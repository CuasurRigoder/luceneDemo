package com.lei.zjs.dao.base;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface BaseDao<T> {

	/**
	 * 保存
	 */
	public void save(T entity);
	
	/**
	 * 删除
	 */
	public void delete(T entity);
	
	/**
	 * 修改
	 */
	public void update(T entity);
	
	/**
	 * 通过id查询
	 */
	public T findById(Serializable id);
	
	/**
	 * 查询全部记录
	 */
	public List<T> findAll();
	
	/**
	 * 命名sql查询
	 */
	public List<T> findByNamedQuery(String query,Object...args);
	
	/**
	 * 命名sql执行
	 */
	public void executeByNamedQuery(String query,Object...args);
	
	/**
	 * 条件查询
	 */
	public List<T> findByCriteria(DetachedCriteria dc);
}
