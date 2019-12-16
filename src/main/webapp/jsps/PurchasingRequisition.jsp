<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 采购申请 添加</title>
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
        .table input {
            width: 140px;
        }

        #temp1 .sample-table tr td {
            line-height: 34px;
        }
    </style>
    <script>
        $(function () {
            $('.date_1').cxCalendar();
        })

        function tianjia() {
            $("#money1").val(parseInt($("#count1").val()) * parseInt($("#unitPrice1").val()))
            var a = "";
            a += "<tbody><tr>";
            $('#table1  tr:eq(1) td input:text').each(function () {
                a += "<td>" + $(this).val() + "</td>";
            });
            a += "<td></td></tr></tbody>";
            $("#table1").append(a);

        }

        function yincangyu(a, b) {
            var name = "";
            $('#table1  tr:gt(1)').each(function () {
                name += $(this).find("td:eq(" + a + ")").text() + ",";
            });
            $("#" + b).val(name);
        }

        function over() {
            yincangyu(0, "name");
            yincangyu(1, "model");
            yincangyu(2, "specification");
            yincangyu(3, "unit");
            yincangyu(4, "count");
            yincangyu(5, "unitPrice");
            yincangyu(6, "moneye");

            $.ajax({
                url: "/Stockup/StockupAdd",
                data: new FormData($("#temp2")[0]),
                type: 'POST',
                processData: false,
                contentType: false,
                success: function (data) {
                    alert("添加成功");
                    window.location = "/jsps/stockOut.jsp";
                }
            })
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">采购申请添加</h3>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px" id="temp1">
        <form id="temp2">
            <table class="table table-striped table-bordered table-hover sample-table">
                <tr>
                    <td>单号：</td>
                    <td><input type="text" class="form-control" name="number"></td>
                    <td>厂家：</td>
                    <td><input type="text" class="form-control" name="manufacturer"></td>
                    <td>申请人：</td>
                    <td><input type="text" class="form-control" name="proposer"></td>
                </tr>
                <tr>
                    <td>申请日期：</td>
                    <td><input type="text" name="signDate" class="form-control date_1"></td>
                    <td>签批日期：</td>
                    <td><input type="date" name="dateOut" class="form-control date_1"></td>
                    <td></td>
                    <td></td>
                </tr>
            </table>
            <table class="table table-striped table-bordered table-hover sample-table" id="table1">
                <tr>
                    <td>品名</td>
                    <td>型号</td>
                    <td>规格</td>
                    <td>单位</td>
                    <td>数量</td>
                    <td>单价</td>
                    <td>金额</td>
                    <td>
                        <input type="hidden" name="name" id="name">
                        <input type="hidden" name="model" id="model">
                        <input type="hidden" name="specification" id="specification">
                        <input type="hidden" name="unit" id="unit">
                        <input type="hidden" name="count" id="count">
                        <input type="hidden" name="unitPrice" id="unitPrice">
                        <input type="hidden" name="moneye" id="moneye">
                    </td>
                </tr>
                <tr>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control" id="count1"></td>
                    <td><input type="text" class="form-control" id="unitPrice1"></td>
                    <td><input type="text" class="form-control" id="money1"></td>
                    <td><input type="button" class="btn-primary btn" onclick="tianjia()" value="添加" style="width: 80px;"></td>
                </tr>
            </table>
        </form>
    </div>
    <input type="button" value="完成" onclick="over()" class="btn-primary btn" style="float: right;margin-right: 40px;">
</div>
</body>
</html>