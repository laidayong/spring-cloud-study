package com.itmuch.cloud.study.user.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.user.entity.User;
import com.itmuch.cloud.study.user.feign.UserFeignClient;
import com.poc.pb.prtoco.src.EmployeeProto.Employee;

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

	@RequestMapping(value="/createEmployee",method = RequestMethod.POST, consumes="application/x-protobuf")
	public String createEmployee(@RequestBody Employee employee){
		System.out.println( " printing the deserialized protobuf employee message " + employee.toString());
		return "success";
	}

	
	@RequestMapping(value="/getEmployee", method = RequestMethod.GET)
	public @ResponseBody Employee getEmployee(){
		//return new ResponseEntity<EmployeeProto.Employee>(
				//Employee.newBuilder().setId(1).setFirstName("samrat").setSecondName("paul").build(), HttpStatus.OK);
		return Employee.newBuilder().setId(1).setFirstName("samrat").setSecondName("paul").build();
	}	

}
