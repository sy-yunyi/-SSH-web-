<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 15:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>预约</title>
    <link rel="stylesheet" type="text/css" href="css/global.css" />
    <link rel="stylesheet" type="text/css" href="css/center.css"/>
</head>
<body>
<s:include value="header.jsp"/>
<s:include value="center_left.jsp"/>
<div id="tc_1_r_1">
    <a href="./teacher.php" class="a1">会员中心</a>
    <a class="a1"> >预约 </a>
</div>
<table id="tc_1_r_1_teble" width="600" border="0" cellspacing="0" cellpadding="0">
    <tbody>
    <tr>
        <td colspan="3">
            <form action="" method="post" name="register" id="register" onsubmit="return CheckValue(this)">
                <table width="745" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                    <tbody>

                    <tr>
                        <td height="30">
                            <table width="100%" border="0" align="center" cellpadding="5" cellspacing="2">
                                <tbody>

                                <s:iterator value="#appointment" id="app" var="appoint">

                                <tr bgcolor="#F9F9E7">
                                    <td height="30" colspan="7">
                                        <div align="left">
                                            预约编号：
                                           ${appoint.apid}
                                            <span style="    margin-left: 60%;">
                                                <s:if test="#appoint.aflag==0">
                                                    <a href="/tporders_webAdd.action?apid=${appoint.apid}&tphone=${loginUser.tphone}">接受</a>
                                                    <a href="/tporders_webReject.action?apid=${appoint.apid}&phone=${loginUser.tphone}">拒绝</a>
                                                </s:if>
                                                <s:elseif test="#appoint.aflag==1">
                                                    <span>已接受</span>
                                                </s:elseif>
                                                <s:else>
                                                    <span>已拒绝</span>
                                                </s:else>

																	</span>
                                        </div>
                                    </td>

                                </tr>
                                <tr bgcolor="#F9F9E7">
                                    <td width="15%" height="30" colspan="1">
                                        <div align="right">
                                            姓名：</div>
                                    </td>
                                    <td colspan="2">${appoint.acname}
                                    </td>
                                    <td width="15%" height="30" colspan="1">
                                        <div align="right">
                                            孩子姓名：</div>
                                    </td>
                                    <td colspan="2">${appoint.acname}
                                    </td>
                                </tr>
                                <tr bgcolor="#F0F0F0">
                                    <td height="30">
                                        <div align="right">
                                            年龄：</div>
                                    </td>
                                    <td width="34%" colspan="2">
                                        ${appoint.acage}
                                    </td>
                                    <td height="30">
                                        <div align="right">
                                            年级：</div>
                                    </td>
                                    <td width="34%" colspan="2">
                                        ${appoint.acgrade}
                                    </td>
                                </tr>

                                <tr bgcolor="#F9F9E7" height="30">
                                    <td  >
                                        <div align="right">
                                            性别：</div>
                                    </td>
                                    <td  colspan="2">
                                        ${appoint.acsex}
                                    </td>
                                    <td >
                                        <div align="right">
                                            手机：</div>
                                    </td>
                                    <td  colspan="2">
                                        ${appoint.apphone}
                                    </td>
                                </tr>
                                <tr bgcolor="#F0F0F0" height="30">
                                    <td >
                                        <div align="right">
                                            科目：</div>
                                    </td>
                                    <td  colspan="2">
                                        ${appoint.asubject}
                                    </td>
                                    <td >
                                        <div align="right">
                                            地址：</div>
                                    </td>
                                    <td  colspan="2">
                                        ${appoint.address}
                                    </td>
                                </tr>
                                <tr bgcolor="#F9F9E7" height="30">
                                    <td >
                                        <div align="right">
                                            时间：</div>
                                    </td>
                                    <td  colspan="2">
                                        ${appoint.aday}
                                    </td>
                                </tr>
                                </s:iterator>
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
