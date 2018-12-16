<%--
  Created by IntelliJ IDEA.
  User: win10
  Date: 2018/12/11
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

    <title>登陆</title>

</head>

<body>

<form action="registe.do" method="post">

      <table border="1">

      <tr>

      <td><label for="username">用户：</label></td>

      <td><input type="text" name="username" id="username"/></td>

      </tr>

       <tr>

      <td><label for="password">密码：</label></td>

      <td><input type="password" name="password" id="password"/></td>

      </tr>

      <tr>

      <td colspan="2" align="center">

       <input type="submit" value="注册"/>

       <input type="reset" value="重置"/>

      </td>

      </tr>

      </table>

      </form>

</body>
</html>


