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

    <%--企业--%>
    <c:if test="${USER.entityId==7||USER.entityId==0}">
    <li> <a href="#">企业注册资料完善</a> </li>
    </c:if>

    <%--委托人--%>
    <c:if test="${USER.entityId==6||USER.entityId==0}">
    <li> <a  href="${pageContext.request.contextPath}/cjl/findByid">委托人注册资料完善</a> </li>
    </c:if>

    <%--个人--%>
    <c:if test="${USER.entityId==0||USER.entityId==1||USER.entityId==2||USER.entityId==3||USER.entityId==4||USER.entityId==5||USER.entityId==8}">
    <li> <a href="#">个人注册资料完善</a> </li>
    </c:if>

    <div class="clear"></div>
</ul>
</div>
<script type="text/javascript" src="/js/main.js"></script>


