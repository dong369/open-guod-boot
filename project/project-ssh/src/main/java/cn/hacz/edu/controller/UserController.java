package cn.hacz.edu.controller;

import cn.hacz.edu.base.vo.ApiResult;
import cn.hacz.edu.base.vo.MapData;
import cn.hacz.edu.dao.UserDaoI;
import cn.hacz.edu.service.UserServiceI;
import cn.hacz.edu.util.TokenUtils;
import cn.hacz.edu.vo.user.UserLoginReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project - GitHub整理
 *
 * @author guodd
 * @version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserServiceI userServiceI;

    @Autowired
    private UserDaoI userDaoI;

    @Value("${token.header}")
    private String tokenHeader;

    @Autowired
    private TokenUtils tokenUtils;

    /**
     * 功能描述：
     */
    @PostMapping(value = "/getToken")
    public ApiResult getToken(@RequestBody UserLoginReq userLoginReq) {
        String s = tokenUtils.addAuthentication(userLoginReq.getId().toString(), userLoginReq.getUserName());
        return ApiResult.ok().data(new MapData().addObj(tokenHeader, s));
    }


    /**
     * 功能描述：获取用户数据表格
     */
    @RequestMapping(value = "/userData")
    public ApiResult userData() {
        return userServiceI.userData();
    }

    /**
     * 功能描述：获取用户角色
     */
    @RequestMapping(value = "/userRoleData")
    public ApiResult userRoleData() {
        return userServiceI.userRoleData();
    }

    /**
     * 功能描述：获取用户资源
     */
    @RequestMapping(value = "/userResourceData")
    public ApiResult userResourceData() {
        return userServiceI.userResourceData();
    }
}
