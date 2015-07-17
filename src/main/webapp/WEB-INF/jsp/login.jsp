<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<center> <h3>Login Page</h3> <br/>
  <form:form commandName="login" method="POST" name="login">
    Username:<form:input path="username"/>
    <font color="red"><form:errors path="username"/></font><br/><br/>
    Password:<form:password path="password"/>
    <font color="red"><form:errors path="password"/></font><br/><br/>
    <input type="submit" value="Login"/> </form:form>
</center>
</body>
</html>
