<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> <!--��X,����,���N���Үw-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fmt"%> <!--��Ʈ榡�Ƽ��Үw-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="sql"%> <!--��Ʈw�������Үw-->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="fn"%> <!--�`�Ψ禡���Үw-->
<%@ page isELIgnored="false"%> <!--�䴩EL��ܦ��A���]���ܡAEL��ܦ����|�ѪR-->
<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"
    import="model.Porder"
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
    <%List<Porder> p = (List<Porder>)session.getAttribute("l");%>
    <h1 align="center">�q��C��</h1>
    <span style="font-weight:bold ;border: 5px outset pink; background-color:pink ;
		  font-size: 30px; color:black ; cursor: pointer">
		   <a href="loginok.jsp">�^�|���\����</a>
    </span>
	
	<table border="1" align="center" valign="middle" bgcolor="white">
	  <tr class="title">
	    <td>id</td>
	    <td>product1</td>
	    <td>product2</td>
	    <td>product3</td>
	    <td>sum</td>
	    <td>name</td>
	    <td>phone</td>
	    <td>address</td>
	    <td>user</td>
	   </tr> 	    
            <c:forEach items="${l}" var="p">
                <tr>
                 <td>${p.id}</td>
                 <td>${p.product1}</td>
                 <td>${p.product2}</td>
                 <td>${p.product3}</td>
                 <td>${p.sum}</td>
                 <td>${p.name}</td>
                 <td>${p.phone}</td>
                 <td>${p.address}</td>
                 <td>${p.user}</td>
                </tr>
            </c:forEach>
	</table>	

    
</body>
</html>