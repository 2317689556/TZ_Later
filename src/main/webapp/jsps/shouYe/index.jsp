<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>台州管理系统 首页</title>
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
    <link type="text/css" href="/css/style1.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="/css/style2.css"/>
    <link rel="stylesheet" href="/index/css/style.css">

    <style>
        p{
            color:#fff;
            font-size:15px;
            text-shadow: 0 0 10px #529DFF;
        }
    </style>
</head>

<body>

<c:import url="/jsps/utlis/daohang.jsp"/>

<div class="wrap about_page" id="wrap">
    <div class="wrapper">
        <div class="header">
            <div class="head">

                <div class="nav_box">
                    <ul class="nav_list" id="nav_list">
                        <li><a href="http://62.234.3.187:8080/jsps/firstpage.jsp" target="_blank">凌云微软研究部</a></li>
                        <li><a href="javascript:void(0);" onclick="play()" id="playbtn" class="btn_sound"></a></li>
                        <li><a href="#">主页</a></li>
                        <li><a href="">官网</a></li>
                    </ul>
                    <span class="ic_line" id="h_line"></span>
                </div>
            </div>
        </div>
        <div class="events_sec" id="events_sec" style="height: 970px">
            <div class="content"style="height: 970px">
                <h3 class="hide_txt png">sc.chinaz.com</h3>
                <div class="events_list">
                    <span class="ic_time png"></span>
                    <ul>
                        <li class="right_li">
                            <span class="ic_events png"></span>
                            <p class="txt_events"><strong>陈佳乐</strong></p>
                        </li>
                        <li class="left_li">
                            <span class="ic_events"><i class="png"></i></span>
                            <p class="txt_events"><strong>于浩洋</strong></p>
                        </li>
                        <li class="right_li">
                            <span class="ic_events png"></span>
                            <p class="txt_events"><strong>张凤</strong></p>
                        </li>
                        <li class="left_li">
                            <span class="ic_events"><i class="png"></i></span>
                            <p class="txt_events"><strong>郝家乐</strong></p>
                        </li>
                        <li class="right_li">
                            <span class="ic_events png"></span>
                            <p class="txt_events"><strong>冯朝阳</strong></p>
                        </li>
                        <li class="left_li">
                            <span class="ic_events"><i class="png"></i></span>
                            <p class="txt_events"><strong>孔祥鹏</strong></p>
                        </li>
                    </ul>
                    <span class="ic_arr png"></span>
                </div>
            </div>
        </div>

      <%--  <div class="wage_sec" id="wage_sec" style="height: 150px">
            <div class="content">


                <center>
                    <p></p>
                    <p>来源：<a href="http://62.234.3.187:8080/jsps/firstpage.jsp" target="_blank">凌云微软研究部</a></p>
                </center>
                <br><br><br>

            </div>
        </div>--%>
    </div>
</div>

<audio id="audios" controls="true" autoplay="autoplay" class="audio" style="display:none;"></audio>

<script>
    var url=["",""];
    var num = GetRandomNum(0,url.length-1);
    document.getElementById("audios").src="http://"+url[num];
    function GetRandomNum(Min,Max)
    {
        var Range = Max - Min;
        var Rand = Math.random();
        return(Min + Math.round(Rand * Range));
    }

    function play(){
        var div = document.getElementById('playbtn');
        var obj=document.getElementById("audios");
        if(obj.paused){
            obj.play();
            div.setAttribute("class", "btn_sound");
        }else{
            obj.pause();
            div.setAttribute("class", "btn_sound btn_no_sound");
        }
    }
</script>
<script src="/index/js/canvas-nest.min.js"></script>

</body>
</html>
