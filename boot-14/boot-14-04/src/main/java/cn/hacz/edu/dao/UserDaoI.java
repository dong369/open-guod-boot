package cn.hacz.edu.dao;

import cn.hacz.edu.entity.SysUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * project - GitHub整理
 *
 * @author dong
 * @version 1.0
 * @date 日期:2018/9/4 时间:21:59
 * @JDK 1.8
 * @Description 功能模块：
 */
@Component
public interface UserDaoI extends JpaRepository<SysUserEntity, Serializable> {
}
