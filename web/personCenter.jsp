<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 9:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>教员中心</title>
    <link rel="stylesheet" type="text/css" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/center.css">
</head>
<body>
    <jsp:include page="header.jsp"/>
    <div id="tc_1">
    <jsp:include page="center_left.jsp"/>
    <div id="tc_1_r_1">
        <a href="" class="a1">会员中心</a>
        <a href="" class="a1">>个人信息</a>
    </div>
        <table id="tc_1_r_1_teble" width="600" border="0" cellspacing="0" cellpadding="0">
            <tbody>
            <tr>
                <td colspan="3">
                    <form action="fteacher_webChangeInfo.action" method="post" name="register" id="register" onsubmit="return CheckValue(this)">
                        <table width="745" border="0" align="center" cellpadding="0" cellspacing="0" bgcolor="#FFFFFF">
                            <tbody>
                            <tr>
                                <td height="30">
                                    <table width="100%" border="0" align="center" cellpadding="5" cellspacing="2">
                                        <tbody>
                                        <tr bgcolor="#F9F9E7">
                                            <td width="15%" height="30" colspan="1">
                                                <div align="right">
                                                    <font color="#FF0000">*</font>真实姓名：</div>
                                            </td>
                                            <td colspan="2">
                                                ${loginUser.tname}

                                            </td>
                                            <td colspan="1" >
                                                <img src="${loginUser.timage}" alt="" style="height:100px;width: 100px; margin-left: 85px;"/>
                                            </td>
                                        </tr>
                                        <tr bgcolor="#F7F5DC">
                                            <td height="30">
                                                <div align="right">
                                                    <font color="#FF0000">*</font>年龄：</div>
                                            </td>
                                            <td width="34%" colspan="3"><input name="tage" type="text"value="${loginUser.tage}"/></td>
                                        </tr>
                                        <tr bgcolor="#F7F5DC">
                                            <td height="30">
                                                <div align="right">
                                                    <font color="#FF0000">*</font>性别：</div>
                                            </td>
                                            <td width="34%" colspan="3">
                                                <input name="tsex" type="radio" value="M" checked="${loginUser.tsex=="M"?"checked":""}"> 男
                                                <input name="tsex" type="radio" value="W" checked="${loginUser.tsex=="W"?"checked":""}"> 女
                                            </td>
                                        </tr>
                                        <tr bgcolor="#F9F9E7">
                                            <td height="30">
                                                <div align="right">
                                                    <font color="#FF0000">*</font>学校：</div></td>
                                            <td colspan="3">
                                                <select name="tshool" size="1" id="select2">
                                                    <option selected="selected" value="">选择学校</option>
                                                    <option value="青岛科技大学" ${loginUser.tshool.equals("青岛科技大学")?"selected":""}>青岛科技大学</option>
                                                    <option value="青岛大学" ${loginUser.tshool.equals("青岛大学")?"selected":""}>青岛大学</option>
                                                    <option value="青岛理工大学" ${loginUser.tshool.equals("青岛理工大学")?"selected":""}>青岛理工大学</option>
                                                    <option value="中国海洋大学" ${loginUser.tshool.equals("中国海洋大学")?"selected":""}>中国海洋大学</option>
                                                    <option value="山东大学" ${loginUser.tshool.equals("山东大学")?"selected":""}>山东大学</option>
                                                </select>
                                            </td>

                                        </tr>
                                        <tr bgcolor="#F7F5DC">
                                            <td>
                                                <div align="right">
                                                    <font color="#FF0000">*</font>学历：</div>
                                            </td>
                                            <td class="font12px" colspan="3">
                                                <select name="teducation" size="1" id="indentity">
                                                    <option value="">学历</option>
                                                    <option value="本科" ${loginUser.teducation=="本科"?"selected":""}>本科</option>
                                                    <option value="专科" ${loginUser.teducation=="专科"?"selected":""}>专科</option>
                                                    <option value="硕士" ${loginUser.teducation=="硕士"?"selected":""}>硕士</option>
                                                    <option value="博士" ${loginUser.teducation=="博士"?"selected":""}>博士</option>
                                                    <option value="其他" ${loginUser.teducation=="其他"?"selected":""}>其他</option>
                                                </select>

                                            </td>
                                        </tr>
                                        <tr bgcolor="#F7F5DC">
                                            <td>
                                                <div align="right">
                                                    <font color="#FF0000">*</font>年级：</div>
                                            </td>
                                            <td colspan="3">
                                                <select name="tgread" size="1" id="school">
                                                    <option value="" >年级</option>
                                                    <option value="一年级"${loginUser.tgread=="一年级"?"selected":""}>一年级</option>
                                                    <option value="二年级"  ${loginUser.tgread=="二年级"?"selected":""}>二年级</option>
                                                    <option value="三年级" ${loginUser.tgread=="三年级"?"selected":""}>三年级</option>
                                                    <option value="四年级" ${loginUser.tgread=="四年级"?"selected":""}>四年级</option>
                                                </select>
                                            </td>

                                        </tr>
                                        <tr bgcolor="#F7F5DC">
                                            <td width="8%">
                                                <div align="right">
                                                    <font color="#FF0000">*</font>手机：</div>
                                            </td>
                                            <td width="46%" colspan="3">
                                                ${loginUser.tphone}
                                                <input name="tphone" type="hidden" value="${loginUser.tphone}" size="17" maxlength="32"></td>
                                        </tr>
                                        <tr bgcolor="#F7F5DC">
                                            <td height="30">
                                                <div align="right">
                                                    <font color="#FF0000">*</font>自我介绍：</div>
                                            </td>
                                            <td width="34%" colspan="3"><input name="tintroduce"  type="text"value="${loginUser.tintroduce}"/></td>

                                        </tr>
                                        <tr bgcolor="#F7F5DC">
                                            <td height="30">
                                                <div align="right">
                                                    <font color="#FF0000">*</font>兴趣特长：</div>
                                            </td>
                                            <td width="34%" colspan="2"><input name="thabit" type="text"value="${loginUser.thabit}"/></td>
                                            <td></td>
                                        </tr>

                                        </tbody>
                                    </table>
                                    <br>
                                    <div align="center"><br>
                                        <input name="Submit2" type="submit" class="buttonSubmit" value="　　提　交　编　辑 　">
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

    <jsp:include page="footer.jsp"/>
</body>
</html>
