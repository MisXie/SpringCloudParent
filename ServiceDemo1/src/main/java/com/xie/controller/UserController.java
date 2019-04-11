package com.xie.controller;

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
  public String getUser(@PathVariable("id") long id) {
    if (userDao.existsById(id)) {
      return userDao.getOne(id).toString();
    }
    return "不存在该用户";
  }

  @GetMapping("/findalluser")
  public Object findAllUser() {
    List<User> users = userDao.findAll();
    System.out.println(users);
    List<String> userss = new ArrayList<>();
    userss.add(users.get(0).toString());
    userss.add(users.get(1).toString());
    return users;
  }

  @GetMapping("/findalluserlike/{like}")
  public Object findAllUserLike(@PathVariable("like") String like) {
    return userDao.findByUsernameLike(like);
  }
}
