<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="utf-8"%>
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
	background-color: burlywood;/*選單背景顏色*/
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
	color: purple;/*字體顏色*/
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

 .footer{
         color:white;
         font-weight:bold ;
         font-size: 20px;
         
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

<body style="background:url(pic/coffee3.jpg) no-repeat">
	
	<!--側欄界面設計-->
	<div id="mySidenav" class="sidenav">
		<a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
		<a href="login.jsp">1)會員登入</a><br> 
		<a href="addmember.jsp">2)會員註冊</a><br> 
		<a href="mr/mrlogin.jsp">3)管理者登入</a><br> 		
	</div>
	
	<div id="main">
	<span style="font-weight: bold; font-size: 50px; color: red; text-align: center; display:block">歡迎光臨!
			X X X 咖啡線上購物網</span><br><br><br>
	
	<span style="font-weight:bold ;border: 5px outset pink; background-color:pink ;
		  font-size: 30px; color:black ; cursor: pointer" onclick="openNav()">&#9776;
		    選單</span>
	</div>
	<br>
	<br>
	<div class="footer">
	
	科學證明：１３個你應該要多喝咖啡的理由
	 <li>1. 咖啡使你精力充沛，且讓你更聰明</li>
	 <li>2. 幫助燃燒脂肪</li>
	 <li>3. 大大改善活動能力</li>
	 <li>4. 富含必要的營養素</li>
	 <li>5. 減少罹患第二型糖尿病的風險</li>
	 <li>6. 預防阿茲海默症及老人痴呆</li>
	 <li>7. 減少罹患帕金森氏症的風險</li>
	 <li>8. 具護肝效果</li>
	 <li>9. 打擊憂鬱讓你更開心</li>
	 <li>10. 較不易罹患特定癌症</li>
	 <li>11. 預防心臟病及減少中風機會</li>
	 <li>12. 助你更長壽</li>
	 <li>13. 咖啡是西方飲食中最大的抗氧化劑來源</li>
	 
	 </div>
</body>
</html>