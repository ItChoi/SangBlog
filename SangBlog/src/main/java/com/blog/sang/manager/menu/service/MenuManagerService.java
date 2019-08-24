package com.blog.sang.manager.menu.service;

import java.util.List;

import com.blog.sang.manager.menu.domain.Menu;

public interface MenuManagerService {
	public List<Menu> getAllOneMenu();
	public Menu getMenuByMenuParam(Menu menu);
	public List<Menu> getMenuTwoAndThreeListByMenuParam(Menu menu);
	
}
