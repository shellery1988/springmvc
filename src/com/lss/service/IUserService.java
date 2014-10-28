package com.lss.service;

import java.util.List;

import com.lss.entity.UserEntity;

public interface IUserService {

	public List<UserEntity> getAllUsers();
	
	public UserEntity getUserById(int id);
	
}
