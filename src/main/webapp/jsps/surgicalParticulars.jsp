<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 手术单 详情</title>
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

        function huizhidan() {
            window.location = "/jsps/surgicalReceipt.jsp?id=${DE.id}&number=${DE.number}&customer=${DE.customer}&ao=${DE.administrativeOffice}&proposer=${DE.proposer}";
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">手术单</h3>

    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
            <tr>
                <div style="margin: 20px">
                    <div style="text-align: left;float: left">
                        <span>订货单位：${DE.proposer}</span>
                    </div>
                    <div style="margin-left: 800px">
                        <span>出库单号：${DE.number}</span>
                    </div>
                    <div style="clear: both"></div>
                    <div style="clear: both ; margin-top: 10px">
                        <div style="text-align: left;float: left">
                            <span>科室：${DE.administrativeOffice}</span>
                        </div>
                        <div style="margin-left: 810px">
                            <span>业务员：${DE.proposer}</span>
                        </div>
                    </div>
                    <div style="clear: both ; margin-top: 10px">
                        <div style="text-align: left;float: left">
                            <span>日期：${DE.writeDate}</span>
                        </div>
                    </div>
                </div>
            </tr>
            <tr style="height: 20px;"></tr>
            <tr>
                <th width="80">序号</th>
                <th width="200px">品名</th>
                <th width="220px">型号</th>
                <th width="150px">规格</th>
                <th width="250px">单位</th>
                <th width="160px">数量</th>
                <th width="180px">单价</th>
                <th width="180px">金额</th>
            </tr>
            <c:forEach items="${SU}" var="p">
                <tr>
                    <td>${p.id}</td>
                    <td>${p.name}</td>
                    <td>${p.model}</td>

                    <td>${p.specification}</td>
                    <td>${p.unit}</td>
                    <td>${p.count}</td>
                    <td>${p.unitPrice}</td>
                    <td>${p.money}</td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="5">合计：${DE.sumcount}</td>
                <td colspan="4">大写：${DE.daXie}</td>
            </tr>
            <tr>
                <td colspan="5">制单：${DE.prepareDocument}</td>
                <td colspan="4">审核：${DE.audit}</td>
            </tr>
            <c:if test="${DE.signState==2}">
                <tr>
                    <td colspan="9">驳回原因：${DE.remark}</td>
                </tr>
            </c:if>
            </tbody>
        </table>
        <div style="float: right;">
            <c:if test="${DE.signState==0}"><input type="button" value="签批" onclick="qianpi(1)">&nbsp;<input type="button" onclick="qianpi(2)" value="驳回"></c:if>
            <c:if test="${DE.signState==1}"><input type="button" value="回执单" onclick="huizhidan()"></c:if>
        </div>
    </div>
</div>
</body>
</html>