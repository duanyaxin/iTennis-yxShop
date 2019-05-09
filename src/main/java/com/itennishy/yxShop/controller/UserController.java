package com.itennishy.yxShop.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itennishy.yxShop.domain.JsonData;
import com.itennishy.yxShop.domain.User;
import com.itennishy.yxShop.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("add")
	public Object add() {
		User user = new User();
		user.setName("test");
		user.setPwd("test");
		user.setPhone("17714337363");
		user.setEmail("563376097@qq.com");
		user.setBrithtime(new Date());
		user.setCreatetime(new Date());
		int id = userService.add(user);
		return JsonData.buildSuccess(id);
	}
	
	@GetMapping("getall")
	public Object getAll() {
		return JsonData.buildSuccess(userService.getAll());
	}
	
	@GetMapping("getbyid")
	public Object getById(long id) {
		return JsonData.buildSuccess(userService.getById(id));
	}
	
	@GetMapping("update")
	public Object update() {
		User user = new User();
		user.setId(18);
		user.setName("newtest");
		userService.updateById(user);
		return JsonData.buildSuccess();
	}
	
	@GetMapping("deletebyid")
	public Object delete(long id) {
		userService.deleteById(id);
		return JsonData.buildSuccess();
	}
	
	/**
	 * 事务处理
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED)
	@GetMapping("testsw")
	public Object delopt() {
		User user = new User();
		user.setName("testsw");
		user.setPwd("test");
		user.setPhone("17714337363");
		user.setEmail("563376097@qq.com");
		user.setBrithtime(new Date());
		user.setCreatetime(new Date());
		int id = userService.add(user);
		int i = 9/0;
		return JsonData.buildSuccess();
		
	}
	
	@Autowired
	private StringRedisTemplate rtl;
	@GetMapping("redis")
	public Object optRedis() {
		rtl.opsForValue().set("testspringboot", "success");
		return JsonData.buildSuccess();
	}
	@GetMapping("getredis")
	public Object optRedisget() {
		
		return JsonData.buildSuccess(rtl.opsForValue().get("testspringboot"));
	}
}
