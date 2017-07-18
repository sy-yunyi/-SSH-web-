<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/29 0029
  Time: 19:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>学员库</title>
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
        <p id="sl_t_t">学员库</p>
    </div>
</div>
<div id="guide">
    <div class="box_list" id="grade" >
        <strong>年级：</strong>
        <span class="orange font ">
            <a href="#">不限</a></span>
        <span class="font"><a href="#">一年级</a></span>
        <span class="font"><a href="#">二年级</a></span>
        <span class="font"><a href="#">三年级</a></span>
        <span class="font"><a href="#">四年级</a></span>
        <span class="font"><a href="#">五年级</a></span>
        <span class="font"><a href="#">六年级</a></span>
    </div>
    <div class="box_list" id="sex" >
        <strong>性别：</strong>
        <span class="orange font ">
            <a href="#">不限</a></span>
        <span class="font"><a href="#">男</a></span>
        <span class="font"><a href="#">女</a></span>
    </div>
</div>


<div id="lb">
    <table id="lb_t" width="940" border="0" cellspacing="0" cellpadding="6">
        <tbody>
        <s:iterator value="list" id="ft" var="pc">
            <tr bgcolor="#F8F8F8">
                <td width="77">
                    <div id="header_id1">
                        <a href="" target="_blank">
                            <img src="" width="60" height="70" border="0"></a>
                        <br><span class="text_c">
                        <s:property value="#pc.pname"/> <br>
                    </span><br>
                    </div>
                </td>
                <td width="131">
                    <p><span class="px12">
        <s:property value="tshool"/> <br>  </span><br>
                        <span class="px12">
                  <font color="#000000">
                      <s:property value="#pc.cname"/>
                  </font><br>
                        <s:property value="#pc.csex"/>
                        <s:property value="#pc.cage"/>
                            <s:property value="#pc.cgrade"/>
                    </span><br>
                    </p>
                </td>
                <td width="180" align="left">
                    <span class="font13px fontGray">家庭地址：</span>
                    <s:property value="#pc.address" />
                </td>
                <td width="419" align="left">
                    <span class="font13px fontGray">要求：</span>
                    <span>
                <s:property value="#pc.pclaim" />
                </span>
                </td>
                <td width="73" style="line-height:17px; margin-bottom:20px;">
                    <p class="link_s">
                        <a href="" target="_blank" class="aOrange fontBold">查看<br> 详情
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
                                    <a href="/parent_findAll.action?currPage=1">首页</a>
                                    <a href="/parent_findAll.action?currPage=<s:property value="currPage-1"/>">上一页</a>
                                </s:if>
                                <s:if test="currPage!=totalPage">
                                    <a href="/parent_findAll.action?currPage=<s:property value="currPage+1"/>">下一页</a>
                                    <a href="/parent_findAll.action?currPage=<s:property value="totalPage"/> ">尾页</a>

                                </s:if>

                            </span>
            </td>
        </tr>
        </tbody>
    </table>
</div>
<script type="text/javascript" src="js/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="js/jquerySession.js"></script>
<script type="text/javascript" src="js/cinfo.js"></script>

</body>
</html>
