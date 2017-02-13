package com.itmuch.cloud.study.configuration.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.itmuch.cloud.study.hmac.dto.Profile;
import com.itmuch.cloud.study.hmac.dto.UserDTO;

import java.util.Collection;

/**
 * Security spring security user
 * Created by Michael DESIGAUD on 15/02/2016.
 */
public class SecurityUser extends User{

    private Integer id;

    private Profile profile;

    public SecurityUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }

    public SecurityUser(Integer id,String username, String password, Profile profile, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = id;
        this.profile = profile;
    }

    public Integer getId() {
        return id;
    }

    public Profile getProfile() {
        return profile;
    }
}
