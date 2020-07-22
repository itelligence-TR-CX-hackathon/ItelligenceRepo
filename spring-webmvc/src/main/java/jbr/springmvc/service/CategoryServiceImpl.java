package jbr.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import jbr.springmvc.dao.CategoryDao;
import jbr.springmvc.model.Categories;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;

	public List<Categories> getCategory() {
		return categoryDao.getCategory();
	}
}
