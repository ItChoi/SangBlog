package com.blog.sang.manager.menu;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.sang.manager.menu.service.MenuManagerService;

@RequestMapping("/manager/menu")
@Controller
public class MenuManagerController {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuManagerController.class);

	@Autowired
	MenuManagerService menuManagerService;
	
	@GetMapping("{menuCode}") 
	public String menuList(@PathVariable("menuCode") String menuCode) {
		
		// TODO::: 메뉴 테이블 설계 확인.... 
		
		return "view:/manager/menu/list";
	}
	
	
}
