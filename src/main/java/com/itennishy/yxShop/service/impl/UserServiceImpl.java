package com.itennishy.yxShop.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itennishy.yxShop.domain.User;
import com.itennishy.yxShop.mapper.UserMapper;
import com.itennishy.yxShop.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserMapper userMapper;
	@Override
	public int add(User user) {
		userMapper.insert(user);
		int id = user.getId();
		return id;
	}
	@Override
	public List<User> getAll() {
		List<User> users = userMapper.getAll();
		return users;
	}
	@Override
	public User getById(Long id) {
		User user = userMapper.findById(id);
		return user;
	}
	@Override
	public void updateById(User user) {
		userMapper.update(user);
	}
	@Override
	public void deleteById(Long id) {
		userMapper.delete(id);
	}
}
