package com.itennishy.yxShop.service;

import java.util.List;

import com.itennishy.yxShop.domain.User;

public interface UserService {
	
	public int add(User user);
	
	public List<User> getAll();
	
	public User getById(Long id);
	
	public void updateById(User user);
	
	public void deleteById(Long id);
}
