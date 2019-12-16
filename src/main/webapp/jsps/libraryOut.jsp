<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 手术单 添加</title>
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
        var arrayObj = new Array();
        $(function () {
            $("#temp3 td select").on("blur", function () {
                $("#money1").html("<option>" + parseInt($("#count1 option:selected").text()) * parseInt($("#unitPrice1 option:selected").text()) + "</option>")
            });

            $("#name1").on("blur", function () {
                asd();
            });

            $('.date_1').cxCalendar();
            $.ajax({
                url: "/Library/showStock",
                type: 'post',
                success: function (data) {
                    $(data).each(function (a, b) {
                        $("#name1").append("<option value='" + b.id + "'>" + b.name + "</option>");
                    })
                }
            })
        });

        function asd() {
            $.ajax({
                url: "/Library/showStock",
                type: 'post',
                data: {"id": $("#name1").val()},
                success: function (data) {
                    $(data).each(function (a, b) {
                        $("#model1").html("<option value='" + b.model + "'>" + b.model + "</option>");
                        $("#specification1").html("<option value='" + b.specification + "'>" + b.specification + "</option>");
                        $("#unitPrice1").html("<option value='" + b.money + "'>" + b.money + "</option>");
                        $("#unit1").html("<option value='" + b.unit + "'>" + b.unit + "</option>");
                        for (var i = 1; i <= b.count; i++) {
                            $("#count1").html("<option value='" + b.count + "'>" + i + "</option>");
                        }
                    });
                    $("#money1").html("<option>" + parseInt($("#count1 option:selected").text()) * parseInt($("#unitPrice1 option:selected").text()) + "</option>")
                }
            })
        }

        function tianjia() {
            if (arrayObj.includes($("#name1").val())) {
                alert("已经选了");
                return;
            }
            var a = "";
            a += "<tbody><tr>";
            $('#table1  tr:eq(1) td select option:selected').each(function () {
                a += "<td>" + $(this).text() + "</td>";
            });
            a += "<td></td></tr></tbody>";
            $("#table1").append(a);
            arrayObj.push($("#name1").val());
        }

        function yincangyu1(a, b) {
            var name = "";
            $('#temp3').each(function () {
                name += $(this).find("td:eq(" + a + ") option:selected").text() + ",";
            });
            $("#" + b).val(name);
        }

        function over() {
            yincangyu1(0, "name",);
            yincangyu1(1, "model");
            yincangyu1(2, "specification");
            yincangyu1(3, "unit");
            yincangyu1(4, "count");
            yincangyu1(5, "unitPrice");
            yincangyu1(6, "money");

            var name = "";
            $('#temp3').each(function () {
                name += $(this).find("td:eq(0) option:selected").val() + ",";
            });
            $("#idd").val(name);

            $.ajax({
                url: "/Library/LibraryAdd",
                data: new FormData($("#temp2")[0]),
                type: 'POST',
                processData: false,
                contentType: false,
                success: function (data) {
                    alert("添加成功");
                    window.location = "/jsps/purchaseRequest.jsp";
                }
            })
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">出货单添加</h3>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px" id="temp1">
        <form id="temp2">
            <table class="table table-striped table-bordered table-hover sample-table">
                <tr>
                    <td>申请人：</td>
                    <td><input type="text" class="form-control" name="proposer"></td>
                    <td>出库单号：</td>
                    <td><input type="text" class="form-control" name="number"></td>
                    <td>科室：</td>
                    <td><input type="text" class="form-control" name="department"></td>
                </tr>
                <tr>
                    <td>发票号：</td>
                    <td><input type="text" name="orderOn" class="form-control"></td>
                    <td>日期：</td>
                    <td><input type="date" name="applyDate" class="form-control date_1"></td>
                    <td>业务员：</td>
                    <td><input type="text" name="salesman" class="form-control"></td>
                </tr>
                <tr>
                    <td>订货单位：</td>
                    <td><input type="text" name="manufacturers" class="form-control"></td>
                    <td></td>
                    <td></td>
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
                        <input type="hidden" name="money" id="money">
                        <input type="hidden" id="idd" name="idd">
                    </td>
                </tr>
                <tr id="temp3">
                    <td><select id="name1" style="width: 140px" class="form-control"></select></td>
                    <td><select id="model1" style="width: 140px" class="form-control"></select></td>
                    <td><select id="specification1" style="width: 140px" class="form-control"></select></td>
                    <td><select id="unit1" style="width: 140px" class="form-control"></select></td>
                    <td><select id="count1" style="width: 140px" class="form-control"></select></td>
                    <td><select id="unitPrice1" style="width: 140px" class="form-control"></select></td>
                    <td><select id="money1" style="width: 140px" class="form-control"></select></td>
                    <td><input type="button" class="btn-primary btn" onclick="tianjia()" value="添加" style="width: 80px;"></td>
                </tr>
            </table>
        </form>
    </div>
    <input type="button" value="完成" onclick="over()" class="btn-primary btn" style="float: right;margin-right: 40px;">
</div>
</body>
</html>