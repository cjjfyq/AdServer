<%@ page import="java.io.Console" %>
<%--
  Created by IntelliJ IDEA.
  User: Gordon
  Date: 2014/4/14
  Time: 21:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<html>
<head>
    <title>adserver</title>

<style type="text/css">

</style>

<script type="text/javascript">
    function login() {
//        alert("login");
        var nameInput = document.getElementById("#name");
        var name = nameInput.value;
        var pw = document.getElementById("#password").value;
        alert("name:" + name + "pw:" + pw);
    }
</script>

</head>
<body>
<h1 style="color: green">登录页面</h1>

<form id="form1" action="/adserver/doLogin" >
用户名：<input type="text" id="name" ><br>
密码：<input type="password" id="password"><br>
<input type="submit" value="登录" id="login">
</form>

</body>
</html>
