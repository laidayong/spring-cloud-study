package com.itmuch.cloud.study.hmac.service;

import org.springframework.stereotype.Service;

import com.itmuch.cloud.study.hmac.dto.UserDTO;
import com.itmuch.cloud.study.hmac.mock.MockUsers;
import com.itmuch.cloud.study.security.hmac.HmacRequester;

import javax.servlet.http.HttpServletRequest;

/**
 * Hmac Requester service
 * Created by Michael DESIGAUD on 16/02/2016.
 */
@Service
public class DefaultHmacRequester implements HmacRequester{

    @Override
    public Boolean canVerify(HttpServletRequest request) {
        return request.getRequestURI().contains("/api") && !request.getRequestURI().contains("/api/authenticate");
    }

    @Override
    public String getPublicSecret(String iss) {
        UserDTO userDTO = MockUsers.findById(Integer.valueOf(iss));
        if(userDTO != null){
            return userDTO.getPublicSecret();
        }
        return null;
    }

    @Override
    public Boolean isSecretInBase64() {
        return true;
    }
}
