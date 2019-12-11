<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 商品信息</title>
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
                url: "${pageContext.request.contextPath}/Commodity/ShowCommodity",
                method: "get",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination: true,
                sidePagination: "server",
                pageNumber: 1,
                pageSize: 8,
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
                        field: 'name',
                        title: '品名',
                        formatter: function (value, row, index) {
                            return "<a href='/Commodity/CommodityParticular?id=" + row.id + "'>" + value + "</a>";
                        }
                    }, {
                        field: 'model',
                        title: '型号'
                    }, {
                        field: 'specification',
                        title: '规格'
                    }, {
                        field: 'manufacturers',
                        title: '厂家'
                    }, {
                        field: 'productLine',
                        title: '所属产品线'
                    }
                ]
            });
        })

        function shuaXin() {
            $('#tab1').bootstrapTable('refresh');
        }

        function tiaozhuan() {
            window.location = "/jsps/CommodityInformationAdd.jsp";
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">商品信息</h3>
    <input class="btn btn-primary" type="button" style="width: 100px; float: left; margin-left: 40px;" onclick="tiaozhuan()" value="添加商品">
    <div style="margin: 40px; margin-top: 94px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table id="tab1"></table>
    </div>
</div>
</body>
</html>
