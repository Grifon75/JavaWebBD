<%-- 
    Document   : login
    Created on : 07.02.2017, 14:42:59
    Author     : Gringo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="newcss.css">
        <title>Login Page</title>
    </head>
    <body class="login_body" background="red" >
        <h3 color="red" >Введите логин и пароль</h3>
        <form action="Login">
            Login__<input type="text" name="login" placeholder="enter login"><br/>
            Password__<input type="password" name="password" placeholder="enter password"><br/>
            <input type="submit" value="Send">
        </form>
    </body>
</html>
