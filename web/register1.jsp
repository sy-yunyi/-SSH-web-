<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/28 0028
  Time: 14:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>教员注册</title>
    <link rel="stylesheet" type="text/css" href="css/global.css"/>
    <link rel="stylesheet" type="text/css" href="css/reg2.css" />
    <script type="text/javascript" src="js/register.js"></script>
    <script language=JavaScript>
        function CheckValue(form1)
        {
            if(document.form1.uname.value=="")
            {
                alert("用户名不能为空！")
                return (false);
            }
            else if(document.form1.pw1.value=="")
            {
                alert("密码不能为空！")
                return (false);
            }
            else if(document.form1.pw1.value.length>20)
            {
                alert("密码不能多于20位！")
                return (false);
            }
            else if(document.form1.pw1.value!=document.form1.pw2.value)
            {
                alert("两次输入密码不同！")
                return (false);
            }
        }
    </script>

</head>

<body>
<div id="sl_2">
    <div id="sl_2_1">
        <a href="../"><img src="image/ic_launcher.png" width="128" height="59" alt="" border="0"></a>
    </div>
    <div id="sl_2_3">
        <p class="font40px fontOrange">教员注册 <em><span class="font50px"> 1</span></em><span class="font18px fontGray">步/2</span></p>
    </div>
    <div id="sl_2_2_1">
        <div align="center" class="px14"></div>
        <div id="sl_2_4">
            <table width="820" border="0" align="center" cellpadding="8" cellspacing="1">
                <form id="form1" name="form1" method="post" action="register2.jsp" onsubmit="return CheckValue(this)">
                    <tbody>
                    <tr>
                        <td height="50" colspan="3" class="orange" style=" border:1px solid #EBECEE; font-size:13px; padding-left:30px"><strong>注意</strong>：以下注册步骤中，任何输入框中请<strong>不要含有空格</strong>和<strong>非要求字符</strong>，否则将会被系统过滤。 </td>
                    </tr>
                    <tr bgcolor="#F3F3F3">
                        <td width="111" height="40" align="right" bgcolor="#F3F3F3"><span class="STYLE3"><font color="#FF0000">*</font> <strong>用户名</strong>：</span></td>
                        <td width="203" bgcolor="#F3F3F3">
                            <input name="" type="text" class="sl_2_table_input1" id="uname" onchange="cuname()" value="" size="16" maxlength="16" ;=""></td>
                        <td width="454" bgcolor="#F3F3F3">
                            <div class="fontGray font12px" id="unameMessage">请使用手机号注册！</div>
                        </td>
                    </tr>
                    <tr bgcolor="#FAFAFA">
                        <td height="40" align="right" bgcolor="#FCFCFC" class="p_l_20">
                            <font color="#FF0000">*</font> <strong>密　码</strong>：</td>
                        <td bgcolor="#FCFCFC">
                            <input name="" type="password" class="sl_2_table_input1" onchange="passwd1()" size="16" maxlength="20"></td>
                        <td bgcolor="#FCFCFC">
                            <div id="pwa" class="fontGray font12px">密码只能使用字母/数字/下划线,长度大于6位,小于20位。</div>
                        </td>
                    </tr>
                    <tr bgcolor="#F3F3F3">
                        <td height="40" align="right" class="p_l_20">
                            <font color="#FF0000">* </font><strong>重复密码</strong>：</td>
                        <td><input name="pw2" type="password" class="sl_2_table_input1" onchange="passwd2()" size="16" maxlength="20"></td>
                        <td>
                            <div id="pwb" class="fontGray font12px">同上,请确保2次输入一致</div>
                        </td>
                    </tr>
                    <tr bgcolor="#FAFAFA">
                        <td height="130" class="p_l_20">
                            <div align="right">
                                <font color="#FF0000">*</font> <strong>选择身份</strong>：</div>
                        </td>
                        <td colspan="2" bgcolor="#FAFAFA" class=" px14 height30">
                            <input type="radio" name="flag" value="1"> 在校大学生 ( 研究生 ) ,不含留学生<br>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>

                        <td>&nbsp;</td>
                    </tr>
                    <tr>
                        <td colspan="3" align="center">
                            <p>
                                <input name="submit" type="submit" class="buttonSubmit" id="submit" value="完善信息">
                            </p>
                            <p>&nbsp; </p>
                        </td>
                    </tr>
                    </tbody>
                </form>
            </table>

        </div>

    </div>
</div>
</body>
</html>
