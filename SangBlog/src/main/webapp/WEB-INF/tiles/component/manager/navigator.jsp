<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<script src="/resources/js/layout.js"></script>
    
<div class="navigator">
		
			<ul class="menu_1_list">
				<li class="menu_1" onclick="javascript: Layout.menuTwoClick($(this));">
					<div class="menu_1_title">
						<span>메뉴1111</span>
					</div>
					
					<ul class="menu_1_sub_list" style="display: none;">
						<c:forEach var="menuTwoAndThree" items="${allTwoAndThreeMenu }">
							<c:if test='${menuTwoAndThree.menuLevel eq "2" }'>
								<li>${menuTwoAndThree.menuName }</li>
							</c:if>
						</c:forEach>
					</ul>
				</li>
				
				<li class="menu_1" onclick="javascript:Layout.menuTwoClick($(this));">
					<div class="menu_1_title">
						<span>메뉴2222</span>
					</div>
					
					<ul class="menu_1_sub_list" style="display: none;">
						<li>test2</li>
						<li>test2</li>
						<li>test2</li>
						<li>test2</li>
						<li>test2</li>
						<li>test2</li>
					</ul>
				</li>
			</ul>
			
		</div>
