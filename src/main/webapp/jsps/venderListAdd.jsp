<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>千佛山医院管理系统 库存</title>
    <script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>
    <script src="http://www.jq22.com/jquery/bootstrap-3.3.4.js"></script>
    <script src="/bootstrap/table/bootstrap-table.js"></script>
    <script src="/bootstrap/js/bootstrap-tab.js"></script>
    <script src="/bootstrap/js/bootstrap.js"></script>
    <script src="/bootstrap/js/bootstrap.min.js"></script>
    <script src="/cxCalendar/js/jquery.cxcalendar.js"></script>
    <script src="/filer/js/jquery.filer.min.js" type="text/javascript"></script>
    <script src="/filer/js/prettify.js" type="text/javascript"></script>
    <script src="/filer/js/scripts.js" type="text/javascript"></script>
    <script src="/filer/js/custom.js" type="text/javascript"></script>
    <link rel="stylesheet" href="/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/bootstrap/css/bootstrap-tab.css">
    <link rel="stylesheet" href="/cxCalendar/css/jquery.cxcalendar.css">
    <link rel="stylesheet" type="text/css" href="/filer/css/jquery.filer.css">
    <link rel="stylesheet" type="text/css" href="/filer/css/jquery.filer-dragdropbox-theme.css">
    <link rel="stylesheet" type="text/css" href="/filer/css/tomorrow.css">
    <link rel="stylesheet" type="text/css" href="/filer/css/custom.css">
    <link rel="stylesheet" type="text/css" href="/filer/css/reset.css">
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
            width: 380px;
            box-shadow: 0 0 5px black;
        }
    </style>
    <script>
        $(function () {
            $('.date_1').cxCalendar();
            $('.temp5').filer({
                changeInput: '<div class="jFiler-input-dragDrop"><div class="jFiler-input-inner"><div class="jFiler-input-icon"><i class="icon-jfi-folder"></i></div><div class="jFiler-input-text"><h3>Click on this box</h3> <span style="display:inline-block; margin: 15px 0">or</span></div><a class="jFiler-input-choose-btn blue">Browse Files</a></div></div>',
                showThumbs: true,
                theme: "dragdropbox",
                templates: {
                    box: '<ul class="jFiler-items-list jFiler-items-grid"></ul>',
                    item: '<li class="jFiler-item">\
                    <div class="jFiler-item-container">\
                        <div class="jFiler-item-inner">\
                            <div class="jFiler-item-thumb">\
                                <div class="jFiler-item-status"></div>\
                                <div class="jFiler-item-info">\
                                    <span class="jFiler-item-title"><b title="{{fi-name}}">{{fi-name | limitTo: 25}}</b></span>\
                                    <span class="jFiler-item-others">{{fi-size2}}</span>\
                                </div>\
                                {{fi-image}}\
                            </div>\
                            <div class="jFiler-item-assets jFiler-row">\
                                <ul class="list-inline pull-left">\
                                    <li>{{fi-progressBar}}</li>\
                                </ul>\
                                <ul class="list-inline pull-right">\
                                    <li><a class="icon-jfi-trash jFiler-item-trash-action"></a></li>\
                                </ul>\
                            </div>\
                        </div>\
                    </div>\
                </li>',
                    itemAppend: '<li class="jFiler-item">\
                        <div class="jFiler-item-container">\
                            <div class="jFiler-item-inner">\
                                <div class="jFiler-item-thumb">\
                                    <div class="jFiler-item-status"></div>\
                                    <div class="jFiler-item-info">\
                                        <span class="jFiler-item-title"><b title="{{fi-name}}">{{fi-name | limitTo: 25}}</b></span>\
                                        <span class="jFiler-item-others">{{fi-size2}}</span>\
                                    </div>\
                                    {{fi-image}}\
                                </div>\
                                <div class="jFiler-item-assets jFiler-row">\
                                    <ul class="list-inline pull-left">\
                                        <li><span class="jFiler-item-others">{{fi-icon}}</span></li>\
                                    </ul>\
                                    <ul class="list-inline pull-right">\
                                        <li><a class="icon-jfi-trash jFiler-item-trash-action"></a></li>\
                                    </ul>\
                                </div>\
                            </div>\
                        </div>\
                    </li>',
                    itemAppendToEnd: false,
                    removeConfirmation: true,
                    _selectors: {
                        list: '.jFiler-items-list',
                        item: '.jFiler-item',
                        remove: '.jFiler-item-trash-action'
                    }
                }
            });

        })

        function updata1() {
            $.ajax({
                url: "/Vender/VenderAdd",
                data: new FormData($("#temp6")[0]),
                type: "POST",
                processData: false,
                contentType: false,
                success: function (data) {
                    alert("修改成功");
                    window.location = "/jsps/venderList.jsp";
                }, error: function () {
                    alert("修改失败");
                }
            })
        }
    </script>
