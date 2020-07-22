package jbr.springmvc.service;

import java.util.List;

import jbr.springmvc.model.Categories;
import jbr.springmvc.model.Product;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;

public interface UserService {

  int register(User user);

  User validateUser(Login login);
  
  List<User> getUser();
  
  List<Product> getItem();
  
  int getItemById(int categoryId);
}