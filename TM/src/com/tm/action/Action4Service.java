package com.tm.action;

import java.lang.reflect.Method;

import org.apache.commons.lang3.text.WordUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.tm.service.CategoryService;
import com.tm.service.ProductService;
import com.tm.service.PropertyService;

public class Action4Service extends Action4Pojo
{
	@Autowired
	CategoryService categoryService;
	@Autowired
	PropertyService propertyService;
	@Autowired
	ProductService productService;
	
	
	public void t2p(Object o){
		try
		{
			Class clazz=o.getClass();
			int id=(Integer)clazz.getMethod("getId").invoke(o);
			Object PersistentBean=categoryService.get(clazz,id);
			String BeanName=clazz.getSimpleName();
			Method setMethod=getClass().getMethod("set" + WordUtils.capitalize(BeanName), clazz);
			setMethod.invoke(this, PersistentBean);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}
