<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
<script type="text/javascript">
	function check() {
		if (loginForm.user.value == "") {
			alert("�b�����i�ť�");
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
<style>
 body{
         margin:0px;
         padding:0px;        
         background:#fff url(../pic/tea.jpg) center center fixed no-repeat;�@//�]�w�I���Ϥ����e�{�覡
         background-size: cover;�@
     }        
</style>
<body>
<form name="loginForm" action="mrporderupdate" method="post">
 �ק�q��Id:<input type="number" name="id"><br><br>
		<table width=750 align=center>
			<tr>
				<td colspan=3><h3 align="center">�ӫ~</h3></td>
			<tr>
				<td>���d    $50</td>
				<td>���K    $60</td>
				<td>�d���_��    $70</td>	
			<tr>
				<td><img src="../pic/1.jpg"><br> <select name="pro1">
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
			            <p>���d�@�ئ��ĥ̪��S�ΡB�����W</p>
			            <p>�S�A�t�����J�O�����D�A�O����</p>
			            <p>�S�⪺�@�د«~�@�ءA��������</p>
			            <p>�i�f�A�J�����[���h�A�Y�հt��</p>
			            <p>�X�@�ءA��O�@�زz�Q���~�ءC</p>
			            <p>�X�n���f�P�A�a���쳥�𮧪��s</p>
			            <p>���A�B���e�Ĩ��A�J�f�׷P�p�H</p>
			            <p>�A�īG���j�׮z�A����J�}���A</p>
			            <p>���G��������A�N�o�ᦳ�ۿ@��</p>
			            <p>���¿}���C</p>
			            
				<td><img src="../pic/2.jpg"><br> <select name="pro2">
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
				        <p>�����~�O�o�M�@�ت��D���A�з�</p>
				        <p>��Ҥj���O1 / 6�@�Y�@�ءB4 / 6 </p>
				        <p>�������B1 / 6���w�A���~�A�]�i</p>
				        <p>�H�A�K�[�׮ۡB���󵥤��P����</p>
				        <p>�A�ѩ��������Ұ��B���w�p��</p>
				        <p>�A�]���f�P���㲢���B�X���ӽo�C</p><br>
				        <br><br><br><br><br><br><br>
				        
				<td><img src="../pic/3.jpg"><br> <select name="pro3">
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
				        <p>�d���_�թM���K�@�ت������@��</p>
				        <p>�A���O Espresso + ���� + ���w�A</p>
				        <p>���P���B�Ȧb��d���_�ե��w��</p>
				        <p>�����h�A���K�h�O�����񥤪w�h</p>
				        <p>�C</p>
				        <p>�P�����쪺�d���_�աA�q�`��</p>
				        <p>�K�n�p�M�A���@�ب���@���C</p> 
				        <p>���K�����w�M�W�@�ت��I���A�]</p>
				        <p>�o��j�q�U�Ȫ��߷R�A�ר�O�k</p>
				        <p>�͡I</p>
				        
			    <tr>
					<td>�b��
					<td><input type="text" name="user">
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
				<td colspan=3 align=center><input type="button" value="ok" style="width:100px;height:30px;"
				onClick="check()">
		</table>
		  
	</form>
</body>
</html>