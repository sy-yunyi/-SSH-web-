<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/28 0028
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>教员信息</title>
    <link rel="stylesheet" type="text/css" href="css/global.css">
    <link rel="stylesheet" type="text/css" href="css/info.css">

</head>
<body>
<s:include value="header.jsp"/>

<div id="sl" style="
    position: relative;
    display: block;
    float: left;
    text-align: center;
    width: 1000px;
    height: 100px;
    padding-bottom: 0px;">
    <div id="sl_t">
        <p id="sl_t_t">教员库</p>
    </div>
</div>
<div id="guide">
    <div class="box_list" >
        <strong>年级：</strong>
        <div id="grade" style="float: none;">
                <span class="orange font ">
                    <a>不限</a></span>
            <span class="font"><a href="#">小学</a></span>
            <span class="font"><a href="#">初中</a></span>
            <span class="font"><a href="#">高中</a></span>
        </div>
    </div>

        <div class="box_list" >
            <strong>科目：</strong>
            <div id="sub" style="float: none;">
                <span class="orange font">
                    <a>不限</a></span>
                <span class="font"><a href="#">英语</a></span>
                <span class="font"><a href="#">生物</a></span>
                <span class="font"><a href="#">数学</a></span>
                <span class="font"><a href="#">语文</a></span>
                <span class="font"><a href="#">物理</a></span>
                <span class="font"><a href="#">历史</a></span>
                <span class="font"><a href="#">化学</a></span>
                <span class="font"><a href="#">地理</a></span>
            </div>
        </div>
    <div class="box_list" >
        <strong>高校：</strong>
        <div id="school" style="float: none;">
                <span class="orange font">
                    <a>不限</a></span>
            <span class="font"><a href="#">青岛科技大学</a></span>
            <span class="font"><a href="#">青岛大学</a></span>
            <span class="font"><a href="#">青岛理工大学</a></span>
            <span class="font"><a href="#">山东大学</a></span>
        </div>
    </div>
    <div class="box_list" >
        <strong>性别：</strong>
        <div id="sex" style="float: none;">
                <span class="orange font">
                    <a>不限</a></span>
            <span class="font"><a href="#">女</a></span>
            <span class="font"><a href="#">男</a></span>
        </div>
    </div>
</div>
</div>

<div id="lb">
    <table id="lb_t" width="940" border="0" cellspacing="0" cellpadding="6">
        <tbody>
        <s:iterator value="list" id="ft" var="fte">
        <tr bgcolor="#F8F8F8">
            <td width="77" class="tname">
                <div id="header_id1">
                    <a href="" target="_blank">
                        <img class="myimg" src="<s:property value="#fte.timage"/> " width="60" height="70" border="0">
                    </a>
                    <br>
                    <span class="text_c">
                        <s:property value="#fte.tname"/>
                        <br>
                    ( ${fte.tsex=="M"?"男":"女"})<br>
                    <span class="fontOrange fontBold">
                        <%--${ft.tpoints>3?"金牌":"普通"}--%>
                    </span>
                    </span>
                    <br>
                </div>
            </td>
            <td width="131" class="tinfo">
                <span class="px12">
                    <s:property value="tshool"/> <br><br>
                    <s:property value="#fte.teducation"/>
                    <s:property value="#fte.tgread"/>
                </span>

            </td>
            <td width="180" align="left" class="tgood">
                <span class="p10 px12">
                <s:iterator value="#ts" id="tsinfo">
                    <s:if test="#fte.tphone==#tsinfo.tphone">
                        <s:property value="#tsinfo.sname"/>
                    </s:if>
                    </s:iterator>
                </span>
                <br>
                <span class="p10 px12">
                    <s:iterator value="#tc" id="tcinfo">
                        <s:if test="#fte.tphone==#tcinfo.tphone">
                            <s:property value="#tcinfo.grade"/>
                        </s:if>
                    </s:iterator>
                </span>
            </td>
            <td width="419" align="left" class="tin">
                <span class="font13px fontGray">自我介绍：
                <s:property value="#fte.tintroduce" />
                </span>
            </td>

            <td width="73" style="line-height:17px; margin-bottom:20px;" class="tgo">
                <span class=" font12px fontGray">
                     <s:property value="#fte.registerDate"/>
                </span>
                <p class="link_s">
                    <a href="/fteacher_findPersoon.action?tphone=<s:property value="#fte.tphone"/> " target="_blank" class="aOrange fontBold">查看<br> 详情
                    </a>
                </p>
            </td>
        </tr>
        </s:iterator>
        <tr>
            <td align="right" colspan="5">
                <span>第<s:property value="currPage"/> 页</span>
                <span>总共<s:property value="totalPage"/> 页</span>
                <span>每页显示<s:property value="pageSize"/>条 </span>
                <span>
                   <s:if test="currPage!=1">
                       <a href="/fteacher_findAll.action?currPage=1">首页</a>
                       <a href="/fteacher_findAll.action?currPage=<s:property value="currPage-1"/>">上一页</a>
                   </s:if>
                    <s:if test="currPage!=totalPage">
                        <a href="/fteacher_findAll.action?currPage=<s:property value="currPage+1"/>">下一页</a>
                        <a href="/fteacher_findAll.action?currPage=<s:property value="totalPage"/> ">尾页</a>
                    </s:if>
                </span>
            </td>
        </tr>
    </div>
        </tbody>
    </table>
</div>

<div class="box box17"><p>&nbsp;</p></div>

<s:include value="footer.jsp"/>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/jquerySession.js"></script>

<%--<script type="text/javascript" src="js/info.js"></script>--%>
<script type="text/javascript" src="js/infos.js"></script>

</body>
</html>
