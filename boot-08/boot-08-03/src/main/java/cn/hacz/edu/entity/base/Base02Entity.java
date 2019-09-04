package cn.hacz.edu.entity.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

/**
 * project - GitHub整理
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/8/16 时间:10:09
 * @JDK 1.8
 * @Description 功能模块：
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Base02Entity {
    @Id
    @GeneratedValue
    @Type(type = "uuid-char")
    @Column(length = 36)
    private UUID id;
}
