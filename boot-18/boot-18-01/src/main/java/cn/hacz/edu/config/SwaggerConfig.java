package cn.hacz.edu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 访问地址(端口号为9696测试地址、端口号为9696正式地址)
 * http://localhost:9696/swagger-ui.html
 * http://localhost:9696/ssh/doc.html
 *
 * @author Administrator
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 功能描述：后台系统
     *
     * @return
     */
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("kafka测试")
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.hacz.edu.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("swagger RESTful APIs")
                .description("swagger RESTful APIs")
                .termsOfServiceUrl("http://www.test.com/")
                .contact("guodd369n@163.com")
                .version("1.0")
                .build();
    }
}