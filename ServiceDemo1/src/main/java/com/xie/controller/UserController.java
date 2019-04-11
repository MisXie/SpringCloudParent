package com.xie.controller;

import com.xie.bean.User;
import com.xie.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserDao userDao;
  @GetMapping("/getuser/{id}")
  public String getUser(@PathVariable("id") long id){
    if(userDao.existsById(id)){
      return userDao.getOne(id).toString();
    }
    return "不存在该用户";
  }
}
