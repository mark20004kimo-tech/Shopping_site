<%@ page language="java" contentType="text/html; charset=BIG5"
	pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<style>
    body{
         margin:0px;
         padding:0px;        
         background:#fff url(pic/tea.jpg) center center fixed no-repeat;　//設定背景圖片的呈現方式
         background-size: cover;　
}        
</style>
</head>
<body>
	<form action="confirm" method="post">
		<table width=750 align=center>
			<tr>
				<td colspan=3>
				<h3 align="center">商品</h3>
			<tr>
				<td>摩卡    $50</td>
				<td>拿鐵    $60</td>
				<td>卡布奇諾    $70</td>
			<tr>
				<td><img src="pic\1.jpg"><br> <select name="pro1">
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9
				</select><br>
			            <p>摩卡咖啡有酸甘的特佳、風味獨</p>
			            <p>特，含有巧克力的味道，是極具</p>
			            <p>特色的一種純品咖啡，飲之潤滑</p>
			            <p>可口，醇味歷久不退，若調配綜</p>
			            <p>合咖啡，更是一種理想的品種。</p>
			            <p>柔軟的口感，帶有原野氣息的酒</p>
			            <p>香，且略呈酸味，入口脂感厚黏</p>
			            <p>，酸亮但強度弱，明顯焦糖香，</p>
			            <p>水果香味明顯，冷卻後有著濃郁</p>
			            <p>的黑糖香。</p>
				
				<td><img src="pic\2.jpg"><br> <select name="pro2">
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9
				</select><br>
				        <p>牛奶才是這杯咖啡的主角，標準</p>
				        <p>比例大約是1 / 6濃縮咖啡、4 / 6 </p>
				        <p>熱牛奶、1 / 6奶泡，此外，也可</p>
				        <p>以再添加肉桂、香草等不同風味</p>
				        <p>，由於牛奶的比例高、奶泡厚重</p>
				        <p>，因此口感更顯甜香且柔順細緻。</p><br>
				        <br><br><br><br><br><br><br>
				   
				<td><img src="pic\3.jpg"><br> <select name="pro3">
						<option value="0">0
						<option value="1">1
						<option value="2">2
						<option value="3">3
						<option value="4">4
						<option value="5">5
						<option value="6">6
						<option value="7">7
						<option value="8">8
						<option value="9">9
				</select><br>
				        <p>卡布奇諾和拿鐵咖啡的成分一樣</p>
				        <p>，都是 Espresso + 牛奶 + 奶泡，</p>
				        <p>不同之處僅在於卡布奇諾奶泡比</p>
				        <p>牛奶多，拿鐵則是牛奶比奶泡多</p>
				        <p>。</p>
				        <p>同等價位的卡布奇諾，通常比拿</p>
				        <p>鐵要小杯，但咖啡味更濃郁。</p> 
				        <p>綿密的奶泡和苦咖啡的碰撞，也</p>
				        <p>得到大量顧客的喜愛，尤其是女</p>
				        <p>生！</p>
			<tr>
				<td colspan=3 align=center><input type="submit" value="ok" style="width:100px;height:30px;">
		</table>
	</form>
</body>
</html>