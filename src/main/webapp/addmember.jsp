<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<script type="text/javascript"  language="javascript" src="js/javaScript01.js" charset="UTF-8" ></script>
<link href="css/css01.css" rel="stylesheet" type="text/css"/>    
</style>
</head>
<body>
<div class="header"></div>
	<div class="sideBar"></div>
	<div class="main">
		<form name="loginForm" action="checkUser" mehod="post">
			<table width=10% bgcolor="white" cellpadding="30" align=center border=6 >
				<tr>
					<td colspan=2 height=100px>
					<h1>���U�|��</h1>
					<img src="pic\cup1.jpg">
				<tr>
					<td>�b��
					<td><input type="text" name="user">
				<tr>
					<td>�K�X
					<td><input type="text" name="password">
				<tr>
				    <td>�m�W
					<td><input type="text" name="name">
				<tr>
				    <td>�q��
					<td><input type="text" name="phone">
				<tr>
				    <td>�a�}
					<td><input type="text" name="address">
				<tr>
					<td colspan=2 align=center><input type="button" value="���U" style="width:100px;height:30px;"
						onClick="check()">
			</table>
		</form>
	</div>
	<div class="footer"></div>
</body>
</html>