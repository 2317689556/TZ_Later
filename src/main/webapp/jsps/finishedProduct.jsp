<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 内容表</title>
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
                url: "/Surgery/finishedProduct",
                method: "get",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination: true,
                striped: true,
                sidePagination: "client",
                pageNumber: 1,
                pageSize: 8,
                columns: [
                    {
                        field: 'name',
                        title: '名字',
                        formatter: function (value, row, index) {
                            return '<a href="/jsps/TableContents.jsp?id=' + row.id + '">' + value + '</a>';
                        }
                    }, {
                        field: '',
                        title: '制表',
                        formatter: function (value, row, index) {
                            return "xxx";
                        }
                    }, {
                        field: 'date',
                        title: '时间'
                    }
                ],
                onLoadSuccess: function () {
                    getTdValue();
                }
            });
        })

        function getTdValue() {
            $(".third-item").parent().parent().css('background-color', '#FFECEC');
            $(".third-item2").parent().parent().css('background-color', '#F0FFF0');
            $(".third-item3").parent().parent().css('background-color', 'rgba(0,240,255,0.1)');
        }

        function shuaXin() {
            $('#tab1').bootstrapTable('refresh');
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">内容表</h3>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table id="tab1"></table>
    </div>
</div>
</body>
</html>
