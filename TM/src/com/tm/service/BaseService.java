package com.tm.service;

import java.util.List;

import com.tm.util.Page;

public interface BaseService
{
	public List list();
	
	public int total();
	
	public List listByPage(Page page);
	
	
	
	public Integer save(Object object);
	
	public void delete(Object object);
	
	public void update(Object object);
	
	public Object get(Class clazz,int id);
	
	public Object get(int id);
	
	
	public List listByParent(Object parent); //根据父类查询所有子类对象（例如：查询某个分类下所有属性）
	
	public List list(Page page,Object parent);//根据父类分页查询子类对象（例如：查询某个分页下前5个属性）
	
	public int total(Object parentObject); //根据父类查询子类对象数量（比如：查询分类下属性数量）

}
