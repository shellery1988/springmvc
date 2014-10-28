package com.lss.dao;

import java.util.List;

import com.lss.entity.UserEntity;

public interface IUserDao {
	
	public List<UserEntity> queryAll();
	
	public UserEntity queryById(int id);
	
}
