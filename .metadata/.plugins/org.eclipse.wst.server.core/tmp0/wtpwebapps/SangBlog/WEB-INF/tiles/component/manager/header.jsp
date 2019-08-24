<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script src="/resources/js/layout.js"></script>

    
<div class="header">
	<div class="logo">
		<span>SangBlog</span>
	</div>
	
	<div class="header_menu">
		<ul>
			<c:forEach var="menu" items="${allOneMenu}">
				<li class="main_menu" onclick="javascript: Layout.menuOneClick('${menu.menuCode }');">
					${menu.menuName }
				</li>
			</c:forEach>
		</ul>
	</div>
	
</div>