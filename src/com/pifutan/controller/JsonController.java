package com.pifutan.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.pifutan.entity.User;
/**
 * 
 * @author ZhangYuliang
 *
 */
//@RequestMapping(consumes = "application/json") 请求设置为json
@Controller
@ResponseBody // 返回json，@ResponseEntity类似
public class JsonController {
	/**
	 * 普通对象回转化为json，但是需要导入包jackson-annotations-2.9.0.jar，jackson-core-2.9.0.jar，jackson-databind-2.9.0.jar
	 * @return
	 */
	@RequestMapping("/json")
	public User json() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return User.getTestInstance();
	}
	@RequestMapping("/jsons")
	public ModelMap jsons() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		ModelMap modelMap = new ModelMap();
		modelMap.put("key", "value");
		modelMap.put("json", User.getTestInstance());
		return modelMap;
	}
	/**
	 * 支持跨域使用@CrossOrigin
	 * @return
	 */
	@CrossOrigin
	@RequestMapping("/json2")
	public User json2() {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		return User.getTestInstance();
	}
	/**
	 * jsonp形式请求时的返回
	 * @param callbackParameter
	 * @return
	 */
	@RequestMapping("/jsonp")
	public JSONPObject jsonp(String callbackParameter) {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(callbackParameter);
		return new JSONPObject(callbackParameter, User.getTestInstance());
	}
	/**
	 * 多种方法获取参数
	 * @param callbackParameter
	 * @return
	 */
	@RequestMapping("/jsonp2")
	public JSONPObject jsonp2(@ModelAttribute("callbackParameter") String callbackParameter) {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(callbackParameter);
		return new JSONPObject(callbackParameter, User.getTestInstance());
	}
	@RequestMapping("/jsonp3")
	public JSONPObject jsonp3(@RequestParam("callbackParameter") String callbackParameter) {
		System.out.println(this.getClass() + "." + Thread.currentThread().getStackTrace()[1].getMethodName());
		System.out.println(callbackParameter);
		return new JSONPObject(callbackParameter, User.getTestInstance());
	}

}
