/*
package com.xie.dataSource;

import com.alibaba.druid.pool.DruidDataSource;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Slf4j
@Getter
@Setter
//@Configuration
//@ConfigurationProperties(prefix = "datasource-druid")
public class DruidSource {

  private String url;

  private String username;

  private String password;

  private String driverClassName;

  private int initialSize;

  private String validationQuery;

  @Bean
  @Primary
  public DataSource dataSource() {
    DruidDataSource datasource = new DruidDataSource();

    datasource.setUrl(url);
    datasource.setUsername(username);
    datasource.setPassword(password);
    datasource.setDriverClassName(driverClassName);
    datasource.setValidationQuery(validationQuery);
    return datasource;
  }
}*/
