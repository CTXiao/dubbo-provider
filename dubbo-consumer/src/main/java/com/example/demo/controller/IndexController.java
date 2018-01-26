package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/html")
	public String index(){
		return "index.html";
	}
	
	@RequestMapping("/jsp")
	public String index2(){
		return "index.jsp";
	}
}
