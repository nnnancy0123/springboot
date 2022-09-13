package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.bean.UserInfoBean;
import com.example.demo.service.UserInfoService;


@Controller
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

//	@GetMapping(value = "login")
//	public ModelAndView homePage() {
//
//		ModelAndView mav = new ModelAndView("login");
//
//		return mav;
//
//	}

	/**
	 * 
	 * @return
	 */
	@GetMapping("/register")
	public ModelAndView register() {

		ModelAndView mav = new ModelAndView("register");

		return mav;
	}
	
	/**
	 * 
	 * @param id
	 * @param name
	 * @param age
	 * @param job
	 * @return
	 */
	@PostMapping("/registerProcess")
	public ModelAndView toEdd(@RequestParam String id,@RequestParam String name,  @RequestParam String age,@RequestParam String job,
			Model model) {

		UserInfoBean userInfoBean = new UserInfoBean();
		userInfoBean.setAge(age);
		userInfoBean.setId(id);
		userInfoBean.setJob(job);
		userInfoBean.setName(name);
		
		userInfoService.newUserInfo(userInfoBean);
		
		List<UserInfoBean>  list = userInfoService.getUserInfo();
		
		model.addAttribute("userInfoList", list);
		
		//次のページに指定する方法
		ModelAndView mav = new ModelAndView("InfoPage");
		
		return mav;
	}

	
}