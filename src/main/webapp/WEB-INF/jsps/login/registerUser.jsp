<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>REgister User</title>
</head>
<body>
<form action="registerUser" method="post">
<pre>
First Name: <input type="text" name="firstName"/>
Last Name: <input type="text" name="lastName"/>
User Name: <input type="text" name="email"/>
Password: <input type="password" name="password"/>
Confirm password: <input type="password" name="confirmPassword"/>
<input type="submit" value="register"/>

</pre>
</form>

</body>
</html>