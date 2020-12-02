<%--
  Created by IntelliJ IDEA.
  User: jiale hao
  Date: 2020/12/1
  Time: 13:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>竞买人详情</title>
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script src="/cxCalendar/js/jquery.cxcalendar.js"></script>
    <script src="/cxCalendar/js/jquery.cxcalendar.languages.js"></script>
    <script src="/boottable/bootstrap-table-zh-CN.min.js"></script>

    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">
    <link rel="stylesheet" href="/cxCalendar/css/jquery.cxcalendar.css">
    <link type="text/css" href="/css/style1.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/style2.css"/>
</head>



<body>
<c:import url="/jsps/utlis/daohang.jsp"/>
<c:import url="/jsps/chanQuanJiaoYi/zuoshu.jsp"/>
<div style="width: 1500px; height: 900px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 250px; box-shadow: 0 0 8px black;">
    <h3 style="margin-top:20px; margin-bottom: 30px;margin-left: 700px;font-size: 30px">竞买人详情</h3>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 700px; padding: 10px;">
        <div style="margin-left: 600px">
            <br> 企业名称：${LIST.userName}<br><br><br><hr>
            <br>  企业地址：${LIST.userAddress}<br><br><br><hr>
            <br>  联系人姓名：${LIST.userLxrName}<br><br><br><hr>
            <br>  联系人身份证：${LIST.userLxrIdCard}<br><br><br><hr>
            <br>  联系人手机号：${LIST.userLxrPhone}<br><br><br><hr>
            <br>  法人姓名：${LIST.userFrName}<br><br><br><hr>
            <br> 法人手机号：${LIST.userFrPhone}<br><br><br><hr>
        </div>
        <div type="button" class="btn btn-info" style="margin-left: 630px"><button style="width: 100px;height: 50px;"><a href="/jsps/chanQuanJiaoYi/hjl/jingmairen.jsp">返回</a></button></div>
    </div>
</div>



</body>

</html>
