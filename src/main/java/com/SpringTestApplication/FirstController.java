package com.SpringTestApplication;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FirstController {
@RequestMapping(value="/hello")
	public String hello()
	{
		return "Welcome User";
	}
@RequestMapping("/")  
public String index(){  
    return "index";  
}  
@RequestMapping(value="/save", method=RequestMethod.POST)  
public ModelAndView save(@ModelAttribute User user){  
    ModelAndView modelAndView = new ModelAndView();  
modelAndView.setViewName("user-data");      
modelAndView.addObject("user", user);    
return modelAndView;  
}  
}
