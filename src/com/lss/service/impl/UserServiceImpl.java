package com.lss.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lss.dao.IUserDao;
import com.lss.entity.UserEntity;
import com.lss.service.IUserService;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private IUserDao userDao;
	
	/*public IUserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}*/

	@Override
	public List<UserEntity> getAllUsers() {
		return userDao.queryAll();
	}

	@Override
	public UserEntity getUserById(int id) {
		return userDao.queryById(id);
	}

}
