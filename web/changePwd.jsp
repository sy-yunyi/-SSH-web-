<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>修改密码</title>
    <link rel="stylesheet" type="text/css" href="css/global.css" />
    <link rel="stylesheet" type="text/css" href="css/center.css"/>
</head>
<body>
<s:include value="header.jsp"/>
<s:include value="center_left.jsp"/>
<div id="tc_1_r_1">
    <a href="./teacher.php" class="a1">会员中心</a>
    <a class="a1"> >修改密码 </a>
</div>


<table id="tc_1_r_1_teble" width="600" border="0" cellspacing="0" cellpadding="0">
    <tbody>
    <tr>
        <td colspan="3">
            <form action="fteacher_webChangePwd.action" method="post" name="register" id="register" >
                <table width="745" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                    <tbody>
                    <tr>
                        <td height="30">
                            <table width="100%" border="0" align="center" cellpadding="5" cellspacing="2">
                                <tbody>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30" colspan="4">
                                        <input type="hidden" name="tphone" value="${loginUser.tphone}">
                                        <div align="left">
                                            修改密码：
                                        </div>
                                        <span style="color: red;list-style: none;font-size: 13px;margin-left: 35%">
                                            <s:actionerror/>
                                        </span>
                                    </td>
                                </tr>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30">
                                        <div align="right">
                                            旧密码：</div>
                                    </td>
                                    <td width="70%" colspan="">
                                        <input type="password" name="tpasswd" />
                                    </td>
                                </tr>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30">
                                        <div align="right">
                                            新密码：</div>
                                    </td>
                                    <td width="70%" colspan="">
                                        <input type="password" name="newpwd" />
                                    </td>

                                </tr>

                                </tbody>
                            </table>
                            <br>
                            <div align="center"><br>
                                <input name="Submit2" type="submit" class="buttonSubmit" value="	修	改	">
                            </div>

                        </td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </td>
    </tr>
    </tbody>
</table>

</div>

<s:include value="footer.jsp"/>


</body>
</html>
