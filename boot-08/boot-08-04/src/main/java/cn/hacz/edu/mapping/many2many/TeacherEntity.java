package cn.hacz.edu.mapping.many2many;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * project - GitHub整理
 *
 * @author guodd
 * @version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "map_teacher")
@DynamicInsert
@DynamicUpdate
public class TeacherEntity {
    /**
     * 功能描述：主机id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 属性描述：姓名
     */
    private String name;

    @ManyToMany
    @JoinTable(name = "map_tea_stu",
            joinColumns = {@JoinColumn(name = "teacher_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private Set<StudentEntity> students = new HashSet<>();
}
