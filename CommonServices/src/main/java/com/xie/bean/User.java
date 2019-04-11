package com.xie.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Administrator on 2019-04-10.
 */
@Entity(name = "t_user")
@ToString
@Setter
@Getter
public class User {

  @Id
 // @KeySql(useGeneratedKeys = true)
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String username;
  private String password;
  private Integer age;
  // 性别，1男性，2女性
  private Integer sex;

  // 出生日期
  private Date birthday;

  // 创建时间
  private Date created;

  // 更新时间
  private Date updated;

  // 备注
  private String note;
}
