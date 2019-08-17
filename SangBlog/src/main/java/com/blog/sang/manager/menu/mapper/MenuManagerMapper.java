package com.blog.sang.manager.menu.mapper;

import java.util.List;

import com.blog.sang.manager.menu.domain.Menu;
import com.blog.sang.manager.menu.support.MenuParam;

public interface MenuManagerMapper {
	public List<Menu> getAllOneMenu();
	public Menu getMenuByMenuParam(MenuParam menuParam);
	public List<Menu> getMenuTwoAndThreeListByMenuParam(MenuParam menuParam);
}
