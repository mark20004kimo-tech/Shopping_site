<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<script type="text/javascript">
	function check() {
		if (loginForm.user.value == "") {
			alert("帳號不可空白");
			return;
		}
		if (loginForm.password.value == "") {
			alert("密碼不可為空");
			return;
		}
		if (loginForm.name.value == "") {
			alert("姓名不可空白");
			return;
		}
		if (loginForm.phone.value == "") {
			alert("電話不可空白");
			return;
		}
		if (loginForm.address.value == "") {
			alert("地址不可空白");
			return;
		}
		loginForm.submit();
	}
</script>
<style>
    body{
         margin:0px;
         padding:0px;
         background:#fff url(../pic/coffee3.jpg) center center fixed no-repeat;　//設定背景圖片的呈現方式
         background-size: cover;　
}        
</style>
</head>
<body>
<div class="header"></div>
	<div class="sideBar"></div>
	<div class="main">
		<form name="loginForm" action="mraddmanager" mehod="post">
			<table width=10% bgcolor="white" cellpadding="30" align=center border=6 >
				<tr>
					<td colspan=2 height=100px>
					<h1>新增管理員</h1>
					<img src="../pic/cup1.jpg">
				<tr>
					<td>帳號
					<td><input type="text" name="user">
				<tr>
					<td>密碼
					<td><input type="text" name="password">
				<tr>
				    <td>姓名
					<td><input type="text" name="name">
				<tr>
				    <td>電話
					<td><input type="text" name="phone">
				<tr>
				    <td>地址
					<td><input type="text" name="address">
				<tr>
					<td colspan=2 align=center><input type="button" value="註冊" style="width:100px;height:30px;"
						onClick="check()">
			</table>
		</form>
	</div>
	<div class="footer"></div>
</body>
</html>