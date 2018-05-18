package com.wechat.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController extends BaseController {

	@RequestMapping(value="/hello")
	@ResponseBody
	public String hello(HttpServletRequest request){
		return "兄弟你好呀";
	}
}
