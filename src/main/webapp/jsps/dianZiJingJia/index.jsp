<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>台州管理系统 电子竞价</title>
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script src="/cxCalendar/js/jquery.cxcalendar.js"></script>
    <script src="/cxCalendar/js/jquery.cxcalendar.languages.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">
    <link rel="stylesheet" href="/cxCalendar/css/jquery.cxcalendar.css">
    <link type="text/css" href="/css/style1.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/style2.css"/>
    <script>


    </script>
</head>

<body>
<c:import url="/jsps/utlis/daohang.jsp"/>
<c:import url="zuoshu.jsp"/>
<div style="width: 1500px; height: 900px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 250px; box-shadow: 0 0 8px black;">
    <h3 style="margin-top:20px; margin-bottom: 30px;margin-left: 700px;font-size: 30px">电子竞价</h3>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 700px; padding: 10px;">
        <table id="tab1"></table>
    </div>
</div>
<%--ceshi3--%>
</body>
</html>
