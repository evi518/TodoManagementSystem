package com.example.app.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.app.domain.Todo;

@Mapper
public interface TodoDao {
	
	List<Todo> selectAll() throws Exception; 
	
	Todo selectById(Integer id) throws Exception;
	
	void setDeleteById(Integer id) throws Exception;
	
	void insert(Todo todo) throws Exception;
	
	void update(Todo todo) throws Exception;
	
	//title表示
	List<Todo> getTitleList() throws Exception;
	
	//pagination
	List<Todo> selectLimited(@Param("offset")int offset, @Param("num")int num) throws Exception;
	
	long countAll() throws Exception;
	
	
}
