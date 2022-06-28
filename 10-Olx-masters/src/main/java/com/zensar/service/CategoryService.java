package com.zensar.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Category;
import com.zensar.db.CategoryDAO;

@Service
public class CategoryService {

	@Autowired
	CategoryDAO dao;

	// Add Category
	public Category addCategory(Category category) {
		return this.dao.save(category);
	}

	// FindAll Categories
	public List<Category> getAllCategories() {
		return this.dao.findAll();
	}

	// Find Category By Id
	public Category getCategoryById(int id) {
		Optional<Category> optional = this.dao.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}
}