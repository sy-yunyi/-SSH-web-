<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/28 0028
  Time: 20:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <meta charset="utf-8" />
    <title>三人行</title>
</head>
<body>
<div id="header">
    <div id="logo">
        <a href="./" title="家教网">
            <img src="image/ic_launcher.png" width="128" height="59" alt="家教网 首页" border="0">
        </a>
    </div>
    <div id="nav">
        <ul>
            <li>
                <a href="/index.jsp" class="a2">首页</a>
            </li>
            <li>
                <a href="/fteacher_findAll.action?currPage=1" class="a2">教员库</a>
            </li>
            <li>
                <a href="/parent_findAll.action?currPage=1" class="a2">学员库</a>
            </li>
        </ul>
    </div>
    <s:if test="#session.loginUser.tname!=null">
        <div id="login">
            <a href="personCenter.jsp" class="a1"><s:property value="#session.loginUser.tname"></s:property> 教员你好！</a> <br>
            <a href="/fteacher_logout.action" class="a1">退出</a>
        </div>
    </s:if>
    <s:else>
        <div id="login">
            <a href="login.jsp" class="a1">教员登陆</a>
            <a href="register2.jsp" class="a1">教员注册</a> <br>
        </div>
    </s:else>


</div>
</body>
</html>
