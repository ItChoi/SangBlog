package com.blog.sang.manager.menu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.sang.manager.menu.domain.Menu;
import com.blog.sang.manager.menu.mapper.MenuManagerMapper;
import com.blog.sang.manager.menu.support.MenuParam;

@Service
public class MenuManagerServiceImpl implements MenuManagerService {
	
	@Autowired
	MenuManagerMapper menuManagerMapper;
	
	@Override
	public List<Menu> getAllOneMenu() {
		return menuManagerMapper.getAllOneMenu();
	}
	
	@Override
	public Menu getMenuByMenuParam(Menu menu) {
		return menuManagerMapper.getMenuByMenuParam(menu);
	}
	
	@Override
	public List<Menu> getMenuTwoAndThreeListByMenuParam(Menu menu) {
		
		return menuManagerMapper.getMenuTwoAndThreeListByMenuParam(menu);
	}
}
