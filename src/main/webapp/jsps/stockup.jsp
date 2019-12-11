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
    <script>
        $(function () {
            $('.date_1').cxCalendar();
            $("#tab1").bootstrapTable({
                url: "${pageContext.request.contextPath}/Stockup/findStockup",
                method: "post",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                pagination: true,
                sidePagination: "server",
                pageNumber: 1,
                pageSize: 8,
                clickToSelect:true,		//是否选中
                queryParams: function (params) {
                    return {
                        limit: params.limit,
                        offset: params.offset,
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
                        align : 'center',
                        checkbox: true,
                    },{
                        field: 'number',
                        title: '单号',
                        formatter: function (value, row, index) {
                            return "<a href='/jsps/stockupList.jsp   ?id=" + row.id + "'>" + value + "</a>";
                        }
                    },{
                        field: 'manufacturers',
                        title: '订货单位'
                    }, {
                        field: 'proposer',
                        title: '申请人'
                    }, {
                        field: 'applyDate',
                        title: '填写日期'
                    }, {
                        field: 'signDate',
                        title: '签批日期'
                    }, {
                        field: 'signState',
                        title: '状态',
                        formatter:function (value,row,index) {
                            if(value==0){
                                return "<span>未签批</span>";
                            }else if(value==1){
                                return "<span id='third-item2'>已签批</span>";
                            }else if(value==2){
                                return "<span id='third-item'>已驳回</span>";
                            }
                        }
                    },
                ],
                onLoadSuccess: function () {  //加载成功时执行
                    getTdValue();
                }
            });
        })

        function getTdValue(){
            /*已驳回颜色*/
            $("#third-item").parent().parent().css('background-color', '#FFECEC');
            /*已批改颜色*/
            $("#third-item2").parent().parent().css('background-color', '#F0FFF0');
        }


        function chaxun() {
            $.ajax({
                url:"/Stockup/findLikeStockup",
                type: "POST",
                dataType:"json",
                data:{id:id},
                success: function (data) {
                    alert(111);
                }
            })
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 40px;">备货单</h3>
    <div style="margin-left: 40px;">
        <input class="form-control" style="width: 700px; float: left;" >
        <input type="button" value="查询" class="btn-primary btn" onclick="chaxun()" id="chaxun">
        <input type="button" value="生成出库单" class="btn-primary btn"  id="daoshu" style="margin-left: 200px" onclick="window.location='/jsps/stockupShow.jsp'">
    </div>
    <div style="margin: 40px; margin-top: 20px; box-shadow: 0 0 4px black; height: 620px; padding: 10px">
        <table id="tab1"></table>
    </div>
</div>
</body>
</html>









