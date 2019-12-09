<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/9
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>厂家代理、管理</title>
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">

</head>
<body>
<div>
    <ul class="nav nav-tabs" role="tablist" id="biaoqian">
        <li role="presentation" class="active"><a href="#Admin" role="tab" data-toggle="tab">厂家代理、管理</a></li>
    </ul>
    <div class="tab-content">
        <div class="tab-pane active" id="Admin" role="tabpanel">
            <div style="height: 230px; whit :500">
                <table id="Tab3">
                </table>
            </div>
        </div>
    </div>
</div>
</body>
<script>
    $(function(){
        $("#Tab3").bootstrapTable({
            url:"/Vender/findVender",
            method:"post",//提交方式
            pagination:true,//开启分页
            contentType:"application/x-www-form-urlencoded; charset=UTF-8",
            sortable: true,   //是否启用排序
            sortOrder:"asc",//排序的方式
            sortName:"id",
            sidePagination: 'server',//client:前端分页；server:后端分页
            cache:false,//是否使用缓存
            responseHandler:function(res){//处理服务器返回数据
                return{
                    "total":res.total,
                    "rows":res.list
                }
            },columns:[
                {
                    align:"center",
                    title:'序号',//表头名
                    formatter :function (value,row,index){
                        return index+1;
                    }
                }, {
                    align:"center",
                    field:'name',
                    title:'用户名',
                    formatter :function (value,row,index){
                        return 0;
                    }
                },{
                    align:"center",
                    title:'生产线数量',
                    formatter :function (value,row,index){
                        return 0;
                    }
                },{
                    align:"center",
                    title:'产品数量',
                    formatter :function (value,row,index){
                        return 0;
                    }
                },{
                    align:"center",
                    title:'营业执照有效期',
                    formatter :function (value,row,index) {
                        return 0;
                    }
                },
            ]
        });
    });
</script>

</html>
