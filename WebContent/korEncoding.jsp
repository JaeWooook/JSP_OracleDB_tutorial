<% request.setCharacterEncoding("UTF-8"); %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%!
		String mName;
		String mNickname;
	%>
	
	<%
		mName = request.getParameter("m__name");
		mNickname = request.getParameter("m__nickname");
	%>
	
	이름 : <%= mName %>
	<br>
	별명 : <%= mNickname %>
</body>
</html>