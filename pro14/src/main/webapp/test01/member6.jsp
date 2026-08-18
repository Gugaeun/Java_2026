<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<jsp:useBean id="m2" class="sec01.ex02.MemberBean2"/>
<jsp:setProperty name="m2" property="*" />
<jsp:useBean id="addr" class="sec01.ex02.Address" />
<jsp:setProperty name="addr" property="city" value="서울" />
<jsp:setProperty name="addr" property="zipcode" value="07654" />
<%
	m2.setAddr(addr);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 출력창</title>
</head>
<body>
	<table border="1" width="800">
        <tr align="center" bgcolor="#99ccff">
            <td><b>아이디</b></td>
            <td><b>비밀번호</b></td>
            <td><b>이름</b></td>
            <td><b>이메일</b></td>
        </tr>
        <tr align="center">
            <td>${m2.id}</td>
            <td>${m2.pwd}</td>
            <td>${m2.name}</td>
            <td>${m2.email }</td>
            <td><%=m2.getAddr().getCity() %></td>
            <td><%=m2.getAddr().getZipcode() %></td>
        </tr>
        
        <tr align="center">
            <td>${m2.id}</td>
            <td>${m2.pwd}</td>
            <td>${m2.name}</td>
            <td>${m2.email}</td>
            <td>${m2.addr.city }</td>
            <td>${m2.addr.zipcode }</td>
        </tr>
    </table>
</body>
</html>