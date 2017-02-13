package com.itmuch.cloud.study.hmac.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.study.hmac.dto.LoginDTO;
import com.itmuch.cloud.study.hmac.dto.UserDTO;
import com.itmuch.cloud.study.hmac.service.AuthenticationService;

import javax.servlet.http.HttpServletResponse;

/**
 * Authentication rest controller
 * Created by Michael DESIGAUD on 14/02/2016.
 */
@RestController
@RequestMapping(value = "/api")
public class Authentication {

    @Autowired
    private AuthenticationService authenticationService;

    @RequestMapping(value = "/authenticate",method = RequestMethod.POST)
    public UserDTO authenticate(@RequestBody LoginDTO loginDTO, HttpServletResponse response) throws Exception{
        return authenticationService.authenticate(loginDTO,response);
    }

    @RequestMapping(value = "/logout",method = RequestMethod.GET)
    public void logout(){
        authenticationService.logout();
    }
}
