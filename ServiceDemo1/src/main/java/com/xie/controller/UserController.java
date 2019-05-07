package com.xie.controller;

import com.xie.ResponseObj;
import com.xie.bean.User;
import com.xie.dao.UserDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Api("用户数据查询")
@RestController
public class UserController {

    @Autowired
    UserDao userDao;

    @ApiOperation("查询用户")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "id",value = "用户id",dataType = "Long",paramType = "path")
    })
    @GetMapping("/getuser/{id}")
    public ResponseObj getUser(@PathVariable("id") long id) {
        if (userDao.existsById(id)) {
            User user = userDao.getOne(id);
            return new ResponseObj(user, "", true);
        } else {
            return new ResponseObj(userDao.getOne(id), "不存在该用户", false);
        }
    }

    @GetMapping("/findalluser")
    public Object findAllUser() {
        List<User> users = userDao.findAll();
        return new ResponseObj(users, "", true);
    }

    @GetMapping("/findalluserlike/{like}")
    public Object findAllUserLike(@PathVariable("like") String like) {
        List<User> users = userDao.findByUsernameLike("%" + like + "%");
        return new ResponseObj(users, "", true);
    }
}
