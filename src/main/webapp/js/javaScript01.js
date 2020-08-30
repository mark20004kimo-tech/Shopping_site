/*!
 * jQuery blockUI plugin
 * Version 2.70.0-2014.11.23
 * Requires jQuery v1.7 or later
 *
 * Examples at: http://malsup.com/jquery/block/
 * Copyright (c) 2007-2013 M. Alsup
 * Dual licensed under the MIT and GPL licenses:
 * http://www.opensource.org/licenses/mit-license.php
 * http://www.gnu.org/licenses/gpl.html
 *
 * Thanks to Amir-Hossein Sobhi for some excellent contributions!
 */

function check() {
		if (loginForm.user.value == "") {
			alert("帳號不可空白");
			return;
		}
		if (loginForm.password.value == "") {
			alert("密碼不可為空");
			return;
		}
		if (loginForm.name.value == "") {
			alert("姓名不可空白");
			return;
		}
		if (loginForm.phone.value == "") {
			alert("電話不可空白");
			return;
		}
		if (loginForm.address.value == "") {
			alert("地址不可空白");
			return;
		}
		loginForm.submit();
	};
