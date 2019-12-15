<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 出库单__详情</title>
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


        /*完成换货*/
        function successHuanHuo(id) {
            var msg = "您确定已经完成换货了吗？\n\n请确认！";
            if (confirm(msg) == true) {
                return updateHH(id);
            } else {
                return false;
            }
        }

        function qianpi(id) {
            var msg = "您确定签批吗？\n\n请确认！";
            if (confirm(msg) == true) {
                $.ajax({
                    url: "/Abnormal/qianpi?id=" + id,
                    type: "json",
                    success: function () {

                    }
                });
                window.location = "/jsps/abnormal.jsp";
            } else {
                return false;
            }
        }

        function updateHH(id) {
            $.ajax({
                url: "/Abnormal/updateSuccess?id=" + id,
                type: "json",
                success: function () {

                }
            });
            window.location = "/jsps/abnormal.jsp";
        }

        /*换货中*/
        function InThe(id) {
            var msg = "您确定吗？\n\n请确认！";
            if (confirm(msg) == true) {
                return updateHuanHuo(id);
            } else {
                return false;
            }
        }

        function updateHuanHuo(id) {
            $.ajax({
                url: "/Abnormal/updateInThe?id=" + id,
                type: "json",
                success: function () {

                }
            });
            window.location = "/jsps/abnormal.jsp";
        }


    </script>


</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">

    <c:if test="${list1.cause=='换货'}">
        <h3 style="margin-bottom: 40px">换货单</h3>
    </c:if>

    <c:if test="${list1.cause=='退货'}">
        <h3 style="margin-bottom: 40px">退货单</h3>
    </c:if>

    <c:if test="${list1.cause=='过期'}">
        <h3 style="margin-bottom: 40px">过期单</h3>
    </c:if>


    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table class="table table-striped table-bordered table-hover" id="sample-table">

            <tr>
                <div style="margin: 20px">
                    <div style="text-align: left;float: left">
                        <span>日期：${list1.date}</span>
                    </div>
                </div>
            </tr>
            <thead>
            <tr>
                <th width="80">序号</th>
                <th width="200px">品名</th>
                <th width="220px">型号</th>
                <th width="250px">单位</th>
                <th width="160px">来源单号</th>
                <th width="180px">编码</th>
                <th width="180px">原因</th>
                <c:if test="${list1.signState==2||list1.signState==3}">
                    <th width="150">换回编码</th>
                </c:if>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.model}</td>

                    <td>${p.unit}</td>
                    <td>${p.number}</td>
                    <td>${p.coding}</td>
                    <td>${p.cause}</td>
                    <c:if test="${p.signState==2||p.signState==3}">
                        <td>${p.codingOut}</td>
                    </c:if>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="5">合计：${list1.unitPrice}</td>
                <td colspan="4">大写：${list1.name}</td>
            </tr>
            <tr>
                <td colspan="5">制单：${list1.number}</td>
                <td colspan="4">审核：${list1.audit}</td>
            </tr>
            </tbody>
        </table>

        <%--未签批--%>
        <c:if test="${list1.signState==0}">
            <div style="margin-left:1000px;margin-top: 50px;">
                <input type="button" class="btn btn-success" onclick="qianpi(${list1.id})" value="签批">&nbsp;&nbsp;&nbsp;<a href="/jsps/abnormal.jsp"><input type="button" class="btn btn-info" value="返回"></a>
            </div>
        </c:if>

        <%--已签批--%>
        <c:if test="${list1.signState==1}">
            <div style="margin-left:1019px;margin-top: 50px;">
                <input type="button" class="btn btn-success" onclick="InThe(${list1.id})" value="扫码">&nbsp;&nbsp;&nbsp;<a href="/jsps/abnormal.jsp"><input type="button" class="btn btn-info" value="返回"></a>
            </div>
        </c:if>
    </div>
</div>
</body>
</html>
