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
		if (loginForm.name.value == "") {
			alert("�m�W���i�ť�");
			return;
		}
		if (loginForm.phone.value == "") {
			alert("�q�ܤ��i�ť�");
			return;
		}
		if (loginForm.address.value == "") {
			alert("�a�}���i�ť�");
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
</head>
<body>
<div class="header"></div>
	<div class="sideBar"></div>
	<div class="main">
		<form name="loginForm" action="mraddmanager" mehod="post">
			<table width=10% bgcolor="white" cellpadding="30" align=center border=6 >
				<tr>
					<td colspan=2 height=100px>
					<h1>�s�W�޲z��</h1>
					<img src="../pic/cup1.jpg">
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