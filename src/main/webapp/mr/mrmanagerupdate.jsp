<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="model.Manager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<script type="text/javascript">
	function check() {
		
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
<style type="text/css">
   .header{
          color:red;
          font-size: 30px;
          font-weight: bold;
   }
   h1 {
	align: center;
	font-size: 45px;
	color: red;
}
</style>
</head>
<body style="background:url(../pic/coffee4.jpg) no-repeat">
<h1 align="center">管理員資料修改</h1>
<div class="header"><% Manager mr=(Manager)session.getAttribute("Mr");%>
                    <%=mr.getName()%>~
                            會員ID:<%=mr.getId()%></div>
	<div class="sideBar"></div>
	<div class="main">
		<form name="loginForm" action="mrmanagerupdate" mehod="post">
			<table width=40% align=center border=1 bgcolor="white">
				<tr>
					<td colspan=2 height=100px>
			        <img src="../pic/update2.png">
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
					<td colspan=2 align=center><input type="button" value="更新" style="width:100px;height:30px;"
						onClick="check()">
			</table>
		</form>
	</div>
	<div class="footer"></div>
</body>
</html>