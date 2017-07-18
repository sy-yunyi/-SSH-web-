<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/5/23 0023
  Time: 23:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>

<html>
<head>
    <title>教员登陆</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/global.css">

    <link rel="stylesheet" type="text/css" href="css/login.css">
</head>
<body>
<div id="sl_2">
    <table id="sl_2_table" width="800" height="250" border="0" align="center" cellpadding="0" cellspacing="0">
        <tbody>
        <tr>
            <td width="350">
                <table id="sl_2_table2" width="800" height="270" border="0" align="center" cellpadding="0" cellspacing="0">
                    <tbody>
                    <tr>
                        <td width="320">
                            <table width="300" border="0" align="center" cellpadding="0" cellspacing="0">
                                <tbody>
                                <tr>
                                    <td height="140">
                                        <table id="sl_2_table3" width="800" height="250" border="0" align="center" cellpadding="0" cellspacing="0">
                                            <tbody>
                                            <tr>
                                                <td width="350">
                                                    <table id="sl_2_table4" width="800" height="270" border="0" align="center" cellpadding="0" cellspacing="0">
                                                        <tbody>
                                                        <tr>
                                                            <td width="320">
                                                                <table width="300" border="0" align="center" cellpadding="0" cellspacing="0">
                                                                    <tbody>
                                                                    <tr>
                                                                        <td height="140">
                                                                            <a href="../"><img src="image/ic_launcher.png" width="160" height="73" alt="天天家教网" border="0"></a>
                                                                        </td>
                                                                    </tr>
                                                                    <tr>
                                                                        <td height="50">&nbsp;</td>
                                                                    </tr>

                                                                    </tbody>
                                                                </table>
                                                            </td>
                                                            <td width="1" bgcolor="#CCCCCC"></td>
                                                            <td>
                                                                <form action="fteacher_webLogin.action" method="post">
                                                                    <table style="margin-left:100px;" width="317" border="0" align="center" cellpadding="0" cellspacing="0">
                                                                        <tbody style="font-size: 13px">
                                                                        <h5><s:actionerror/></h5>
                                                                        <tr>
                                                                            <td width="69" height="30">
                                                                                <div align="left">用户名：</div>
                                                                            </td>
                                                                            <td width="248">
                                                                                <input name="tphone" type="text" class="sl_2_table_input" id="name" size="18" value=""></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td height="30">
                                                                                <div align="left">密　码：</div>
                                                                            </td>
                                                                            <td><input name="tpasswd" type="password" class="sl_2_table_input" id="password" size="18" value=""></td>
                                                                        </tr>

                                                                        <tr>
                                                                            <td height="50">
                                                                                <div align="left">自动登录：</div>
                                                                            </td>
                                                                            <td><input name="edit_login" type="checkbox" id="checkbox" checked="" value="1">
                                                                                <span>　　　　　　　　　　　<a href="" class="aOrange_un">忘记密码？</a></span></td>
                                                                        </tr>
                                                                        <tr>
                                                                            <td height="50" colspan="2">
                                                                                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                                                                                    <tbody>
                                                                                    <tr>
                                                                                        <td width="158">
                                                                                            <div align="left">
                                                                                                <input name="submit" type="submit" class="buttonSubmit" id="submit" value="教员登陆">
                                                                                            </div>
                                                                                        </td>
                                                                                        <td width="159" align="left">
                                                                                            <a href="../reg/reg1.php" class="aBottomGray">教员注册</a>
                                                                                        </td>
                                                                                    </tr>
                                                                                    </tbody>
                                                                                </table>
                                                                            </td>
                                                                        </tr>
                                                                        </tbody>
                                                                    </table>
                                                                </form>
                                                            </td>
                                                        </tr>
                                                        </tbody>
                                                    </table>
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </td>
                    </tr>
                    </tbody>
                </table>
            </td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>
