package com.tm.action;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.convention.annotation.Action;


import com.tm.pojo.Category;
import com.tm.util.ImageUtil;
import com.tm.util.Page;

/*@Namespace("/")
@ParentPackage("basicstruts")  
@Results(
		{
			分类管理
			@Result(name="listCategory", location="/admin/listCategory.jsp"),
			@Result(name="listCategoryPage", type = "redirect", location="/admin_category_list"),
			@Result(name="editCategory", location="/admin/editCategory.jsp"),
		
		})*/
public class CategoryAction extends Action4Result{


	@Action("admin_category_list")
	public String list() {
		
		 if (page==null)
		{
			page=new Page();
		}
		 int total=categoryService.total();
		 page.setTotal(total);
		 categorys=categoryService.listByPage(page);
		 return "listCategory";
	
	}
	
	@Action("admin_category_add")
	public String add(){
		categoryService.save(category);
		String path="E:\\project\\TM\\WebContent\\img\\category";
		File imageFolder=new File(path);
		File file=new File(imageFolder,category.getId()+".jpg");
		try
		{
			FileUtils.copyFile(img, file);
			BufferedImage img=ImageUtil.change2jpg(file);
			ImageIO.write(img, "jpg", file);
		} catch (IOException e)
		{
			e.printStackTrace();
		}
		return "listCategoryPage";
	}
	
	
	@Action("admin_category_delete")
	public String delete() {
		categoryService.delete(category);
		return "listCategoryPage";
	}	
	
	@Action("admin_category_edit")
	public String edit(){
		int id=category.getId();
		category=(Category)categoryService.get(id);
		return "editCategory";
	}
	
	@Action("admin_category_update")
	public String update(){
		categoryService.update(category);
		if (null!=img)
		{
			/*File imageFolder=new File(ServletActionContext.getServletContext().getRealPath("/img/category"));*/
			String path="E:\\project\\TM\\WebContent\\img\\category";
			File imageFolder=new File(path);
			File file=new File(imageFolder,category.getId()+"jpg");
			try
			{
				FileUtils.copyFile(img, file);
				BufferedImage img=ImageUtil.change2jpg(file);
				ImageIO.write(img,"jpg",file);
			} catch (IOException e)
			{
				e.printStackTrace();
			}
		}
		return "listCategoryPage";
	}
	

}