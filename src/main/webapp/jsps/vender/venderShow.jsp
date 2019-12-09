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
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/imageUp/css/imageUpload.css">
    <script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">

</head>
<body>
<jsp:include page="../utlis/background.jsp"/>
<jsp:include page="../utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border: 1px solid black; float: left; margin: 50px 0px 0px 60px;">
    <div style="text-align-last: left">


        <div>
            <div>
                <p><span></span></p>
            </div>
        </div>

        <div>
            <div>
                <p><span>厂家\代理名称：XXXXXX</span></p>
            </div>
        </div>

        <div>
            <div>
                <p><span>产品线1：XXXX</span> <span style="margin-left: 200px">地区：XXX</span></p>
            </div>
        </div>


        <div>
            <div>
                <p><span>代理有效期：XXXX-XX-XX（剩余XX个月）</span></p>
            </div>
        </div>



        <div>
            <div>
                <p><span>包括产品：XXX、XXX、XXXX、XXXXXXX、XXXXXX</span></p>
            </div>
        </div>



        <div>
            <div>
                <p><span>产品线2：XXXX</span><span style="margin-left: 200px">地区：XXX</span></p>
            </div>
        </div>

        <div>
            <div>
                <p><span>包括产品：XXX、XXXX、XXXXXXX、XXXXX、XXXXXXX</span></p>
            </div>
        </div>

        <div>
            <div>
                <p><span>代理有效期：XXXX-XX-XX（剩余XX个月）</span></p>
            </div>
        </div>



        <div>
            <div>
                <p><span></span></p>
            </div>
        </div>

        <div>
            <div>
                <p><span></span></p>
            </div>
        </div>



        <div>
            <div>
                <p><span>营业执照：</span></p>
                <div class="bmsc_nr_input">
                    <div style="width: 100%;position: relative;">
                        <form id="upBox">
                            <div id="inputBox"><input name="files" type="file" title="请选择图片" id="file" multiple accept="image/png,image/jpg,image/gif,image/JPEG"/>点击选择图片</div>
                            <div id="imgBox"></div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <div>
            <div>
                <p><span>资格证书：</span></p>
            </div>
        </div>

        <!-- Unnamed (提交按钮) -->
        <div>
            <input  type="submit" value="修改" class="text_sketch"/>
        </div>

    </div>
</div>
</body>
<script>
    //启用插件设置相应的参数
    imgUpload({
        inputId:'file',//input框的id
        imgBox:'file',//图片容器id
        buttonId:'btn',//提交按钮id
        upUrl:'${pageContext.request.contextPath}/xxx',
        data:'files',//type="file"控件的name名
        formId:'upBox',//form表单的id
        num:'10',
        inputId:'file', //input框id
        imgBox:'imgBox', //图片容器id
        buttonId:'btn', //提交按钮id
        upUrl:'${pageContext.request.contextPath}/xxx',  //提交地址
        data:'files', //type="file"控件的name名
        formId:"upBox",//form表单的id
        num:"10"//上传个数
    })
</script>



</html>
