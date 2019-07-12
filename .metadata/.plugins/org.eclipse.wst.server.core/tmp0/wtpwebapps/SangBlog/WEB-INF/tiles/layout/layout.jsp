<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<link href="/resources/css/tiles/manager_header.css" rel="stylesheet" type="text/css">

</head>
<body>
	<div class="wrap">
		
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="navigator" />
		<tiles:insertAttribute name="content" />	
		<!-- <div class="header">
			<div class="logo">
				<span>SangBlog</span>
			</div>
			
			<div class="header_menu">
				<ul>
					<li class="main_menu">메뉴1</li>
					<li class="main_menu">메뉴2</li>
					<li class="main_menu">메뉴3</li>
					<li class="main_menu">메뉴4</li>
					<li class="main_menu">메뉴5</li>
					<li class="main_menu">메뉴6</li>
				</ul>
			</div>
		</div>    
		
		<div class="navigator">
		
			<ul class="menu_1_list">
				<li class="menu_1">
					<div class="menu_1_title">
						<span>메뉴1111</span>
					</div>
					
					<ul class="menu_1_sub_list" style="display: none;">
						<li>test1</li>
						<li>test1</li>
						<li>test1</li>
						<li>test1</li>
						<li>test1</li>
						<li>test1</li>
					</ul>
				</li>
				
				<li class="menu_1">
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
		
		<div class="content">
			asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdas d
		</div> -->
		
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			$('.menu_1').on('click', function() {
				event.preventDefault();
				var index = $(this).index();
				
				// start 코드가 깨끗하지 않다. 메뉴 클릭 시 클래스 on을 추가하는데, 활용할 수 있는 방안 찾아보기....
				$('.menu_1').removeClass('on');
				$(this).addClass('on');
				
				$('.menu_1 > ul').css("display", "none");
				$('.menu_1 > ul')[index].style.display = "block";
				
				$('.menu_1 > .menu_1_title').css("color", "black");
				$('.menu_1 > .menu_1_title').css("background", "white");
				
				$('.menu_1 > .menu_1_title')[index].style.color = "white";
				$('.menu_1 > .menu_1_title')[index].style.background = "#79AAFF";
				// end 코드가 깨끗하지 않다. 메뉴 클릭 시 클래스 on을 추가하는데, 활용할 수 있 는 방안 찾아보기....
				
			});
			
		});
		
	</script>
	
</body>
</html>