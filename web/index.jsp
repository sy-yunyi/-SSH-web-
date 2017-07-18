<%--
  Created by IntelliJ IDEA.
  User: sy
  Date: 2017/5/24 0024
  Time: 9:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <meta charset="utf-8" />
    <title>三人行</title>
    <link rel="stylesheet" href="css/bootstrap.css" />
    <link rel="stylesheet" href="css/global.css" />
    <link rel="stylesheet" href="css/index.css" />

</head>

<body>
<s:include value="header.jsp"/>
<div>
    <div id="carousel-example-generic" class="carousel slide" data-ride="carousel">
        <!-- Indicators -->
        <ol class="carousel-indicators">
            <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li>
            <li data-target="#carousel-example-generic" data-slide-to="1"></li>
            <li data-target="#carousel-example-generic" data-slide-to="2"></li>
        </ol>
        <!-- Wrapper for slides -->
        <div class="carousel-inner" role="listbox">
            <div class="item active">
                <img src="image/行.jpg" alt="1">
            </div>
            <div class="item">
                <img src="image/三.jpg" alt="2">
            </div>
            <div class="item">
                <img src="image/人.jpg" alt="3">
            </div>
        </div>

        <!-- Controls -->
        <a class="left carousel-control" href="#carousel-example-generic" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#carousel-example-generic" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
    <table id="tableList" style="width:500px;font-size:13px;margin:auto" border="0" cellpadding="0" cellspacing="0">
        <tbody >
        <tr>
            <td height="80">&nbsp;</td>
        </tr>
        <tr>
            <td>
                <div class="sub">
                <span class="font13px fontOrange">家教科目　</span>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=英语&school=A">英语</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=数学&school=A">数学</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=语文&school=A">语文</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=物理&school=A">物理</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=化学&school=A">化学</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=历史&school=A">历史</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=地理&school=A">地理</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=生物&school=A">生物</a>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="grade">
                <span class="font13px fontOrange">家教年级　</span>
                <a href="/fteacher_asynUpdate.action?grade=小学&sex=A&sub=A&school=A">小学</a>
                <a href="/fteacher_asynUpdate.action?grade=初中&sex=A&sub=A&school=A">初中</a>
                <a href="/fteacher_asynUpdate.action?grade=高中&sex=A&sub=A&school=A">高中</a>
                </div>
            </td>
        </tr>
        <tr>
            <td>
                <div class="school">
                <span class="font13px fontOrange">家教高校　</span>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=A&school=青岛科技大学">青岛科技大学</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=A&school=青岛大学">青岛大学</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=A&school=山东大学">山东大学</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=A&school=中国石油大学">中国石油大学</a>
                <a href="/fteacher_asynUpdate.action?grade=A&sex=A&sub=A&school=中国海洋大学">中国海洋大学</a>
                </div>
            </td>
        </tr>
        </tbody>
    </table>
    <table id="tablePhone" width="95%" border="0" cellpadding="0" cellspacing="0">
        <tbody>
        <tr>
            <td align="center" class="font14px">三人行，必有我师！</td>
        </tr>
        <tr>
            <td align="center"><span class="font14px fontGray">请家教热线：</span>
                <span class="fontOrange font14px fontBold">0532-88888888，66666666</span>
                <span class="font14px fontGray">　　接家教：</span>
                <span class="fontOrange font13px fontBold">0532-88888888</span><br>
            </td>
        </tr>
        <tr>
            <td align="center" class="font12px fontGray">
                <img src="image/ic_launcher.png" alt="" />
            </td>
        </tr>
        </tbody>
    </table>
    <div class="box box17"><p>&nbsp;</p></div>
    <s:include value="footer.jsp"/>
</div>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/jquerySession.js"></script>
<script type="text/javascript"src="js/index.js"></script>
</body>
</html>
