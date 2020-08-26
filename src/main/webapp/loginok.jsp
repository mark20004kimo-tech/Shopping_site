<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="utf-8"
	import="model.Member"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
<style type="text/css">
@charset "utf-8";
/* CSS Document */
body {
	font-family: "Lato", sans-serif;
}

/*側邊欄選擇器*/
.sidenav {
	height: 100%;
	width: 0; /*原始寬度爲0*/
	position: fixed;
	z-index: 1;
	top: 0;
	right: 0;
	background-color: burlywood; /*選單背景顏色*/
	overflow-x: hidden;
	transition: 0.5s;
	padding-top: 100px;
	border: 5px outset brown;
}

/*側邊欄選項選擇器*/
.sidenav a {
	padding: 8px 8px 8px 32px;
	text-decoration: none;
	font-size: 30px;
	color: purple; /*字體顏色*/
	display: block;
	transition: 0.3s;
}

/*側欄標籤和關閉按鈕光標的效果*/
.sidenav a:hover, .offcanvas a:focus {
	color: #f1f1f1;
}

/*側欄和關閉按鈕的位置選擇器*/
.sidenav .closebtn {
	position: absolute;
	top: 0;
	right: 25px;
	font-size: 36px;
	margin-left: 50px;
}


/*當文檔高度小於450px時，改變側欄的padding屬性和字體大小*/
@media screen and (max-height: 450px) {
	.sidenav {
		padding-top: 15px;
	}
	.sidenav a {
		font-size: 18px;
	}
}
</style>

<script type="text/ecmascript">
	
	
    /*改變原始寬度（0）*/
    function openNav() {
        document.getElementById("mySidenav").style.width = "250px";
    }
    /*恢復原始寬度0*/
    function closeNav() {
        document.getElementById("mySidenav").style.width = "0";
    }


</script>
</head>

<body style="background: url(pic/coffee3.jpg) no-repeat">

	<!--側欄界面設計-->
	<div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<a href="memberupdate.jsp">1)會員資料修改</a><br> 
		<a href="porder.jsp">2)購物</a><br>
		<a href="findporder.jsp">3)訂單查詢</a><br>
        <a href="porderupdate.jsp">4)訂單修改</a><br>
        <a href="porderdelete.jsp">5)訂單刪除</a><br>
        <a href="logout.jsp">6)會員登出</a>
	</div>

	<div id="main">
		<marquee style="font-weight: bold; font-size: 40px; color: red"
			direction="right" Width="1000" height="45" scrollamount="10">
			Welcome!<% Member m=(Member)session.getAttribute("M");%>
            <%=m.getName()%>~
                        會員ID:<%=m.getId()%></marquee>
		<br>
		<br> <span
			style="font-weight: bold; border: 5px outset pink; background-color: pink; font-size: 30px; color: black; cursor: pointer"
			onclick="openNav()">&#9776; 會員功能選單</span>
	</div>
</body>
</html>