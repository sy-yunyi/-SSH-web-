<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/28 0028
  Time: 15:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>教员注册</title>
    <link rel="stylesheet" type="text/css" href="css/global.css" />
    <link rel="stylesheet" type="text/css" href="css/reg3.css" />
</head>

<body>
<div id="sl_2">
    <div id="sl_2_1">
        <a href="../"><img src="image/ic_launcher.png" width="128" height="59" alt="" border="0"></a>
    </div>
    <div id="sl_2_3">
        <p class="font40px fontOrange">教员注册 <em><span class="font50px"> 1</span></em><span class="font18px fontGray">步/1</span></p>
    </div>
    <table id="sl_2_table_1" width="960" style=" border:1px solid #EBECEE;" cellspacing="0" cellpadding="0">
        <form action="fteacher_webRegis.action" method="post">
        <tbody>
        <tr>
            <td height="87">
                <table width="100%" border="0" align="center" cellpadding="7" cellspacing="2">
                    <tbody>
                    <tr bgcolor="#FCFCFC">
                        <td height="40" colspan="4" align="left" class="fontGray fontHeigh25" style="padding:18px;">【提示】1、不要怕麻烦哦：）您所填信息<strong>越详细</strong>就能吸引家长阅读，也就越容易获得家长的预约。所以请您务必如实、详尽地填写以下各拦。其中红色星号（
                            <font color="#FF3300">*</font>）为必填。
                            <input name="tphone" type="hidden" id="uname" value=${tphone}></td>
                            <input name="tpasswd" type="hidden"  value=${tpasswd}></td>
                    </tr>
                    <tr bgcolor="#FCFCFC">
                        <td height="40" colspan="4" align="center" bgcolor="#D0D0D0"><span style="height:12px"><strong>基 本 信 息</strong></span></td>
                    </tr>
                    <tr bgcolor="#FCFCFC">
                        <td width="17%" height="50" align="right">
                            <font color="#FF0000">*</font><strong>真实姓名：</strong></td>
                        <td height="40" colspan="3" bgcolor="#FCFCFC">
                            <input name="tname" type="text" id="real_name2" size="15" maxlength="15">
                            <span class="font12px fontGray"> 注意：(1)一经填写不得修改;<br></span></td>
                    </tr>
                    <tr bgcolor="#FCFCFC">
                        <td width="17%" height="50" align="right">
                            <font color="#FF0000">*</font><strong>密码：</strong></td>
                        <td height="40" colspan="3" bgcolor="#FCFCFC">
                            <input name="tpasswd" type="text"  size="15" maxlength="15">
                            <span class="font12px fontGray"> <br></span></td>
                    </tr>
                    <tr bgcolor="#F3F3F3">
                        <td height="30">
                            <div align="right">
                                <font color="#FF0000">*</font><strong>性别：</strong></div>
                        </td>
                        <td width="30%">
                            <input name="tsex" type="radio" value="W" checked="checked"> 男
                            <input name="tsex" type="radio" value="M"> 女
                        </td>
                    </tr>
                    <tr bgcolor="#FCFCFC">
                        <td height="30">
                            <div align="right">
                                <font color="#FF0000">*</font><strong>年龄：</strong></div>
                        </td>
                        <td width="30%">
                            <input name="tage" type="text" value="">
                        </td>
                    </tr>
                    <tr bgcolor="#F3F3F3">
                        <td height="30">
                            <div align="right">
                                <font color="#FF0000">*</font><strong>学校：</strong></div>
                        </td>
                        <td>
                            <select name="tshool" size="1" id="select2">
                                <option selected="selected" value="">选择学校</option>
                                <option value="青岛科技大学">青岛科技大学</option>
                                <option value="青岛大学">青岛大学</option>
                                <option value="青岛理工大学">青岛理工大学</option>
                                <option value="中国海洋大学">中国海洋大学</option>
                                <option value="山东大学">山东大学</option>
                            </select>
                        </td>
                    </tr>
                    <tr bgcolor="#FCFCFC">
                        <td>
                            <div align="right">
                                <font color="#FF0000">*</font><strong>学历：</strong></div>
                        </td>
                        <td class="font12px">
                            <select name="teducation" size="1" id="indentity">
                                <option selected="selected" value="">学历</option>
                                <option value="本科">本科</option>
                                <option value="专科">专科</option>
                                <option value="硕士">硕士</option>
                                <option value="博士">博士</option>
                                <option value="其他">其他</option>
                            </select>

                        </td>
                    </tr>
                    <tr bgcolor="#F3F3F3">
                        <td height="30">
                            <div align="right">
                                <font color="#FF0000">*</font><strong>年级：</strong></div>
                        </td>
                        <td colspan="3" bgcolor="#F3F3F3">
                            <select name="tgread" size="1" id="school">
                                <option value="" selected="selected">年级</option>
                                <option value="一年级">一年级</option>
                                <option value="二年级">二年级</option>
                                <option value="三年级">三年级</option>
                                <option value="四年级">四年级</option>
                            </select>
                        </td>
                    </tr>
                    <tr bgcolor="#FCFCFC">
                        <td width="17%" height="50" align="right">
                            <font color="#FF0000">*</font><strong>手机号：</strong></td>
                        <td height="40" colspan="3" bgcolor="#FCFCFC">
                            <input name="tphone" type="text" size="11" maxlength="11">
                            <span class="font12px fontGray"> <br></span></td>
                    </tr>
                    <tr bgcolor="#F3F3F3">
                        <td >
                            <div align="right">
                                <font color="#FF0000">*</font><strong>个人介绍：</strong></div>
                        </td>
                        <td width="30%">
                            <input name="tintroduce" type="text" value="" multiple="true" style="width: 400px;">
                        </td>
                    </tr>
                    <tr bgcolor="#FCFCFC">
                        <td height="30">
                            <div align="right">
                                <font color="#FF0000">*</font><strong>兴趣特长：</strong></div>
                        </td>
                        <td width="30%">
                            <input name="thabit" type="text" value="" multiple="true" style="width: 400px;">
                        </td>
                    </tr>

                    </tbody>
                </table>
            </td>
        </tr>
        <tr>
            <td height="87">
                <div align="center">
                    <input name="submit" type="submit" class="buttonSubmit" id="submit" value="完成">
                </div>
            </td>
        </tr>
        <tr>
            <td height="10">&nbsp;</td>
        </tr>
        </tbody>
        </form>
    </table>
    <div id="sl_2_2_1">
        <div align="center" class="px14"></div>
    </div>
</div>
</body>

</html>
