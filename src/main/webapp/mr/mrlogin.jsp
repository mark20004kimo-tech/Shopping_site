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
			alert("�b�����i�ť�");
			return;
		}
		if (loginForm.password.value == "") {
			alert("�K�X���i����");
			return;
		}
		loginForm.submit();
	}
</script>

<style>
    body{
         margin:0px;
         padding:0px;
         background:#fff url(../pic/coffee3.jpg) center center fixed no-repeat;�@//�]�w�I���Ϥ����e�{�覡
         background-size: cover;�@
}        
</style>

<link rel="stylesheet" href="css/st.css"></link>
</head>
<body >
	<div class="header"></div>
	<div class="sideBar"></div>
	<div class="main">
		<form name="loginForm" action="mrlogin" mehod="post">
			<table width=10% bgcolor="white" cellpadding="30" align=center border=6 >
				<tr height=50px>
					<td colspan=2 height=100px>
					<h1>�޲z���n�J</h1>
					<img src="../pic/cup1.jpg">
				<tr height=10px>
					<td>�b��
					<td><input type="text" name="user">
				<tr height=10px>
					<td>�K�X
					<td><input type="text" name="password">
				<tr height=10px>
					<td colspan=2 align=center><input type="button" value="ok" style="width:100px;height:30px;"
						onClick="check()">
			</table>
		</form>
	</div>
	<div class="footer"></div>
</body>
</html>