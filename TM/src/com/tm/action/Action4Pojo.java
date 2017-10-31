package com.tm.action;

import java.util.List;

import com.tm.pojo.Category;
import com.tm.pojo.Product;
import com.tm.pojo.Property;

public class Action4Pojo extends Action4Pagination
{
	protected Category category;
	protected Property property;
	protected Product product;
	
	protected List<Category> categorys;
	protected List<Property> propertys;
	protected List<Product> products;

	public Category getCategory()
	{
		return category;
	}

	public void setCategory(Category category)
	{
		this.category = category;
	}

	public List<Category> getCategorys()
	{
		return categorys;
	}

	public void setCategorys(List<Category> categorys)
	{
		this.categorys = categorys;
	}

	public Property getProperty()
	{
		return property;
	}

	public void setProperty(Property property)
	{
		this.property = property;
	}

	public List<Property> getPropertys()
	{
		return propertys;
	}

	public void setPropertys(List<Property> propertys)
	{
		this.propertys = propertys;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}

	public List<Product> getProducts()
	{
		return products;
	}

	public void setProducts(List<Product> products)
	{
		this.products = products;
	}
	
	
}
