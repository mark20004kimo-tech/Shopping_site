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
         background:#fff url(pic/tea.jpg) center center fixed no-repeat;　//設定背景圖片的呈現方式
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
<h1 align="center">訂單確認</h1>
	<%
		Porder p = (Porder) session.getAttribute("P");
	%><br>
	<table width=500 align=center>
		<tr>
			<td colspan=2>
		<tr>
			<td>帳號
			<td><%=p.getUser()%>
		<tr>
			<td>姓名
			<td><%=p.getName()%>
		<tr>
			<td>地址
			<td><%=p.getAddress()%>
		<tr>
			<td>電話
			<td><%=p.getPhone()%>
		<tr>
			<td>商品1
			<td><%=p.getProduct1()%>
		<tr>
			<td>商品2
			<td><%=p.getProduct2()%>
		<tr>
			<td>商品3
			<td><%=p.getProduct3()%>
		<tr>
			<td>總共
			<td><%=p.getSum()%>
		<tr>
			<td colspan=2><a href="add">確定</a>

				<div align="center">
					<form>
						<input name="print" type="button" value="列印此頁" style="width:100px;height:30px;"
							onclick="varitext()">
					</form>
				</div>
	</table>
</body>
</html>