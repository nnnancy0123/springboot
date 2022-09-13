package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.UserInfoBean;
import com.example.demo.mapper.UserInfoMapper;

@Service
public class UserInfoService {

	@Autowired
	UserInfoMapper userInfoMapper;

	public void newUserInfo(UserInfoBean userInfoBean) {

		userInfoMapper.newUser(userInfoBean);
		System.out.println("1234");
	}

	 public List<UserInfoBean> getUserInfo() {
		
		return userInfoMapper.getAll();
		
	}

}