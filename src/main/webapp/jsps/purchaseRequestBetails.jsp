<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 出库单</title>
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
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">库存</h3>
    <span style="float: left; font-size: 17px; line-height: 34px; margin-left: 40px;">开始日期：</span>
    <input class="form-control date_1" id="date_1" type="date" style="width: 150px; float: left;" onchange="shuaXin()">
    <span style="float: left; font-size: 17px; line-height: 34px; margin-left: 50px;">结束日期：</span>
    <input class="form-control date_1" id="date_2" type="date" style="width: 150px;" onchange="shuaXin()">
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table class="table table-striped table-bordered table-hover" id="sample-table">
            <thead>
            <tr>
                <th width="25"><label><input type="checkbox" class="ace"><span class="lbl"></span></label></th>
                <th width="80">序号</th>
                <th width="100">品名</th>
                <th width="220px">型号</th>
                <th width="150px">规格</th>
                <th width="250px">单位</th>
                <th width="160px">数量</th>
                <th width="180px">单价</th>
                <th width="180px">金额</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${p}" var="p">
                <tr>
                    <td><label><input type="checkbox" class="ace"><span class="lbl"></span></label></td>
                    <td>${p.userId}</td>
                    <td>${p.userName}</td>
                    <td>${p.userPhone}</td>
                    <td>
                        <c:if test="${p.userSex==1}">男</c:if>
                        <c:if test="${p.userSex==0}">女</c:if>
                    </td>
                    <td>${p.userEmail}</td>
                    <td>${p.company}</td>
                    <td>${p.address}</td>
                    <td class="td-manage">
                        <c:if test="${p.userRole==11}">
                            <span class="label label-defaunt radius">不允许操作</span>
                            <a onClick="member_stop(this,'10001',${p.userId})" href="javascript:;" title="冻结"
                               class="btn btn-xs btn-success"><i class="fa fa-check  bigger-120"></i></a>
                        </c:if>
                        <c:if test="${p.userRole!=11}">
                            <c:if test="${p.userState==0}">
                                <a onClick="member_stop(this,'10001',${p.userId})" href="javascript:;" title="冻结"
                                   class="btn btn-xs btn-success"><i class="fa fa-check  bigger-120"></i></a>
                            </c:if>
                            <c:if test="${p.userState==1}">
                                <a onClick="member_start(this,'10001',${p.userId})" href="javascript:;" title="启用"
                                   class="btn btn-xs"><i class="fa fa-close  bigger-120"></i></a>
                            </c:if>

                            <a title="编辑" onclick="modifyUser1(${p.userId})"
                               href="javascript:;" class="btn btn-xs btn-info"><i class="fa fa-edit bigger-120"></i></a>
                        </c:if>


                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
