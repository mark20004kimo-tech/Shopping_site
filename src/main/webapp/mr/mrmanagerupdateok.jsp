<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<%
session.removeAttribute("Mr");
%>
<style type="text/css">
h1 {
	align: center;
	font-size: 45px;
	color: red;
}
</style>
</head>
<body style="background: url(../pic/okok.png) no-repeat">

<h1 align="center">管理員資料更新成功</h1>
	
	<span style="font-weight:bold ;border: 5px outset pink; background-color:pink ;
		  font-size: 30px; color:black ; cursor: pointer">
		    <a href="mrlogin.jsp">回管理員登入頁</a>
    </span>
</body>
</html>