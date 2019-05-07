package com.xie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Administrator on 2019-04-10.
 */
@SpringBootApplication
@EnableEurekaClient
public class Client1Application {
    public static void main(String[] args) {
        SpringApplication.run(Client1Application.class);
    }
}
