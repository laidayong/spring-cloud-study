package com.chinaubi.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.itmuch.cloud.study.domain.User;

public interface  UserMapper {

	@Select("SELECT * FROM user")
	List<User> getAll();	
	
}
