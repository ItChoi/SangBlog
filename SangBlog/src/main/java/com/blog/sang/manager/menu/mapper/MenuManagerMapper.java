package com.blog.sang.manager.menu.mapper;

import java.util.List;

import com.blog.sang.manager.menu.domain.Menu;

public interface MenuManagerMapper {
	public List<Menu> getAllOneMenu();
	public Menu getMenuByMenuParam(Menu menu);
	public List<Menu> getMenuTwoAndThreeListByMenuParam(Menu menu);
}
