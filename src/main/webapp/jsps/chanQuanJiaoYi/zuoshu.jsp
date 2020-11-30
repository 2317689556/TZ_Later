<%--
  Created by IntelliJ IDEA.
  User: jiale hao
  Date: 2020/11/26
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div style="width: 150px">
<ul class="ce">
<li>

    <%--委托人，财务，个人，admin--%>
<c:if test="${USER.entityId==5||USER.entityId==6||USER.entityId==0||USER.entityId==8}">
<a href="#">业务办理<img class="more" src="/images/more.png"/></a>
</c:if>
<ul class="er">

    <%----%>
    <c:if test="${USER.entityId==5||USER.entityId==6||USER.entityId==0}">
    <li class="e_li">
        <a href="##">财务</a>
        <ul class="thr">
            <c:if test="${USER.entityId==5||USER.entityId==0}">
                <li><a href="##">正常保证金</a></li>
                <li><a href="##">异常保证金</a></li>
                <li><a href="##">退保证金审核</a></li>
            </c:if>
                <%--委托人--%>
            <c:if test="${USER.entityId==6||USER.entityId==0}">
                <li><a href="##">保证金退付管理</a></li>
                <li><a href="##">已办理</a></li>
            </c:if>
            <div class="clear"></div>
        </ul>
    </li>
</c:if>

<%--竞买人--%>
<c:if test="${USER.entityId==8||USER.entityId==0}">
    <li><a href="#">缴纳保证金</a></li>
</c:if>

<%--竞买人--%>
<c:if test="${USER.entityId==8||USER.entityId==0}">
    <li><a href="#">项目报名</a></li>
</c:if>

<%--监管办--%>
<c:if test="${USER.entityId==4||USER.entityId==0}">
    <li><a href="#">合同办理</a></li>
</c:if>

<%--委托人--%>
<c:if test="${USER.entityId==6||USER.entityId==0}">
    <li> <a href="#">项目交易申请</a> </li>
</c:if>

    <%--监管办--%>
<c:if test="${USER.entityId==4||USER.entityId==0}">
    <li> <a href="#">合同审核</a> </li>
</c:if>
    </ul>

    </li>


    <li>
    <a href="#">项目管理<img class="more" src="/images/more.png"/></a>

    <ul class="er">

    <li class="e_li">

    <a href="##">资格审核</a>

    <ul class="thr">

    <li> <a href="##">竞买人列表</a> </li>

    <div class="clear"></div>
    </ul>
    </li>
    <li> <a href="#">合同办理</a> </li>

    <li> <a href="#">合同备案</a> </li>

    <li> <a href="#">项目交易受理</a> </li>

    <%--处长--%>
    <li> <a href="#">项目交易审核</a> </li>

    <%--委托人--%>
    <li> <a href="#">项目申请审核</a> </li>

    <%--处长--%>
    <li> <a href="#">项目申请分派</a> </li>

    <li> <a href="#">成交确认书</a> </li>

    <li> <a href="#">成交结果录入办理</a> </li>

    <li> <a href="#">补充文件办理</a> </li>

    <li> <a href="#">结果公示</a> </li>

    </ul>

    </li>


    <li>
    <a href="#">项目办理<img class="more" src="/images/more.png"/></a>

    <ul class="er">

    <%--监管办--%>
    <li> <a href="#">竞价规则设置</a> </li>

    <%--监管办--%>
    <li> <a href="#">项目负责人登记办理项目</a> </li>

    <%--委托人--%>
    <li> <a href="#">委托人确认</a> </li>

    <%--监管办--%>
    <li> <a href="#">监管办备案</a> </li>

    <%--处长--%>
    <li> <a href="#">处长审核</a> </li>

    </ul>

    </li>


    <div class="clear"></div>
    </ul>
    </div>
    <script type="text/javascript" src="/js/jquery-1.4.2.min.js"></script>
    <script type="text/javascript" src="/js/main.js"></script>


