package jbr.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Categories;
import jbr.springmvc.model.Product;
import jbr.springmvc.service.UserService;

@Controller
public class ProductController {

	@Autowired
	UserService userService;

	@RequestMapping(value="/viewproduct/{id}", method=RequestMethod.GET)
	public String viewProduct(@RequestParam int id) {
//		List<Product> products= new Product
//		model.addAttribute("viewproduct",viewproduct);
		return "viewproduct";
	}
	
	
	
	
	
	
	
	

}
