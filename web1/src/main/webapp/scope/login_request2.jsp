<%@page import="member.dto.LoginDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    	LoginDto loginDto = (LoginDto)session.getAttribute("loginDto");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- login.jsp 사용자 입력값을 여기서 출력이 가능한가?  X --%>
<p>userid : <%=request.getParameter("userid") %></p>
<br />
<hr />
<%-- <p>userid : <%=session.getAttribute("userid") %></p>
<p>password : <%=session.getAttribute("password") %></p>--%>
<p>userid : <%=loginDto.getUserid() %>
<p>password :<%=loginDto.getPassword() %>
<br />
<a href="scope1.jsp">이동하기</a>
</body>
</html>