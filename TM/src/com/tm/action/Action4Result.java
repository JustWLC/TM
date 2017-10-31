package com.tm.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;


@Namespace("/")
@ParentPackage("basicstruts")  
@Results(
		{
			/*分类管理*/
			@Result(name="listCategory", location="/admin/listCategory.jsp"),
			@Result(name="listCategoryPage", type = "redirect", location="/admin_category_list"),
			@Result(name="editCategory", location="/admin/editCategory.jsp"),
		
			/*属性管理*/
			@Result(name="listProperty", location="/admin/listProperty.jsp"),
			@Result(name="listPropertyPage", type="redirect",location="/admin_property_list?category.id=${property.category.id}"),
			@Result(name="editProperty",location="/admin/editProperty.jsp"),
			
			/*产品管理*/
			@Result(name="listProduct", location="/admin/listProduct.jsp"),
	        @Result(name="editProduct", location="/admin/editProduct.jsp"),
	        @Result(name="listProductPage", type = "redirect", location="/admin_product_list?category.id=${product.category.id}"),
		})
public class Action4Result extends Action4Service
{
	
}
