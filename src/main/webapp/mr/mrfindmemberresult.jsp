<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--輸出,條件,迭代標籤庫-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%> <!--資料格式化標籤庫-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%> <!--資料庫相關標籤庫-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%> <!--常用函式標籤庫-->
<%@ page isELIgnored="false"%> <!--支援EL表示式，不設的話，EL表示式不會解析-->
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="model.Member"
    import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style>
    body{
         margin:0px;
         padding:0px;        
         background:#fff url(../pic/tea.jpg) center center fixed no-repeat;　//設定背景圖片的呈現方式
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
      <%
      List<Member> m = (List<Member>)session.getAttribute("ll");
      System.out.println(m);
      
	%>
	<h1 align="center">會員列表</h1>
    <span style="font-weight:bold ;border: 5px outset pink; background-color:pink ;
		  font-size: 30px; color:black ; cursor: pointer">
		  <a href="mrloginok.jsp">回管理員功能選單</a>
    </span>
    
	<table border="1" align="center" valign="middle" bgcolor="white">
	  <tr class="title">
	    <td>id</td>
	    <td>name</td>
	    <td>user</td>
	    <td>password</td>
	    <td>phone</td>
	  	<td>address</td>
	    
	   </tr> 
	    
            <c:forEach items="${ll}" var="m">
                <tr>
                 <td>${m.id}</td>
                 <td>${m.name}</td>
                 <td>${m.user}</td>
                 <td>${m.password}</td>
                 <td>${m.phone}</td>
                 <td>${m.address}</td>
                </tr>
            </c:forEach>
	</table>	
</body>
</html>