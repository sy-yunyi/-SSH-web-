<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/30 0030
  Time: 20:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<%@taglib uri="/struts-dojo-tags" prefix="sx"%>
<html>
<head>
    <title>预约教员</title>
    <link rel="stylesheet" type="text/css" href="css/global.css"/>
    <link rel="stylesheet" type="text/css" href="css/appointment.css"/>
    <s:head theme="xhtml"/>
    <sx:head parseContent="true"/>
</head>
<body>

<table id="sl_2" width="1000" border="0" cellspacing="1" cellpadding="1">
    <%--<s:form theme="xhtml" action="appointment_webAdd" >--%>
    <form action="" name="theForm" method="post" onsubmit="return CheckValue(this)">
    <tbody>
    <tr>
        <td>
            <table id="sl_2_table" width="920" border="0" align="center" cellpadding="0" cellspacing="0">
                <tbody>
                <tr>
                    <td width="750" valign="top">
                        <table width="100%" border="0" cellspacing="0" cellpadding="5">
                            <tbody>
                            <tr>
                                <td width="4%" height="70">
                                    <table id="sl_2_table2" width="920" border="0" align="center" cellpadding="0" cellspacing="0">
                                        <tbody>
                                        <tr>
                                            <td width="750" valign="top">
                                                <table width="99%" border="0" align="center" cellpadding="0" cellspacing="0">
                                                    <tbody>
                                                    <tr>
                                                        <td height="20">&nbsp;</td>
                                                    </tr>
                                                    <tr>
                                                        <td height="50">

                                                            <div align="left" class="zx">
                                                                <div align="center" class="font18px">在线预约教员</div>

                                                            </div>
                                                        </td>
                                                    </tr>
                                                    </tbody>
                                                </table>
                                                <table width="100%" border="0" cellspacing="0" cellpadding="5">
                                                    <tbody>
                                                    <tr>
                                                        <td width="62%" align="left" valign="middle" class=" fontHeigh25 borderBottom">
                                                            <a href="/fteacher_findPersoon.action?tphone=${perf.tphone}" class="ash- height20" target="_blank">
                                                                ${perf.tname}<span class="fontOrange">√</span> (${perf.tsex=="M"?"男":"女"}) ${perf.tshool} <br>
                                                                <span class="px12 ash--">
                                                                     <input type="hidden" value="<s:property value="#session.perf.tphone"/>" name="atphone">
																								<font color="#999999">${perf.teducation} ${perf.tgread}
                                                                                                </font>
																							</span>
                                                            </a>
                                                        </td>

                                                    </tr>
                                                    </tbody>
                                                </table>
                                                <table width="100%" border="0" cellpadding="5" cellspacing="1" bgcolor="#FFFFFF">
                                                    <tbody>
                                                    <tr>
                                                        <td width="150" height="20" class="px13"></td>
                                                        <td class="px13"></td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#F0F0F0" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>孩子姓名：</div>
                                                        </td>
                                                        <td bgcolor="#F0F0F0" class="px13">
                                                            <div align="left">
                                                                <input name="acname" class="sl_2_table_input1" size="8" maxlength="20">
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#F0F0F0" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>孩子年龄：</div>
                                                        </td>
                                                        <td bgcolor="#F0F0F0" class="px13">
                                                            <div align="left">
                                                                <input name="acage" class="sl_2_table_input1" size="8" maxlength="20">
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#F0F0F0" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>孩子性别：</div>
                                                        </td>
                                                        <td bgcolor="#F0F0F0" class="px13">
                                                            <div align="left">
                                                                <input name="acsex" type="radio" value="男" checked="checked"> 男
                                                                <input name="acsex" type="radio" value="女"> 女
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#FAFAFA" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>您的手机或固话：</div>
                                                        </td>
                                                        <td bgcolor="#FAFAFA" class="px13">
                                                            <div align="left">
                                                                <input name="apphone" class="sl_2_table_input1" size="25" maxlength="20">

                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#F0F0F0" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>选择科目：</div>
                                                        </td>
                                                        <td bgcolor="#F0F0F0" class="px13">
                                                            <div align="left">
                                                                <select name="asubject" class="sl_2_table_input1" id="address">
                                                                    <option value=""></option>
                                                                    <option value="数学">数学</option>
                                                                    <option value="语文">语文</option>
                                                                    <option value="英语">英语</option>
                                                                    <option value="物理">物理</option>
                                                                    <option value="化学">化学</option>
                                                                    <option value="政治">政治</option>
                                                                    <option value="历史">历史</option>
                                                                    <option value="地理">地理</option>
                                                                </select>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#F0F0F0" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>年级：</div>
                                                        </td>
                                                        <td bgcolor="#F0F0F0" class="px13">
                                                            <div align="left">
                                                                <select name="acgrade" class="sl_2_table_input1" id="">
                                                                    <option value=""></option>
                                                                    <option value="一年级">一年级</option>
                                                                    <option value="二年级">二年级</option>
                                                                    <option value="三年级">三年级</option>
                                                                    <option value="四年级">四年级</option>
                                                                    <option value="五年级">五年级</option>
                                                                    <option value="六年级">六年级</option>
                                                                </select>
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#FAFAFA" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>开始时间：</div>
                                                        </td>
                                                        <td bgcolor="#FAFAFA" class="px13">
                                                            <div align="left">
                                                                <%--<s:date name="astarttime" ></s:date>--%>
                                                                <%--<sd:datetimepicker name="astrat" ></sd:datetimepicker>--%>
                                                                <input type="datetime-local" name="astarttime">
                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="40" bgcolor="#FAFAFA" class="px13">
                                                            <div align="right">
                                                                <font color="#ff0000">*</font>结束时间：</div>
                                                        </td>
                                                        <td bgcolor="#FAFAFA" class="px13">
                                                            <div align="left">
                                                               <%--<s:date name="astoptime"></s:date>--%>
                                                                <%--<sx:datetimepicker name="astop" label="Format(yyyy-MM--dd)"  ></sx:datetimepicker>--%>
                                                                   <input type="datetime-local" name="astoptime">

                                                            </div>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="100" bgcolor="#FAFAFA" class="px13">
                                                            <div align="right"><span class="buleo2_link_9">地址：<br></span></div>
                                                        </td>
                                                        <td align="left" bgcolor="#FAFAFA">
                                                            <textarea name="address" cols="50" rows="5"></textarea>
                                                        </td>
                                                    </tr>
                                                    <tr>
                                                        <td height="80" colspan="2" bgcolor="#FFFFFF" class="px13">
                                                            <div align="center">
                                                                <input name="Submit2" type="submit" class="buttonSubmit" value="　　提 交 信 息　　">
                                                            </div>
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
    </form>
</table>

</body>
</html>
