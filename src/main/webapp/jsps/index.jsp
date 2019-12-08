<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">
    <link rel="stylesheet" href="/bootstrap/table/bootstrap-tableprin.css">
    <script>
        $(function () {
            aa();
        })

        function aa() {
            $("#tab1").bootstrapTable({
                url: "${pageContext.request.contextPath}/user/show",
                contentType: "application/x-www-form-urlencoded; charset=UTF-8",
                //编码，bootstrapTable的post提交默认是application/json
                cache: false,      //关闭缓存
                pagination: true,   //开启分页
                sidePagination: "server", //服务端分页，client是客户端
                pageNumber: 1,     //分页起始行,默认第一行
                pageSize: 10,       //每页几行
                pageList: [10, 20, 30],   //设置每页几行的下拉框
                showRefresh: true,  //刷新按钮
                strictSearch: true,     //精确搜索
                showColumns: true,      //列的下拉菜单
                showColumns: true,
                clickToSelect: true,    //设置复选框头
                queryParams: function (params) {   //传入
                    return {
                        limit: params.limit,     // 每页要显示的数据条数
                        offset: params.offset,   // 每页显示数据的开始行号
                        diqu: $("#asd").val(),
                        order: $("#xgy").val()
                    };
                }, responseHandler: function (res) {//返回
                    return {
                        "total": res.total,//总页数
                        "rows": res.list   //返回数据的集合
                    };
                },
                columns: [//field：属性  title：列名
                    {
                        field: 'name',
                        title: 'name'
                    }, {
                        field: 'url',
                        title: 'url'
                    }, {
                        field: 'shouci',
                        title: 'shouci'
                    }, {
                        field: 'daxiao',
                        title: 'daxiao'
                    }, {
                        field: 'cengshu',
                        title: 'cengshu'
                    }, {
                        field: 'ting',
                        title: 'ting'
                    }, {
                        field: 'juli',
                        title: 'juli'
                    }, {
                        field: 'money',
                        title: 'money', formatter: function (value, row, index) {
                            return value + "元";
                        }
                    }
                ]
            })
        }

        function bb(asgfaerg) {
            var psel = document.getElementById("asd");
            psel.value = asgfaerg; //设置
            $('#tab1').bootstrapTable('refresh');
        }

        function cc() {
            $('#tab1').bootstrapTable('refresh');
        }
    </script>
</head>
<body>
<div>
    <input type="text" id="asd" value="" hidden>
    <a href="javascript:bb('昌平')">昌平</a>
    <a href="javascript:bb('朝阳')">朝阳</a>
    <a href="javascript:bb('大兴')">大兴</a>
    <a href="javascript:bb('东城西城')">东城西城</a>
    <a href="javascript:bb('房山门头沟亦庄开发区')">房山门头沟亦庄开发区</a>
    <a href="javascript:bb('丰台')">丰台</a>
    <a href="javascript:bb('海淀')">海淀</a>
    <a href="javascript:bb('石景山')">石景山</a>
    <a href="javascript:bb('顺义')">顺义</a>
    <a href="javascript:bb('通州')">通州</a>
    <a href="javascript:bb('总和')">总和</a>
    <select id="xgy" onchange="javascript:cc()">
        <option value="DESC">倒序</option>
        <option value="ASC">正序</option>
    </select>
    <table id="tab1"></table>
</div>
</body>
</html>
