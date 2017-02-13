package com.itmuch.cloud.study.user.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import static  org.junit.Assert.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.itmuch.cloud.study.user.entity.User;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)

public class WebControllerTest {

//	@Autowired
//	private FeignController feignController;
//	
//	@Test
//	public void testFindById() {
//			User user  = feignController.findByIdFeign(1l);
//			assertThat(user).isNotNull();
//	}

	@Test
	public void testDummy() {
	}

}
