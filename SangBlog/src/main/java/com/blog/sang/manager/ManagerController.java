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
	
	@GetMapping("/test")
	public String frontMain() {
		
		logger.info("test 왔다 매니저 컨트롤러:::");
		
		return "/manager/main";
	}
	
	
	
	
	
}