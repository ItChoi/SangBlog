package com.blog.sang.manager.portfolio;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/manager/portfolio")
@Controller
public class PortfolioManagerController {

	private static final Logger logger = LoggerFactory.getLogger(PortfolioManagerController.class);
	
	@GetMapping("/")
	public String list() {
		
		logger.info("나왔슈 포트폴리오");
		
		return "/manager/portfolio/list";
	}
	
}
