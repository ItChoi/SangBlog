package com.blog.sang.manager.menu.service;

import java.util.List;

import com.blog.sang.manager.menu.domain.Menu;

public interface MenuManagerService {
	public List<Menu> getAllOneMenu();
	public List<Menu> getMenuByParentId(long id);
	
}
