package com.blog.sang.manager.menu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.sang.manager.menu.domain.Menu;
import com.blog.sang.manager.menu.service.MenuManagerService;

@RequestMapping("/manager/menu")
@Controller
public class MenuManagerController {

	@Autowired
	MenuManagerService menuManagerService;
	
	@GetMapping("{menuCode}") 
	public String menuList(@PathVariable("menuCode") String menuCode) {
		
		// TODO::: 메뉴 테이블 설계 확인.... 
		// - 
		
		return "view:/manager/menu/list";
	}
	
	@PostMapping("/menu-two-list")
	public ResponseEntity<List<Menu>> menuTwoList(long id) {
		
	List<Menu> menuTwoList = menuManagerService.getMenuByParentId(id);
		
		
		return menuTwoList;
	}
	
	
	
}
