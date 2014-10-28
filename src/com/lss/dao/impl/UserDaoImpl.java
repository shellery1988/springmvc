package com.lss.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lss.dao.IUserDao;
import com.lss.entity.UserEntity;
import com.lss.until.DaoImplTemplate;

@Repository
public class UserDaoImpl extends DaoImplTemplate implements IUserDao{

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;  
	
	@Override
	public List<UserEntity> queryAll() {
		return sqlSessionTemplate.selectList("com.lss.dao.IUserDao.queryAll");
	}

	@Override
	public UserEntity queryById(int id) {
		return sqlSessionTemplate.selectOne("com.lss.dao.IUserDao.queryById", id);
	}

	
	public static void main(String[] args) {
		StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
		System.out.println(stackTrace[1].getClassName()+"."+stackTrace[1].getMethodName());
		
	}
}
