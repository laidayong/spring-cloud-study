package com.itmuch.cloud.study.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.itmuch.cloud.study.user.entity.User;
import com.itmuch.cloud.study.user.feign.UserFeignClient;
import com.poc.pb.prtoco.src.EmployeeProto.Employee;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * 
 * @author dayong
 *
 */
@Controller("web")
public class WebController {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserFeignClient userFeignClient;

	@RequestMapping("/greeting")
	public String greeting(@RequestParam(value = "id", required = true) Long id, Model model) {

		logger.info("called by id:"+id);
		User user = userFeignClient.findByIdFeign(id);
		if (user != null) {
			model.addAttribute("name", user.getUsername());
		}
		return "greeting";
	}

}