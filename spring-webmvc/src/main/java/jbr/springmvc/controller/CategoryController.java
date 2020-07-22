package jbr.springmvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

public class CategoryController {
	
	@RequestMapping(value="/viewproduct", method=RequestMethod.GET)
	public ModelAndView getCategory() {
		ModelAndView b=new ModelAndView();
		return b;
	}
	

}
