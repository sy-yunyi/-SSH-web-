<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>订单</title>
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
            <form action="edit_file_do.php" method="post" name="register" id="register" onsubmit="return CheckValue(this)">
                <table width="745" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                    <tbody>
                    <tr>
                        <td height="30">
                            <table width="100%" border="0" align="center" cellpadding="5" cellspacing="2">
                                <tbody>
                                <s:iterator value="list" var="ord">
                                <tr bgcolor="#F9F9E7">
                                    <td height="30" colspan="7">
                                        <div align="left">
                                            <%--订单编号：${ord.oid}--%>
                                            <s:property value="#ord.oid"/>
                                            <span style="    margin-left: 30%;">
                                                <%--${ord.otime}--%>
                                                <s:property value="#ord.otime"/>
                                            </span>
                                        </div>
                                    </td>
                                </tr>
                                <tr bgcolor="#F9F9E7">

                                    <td width="15%" height="30" colspan="1">
                                        <div align="right">
                                            孩子姓名：</div>
                                    </td>
                                    <td colspan="2">
                                            <%--${ord.ocname}--%>
                                        <s:property value="#ord.ocname"/>
                                    </td>
                                    <td width="15%" height="30" colspan="1">
                                        <div align="right">
                                            年龄：</div>
                                    </td>
                                    <td colspan="2">
                                            <%--${ord.ocage}--%>
                                        <s:property value="#ord.ocage"/>
                                    </td>
                                </tr>
                                <tr bgcolor="#F0F0F0">
                                    <td height="30">
                                        <div align="right">
                                            科目：</div>
                                    </td>
                                    <td width="34%" colspan="2">
                                        <s:property value="#ord.osubject"/>
                                            <%--${ord.osubject}--%>
                                    </td>
                                    <td height="30">
                                        <div align="right">
                                            年级：</div>
                                    </td>
                                    <td width="34%" colspan="2">
                                            <%--${ord.ocgrade}--%>
                                            <s:property value="#ord.ocgrade"/>
                                    </td>
                                </tr>

                                <tr bgcolor="#F9F9E7"  height="30">
                                    <td >
                                        <div align="right">
                                            性别：</div>
                                    </td>
                                    <td  colspan="2">
                                        <%--${ord.ocsex}--%>
                                        <s:property value="#ord.ocsex"/>
                                    </td>
                                    <td >
                                        <div align="right">
                                            手机：</div>
                                    </td>
                                    <td  colspan="2">
                                        <%--${ord.pphone}--%>
                                        <s:property value="#ord.pphone"/>
                                    </td>
                                </tr>
                                <tr bgcolor="#F0F0F0"  height="30">
                                    <td >
                                        <div align="right">
                                            开始时间：</div>
                                    </td>
                                    <td  colspan="2">
                                        <%--${ord.startTime}--%>
                                        <s:property value="#ord.startTime"/>
                                    </td>
                                    <td >
                                        <div align="right">
                                            结束时间：</div>
                                    </td>
                                    <td  colspan="2">
                                        <%--${ord.endTime}--%>
                                        <s:property value="#ord.endTime"/>
                                    </td>
                                </tr>
                                <tr bgcolor="#F9F9E7"  height="30">
                                    <td >
                                        <div align="right">
                                            天数：</div>
                                    </td>
                                    <td  colspan="2">
                                        <%--${ord.studyTime}--%>
                                        <s:property value="#ord.studyTime"/>
                                    </td>
                                    <td >
                                        <div align="right">
                                            价格：</div>
                                    </td>
                                    <td  colspan="2">
                                            <%--${ord.oprice}--%>
                                        <s:property value="#ord.oprice"/>
                                    </td>
                                </tr>
                                    <tr bgcolor="#F0F0F0"  height="20">
                                    </tr>
                                </s:iterator>
                                </tbody>
                            </table>
                            <br>
                        </td>
                    </tr>
                    <tr>
                        <td align="right">
                            <span>第<s:property value="currPage"/> 页</span>
                            <span>总共<s:property value="totalPage"/> 页</span>
                            <span>每页显示<s:property value="pageSize"/> </span>
                            <span>
                                <s:if test="currPage!=1">
                                    <a href="/tporders_webFindPage.action?currPage=1&phone=${loginUser.tphone}">首页</a>
                                    <a href="/tporders_webFindPage.action?currPage=<s:property value="currPage-1"/> &phone=${loginUser.tphone}">上一页</a>
                                </s:if>
                                <s:if test="currPage!=totalPage">
                                    <a href="/tporders_webFindPage.action?currPage=<s:property value="currPage+1"/>&phone=${loginUser.tphone}">下一页</a>
                                    <a href="/tporders_webFindPage.action?currPage=<s:property value="totalPage"/> &phone=${loginUser.tphone}">尾页</a>

                                </s:if>
                             <a href="/tporders_webFindPage.action"></a>

                            </span>
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
