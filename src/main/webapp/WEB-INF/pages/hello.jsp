<%--
  Created by IntelliJ IDEA.
  User: enxin
  Date: 2020/6/6
  Time: 17:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<head>
    <title>测试页面</title>

</head>
<body>

<c:forEach items="${list}" var="obj">
    ${obj.aid}-----${obj.aname} <br>
</c:forEach>
</body>
</html>
