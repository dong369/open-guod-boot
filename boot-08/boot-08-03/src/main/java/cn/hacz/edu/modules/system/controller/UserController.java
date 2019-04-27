package cn.hacz.edu.modules.system.controller;

import cn.hacz.edu.modules.system.dao.StudentDaoI;
import cn.hacz.edu.modules.system.dao.UserDaoI;
import cn.hacz.edu.modules.system.entity.UserEntity;
import cn.hacz.edu.modules.system.service.UserServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * project - GitHub整理
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/7/6 时间:15:07
 * @JDK 1.8
 * @Description 功能模块：
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceI userServiceI;
    @Autowired
    private UserDaoI userDaoI;
    @Autowired
    private StudentDaoI studentDaoI;

    @PostMapping(value = "/getUser")
    public List<UserEntity> getUser() {
        List<UserEntity> all = userDaoI.findAll();
        return all;
    }
}
