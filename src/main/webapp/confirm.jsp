<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5" import="model.Porder"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<script language="JavaScript">

function varitext(text){
text=document
print(text)
}

</script>
<style>
    body{
         margin:0px;
         padding:0px;        
         background:#fff url(pic/tea.jpg) center center fixed no-repeat;�@//�]�w�I���Ϥ����e�{�覡
         background-size: cover;
} 
h1 {
	align: center;
	font-size: 45px;
	color: red;
}
</style>   
</head>
<body>
<h1 align="center">�q��T�{</h1>
	<%
		Porder p = (Porder) session.getAttribute("P");
	%><br>
	<table width=500 align=center>
		<tr>
			<td colspan=2>
		<tr>
			<td>�b��
			<td><%=p.getUser()%>
		<tr>
			<td>�m�W
			<td><%=p.getName()%>
		<tr>
			<td>�a�}
			<td><%=p.getAddress()%>
		<tr>
			<td>�q��
			<td><%=p.getPhone()%>
		<tr>
			<td>�ӫ~1
			<td><%=p.getProduct1()%>
		<tr>
			<td>�ӫ~2
			<td><%=p.getProduct2()%>
		<tr>
			<td>�ӫ~3
			<td><%=p.getProduct3()%>
		<tr>
			<td>�`�@
			<td><%=p.getSum()%>
		<tr>
			<td colspan=2><a href="add">�T�w</a>

				<div align="center">
					<form>
						<input name="print" type="button" value="�C�L����" style="width:100px;height:30px;"
							onclick="varitext()">
					</form>
				</div>
	</table>
</body>
</html>