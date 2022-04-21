<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"  href="/bootstrap-4.6.1-dist/css/bootstrap.min.css" />
</head>
<body>
<div class="<jum></jum>botron jumbotron-fluid" style="margin-bottom:0">
  <div class="container">
    <h1 class="display-4">제품관리시스템</h1>
    <p class="lead">model2</p>
  </div>
</div>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">  
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        <a class="nav-link" href="index.jsp">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/insert.jsp">제품입력</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/list.do">제품목록</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/delete.jsp">제품삭제</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/search.jsp">제품검색</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="/update.jsp">제품수정</a>
      </li>
    </ul>
  </div>
</nav>
<div class="container" style="margin-top:10px">