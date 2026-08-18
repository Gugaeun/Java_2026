<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%
	request.setCharacterEncoding("UTF-8");
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	String name = request.getParameter("name");
	String email = request.getParameter("email");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보창</title>
</head>
<body>
	<table border="1" align="center">
		<tr align="center" bgcolor="#99ccff">
			<td width="200"><b>아이디</b></td>
			<td width="200"><b>비밀번호</b></td>
			<td width="200"><b>이름</b></td>
			<td width="200"><b>이메일</b></td>
		</tr>
		<tr align="center">
			<td>${memberList[0].id }</td>
			<td>${memberList[0].pwd }</td>
			<td>${memberList[0].name }</td>
			<td>${memberList[0].email }</td>
		</tr>
		<tr align="center">
			<td>${memberList[1].id }</td>
			<td>${memberList[1].pwd }</td>
			<td>${memberList[1].name }</td>
			<td>${memberList[1].email }</td>
		</tr>
	</table>
		
</body>
</html>