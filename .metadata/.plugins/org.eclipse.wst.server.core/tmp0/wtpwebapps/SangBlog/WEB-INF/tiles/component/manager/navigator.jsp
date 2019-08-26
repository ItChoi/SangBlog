<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<script src="/resources/js/layout.js"></script>
    
<div class="navigator">
		
			<ul class="menu_1_list">
				<!-- TODO::: 메뉴 2차, 3차 뿌려주기  - 쿼리 먼저 수정하기. menu-mapper.xml(getMenuTwoAndThreeListByMenuParam) -->
				<c:forEach var="menuTwoAndThree" items="${allTwoAndThreeMenu }">
					<c:if test='${menuTwoAndThree.menuLevel eq "2" }'>
						<li class="menu_1" onclick="javascript: Layout.menuTwoClick($(this));">
							<div class="menu_1_title">
								<c:if test='${menuTwoAndThree.menuLevel eq "2" }'>
									<span>${menuTwoAndThree.menuName }</span>
								</c:if>
							</div>
							
							<c:if test='${menuTwoAndThree.menuLevel eq "3" }'>
								<ul class="menu_1_sub_list" style="display: none;">
										<li>${menuTwoAndThree.menuName }</li>
								</ul>
							</c:if>
						</li>
					</c:if>
				</c:forEach>
				
			</ul>
			
		</div>
