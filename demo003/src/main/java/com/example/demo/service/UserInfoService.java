package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.InfoBean;
import com.example.demo.mapper.UserInfoMaper;

@Service
public class UserInfoService {
	
	@Autowired
	UserInfoMaper userInfoMaper;
	
	public void newUserInfo(String id, String name, int age, String job) {
		
		InfoBean infoBean = new InfoBean();
		infoBean.setAge(age);
		infoBean.setId(id);
		infoBean.setJob(job);
		infoBean.setName(name);
		
		userInfoMaper.newUser(infoBean);
		
		System.out.println("1234");
	}

}
