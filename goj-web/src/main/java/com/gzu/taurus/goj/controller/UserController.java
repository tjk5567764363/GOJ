package com.gzu.taurus.goj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request, Model model) {
		return "index";
	}
}
