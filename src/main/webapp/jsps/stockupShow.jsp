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
    <style>
        span {
            float: left;
        }

        #temp1 input {
            width: 150px;
        }

        #temp1 table tr {
            height: 50px;
        }

        #temp3 input {
            width: 100px;
        }

        img {
            height: 240px;
            float: left;
            box-shadow: 0 0 5px black;
        }
    </style>
    <script>
        function updata1() {
            $.ajax({
                url: "/xxx/xxx",
                data: new FormData($("#temp6")[0]),
                type: "post",
                processData: false,
                contentType: false,
                success: function (data) {

                }
            })
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">备货单</h3>
    <div id="temp1">
        <form id="temp6">
            <table style="float:left;">
                    <tr>
                        <td><span>订货单位：</span></td>
                        <td><input type="text"  class="form-control"  name="name"></td>
                    </tr>
                    <tr>
                         <td><span>科室：</span></td>
                        <td><input type="text"  class="form-control"  name="date"></td>
                    </tr>
            </table>
        </form>
        <div style="float: right; margin-top: 250px;" id="temp3">
            <input type="button" value="添加" class="btn-primary btn" onclick="updata1()" style="margin-left: 1em; display: none;" id="temp5">
        </div>
    </div>
</div>
</body>
</html>
