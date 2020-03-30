package cn.hacz.edu;

import cn.hacz.edu.properties.ObjectProperties;
import cn.hacz.edu.properties.PayProperties;
import cn.hacz.edu.util.InfoUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project - GitHub整理 ETC发票系统
 *
 * @author dong
 * @version 3.0
 * @date 日期:2018/7/3 时间:21:53
 * @since 1.8
 */
@SpringBootApplication
@RestController
public class Boot0102Application {
    @Autowired
    private PayProperties payProperties;
    @Autowired
    private ObjectProperties objectProperties;

    public static void main(String[] args) {
        SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(Boot0102Application.class);
        ApplicationContext context = springApplicationBuilder.context();
        SpringApplication application = springApplicationBuilder.application();
        application.run(args);
        new SpringApplicationBuilder(Boot0102Application.class).run(args);
    }

    @GetMapping(value = "/info")
    public String info() {
        return payProperties.getPayName() + ","
                + InfoUtils.info() + ","
                + objectProperties.getName();
    }

    @Bean
    public InfoUtils info(@Value("${guodd.name}") String name) {
        InfoUtils.setName(name);
        return new InfoUtils();
    }
}