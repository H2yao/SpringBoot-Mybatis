package com.example.service;

import java.util.List;

/**
 * 简单封装基本CRUD接口
 * @author H2yao
 * @param <T>
 */
public interface BaseService<T> {

	// 查询
	List<T> findAll();

	// 查询ID
	List<T> findById(int id);

	// 修改
	void update(T t);

	// 添加
	void create(T t);

	// 删除
	void delete(int id);

}
