<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 商品 详情</title>
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
            width: 325px;
            float: left;
            box-shadow: 0 0 5px black;
        }
    </style>
    <script>
        $(function () {
            $('.date_1').cxCalendar();
        })

        function updata() {
            $("input").removeAttr("disabled");
            $(".temp4").css("display", "none");
            $(".temp5").css("display", "block");
        }

        function updata1() {
            $.ajax({
                url: "/Vender/UpdataVender",
                data: new FormData($("#temp6")[0]),
                type: "POST",
                processData: false,
                contentType: false,
                success: function (data) {
                    alert("修改成功");
                }, error: function () {
                    alert("修改失败");
                }
            })
            $("#temp1 table input").attr("disabled", "disabled");
            $(".temp4").css("display", "block");
            $(".temp5").css("display", "none");
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">商品详情</h3>
    <div style="margin: 40px; margin-top: 94px; box-shadow: 0 0 4px black; height: 620px; padding: 25px 50px 0 50px; text-align: left;" id="temp1">
        <form id="temp6" enctype="multipart/form-data" type="post">
            <table style="float:left;">
                <input type="hidden" value="${AGENCY.id}" name="id">
                <tr>
                    <td><span>品名：</span></td>
                    <td><input type="text" value="${CY.name}" class="form-control" disabled name="name"></td>
                </tr>
                <tr>
                    <td><span>型号：</span></td>
                    <td><input type="text" value="${CY.model}" class="form-control" disabled name="model"></td>
                </tr>
                <tr>
                    <td><span>规格：</span></td>
                    <td><input type="text" value="${CY.specification}" disabled class="form-control" name="specification"></td>
                </tr>
                <tr>
                    <td><span>厂家：</span></td>
                    <td><input type="text" value="${CY.manufacturers}" disabled class="form-control" name="manufacturers"></td>
                </tr>
                <tr>
                    <td><span>所属产品线：</span></td>
                    <td><input type="text" value="${CY.productLine}" disabled class="form-control" name="productLine"></td>
                </tr>
                <tr>
                    <td><span>入库价格：</span></td>
                    <td><input type="text" value="${CY.moneyInput}" disabled class="form-control" name="moneyInput"></td>
                </tr>
                <tr>
                    <td><span>出库价格：</span></td>
                    <td><input type="text" value="${CY.moneyOut}" disabled class="form-control" name="moneyOut"></td>
                </tr>
                <input type="hidden" value="${CY.id}" name="id">
            </table>
        </form>
        <div style="float: right; margin-top: 500px;" id="temp3">
            <input type="button" value="修改" class="btn-primary btn temp4" onclick="updata()">
            <input type="button" value="完成" class="btn-primary btn temp5" onclick="updata1()" style="margin-left: 1em; display: none;">
        </div>
    </div>
</div>
</body>
</html>
