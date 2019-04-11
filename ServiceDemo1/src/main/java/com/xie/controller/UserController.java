package com.xie.controller;

import com.xie.ResponseObj;
import com.xie.bean.User;
import com.xie.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

  @Autowired
  UserDao userDao;

  @GetMapping("/getuser/{id}")
  public ResponseObj getUser(@PathVariable("id") long id) {
    if (userDao.existsById(id)) {
      return new ResponseObj(userDao.getOne(id),"",true);
    }else {
      return new ResponseObj(userDao.getOne(id),"不存在该用户",false);
    }
  }

  @GetMapping("/findalluser")
  public Object findAllUser() {
    List<User> users = userDao.findAll();
    return new ResponseObj(users,"",true);
  }

  @GetMapping("/findalluserlike/{like}")
  public Object findAllUserLike(@PathVariable("like") String like) {
    List<User> users =  userDao.findByUsernameLike("%"+like+"%");
    return new ResponseObj(users,"",true);
  }
}
