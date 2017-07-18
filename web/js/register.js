var xmlHttp;

function createXMLHttpRequest() {
	if(window.ActiveXObject) {
		xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
	} else if(window.XMLHttpRequest) {
		xmlHttp = new XMLHttpRequest();
	}
}

function validate() {
	createXMLHttpRequest();
	var by = document.getElementById("y");
	var bm = document.getElementById("m");
	var bd = document.getElementById("d");
	if(by != "" && bm != "" && bd !== "") {
		var url = "register.php?y=" + escape(by.value) + "&m=" + escape(bm.value) + "&d=" + escape(bd.value);

		xmlHttp.open("GET", url, "true");
		xmlHttp.onreadystatechange = callback;
		xmlHttp.send(null);
	}
}

function callback() {
	if(xmlHttp.readyState == 4) {
		if(xmlHttp.status == 200) {
			var val = xmlHttp.responseXML.getElementsByTagName("passed")[0].firstChild.nodeValue;
			var mes = xmlHttp.responseXML.getElementsByTagName("message")[0].firstChild.nodeValue;
			setMessage(mes, val);
		}
	}
}

function setMessage(message, isValid) {
	var messageArea = document.getElementById("birth");
	var fontColor = "red";
	if(isValid == 1) {
		fontColor = "green";
		messageArea.innerHTML = "<font color=" + fontColor + ">" + message + "</font>";
	} else {
		fontColor = "red";
		messageArea.innerHTML = "<font color=" + fontColor + ">" + message + "</font>";
	}
}

/***c uname检测  ***/
function cuname() {
	createXMLHttpRequest();
	var name = document.getElementById("uname");
	//alert(name.value);
	//var url="cheuname.php?uname="+encodeURI(name.value);//encodeURI()可以将汉字转码
	//alert(encodeURI(name.value));
	var url = "cheuname.php?uname=" + name.value; //直接传递中文，escape()可以将汉字编码
	xmlHttp.open("GET", url, "true");
	xmlHttp.onreadystatechange = callbackc;
	xmlHttp.send(null);
}

function callbackc() {
	if(xmlHttp.readyState == 4) {
		if(xmlHttp.status == 200) {
			var val = xmlHttp.responseXML.getElementsByTagName("passed")[0].firstChild.nodeValue;
			var mes = xmlHttp.responseXML.getElementsByTagName("message")[0].firstChild.nodeValue;

			setMessagec(mes, val);
		}
	}
}

function setMessagec(message, isValid) {
	var messageArea = document.getElementById("unameMessage");
	var fontColor = "red";
	if(isValid == 3) {
		fontColor = "green";
		messageArea.innerHTML = "<font color=" + fontColor + ">" + message + "</font>";
	} else {
		fontColor = "red";
		messageArea.innerHTML = "<font color=" + fontColor + ">" + message + "</font>";
	}
}
/***c 检测密码 ***/
function passwd1() {
	var password1 = document.getElementById("pwa");
	var pattern = /^\w{6,20}$/;
	if(!pattern.test(document.form1.pw1.value)) {
		fontColor = "red";
		password1.innerHTML = "<font color=" + fontColor + ">密码不符合要求，只能使用“字母/数字/下划线”并且要大于5位小于20位！</font>";
	} else {
		fontColor = "green";
		password1.innerHTML = "<font color=" + fontColor + ">您输入的密码符合要求!</font>";

	}
}

function passwd2() {
	var password1 = document.getElementById("pwa");
	var password2 = document.getElementById("pwb");
	if(document.form1.pw2.value.length >= 20 || document.form1.pw2.value.length < 6 || document.form1.pw2.value == "") {
		fontColor = "red";
		password2.innerHTML = "<font color=" + fontColor + ">密码太短，请确保密码大于5位！</font>";

	} else if(document.form1.pw1.value != document.form1.pw2.value) {
		fontColor = "red";
		password2.innerHTML = "<font color=" + fontColor + ">2次输入的密码不一样！</font>";
	} else {
		fontColor = "green";
		password2.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /> 密码一致恭喜您!</font>";
		password1.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";
	}
}

