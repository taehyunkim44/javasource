<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		//로그아웃 => 세션 해제
		//           removeAtrribute("이름") / invalidate()
		session.removeAttribute("loginDto");
		
		//페이지 이동 : loginForm.jsp
		response.sendRedirect("loginForm.jsp");
%>