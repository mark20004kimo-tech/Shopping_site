<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style type="text/css">
body{
         margin:0px;
         padding:0px;
         background:#fff url(pic/coffee3.jpg) center fixed no-repeat;　//設定背景圖片的呈現方式
        　
        }
h1 {
	align: center;
	font-size: 45px;
	color: red;
}
</style>
</head>
<body>
<h1 align="center">會員訂單查詢</h1>
<br><br><br>
<table border="1" align="center" valign="middle" style="background: url(pic/green2.jpg) no-repeat">
<tr>
<td style="height:250px;width:600px;" align='center' valign="middle">
   <form action="findporder" method="POST">
           請輸入會員帳號:<br>
            <input type="text" name="user"><br><br>
            <input type="hidden" name="operation" value="find"/>
            <input type="submit" value="提交" style="width:100px;height:30px;"/>
        </form>
        </td>
</tr>
</table>
</body>
</html>