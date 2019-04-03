package cn.hacz.edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * project -
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/3/12 时间:15:02
 * @JDK 1.8
 * @Description 功能模块：
 */
@SpringBootApplication
public class Boot1104Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot1104Application.class, args);
    }
}