<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="model.manager"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<script type="text/javascript">
	function check() {
		
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
<h1 align="center">�޲z����ƭק�</h1>
<div class="header"><% manager mr=(manager)session.getAttribute("Mr");%>
                    <%=mr.getName()%>~
                            �|��ID:<%=mr.getId()%></div>
	<div class="sideBar"></div>
	<div class="main">
		<form name="loginForm" action="mrmanagerupdate" mehod="post">
			<table width=40% align=center border=1 bgcolor="white">
				<tr>
					<td colspan=2 height=100px>
			        <img src="../pic/update2.png">
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
					<td colspan=2 align=center><input type="button" value="��s" style="width:100px;height:30px;"
						onClick="check()">
			</table>
		</form>
	</div>
	<div class="footer"></div>
</body>
</html>