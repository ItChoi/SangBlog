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

}
