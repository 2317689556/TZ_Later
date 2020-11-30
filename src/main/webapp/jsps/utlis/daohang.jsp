<%--
  Created by IntelliJ IDEA.
  User: jiale hao
  Date: 2020/11/26
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    $(document).ready(function(){

        $(".def-nav,.info-i").hover(function(){
            $(this).find(".pulldown-nav").addClass("hover");
            $(this).find(".pulldown").show();
        },function(){
            $(this).find(".pulldown").hide();
            $(this).find(".pulldown-nav").removeClass("hover");
        });

    });
</script>

<div class="hd-main clearfix" id="header" style="height: 50px;width: 100%">

    <%--点击logo返回首页--%>
    <a class="logo" href="/jsps/shouYe/index.jsp"></a>

    <div class="navs">
        <a class="def-nav" href="/jsps/geRenBanGong/index.jsp">个人办公</a>
        <span class="separate"></span>
        <a class="def-nav" href="/jsps/dianZiJingJia/index.jsp">电子竞价</a>
        <span class="separate"></span>
        <a class="def-nav" href="/jsps/chanQuanJiaoYi/index.jsp">产权交易</a>
        <span class="separate"></span>
        <a class="def-nav" href="/jsps/jiaoYiDaTing/index.jsp">交易大厅</a>
        <span class="separate"></span>


        <%--下面的代码没啥卵用，只是页面好看--%>
        <div class="def-nav current has-pulldown-special">
            <a class="pulldown-nav" href=""><em class="f-icon"></em>功能</a>
            <div class="pulldown app-url">
                <div class="content">
                    <a class="li disk" href="">
                        <span class="icon"></span>
                        <span class="text">网盘</span>
                    </a>
                    <a class="li tongxunlu" href="">
                        <span class="icon"></span>
                        <span class="text">通讯录</span>
                    </a>
                    <a class="li xiangce" href="">
                        <span class="icon"></span>
                        <span class="text">相册</span>
                    </a>
                    <a class="li wenzhang" href="">
                        <span class="icon"></span>
                        <span class="text">文章</span>
                    </a>
                    <a class="li note" href="">
                        <span class="icon"></span>
                        <span class="text">记事本</span>
                    </a>
                    <a class="li duanxin" href="">
                        <span class="icon"></span>
                        <span class="text">短信</span>
                    </a>
                    <a class="li zhaohui" href="">
                        <span class="icon"></span>
                        <span class="text">手机找回</span>
                    </a>
                    <a class="li youxi" href="">
                        <span class="icon"></span>
                        <span class="text">游戏</span>
                    </a>
                    <a class="li jiankang" href="">
                        <span class="icon"></span>
                        <span class="text">健康</span>
                    </a>
                </div>
            </div>
        </div>

        <span class="separate"></span>

    </div>

    <div class="info">
        <ul>
            <li class="info-i user-name has-pulldown">
                <em class="f-icon pull-arrow"></em>
                <a class="f-icon identity" href="" title="未开通VIP"></a>
                <span class="name top-username">李四</span>
                <div class="pulldown user-info">
                    <em class="arrow"></em>
                    <div class="content">
                        <span class="li"><a href="">个人资料</a></span>
                        <span class="li"><a href="">购买容量</a></span>
                        <span class="li"><a href="">免费扩容</a></span>
                        <span class="li"><a href="">会员中心</a></span>
                        <span class="separate-li no-height"></span>
                        <span class="li"><a href="javascript:;" id="signout">退出</a></span>
                    </div>
                </div>
            </li>
            <li class="info-i default-text">
                <a class="notice" href="" id="notificationTrigger">通知</a>
                <em class="f-icon notice-nu" id="noticeNoParent">
                    <b class="f-icon" id="noticeNo">0</b>
                </em>
            </li>
            <li class="info-i no-separate default-text has-pulldown">
                <em class="f-icon pull-arrow"></em>
                <span class="more" hideFocus="hideFocus">更多</span>
                <div class="pulldown more-info">
                    <em class="arrow"></em>
                    <div class="content">
                        <span class="separate-li no-height"></span>
                        <span class="li"><a href="">收藏工具</a></span>
                        <span class="li"><a href="">历史记录</a></span>
                        <span class="li"><a href="">版本更新</a></span>
                        <span class="li"><a href="">帮助中心</a></span>
                        <span class="li"><a href="">问题反馈</a></span>
                        <span class="li"><a href="">服务协议</a></span>
                        <span class="li"><a href="">权利声明</a></span>
                    </div>
                </div>
            </li>
        </ul>
    </div>

</div>
