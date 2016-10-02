package com.sliit.sa.service;

import com.sliit.sa.model.Category;

import java.util.List;

public interface CategoryDAO {
	
	public void SaveOrUpdate(Category category);
	
	public void delete(int catID);
	
	public Category findByID(int catID);
	
	public Category findByName(String catName);
	
	public List<Category> getAllCategories();
	
	public boolean isCategoryExist(Category category);
	
}
