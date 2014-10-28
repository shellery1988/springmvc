package com.lss.entity;

import java.io.Serializable;

public class GroupEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String name;
	
	private String code;
	
	private int parid;
	
	private String mark;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getParid() {
		return parid;
	}

	public void setParid(int parid) {
		this.parid = parid;
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}
	
}