</head>

<body>
<c:import url="utlis/background.jsp"/>
<c:import url="utlis/broadside.jsp"/>
<div style="width: 1300px; height: 800px; border:1px solid rgba(0,0,0,0.6); float: left; margin: 50px 0px 0px 60px; box-shadow: 0 0 8px black;">
    <h3 style="margin-bottom: 10px; font-size: 18.72px">代理厂商添加</h3>
    <div style="margin: 40px; margin-top: 89px; box-shadow: 0 0 4px black; height: 650px; padding: 25px 50px 0 50px; text-align: left;" id="temp1">
        <form id="temp6" enctype="multipart/form-data" action="/Vender/VenderAdd" method="post">
            <table style="float:left;">
                <tr>
                    <td><span>代理商名称：</span></td>
                    <td><input type="text" value="${AGENCY.name}" class="form-control" name="name"></td>
                </tr>
                <tr>
                    <td><span>营业执照时间：</span></td>
                    <td><input type="date" value="${AGENCY.date}" class="form-control date_1" name="date"></td>
                </tr>
                <tr>
                    <td><span>产品线名称：</span></td>
                    <td><input type="text" value="${i.name}" class="form-control" name="name1"></td>
                </tr>
                <tr>
                    <td><span>产品：</span></td>
                    <td class="temp6"><input type="text" name="name2"><br><input type="text" name="name2"><br><input type="text" name="name2"><br><input type="text" name="name2" style="margin-bottom: 6px"></td>
                </tr>
                <tr>
                    <td><span>地区：</span></td>
                    <td><input type="text" value="${i.address}" class="form-control" name="address"></td>
                </tr>
                <tr>
                    <td><span>代理有效期：</span></td>
                    <td><input type="date" value="${i.validityOfAgency}" class="form-control date_1" name="validityOfAgency"></td>
                </tr>
                <tr>
                    <td><span>产品线名称：</span></td>
                    <td><input type="text" value="${i.name}" class="form-control" name="name1"></td>
                </tr>
                <tr>
                    <td><span>产品：</span></td>
                    <td class="temp6"><input type="text" name="name3"><br><input type="text" name="name3"><br><input type="text" name="name3"><br><input type="text" name="name3" style="margin-bottom: 6px"></td>
                </tr>
                <tr>
                    <td><span>地区：</span></td>
                    <td><input type="text" value="${i.address}" class="form-control" name="address"></td>
                </tr>
                <tr>
                    <td><span>代理有效期：</span></td>
                    <td><input type="date" value="${i.businessLicenseTemp}" class="form-control date_1" name="validityOfAgency"></td>
                </tr>
                <input type="hidden" value="${i.id}" name="id1">
            </table>
            <div id="Temp2" style="margin-left: 20px; float: left; text-align: center; width: 400px;">
                <input type="file" name="tupian1" class="temp4 temp5" value="资格证书" multiple="multiple">
            </div>
            <div id="Temp4" style="margin-left: 20px; float: left; text-align: center; width: 400px;">
                <input type="file" value="营业执照" name="tupian1" class="temp4 temp5" multiple="multiple">
            </div>
            <div style="" id="temp3">
                <input type="button" onclick="updata1()" value="完成" class="btn-primary btn temp4" style="margin-top: 560px; margin-left:-70px; position: absolute;">
            </div>
        </form>
    </div>
</div>
</body>
</html>
