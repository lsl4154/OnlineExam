<%--
  Created by IntelliJ IDEA.
  User: likai
  Date: 2020/11/4
  Time: 15:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title>所有账户信息</title>
</head>
<body>

<h3>所有账户信息</h3>
<%--${accountList}--%>
<c:forEach items="${list}" var="account">  <!--这里的list是对应于model.add方法中的第一个参数-->
  ${account.toString()}
</c:forEach>

</body>
</html>
