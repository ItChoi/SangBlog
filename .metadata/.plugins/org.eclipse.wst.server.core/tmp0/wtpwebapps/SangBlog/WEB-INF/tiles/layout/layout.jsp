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
	</div>
	
	<script type="text/javascript">
		$(document).ready(function() {
			
		});
		
	</script>
	
</body>
</html>