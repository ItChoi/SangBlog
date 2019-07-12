package com.blog.sang.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/manager")
public class ManagerController {
	
	private static final Logger logger = LoggerFactory.getLogger(ManagerController.class);
	
	@GetMapping("/")
	public String frontMain() {
		
		
		return "/manager/main";
	}
	
	
	
	
	
}