function realname() {
	var password1 = document.getElementById("realn");
	if(document.form1.real_name.value.length >= 16 || document.form1.real_name.value.length < 2 || document.form1.real_name.value == "") {
		fontColor = "red";
		password1.innerHTML = "<font color=" + fontColor + ">请输入您的真实姓名。</font>";
	} else {
		fontColor = "green";
		password1.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";

	}
}

function idcard() {
	var idcar = document.getElementById("idcard");
	if(document.form1.id_card.value.length > 20 || document.form1.id_card.value.length < 15 || document.form1.id_card.value == "") {
		fontColor = "red";
		idcar.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：身份证位数不正确。</font>";
	} else {
		var pattern = /[^0-9]/;
		if(pattern.test(document.form1.id_card.value)) {
			fontColor = "red";
			idcar.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：包含字母或汉字。</font>";
		} else {
			fontColor = "green";
			idcar.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";
		}
	}
}

function email() {
	var emai = document.getElementById("email");
	if(document.form1.e_mail.value.length > 30 || document.form1.e_mail.value.length < 10 || document.form1.e_mail.value == "") {
		fontColor = "red";
		emai.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：E_mail太短。</font>";
	} else {
		var pattern = /^[a-zA-Z0-9\-\_]+\@[a-zA-Z0-9\-\_\.]+\.([a-zA-Z]{2,4})$/;
		if(pattern.test(document.form1.e_mail.value)) {
			fontColor = "green";
			emai.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";
		} else {
			fontColor = "red";
			emai.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：Mail格式不正确。</font>";
		}
	}
	/***'/^[a-zA-Z0-9\-]+\@[a-zA-Z0-9\-\.]+\.([a-zA-Z]{2,3})$/;**/
}

function cmsn() {
	var cms = document.getElementById("cmsn");
	if(document.form1.msn.value.length > 30 || document.form1.msn.value.length < 14 || document.form1.msn.value == "") {
		fontColor = "red";
		cms.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：msn太短。</font>";
	} else {
		var pattern = /^[a-zA-Z0-9\-]+\@[a-zA-Z0-9\-\.]+\.([a-zA-Z]{2,3})$/;
		if(pattern.test(document.form1.msn.value)) {
			fontColor = "green";
			cms.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";
		} else {
			fontColor = "red";
			cms.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：Mail格式不正确。</font>";
		}
	}
}

function cqq() {
	var cq = document.getElementById("cqq");
	if(document.form1.qq.value.length > 15 || document.form1.qq.value.length < 5 || document.form1.qq.value == "") {
		fontColor = "red";
		cq.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：位数不正确。</font>";
	} else {
		var pattern = /[^0-9]/;
		if(pattern.test(document.form1.qq.value)) {
			fontColor = "red";
			cq.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：包含字母或汉字。</font>";
		} else {
			fontColor = "green";
			cq.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";
		}
	}
}

function cmob() {
	var cmo = document.getElementById("cmob");
	if(document.form1.mobile.value.length > 15 || document.form1.mobile.value.length < 11 || document.form1.mobile.value == "") {
		fontColor = "red";
		cmo.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：位数不正确。</font>";
	} else {
		var pattern = /[^0-9]/;
		if(pattern.test(document.form1.mobile.value)) {
			fontColor = "red";
			cmo.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：包含字母或汉字。</font>";
		} else {
			fontColor = "green";
			cmo.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";
		}
	}
}

function cphone() {
	var cphon = document.getElementById("cphone");
	if(document.form1.phone.value.length > 15 || document.form1.phone.value.length < 7 || document.form1.phone.value == "") {
		fontColor = "red";
		cphon.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：位数不正确。</font>";
	} else {
		var pattern = /[^0-9]/;
		if(pattern.test(document.form1.phone.value)) {
			fontColor = "red";
			cphon.innerHTML = "<font color=" + fontColor + "><img src=tp/c_err.gif width=13 height=13 />：包含字母或汉字。</font>";
		} else {
			fontColor = "green";
			cphon.innerHTML = "<font color=" + fontColor + "><img src=tp/c_rig.gif width=13 height=13 /></font>";
		}
	}
}