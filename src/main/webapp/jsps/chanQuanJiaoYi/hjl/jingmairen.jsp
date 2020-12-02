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
    <title>竞买人列表</title>
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


<script>
    $(function () {
        $("#tab1").bootstrapTable({
            url: "${pageContext.request.contextPath}/hjl/jingmaorenFindAll",
            method: "get",
            contentType: "application/x-www-form-urlencoded; charset=UTF-8",
            pagination: true,
            striped: true,
            sidePagination: "server",
            pageNumber: 1,
            pageSize: 10,
            queryParams: function (params) {
                return {
                    limit: params.limit,
                    offset: params.offset,
                };
            },
            responseHandler: function (res) {
                return {
                    "total": res.total,
                    "rows": res.list
                };
            },
            columns: [

                {
                    field: 'userIdcard',
                    title: '组织机构代码/身份证号码'
                }, {
                    field: 'userName',
                    title: '企业名称/姓名'
                }, {
                    field: 'userLxrName',
                    title: '联系人'
                }, {
                    field: 'userLxrPhone',
                    title: '联系电话'
                }, {
                    field: 'startTime',
                    title: '注册时间'
                }, {
                    title: '操作',
                    formatter: function (value, row, index) {
                        return "<a href='/hjl/jingmairenFindAllById?userId=" + row.userId + "'>"+'查看'+"</a>";
                    }
                }
            ],
        });
    })

    /*刷新*/
    function shuaXin() {
        $('#tab1').bootstrapTable('refresh');
    }
</script>



<body>
<c:import url="/jsps/utlis/daohang.jsp"/>
<c:import url="/jsps/chanQuanJiaoYi/zuoshu.jsp"/>
<div style="width: 1500px; height: 900px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 250px; box-shadow: 0 0 8px black;">
    <h3 style="margin-top:20px; margin-bottom: 30px;margin-left: 700px;font-size: 30px">竞买人列表</h3>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 700px; padding: 10px;">
        <table id="tab1"></table>
    </div>
</div>



</body>

</html>
