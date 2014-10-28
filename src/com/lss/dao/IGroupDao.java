package com.lss.dao;

import java.util.List;

import com.lss.entity.GroupEntity;

public interface IGroupDao {

	public List<GroupEntity> queryAll();
	
	public GroupEntity queryById(int id);
	
}
