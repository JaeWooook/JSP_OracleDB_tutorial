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
		if(session.getAttribute("memberId") !=null)//�̰ɷ� ������ ������ �̹� �α��� �Ǿ��ֱ��� �ϰ� �Ѱ��ش�.
			response.sendRedirect("loginOkSession.jsp");
	%>
	<form action="loginConSe" method="post">
		ID : <input text="text" name="m_ID"><br>
		PW : <input text="password" name="m_PW"><br>
		<input type="submit" value="login">
	</form>
</body>
</html>