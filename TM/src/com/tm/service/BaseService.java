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
	
	
	public List listByParent(Object parent); //���ݸ����ѯ��������������磺��ѯĳ���������������ԣ�
	
	public List list(Page page,Object parent);//���ݸ����ҳ��ѯ����������磺��ѯĳ����ҳ��ǰ5�����ԣ�
	
	public int total(Object parentObject); //���ݸ����ѯ����������������磺��ѯ����������������

}
