<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/30 0030
  Time: 18:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>教员详情</title>
    <link rel="stylesheet" type="text/css" href="css/global.css"/>
    <link rel="stylesheet" type="text/css" href="css/teacher_info.css"/>
</head>
<body>
<s:include value="header.jsp"/>

<div id="tc_1">
    <div id="tc_1_l">
        <img src="${perf.timage}" width="132" height="155" alt="">
        <table id="tc_1_l_1" width="190" border="0" cellspacing="5" cellpadding="5">
            <tbody>
            <tr>
                <td height="35">${perf.tname}</td>
            </tr>
            <tr>
                <td height="35"><span class="fontOrange fontBold">√认证</span>教员</td>
            </tr>
            </tbody>
        </table>
        <table id="tc_1_l_2" width="350" border="0" cellspacing="5" cellpadding="5">
            <tbody>
            <tr>
                <td height="35"><span class="fontGray font12px">认证情况：</span>本站已经审核过此教员的真实证件</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<table id="tc_2" width="1000">
    <tbody>
    <tr>
        <td>
            <div class="font18px" id="tc_2_1">基本信息</div>
            <table id="tc_2_2" width="400" border="0" cellspacing="0" cellpadding="0">
                <tbody>
                <tr>
                    <td width="27" class="fontGray">&nbsp;</td>
                    <td width="67" class="fontGray font12px">性　　别：</td>
                    <td width="244">${perf.tsex=="M"?"男":"女"}</td>
                </tr>
                <tr>
                    <td width="27" class="fontGray">&nbsp;</td>
                    <td width="67" class="fontGray font12px">年		龄：</td>
                    <td width="244">${perf.tage}</td>
                </tr>

                </tbody>
            </table>
            <table id="tc_2_3" width="410" border="0" cellspacing="0" cellpadding="0">
                <tbody>
                <tr>
                    <td class="fontGray">&nbsp;</td>
                    <td class="fontGray font12px">高校： </td>
                    <td><span class="px14">
          									${perf.tshool}        </span></td>
                </tr>
                <tr>
                    <td class="fontGray">&nbsp;</td>
                    <td class="fontGray font12px">学历： </td>
                    <td><span class="px14">
          									${perf.teducation}        </span></td>
                </tr>
                <tr>
                    <td class="fontGray">&nbsp;</td>
                    <td class="fontGray font12px">年级： </td>
                    <td><span class="px14">
          									${perf.tgread}        </span></td>
                </tr>
                </tbody>
            </table>
            <div class="font18px" id="tc_2_4">家教信息</div>
            <table id="tc_2_5" width="840" border="0" cellspacing="5" cellpadding="5">
                <tbody>
                <tr>
                    <td>
                        <p class="fontOrange font14px">可教授科目：</p>
                        <p class="font14px">
                           <span class="p10 px12">
                               <s:iterator value="#perf" var="pe">
                                <s:iterator value="#ts" id="tsinfo">
                                    <s:if test="#pe.tphone==#tsinfo.tphone">
                                        <s:property value="#tsinfo.sname"/>
                                    </s:if>
                                </s:iterator>
                                </span>
                            <br>
                            <span class="p10 px12">
                                    <s:iterator value="#tc" id="tcinfo">
                                        <s:if test="#pe.tphone==#tcinfo.tphone">
                                            <s:property value="#tcinfo.grade"/>
                                        </s:if>
                                    </s:iterator>
                            </span>
                            </s:iterator>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p class="fontOrange font14px">自我描述：</p>
                        <p class="font14px">
                            ${perf.tintroduce}
                        </p>
                    </td>
                </tr>
                <tr>
                    <td>
                        <p class="fontOrange font14px">兴趣爱好：</p>
                        <p class="font14px">
                            ${perf.thabit}
                        </p>
                    </td>
                </tr>
                </tbody>
            </table>
        </td>
    </tr>
    </tbody>
</table>

<div id="tc_2_6">
    <p>
        <a href="/fteacher_appPersoon.action?tphone=${perf.tphone}" target="_blank" class="aBottomYellow">在线预约</a>
    </p>
</div>

<s:include value="footer.jsp"/>

</body>
</html>
