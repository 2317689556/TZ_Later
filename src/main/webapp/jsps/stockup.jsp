<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 库存</title>
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
    <script>
        $(function () {
            $('.date_1').cxCalendar();
            $("#tab1").bootstrapTable({
                url: "${pageContext.request.contextPath}/Stockup/findStockup",
                method: "post",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination: true,
                sidePagination: "server",
                pageNumber: 1,
                pageSize: 8,
                singleSelect: true,//单行选择单行,设置为true将禁止多选
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
                        checkbox: true
                    },{
                        field: 'number',
                        title: '单号'
                    },{
                        field: 'center',
                        title: '订货单位'
                    },{
                        field: 'manufacturers',
                        title: '科室'
                    }, {
                        field: 'proposer',
                        title: '申请人'
                    }, {
                        field: 'applyDate',
                        title: '填写日期'
                    }, {
                        field: 'signDate',
                        title: '签批日期'
                    }, {
                        field: 'signState',
                        title: '状态'

                    },
                ]
            });
        })

        function shuaXin() {
            $('#tab1').bootstrapTable('refresh');
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px;">备货单</h3>
    <div style="margin-left: 40px;">
        <input class="form-control" style="width: 700px; float: left;" >
        <input type="button" value="查询" class="btn-primary btn" onclick="updata()" id="chaxun">
        <input type="button" value="生成出库单" class="btn-primary btn" onclick="updata()" id="daoshu" style="margin-left: 200px">
    </div>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table id="tab1"></table>
    </div>
</div>
</body>
</html>









