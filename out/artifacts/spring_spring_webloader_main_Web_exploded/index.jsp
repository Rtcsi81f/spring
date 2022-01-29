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

<input type="button" onclick="window.location.href='${pageContext.request.contextPath}/web/loader';" value="发起请求">
</body>
</html>
