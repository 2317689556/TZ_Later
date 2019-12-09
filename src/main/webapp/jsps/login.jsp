<!doctype html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>千佛山医院管理系统</title>
  <meta name="description" content="这是一个 index 页面">
  <meta name="keywords" content="index">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
	<link href="${pageContext.request.contextPath}/static/assets/css/bootstrap.min.css" rel="stylesheet" />
  <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/static/assets/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/static/assets/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/amazeui.min.css" />
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/admin.css">
  <link rel="stylesheet" href="${pageContext.request.contextPath}/static/assets/css/app.css">
</head>

<body>
  <div class="am-g myapp-login" style="color:#6495ED;">
	<div class="myapp-login-logo-block  tpl-login-max">
		<div class="myapp-login-logo-text">
			<div class="myapp-login-logo-text">
			医疗系统	<span> 千佛山</span>
				
			</div>
		</div>

		<div class="login-font">
			<i>Dudley </i> Pipeline <span> System</span>
		</div>
		<div class="am-u-sm-10 login-am-center">
			<form class="am-form">
				<fieldset>
					<div class="am-form-group">
						用户名：<input type="text" class="" id="doc-ipt-name-1" placeholder="输入账号">
					</div>
					<div class="am-form-group">
						密码：<input type="password" class="" id="doc-ipt-pwd-1" placeholder="请输入密码">
					</div>
					<p><button type="button" id="dluser" class="am-btn am-btn-default">登陆</button></p>
				</fieldset>
			</form>
		</div>
	</div>
</div>

  <script src="${pageContext.request.contextPath}/static/assets/js/jquery.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/assets/js/amazeui.min.js"></script>
  <script src="${pageContext.request.contextPath}/static/assets/js/app.js"></script>
</body>
</html>
<script type="text/javascript">
		//校验登陆
        $("#doc-ipt-phone-1").blur(function () {
			var username = $("#doc-ipt-name-1").val();
			if ($("doc-ipt-phone-1").val()<1){
				alert("账号不能为空");
				return false;
			}
        });
		$("#doc-ipt-pwd-1").blur(function () {
			var pwd = $("#doc-ipt-pwd-1").val();
			if ($("#doc-ipt-pwd-1").val()<1){
				alert("密码不能为空");
				return false;
			}
		});


	$(function () {
	 	//用户登陆
		 $("#dluser").click(function () {
             var phone=$("#doc-ipt-phone-1").val();
             var pwd=$("#doc-ipt-pwd-1").val();
			 $.ajax({
				 url:'${pageContext.request.contextPath}/user/getuser',
				 data:{"userPhone":phone,"userPassword":pwd},
				 type:'post',
				 dataType:'json',
				 success:function (data) {
					 if (data!=null){
					 	window.location.href="${pageContext.request.contextPath}/jsps/index.jsp";
					 }
				 },error:function (data) {
                     alert("用户和密码不正确 AND 用户冻结");
				 }
			 })
		 })

	 })



</script>