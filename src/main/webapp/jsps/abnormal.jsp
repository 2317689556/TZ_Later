<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 异常查询</title>
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
                url: "/Abnormal/AbnormalFindAll",
                method: "get",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination: true,
                striped: true,
                sidePagination: "server",
                pageNumber: 1,
                pageSize: 8,
                queryParams: function (params) {
                    return {
                        limit: params.limit,
                        offset: params.offset,
                        date_1: $("#date_1").val(),
                        date_2: $("#date_2").val()
                    };
                },
                responseHandler: function (res) {
                    return {
                        "total": res.total,
                        "rows": res.list
                    };
                },
                columns: [
                    {
                        field: 'id',
                        title: '序号',
                        formatter: function (value, row, index) {
                            return index + 1;
                        }
                    }, {
                        field: 'number',
                        title: '单号',
                        formatter: function (value, row, index) {
                            return "<a href='/Abnormal/AbnormalFindAllById?id=" + row.id + "'>" + value + "</a>";
                        }
                    }, {
                        field: 'customer',
                        title: '填单'
                    }, {
                        field: 'date',
                        title: '出库日期'
                    }, {
                        field: 'cause',
                        title: '异常原因'
                    }, {
                        field: 'signState',
                        title: '状态',
                        formatter:function (value,row,index) {
                            if(value==0){
                                return "<span class='third-item'>未签批</span>";
                            }else if(value==1){
                                return "<span class='third-item2'>已签批</span>";
                            }else if(value==2){
                                return "<span>换货中</span>";
                            }else if(value==3){
                                return "<span>已完成</apan>"
                            }
                        }
                    }
                ],
                onLoadSuccess: function () {  //加载成功时执行
                    getTdValue();
                }
            });
        })
        function getTdValue(){
            /*未签批的颜色*/
            $(".third-item").parent().parent().css('background-color', '#FFECEC');
            /*已签批的颜色*/
            $(".third-item2").parent().parent().css('background-color', '#F0FFF0');
        }
        /*刷新*/
        function shuaXin() {
            $('#tab1').bootstrapTable('refresh');
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px">异常查询</h3>
    <span style="float: left; font-size: 17px; line-height: 34px; margin-left: 40px;">开始日期：</span>
    <input class="form-control date_1" id="date_1" type="date" style="width: 150px; float: left;" onchange="shuaXin()">
    <span style="float: left; font-size: 17px; line-height: 34px; margin-left: 50px;">结束日期：</span>
    <input class="form-control date_1" id="date_2" type="date" style="width: 150px;" onchange="shuaXin()">
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table id="tab1"></table>
    </div>
</div>
</body>
</html>
