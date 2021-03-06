package cn.hacz.edu.entity.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * project - GitHub整理
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/8/16 时间:10:09
 * @since 1.8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Base01Entity implements Serializable {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    @CreatedDate
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;
    /**
     * 创建人
     */
    @Column(name = "create_by")
    private String createBy;
    /**
     * 更新人
     */
    @Column(name = "update_by")
    private String updateBy;
    /**
     * 删除标识0-正常；1-删除
     * （true_false=T_F；numeric_boolean=0_1；yes_no=Y_N）
     */
    @Type(type = "numeric_boolean")
    @Column(name = "delFlag")
    private Boolean delFlag;
    /**
     * 备注
     */
    @Column(name = "remark")
    private String remark;
    /**
     * 大文本数据
     */
    @Lob
    @Column(columnDefinition = "text")
    private String text;
    /**
     * spare1
     */
    @Column(name = "spare1")
    private String spare1;
    /**
     * spare2
     */
    @Column(name = "spare2")
    private String spare2;
    /**
     * spare3
     */
    @Column(name = "spare3")
    private String spare3;
}
