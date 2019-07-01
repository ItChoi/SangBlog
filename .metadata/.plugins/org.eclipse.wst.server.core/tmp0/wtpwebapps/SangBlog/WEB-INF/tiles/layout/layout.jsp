<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="/resources/css/tiles/manager_header.css" rel="stylesheet" type="text/css">
<style>
	html body .wrap {
		margin: 0px;
		padding: 0px; 
	}
</style>
</head>
<body>
	<div class="wrap">
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="navigator" />
		<tiles:insertAttribute name="content" />	
	</div>
</body>
</html>