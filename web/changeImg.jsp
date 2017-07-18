<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 20:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>更换头像</title>
    <link rel="stylesheet" type="text/css" href="css/global.css" />
    <link rel="stylesheet" type="text/css" href="css/center.css"/>
</head>
<body>

<s:include value="header.jsp"/>
<s:include value="center_left.jsp"/>
<div id="tc_1_r_1">
    <a href="./teacher.php" class="a1">会员中心</a>
    <a class="a1"> >个人擅长 </a>
</div>
<table id="tc_1_r_1_teble" width="600" border="0" cellspacing="0" cellpadding="0">
    <tbody>
    <tr>
        <td colspan="3">
            <form action="fteacher_webChangeImg.action?tphone=${loginUser.tphone}" method="post" name="register" id="register"  enctype="multipart/form-data">
                <table width="745" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                    <tbody>
                    <tr>
                        <td height="30">
                            <table width="100%" border="0" align="center" cellpadding="5" cellspacing="2">
                                <tbody>

                                <tr bgcolor="#F9F9E7">
                                    <td width="15%" height="30" colspan="1" align="center">
                                        <img src="${loginUser.timage}" /><br />
                                        <input type="file" value="更换头像" name="file" />
                                        <div align="center"><br>
                                            <input name="Submit2" type="submit" class="buttonSubmit" value="   确定	  ">
                                        </div>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <br>
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
