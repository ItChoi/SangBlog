package com.blog.sang.manager.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.blog.sang.manager.menu.domain.Menu;
import com.blog.sang.manager.menu.service.MenuManagerService;

public class ManagerMenuInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(ManagerMenuInterceptor.class);

	@Autowired
	MenuManagerService menuManagerService;
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		return super.preHandle(request, response, handler);
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		// header.jsp에서 1차 메뉴 이름 값 전달.
		List<Menu> a = menuManagerService.getAllOneMenu();
		if (a != null) {
			for (Menu aa : a) {
				logger.info("test111: " + aa.getId());
			}
		}
		logger.info("test22222222: ");
		modelAndView.addObject("allOneMenu", menuManagerService.getAllOneMenu());
		
		super.postHandle(request, response, handler, modelAndView);
	}
}
