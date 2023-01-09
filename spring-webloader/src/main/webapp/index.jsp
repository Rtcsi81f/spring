<%--
  Created by IntelliJ IDEA.
  User: setsunayang
  Date: 2022/1/29
  Time: 08:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" isELIgnored="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<html>
<head>
    <title>欢迎页面</title>
</head>
<body>
<input class="button" type="button" onclick="window.location.href='${pageContext.request.contextPath}/web/loader';"
       value="请求成功页面">
<input class="button" type="button" onclick="window.location.href='${pageContext.request.contextPath}/user/getUserInfoById';"
       value="请求用户页面">
<input class="button" type="button" onclick="window.location.href='${pageContext.request.contextPath}/env/toEnv';"
       value="测试Environment实例">
<input class="button" type="button" onclick="window.location.href='${pageContext.request.contextPath}/jvm/test';"
       value="jvm 简单测试，配合 jvisualvm 实验">
<input class="button" type="button" onclick="window.location.href='${pageContext.request.contextPath}/user/getUserVO'"
       value="关联查询">
<input class="button" type="button" onclick="window.location.href='${pageContext.request.contextPath}/transaction/test'"
       value="事务：TEST">
</body>
</html>
