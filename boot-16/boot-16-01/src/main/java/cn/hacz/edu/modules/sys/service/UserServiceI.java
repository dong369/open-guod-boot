package cn.hacz.edu.modules.sys.service;

import cn.hacz.edu.vo.Json;
import cn.hacz.edu.modules.sys.vo.UserVo;

import javax.validation.Valid; /**
 * project - GitHub整理 Gitee开源系统
 *
 * @author guod
 * @version 1.0
 * @date 日期:2018/7/10 时间:9:34
 * @JDK 1.8
 * @Description 功能模块：
 */
public interface UserServiceI {
    Json getAgeCount(@Valid UserVo userVo);
}
