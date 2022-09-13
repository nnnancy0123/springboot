package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.UserInfoBean;

@Mapper
public interface UserInfoMapper {
	
	public void newUser(UserInfoBean userInfoBean);
	 
	public List<UserInfoBean> getAll();
	 	
}