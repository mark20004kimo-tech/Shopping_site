<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="model.Member"%>
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

</style>
</head>
<body style="background:url(pic/coffee4.jpg) no-repeat">


<div class="header"><% Member m=(Member)session.getAttribute("M");%>
                    <%=m.getName()%>~
                            �|��ID:<%=m.getId()%></div>
	<div class="sideBar"></div>
	<div class="main">
		<form name="loginForm" action="updateuser" mehod="post">
			<table width=40% align=center border=1 bgcolor="#2c8f8b">
				<tr>
					<td colspan=2 height=100px>
			        <img src="pic\updatemember.png">			
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