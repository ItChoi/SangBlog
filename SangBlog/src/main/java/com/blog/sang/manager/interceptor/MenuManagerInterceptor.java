package com.blog.sang.manager.interceptor;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.blog.sang.manager.menu.domain.Menu;
import com.blog.sang.manager.menu.service.MenuManagerService;

public class MenuManagerInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LoggerFactory.getLogger(MenuManagerInterceptor.class);

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
		modelAndView.addObject("allOneMenu", menuManagerService.getAllOneMenu());
		
		String uri = request.getRequestURI();
		logger.info("uri: " + uri);
		
		String menuUrl = uri.substring(0, uri.lastIndexOf("/") + 1);
		String menuUri = uri.substring(uri.lastIndexOf("/") + 1);
		
		logger.info("menuUrl: " + menuUrl);
		logger.info("menuUri: " + menuUri);
		logger.info("request param: " + request.getParameter("menuCode"));
		
		Menu menuParam = new Menu();
		
		if (!StringUtils.isEmpty(menuUrl) && !StringUtils.isEmpty(menuUri)) {
			menuParam.setUrl(menuUrl);
			menuParam.setUri(menuUri);
		} else {
			String managerUrl = "manager/";
			String menuCode = uri.substring(uri.lastIndexOf(managerUrl) + managerUrl.length());
			
			logger.info("menuCode: " + menuCode);
			
			menuCode = menuCode.replaceAll("/", "");
			menuParam.setMenuCode(menuCode);
		}
		
		Menu menu = menuManagerService.getMenuByMenuParam(menuParam);
		
		if (menu != null) {
			menuParam.setMenuLevel("");
			menuParam.setId(menu.getId());
			
			/*List<Menu> menuList = menuManagerService.getMenuTwoAndThreeListByMenuParam(menuParam);
			logger.info("menuList1::: " + menuList);
			logger.info("menuList2::: " + menuList.size());
			for (Menu val : menuList) {
				logger.info("부모       ::: " + val.getId());
				logger.info("부모       ::: " + val.getParentId());
				logger.info("부모       ::: " + val.getMenuLevel());
				logger.info("부모       ::: " + val.getMenuCode());
				logger.info("부모       ::: " + val.getMenuName());
				logger.info("부모       ::: " + val.getOrdering());
				logger.info("부모       ::: " + val.getUrl());
				logger.info("부모       ::: " + val.getUri());
				logger.info("부모       ::: " + val.getMenuDisplay());
				logger.info("자식       ::: " + val.getChildId());
				logger.info("자식       ::: " + val.getChildParentId());
				logger.info("자식       ::: " + val.getChildMenuLevel());
				logger.info("자식       ::: " + val.getChildMenuCode());
				logger.info("자식       ::: " + val.getChildMenuName());
				logger.info("자식       ::: " + val.getChildOrdering());
				logger.info("자식       ::: " + val.getChildUrl());
				logger.info("자식       ::: " + val.getChildUri());
				logger.info("자식       ::: " + val.getChildMenuDisplay());
			}*/
			
			// TODO::: 쿼리로 2차 3차 메뉴를 한 번에 가져오나, 2, 3차를 분리하여 Menu에 넣자.
			
		
			
			modelAndView.addObject("allTwoAndThreeMenu", menuManagerService.getMenuTwoAndThreeListByMenuParam(menuParam));
			
			
		}
		
		super.postHandle(request, response, handler, modelAndView);
	}
}
