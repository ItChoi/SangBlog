package com.blog.sang.manager.portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/manager/portfolio")
@Controller
public class PortfolioManagerController {

	@GetMapping("/list")
	public String list() {
		
		return "";
	}
	
}