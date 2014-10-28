package com.lss.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lss.dao.IGroupDao;
import com.lss.entity.GroupEntity;

@Repository
public class GroupDaoImpl implements IGroupDao {

	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;  
	
	@Override
	public List<GroupEntity> queryAll() {
		return sqlSessionTemplate.selectList("com.lss.dao.IGroupDao.queryAll");
	}

	@Override
	public GroupEntity queryById(int id) {
		return sqlSessionTemplate.selectOne("com.lss.dao.IGroupDao.queryById", id);
	}

}
