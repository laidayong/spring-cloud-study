package com.itmuch.cloud.study.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.user.entity.User;
import com.itmuch.cloud.study.user.feign.UserFeignClient;

@RestController("rest")
public class FeignController {
    private static final Logger LOGGER = LoggerFactory.getLogger(FeignController.class);
	
	
  @Autowired
  private UserFeignClient userFeignClient;

  @GetMapping("/feign/{id}")
  public User findByIdFeign(@PathVariable Long id) {
    User user = this.userFeignClient.findByIdFeign(id);
    return user;
  }

  @GetMapping("/users")
	public List<User> getUsers(){
	  return this.userFeignClient.getUsers();
  }

}
