package cn.hacz.edu.service;

import cn.hacz.edu.domain.entity.StudentEntity;

import java.util.List;

/**
 * project - GitHub整理 ETC发票系统
 *
 * @author dong
 * @version 3.0
 * @date 日期:2018/7/7 时间:15:58
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface UserServiceI {
    void insert(String name, Integer age);

    void deleteByName(String name);

    public List<StudentEntity> getStudentAll();
}
