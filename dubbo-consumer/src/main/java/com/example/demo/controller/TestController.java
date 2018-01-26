package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.xf.service.TestService;

@Controller
public class TestController {
	@Autowired
	TestService testService;

	@ResponseBody
	@RequestMapping("/test/{name}")
	public JSONObject testJson(@PathVariable("name") String name) {
		JSONObject jsonObject = new JSONObject();
		String testStr = testService.sayHello(name);
		jsonObject.put("str", testStr);
		return jsonObject;
	}
}
