package com.example.demo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.bean.InfoBean;

@Mapper
public interface UserInfoMaper {
	
	public void newUser(InfoBean infoBean);
		
	
}
