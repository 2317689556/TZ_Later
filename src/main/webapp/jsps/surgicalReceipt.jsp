<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 手术单 回执单</title>
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
            width: 130px;
        }

        #temp1 .sample-table tr td {
            line-height: 34px;
        }
    </style>
    <script>
        $(function () {
            $('.date_1').cxCalendar();
        })

        function qianpi(asd) {
            $.ajax({
                url: "/Surgery/Sign",
                data: {"id": "${DE.id}", "q": asd},
                type: 'POST',
                success: function (data) {
                    alert("签批成功");
                    window.location = "/jsps/surgicalDrape.jsp";
                }
            })
        }

        function getQueryVariable(variable) {
            var query = window.location.search.substring(1);
            var vars = query.split("&");
            for (var i = 0; i < vars.length; i++) {
                var pair = vars[i].split("=");
                if (pair[0] == variable) {
                    return pair[1];
                }
            }
            return (false);
        }

        function huizhidan() {
            window.location = "/jsps/surgicalDrape.jsp";
        }

        function tianjia() {
            var a = "";
            a += "<tbody><tr><td></td>";
            $('#table1  tr:eq(1) td input:text').each(function () {
                a += "<td>" + $(this).val() + "</td>";
            });
            a += "<td></td></tr></tbody>";
            $("#table1").append(a);
        }

        function over() {
            var name = "";
            $('#table1  tr:gt(1)').each(function () {
                name += $(this).find("td:eq(1)").text() + ",";
            });
            $("#name").val(name);

            var model = "";
            $('#table1  tr:gt(1)').each(function () {
                model += $(this).find("td:eq(2)").text() + ",";
            });
            $("#model").val(model);

            var specification = "";
            $('#table1  tr:gt(1)').each(function () {
                specification += $(this).find("td:eq(3)").text() + ",";
            });
            $("#specification").val(specification);

            var unit = "";
            $('#table1  tr:gt(1)').each(function () {
                unit += $(this).find("td:eq(4)").text() + ",";
            });
            $("#unit").val(unit);

            var employCount = "";
            $('#table1  tr:gt(1)').each(function () {
                employCount += $(this).find("td:eq(5)").text() + ",";
            });
            $("#employCount").val(employCount);

            var number = "";
            $('#table1  tr:gt(1)').each(function () {
                number += $(this).find("td:eq(6)").text() + ",";
            });
            $("#number").val(number);


            $.ajax({
                url: "/Surgery/AddSurgery",
                data: new FormData($("#temp2")[0]),
                type: 'POST',
                processData: false,
                contentType: false,
                success: function (data) {
                    alert("回执成功");
                    // window.location = "/jsps/surgicalDrape.jsp";
                }
            })
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">回执单</h3>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px" id="temp1">
        <form id="temp2">
            <table class="table table-striped table-bordered table-hover sample-table">
                <tr>
                    <td>手术单号：</td>
                    <td>${param.number}</td>
                    <td>患者姓名：</td>
                    <td><input type="text" class="form-control" name="patientName"></td>
                    <td>术者：</td>
                    <td><input type="text" name="performer" class="form-control"></td>
                </tr>
                <tr>
                    <td>订货单位：</td>
                    <td>${param.customer}</td>
                    <td>患者性别：</td>
                    <td><input type="text" name="sex" class="form-control"></td>
                    <td>科室：</td>
                    <td>${param.ao}</td>
                </tr>
                <tr>
                    <td>手术日期：</td>
                    <td><input type="date" name="date" class="form-control date_1"></td>
                    <td>病历号：</td>
                    <td><input type="text" name="num" class="form-control"></td>
                    <td>业务员：</td>
                    <td>${param.proposer}</td>
                </tr>
            </table>
            <table class="table table-striped table-bordered table-hover sample-table" id="table1">
                <tr>
                    <td>序号</td>
                    <td>品名</td>
                    <td>型号</td>
                    <td>规格</td>
                    <td>单位</td>
                    <td>使用数量</td>
                    <td>货品编码</td>
                    <td>
                        <input type="hidden" name="name" id="name">
                        <input type="hidden" name="model" id="model">
                        <input type="hidden" name="specification" id="specification">
                        <input type="hidden" name="unit" id="unit">
                        <input type="hidden" name="employCount1" id="employCount">
                        <input type="hidden" name="number1" id="number">
                        <input type="hidden" name="surgicalDrapeId" value="${param.id}">
                    </td>
                </tr>
                <tr>
                    <td>序号</td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="text" class="form-control"></td>
                    <td><input type="button" class="btn-primary btn" onclick="tianjia()" value="添加"></td>
                </tr>
            </table>
        </form>
    </div>
    <input type="button" value="完成" onclick="over()" class="btn-primary btn" style="float: right;margin-right: 40px;">
</div>
</body>
</html>