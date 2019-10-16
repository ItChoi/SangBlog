package com.blog.sang.manager.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/manager/user")
@Controller
public class UserManagerController {
	
	private static final Logger logger = LoggerFactory.getLogger(UserManagerController.class);
	
	@GetMapping("/")
	public String list() {
		
		logger.info("나왔슈 회원정보");
		
		return "/manager/user/list";
	}
}
