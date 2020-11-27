<%--
  Created by IntelliJ IDEA.
  User: jiale hao
  Date: 2020/11/26
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div style="width: 150px">
<ul class="ce">
    <li> <a class="xz"  href="#">目录A</a> </li>
    <li>
        <a href="#">目录B <img class="more" src="/images/more.png"/></a>
        <ul class="er">
            <li>     <a  href="##">二级目录A</a>    </li>
            <li class="e_li">
                <a  href="##">二级目录B</a>
                <ul class="thr">
                    <li> <a  href="##">三级目录A</a> </li>
                    <li>
                        <a  href="##">三级目录B <img class="more1" src="/images/more1.png"/></a>
                        <div class="thr_nr">
                            <h3> 三级目录B主要内容 </h3>
                            <img src="/images/aa.png"/>
                        </div>
                    </li>
                    <li> <a  href="##">三级目录C</a> </li>
                    <li>
                        <a  href="##">三级目录D <img class="more1" src="/images/more1.png"/></a>
                        <div class="thr_nr">
                            <h3> 三级目录D主要内容 </h3>
                            <img src="/images/bb.png"/>
                        </div>
                    </li>
                    <div class="clear"></div>
                </ul>
            </li>
            <li>     <a  href="##">二级目录C</a>   </li>
            <li class="e_li">
                <a  href="##">二级目录D</a>
                <ul class="thr">
                    <li> <a  href="##">三级目录A</a> </li>
                    <li> <a  href="##">三级目录B</a> </li>
                    <li> <a  href="##">三级目录C</a> </li>
                    <li> <a  href="##">三级目录D</a> </li>
                    <div class="clear"></div>
                </ul>
            </li>
        </ul>
    </li>
    <li> <a href="#">目录C</a> </li>
    <li> <a href="#">目录D</a> </li>
    <li> <a href="#">目录E</a> </li>
    <li>
        <a href="#">目录F <img class="more" src="/images/more.png"/></a>
        <ul class="er">
            <li> <a  href="##">二级目录A</a> </li>
            <li> <a  href="##">二级目录B</a> </li>
            <li> <a  href="##">二级目录C</a> </li>
            <li> <a  href="##">二级目录D</a> </li>
        </ul>
    </li>
    <div class="clear"></div>
</ul>
</div>
<script type="text/javascript" src="/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript" src="/js/main.js"></script>


