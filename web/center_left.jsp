<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
<div id="tc_1">
    <div id="tc_1_l">
        <meta charset="gb2312">
        <ul>
            <li style="border-bottom:hidden;">
                <a href="./teacher.php" class="fontBold aOrange17">会员中心</a>
            </li>
            <li></li>
            <li>
                <a href="/personCenter.jsp">个人信息</a>
            </li>
            <li>
                <a href="/changeSub.jsp">擅长科目</a>
            </li>
            <li>
                <a href="/changePwd.jsp">修改密码</a>
            </li>
            <li>
                <a href="/changeImg.jsp">修改头像</a>
            </li>
            <li></li>
            <li>
                <a href="/appointment_webAppointment.action?phone=${loginUser.tphone}">预约</a>
            </li>
            <li>
                <a href="/tporders_webFindPage.action?phone=${loginUser.tphone}&currPage=1">订单</a>
            </li>
            <li></li>
            <li>
                <a href="./feedback.php">意见反馈</a>
            </li>

            <li></li>
            <li>
                <a href="/fteacher_logout.action">退出登陆</a>
            </li>
        </ul>
    </div>

</body>
</html>
