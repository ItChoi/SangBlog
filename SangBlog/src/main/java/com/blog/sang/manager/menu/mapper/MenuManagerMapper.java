package com.blog.sang.manager.menu.mapper;

import java.util.List;

import com.blog.sang.manager.menu.domain.Menu;

public interface MenuManagerMapper {
	public List<Menu> getAllOneMenu();
	public List<Menu> getMenuByParentId(long id);
}
