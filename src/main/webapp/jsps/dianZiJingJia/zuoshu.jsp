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

    <%--监管办能看--%>
    <c:if test="${USER.entityId==4||USER.entityId==0}">
    <li>
        <a href="#">竞价管理<img class="more" src="/images/more.png"/></a>
        <ul class="er">
            <li>     <a  href="##">电子竞价管理</a>    </li>
        </ul>
    </li>
    </c:if>

    <c:if test="${USER.entityId==4||USER.entityId==0}">
    <li>
        <a href="#">竞价监督<img class="more" src="/images/more.png"/></a>
        <ul class="er">
            <li> <a  href="##">竞价规则设置</a> </li>
            <li> <a  href="##">标的信息列表</a> </li>
            <li> <a  href="##">标的设置规则</a> </li>
        </ul>
    </li>
    </c:if>

    <div class="clear"></div>
</ul>
</div>
<script type="text/javascript" src="/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="/js/main.js"></script>


