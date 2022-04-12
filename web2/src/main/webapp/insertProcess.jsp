<%@page import="web2.dto.MemberDTO"%>
<%@page import="web2.dao.MemberDAO"%>
<%@page import="web2.dao.JdbcUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//한글처리
	request.setCharacterEncoding("utf-8");


	//폼에서 입력값 가져오기
	String name = request.getParameter("name");
	String addr = request.getParameter("addr");
	String email = request.getParameter("email");
	int age = Integer.parseInt(request.getParameter("age"));
	
	MemberDTO insertDto = new MemberDTO(name,addr,email,age);
	
	
	//db작업
	Connection con = JdbcUtil.getConnection();
	MemberDAO dao = new MemberDAO(con);
	
	String path = "";
	
	if(dao.insert(insertDto)){
		//페이지 이동 => 전체 리스트 보여주기
		path = "list.jsp";
		//커밋
		JdbcUtil.commit(con);
	}else{
		//페이지 이동 => 실패가 발생한 페이지 보여주기
		path = "/insert.jsp";
		//롤백
		JdbcUtil.rollback(con);
	}
	JdbcUtil.close(con);
	
	response.sendRedirect(path);
%>












