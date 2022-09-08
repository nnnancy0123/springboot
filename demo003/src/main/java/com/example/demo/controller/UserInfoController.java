package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.UserInfoService;

@Controller
public class UserInfoController {

	@Autowired
	UserInfoService userInfoService;

	@RequestMapping(value = "login")

	public String homePage(Model model, HttpServletRequest request) {

		return "login";

	}

	@GetMapping("/login")
	public ModelAndView toEdd(@RequestParam String name, String id, int age, String job) {

		userInfoService.newUserInfo(id, name, age, job);

		ModelAndView mav = new ModelAndView("login");

		return mav;

	}

}
