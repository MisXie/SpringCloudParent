package com.xie.dao;

import com.xie.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Long> {

  List<User> findByUsernameLike(String like);
}
