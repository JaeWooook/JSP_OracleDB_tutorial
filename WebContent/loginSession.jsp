<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		if(session.getAttribute("memberId") !=null)//이걸로 세션이 있으면 이미 로그인 되어있구나 하고 넘겨준다.
			response.sendRedirect("loginOkSession.jsp");
	%>
	<form action="loginConSe" method="post">
		ID : <input text="text" name="m_ID"><br>
		PW : <input text="password" name="m_PW"><br>
		<input type="submit" value="login">
	</form>
</body>
</html>