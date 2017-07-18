<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 12:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>个人擅长</title>
    <link rel="stylesheet" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/center.css">
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
            <form action="edit_file_do.php" method="post" name="register" id="register" onsubmit="return CheckValue(this)">
                <table width="745" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                    <tbody>
                    <tr>
                        <td height="30">
                            <table width="100%" border="0" align="center" cellpadding="5" cellspacing="2">
                                <tbody>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30" colspan="4">
                                        <div align="left">
                                            擅长科目：
                                            ${ts_str}
                                        </div>
                                    </td>

                                </tr>
                                <%--<s:iterator value="#sub_list" id="sub">--%>

                                    <%--<tr bgcolor="#F7F5DC">--%>
                                        <%--<td height="30">--%>
                                            <%--<div align="right">--%>
                                                <%--${sub_list.sname}：</div>--%>
                                        <%--</td>--%>
                                        <%--<td width="34%" colspan="">--%>
                                            <%--<s:iterator value="#ts_str" var="str">--%>
                                                <%--<s:if test="str.equals(${sub_list.sname})">--%>
                                                    <%--<a href="/webAddTs?tphone=${loginUser.tphone}&sid=10002&sname=数学"> 添加</a>--%>
                                                <%--</s:if>--%>
                                           <%--<s:else>--%>
                                               <%--<a href="/webAddTs?tphone=${loginUser.tphone}&sid=10002&sname=数学"> 删除</a>--%>

                                           <%--</s:else>--%>
                                            <%--</s:iterator>--%>
                                        <%--</td>--%>
                                    <%--</tr>--%>
                                <%--</s:iterator>--%>

                                <tr bgcolor="#F7F5DC">
                                    <td height="30">
                                        <div align="right">
                                            数学：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10002&sname=数学"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10002&sname=数学"> 删除</a>
                                    </td>
                                    <td height="30">
                                        <div align="right">
                                            语文：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10001&sname=语文"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10001&sname=语文"> 删除</a>

                                    </td>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30">
                                        <div align="right">
                                            英语：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10003&sname=英语"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10003&sname=英语"> 删除</a>
                                    </td>
                                    <td height="30">
                                        <div align="right">
                                            物理：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10004&sname=物理"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10004&sname=物理"> 删除</a>

                                    </td>

                                </tr>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30">
                                        <div align="right">
                                            化学：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10005&sname=化学"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10005&sname=化学"> 删除</a>

                                    </td>
                                    <td height="30">
                                        <div align="right">
                                            政治：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10006&sname=政治"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10006&sname=政治"> 删除</a>

                                    </td>

                                </tr>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30">
                                        <div align="right">
                                            历史：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10007&sname=历史"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10007&sname=历史"> 删除</a>

                                    </td>
                                    <td height="30">
                                        <div align="right">
                                            生物：</div>
                                    </td>
                                    <td width="34%" colspan="">
                                        <a href="/tsinfo_webAddTs?tphone=${loginUser.tphone}&sid=10008&sname=生物"> 添加</a>
                                        <a href="/tsinfo_webDeleteTs?tphone=${loginUser.tphone}&sid=10008&sname=生物"> 删除</a>

                                    </td>
                                </tr>
                                </tbody>
                            </table>
                            <br>
                            <table width="100%" border="0" align="center" cellpadding="5" cellspacing="2">
                                <tbody>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30" colspan="4">
                                        <div align="left">
                                            年级：${tc_str}
                                        </div>
                                    </td>

                                </tr>

                                <tr bgcolor="#F7F5DC">
                                    <td height="30" colspan="2">
                                        <div align="right">
                                            小学：</div>
                                    </td>
                                    <td width="70%" colspan="2">
                                        <a href="/tcinfo_webAddTc?tphone=${loginUser.tphone}&&grade=小学"> 添加</a>
                                        <a href="/tcinfo_webDeleteTc?tphone=${loginUser.tphone}&&grade=小学"> 删除</a>

                                    </td>


                                </tr>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30" colspan="2">
                                        <div align="right">
                                            初中：</div>
                                    </td>
                                    <td width="70%" colspan="2">
                                        <a href="/tcinfo_webAddTc?tphone=${loginUser.tphone}&&grade=初中"> 添加</a>
                                        <a href="/tcinfo_webDeleteTc?tphone=${loginUser.tphone}&&grade=初中"> 删除</a>

                                    </td>
                                </tr>
                                <tr bgcolor="#F7F5DC">
                                    <td height="30" colspan="2">
                                        <div align="right">
                                            高中：</div>
                                    </td>
                                    <td width="70%" colspan="2">
                                        <a href="/tcinfo_webAddTc?tphone=${loginUser.tphone}&&grade=高中"> 添加</a>
                                        <a href="/tcinfo_webDeleteTc?tphone=${loginUser.tphone}&&grade=高中"> 删除</a>
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

</div>

<s:include value="footer.jsp"/>
</body>
</html>
