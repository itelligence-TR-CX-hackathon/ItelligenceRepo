package jbr.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.Categories;
import jbr.springmvc.model.Product;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	public UserDao userDao;

	public int register(User user) {
		return userDao.register(user);
	}

	public User validateUser(Login login) {
		return userDao.validateUser(login);
	}

	public List<User> getUser() {
		return userDao.getUser();
	}

	public List<Product> getItem() {
		return userDao.getItem();
	}

	@Override
	public int getItemById(int categoryId) {
		// TODO Auto-generated method stub
		return 0;
	}

}
