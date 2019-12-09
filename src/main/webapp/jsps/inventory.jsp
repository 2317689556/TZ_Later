<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 主页</title>
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">
    <script>
        $(function () {
            $("#tab1").bootstrapTable({
                url: "${pageContext.request.contextPath}/",
                method: "get",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                //编码，bootstrapTable的post提交默认是application/json
                cache: false,      //关闭缓存
                pagination: true,   //开启分页
                sidePagination: "server", //服务端分页，client是客户端
                pageNumber: 1,     //分页起始行,默认第一行
                pageSize: 3,       //每页几行
                pageList: [3, 5, 10],   //设置每页几行的下拉框
                showRefresh: true,  //刷新按钮
                strictSearch: true,     //精确搜索
                showColumns: true,      //列的下拉菜单
                clickToSelect: true,    //设置复选框头
                queryParams: function (params) {   //传入
                    return {
                        limit: params.limit,     // 每页要显示的数据条数
                        offset: params.offset,   // 每页显示数据的开始行号
                        sort: params.sort,       // 要排序的字段
                        order: params.order,     // 排序规则
                    };
                },
                responseHandler: function (res) {//返回
                    return {
                        "total": res.total,//总页数
                        "rows": res.list   //返回数据的集合
                    };
                },
                columns: [//field：属性  title：列名
                    {
                        field: 'id',
                        title: '序号',
                        formatter: function (value, row, index) {
                            //value：该列的字段值
                            //row：这一行的数据对象
                            //index：行号，从0开始
                            return index + 1;
                        }
                    }, {
                        field: 'age',
                        title: '年龄'
                    }
                ]
            });
        })
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border: 1px solid black; float: left; margin: 50px 0px 0px 60px;">
    <h3>库存</h3>
    <table id="tab1"></table>
</div>
</body>
</html>
