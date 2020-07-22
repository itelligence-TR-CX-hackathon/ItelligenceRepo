package jbr.springmvc.dao;

import java.util.List;

import jbr.springmvc.model.Categories;
import jbr.springmvc.model.Product;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserDao {
	int register(User user);

	User validateUser(Login login);

	List<User> getUser();

	List<Product> getItem();

}