package cn.hacz.edu.producer.impl;


import cn.hacz.edu.producer.ProducerService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * Simple to Introduction
 * className: ProducerServiceImpl
 *
 * @author yqbjtu
 * @version 2018/4/27 8:52
 */
@Service
@Slf4j
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    private KafkaTemplate<String, String> template;

    @Override
    public void send(String topic, String str, int count) {
        for (int i = 0; i < count; i++) {
            template.send(topic, str);
        }
    }

    @Override
    public void sendJson(String topic, String json, int count) {
        for (int i = 0; i < count; i++) {
            sendJson(topic, json);
        }
    }

    //发送消息方法
    private void sendJson(String topic, String json) {
        JSONObject jsonObj = JSON.parseObject(json);

        jsonObj.put("topic", topic);
        jsonObj.put("ts", System.currentTimeMillis() + "");

        log.info("json+++++++++++++++++++++  message = {}", jsonObj.toJSONString());

        ListenableFuture<SendResult<String, String>> future = template.send(topic, jsonObj.toJSONString());
        future.addCallback(new ListenableFutureCallback<SendResult<String, String>>() {
            @Override
            public void onSuccess(SendResult<String, String> result) {
                log.info("msg OK. " + result.toString());
            }

            @Override
            public void onFailure(Throwable ex) {
                log.error("msg send failed.", ex);
            }
        });
    }
}
