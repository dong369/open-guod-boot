package cn.hacz.edu.dao;

import cn.hacz.edu.entity.BugTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * project - GitHub整理
 *
 * @author guodd
 * @version 1.0
 * @date 日期:2019/2/26 时间:14:26
 * @JDK 1.8
 * @Description 功能模块：
 */
@Repository
public interface BugTypeDaoI extends JpaRepository<BugTypeEntity, Serializable> {
}
