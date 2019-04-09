package cn.hacz.edu.modules.system.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.util.List;

/**
 * project - GitHub整理 综合客户服务系统
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/8/13 时间:15:56
 * @JDK 1.8
 * @Description 功能模块：文章信息
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "article_info")
public class Article {
    @Id
    private String id;
    @Field("title")
    private String title;
    @Field("url")
    private String url;
    @Field("author")
    private String author;
    @Field("tags")
    private List<String> tags;
    @Field("visit_count")
    private Long visitCount;
    private LocalDateTime addTime;
    /**
     * 功能描述：价格
     */
    private Integer price;
}
