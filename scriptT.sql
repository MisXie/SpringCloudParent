110.3
 private Long id;

  private String userName;

  private String password;

  private String name;

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
  
  create table if not exists t_user(
	id int(11) primary key auto_increment
	username varchar(32)
	password varchar(32)
	age int(3)
	sex int(1)
	birthday datetime
	created datetime
	updated datetime
	note varchar(255)
  )charset=utf-8