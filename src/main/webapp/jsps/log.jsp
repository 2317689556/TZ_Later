<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 日志</title>
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
            bb();
        })

        function bb() {
            $("#tab tr:gt(0)").remove();
            aa("入库件数");
            aa("入库单");
            aa("入库金额");
            aa("出库件数");
            aa("出库单");
            aa("出库金额");
            aa("手术单进行");
            aa("换货");
            aa("退货");
            aa("报损");
            aa("过期");
        }

        function aa(a) {
            $.ajax({
                url: "/user/Log",
                type: "post",
                data: {"a": a, "start": $("#date_1").val(), "stop": $("#date_2").val()},
                success: function (data) {
                    if (data == null) {
                        return;
                    }
                    $(data).each(function (index, obj) {
                        $("#tab").append("<tr><td>" + obj.state + "：</td><td>" + obj.num + "</td></tr>");
                    });
                }
            });
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">日志</h3>
    <span style="float: left; font-size: 17px; line-height: 34px; margin-left: 40px;">开始日期：</span>
    <input class="form-control date_1" id="date_1" type="date" style="width: 150px; float: left;" onchange="bb()">
    <span style="float: left; font-size: 17px; line-height: 34px; margin-left: 50px;">结束日期：</span>
    <input class="form-control date_1" id="date_2" type="date" style="width: 150px;" onchange="bb()">
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table class="table table-striped table-bordered table-hover" id="tab">
            <tr></tr>
        </table>
    </div>
</div>
</body>
</html>
