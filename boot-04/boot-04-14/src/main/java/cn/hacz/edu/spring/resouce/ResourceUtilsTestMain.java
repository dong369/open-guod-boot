package cn.hacz.edu.spring.resouce;

import org.apache.commons.io.FileUtils;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.util.List;

/**
 * project - GitHub整理
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/10/11 时间:13:23
 * @JDK 1.8
 * @Description 功能模块：内置的resouce类型
 */
public class ResourceUtilsTestMain {
    public static void main(String[] args) throws Exception {
        File file = ResourceUtils.getFile("classpath:application.yml");
        List<String> strings = FileUtils.readLines(file, "utf-8");
        strings.forEach(System.out::println);
    }
}
