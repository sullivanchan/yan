package com.springMVC.spittr.web;

import org.springframework.stereotype.Controller;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 声明为一个控制器
 */
@Controller
public class HomeController {

	/**
	 * 处理对“/”的GET请求，并且定义视图名
	 */
	@RequestMapping(method=GET,value="/")
	public String home(){
		return "home";
	}
}