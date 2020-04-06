<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Login</title>
<style>
body {
		background-image: url("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/book-quotes-1531945007.jpg?crop=1.00xw:0.753xh;0,0.247xh&resize=980:*");
    	background-repeat: no-repeat;
    	background-attachment: fixed;  
       	background-size: cover;       
     }     
</style>          
</head>
<h1 style="text-align:center;color:blue">Welcome to the The Library</h1>
<body>
<div style="text-align:center">
	<font color="red">${errorMessage}</font>
	
    <form method="post" action="LoginRegister">
    <img src ="http://icons.iconarchive.com/icons/graphicloads/flat-finance/128/person-icon.png">
    <br><br>
    <h1 style="color:purple;">MEMBER LOGIN</h1>
    <input type="text" name = "username" placeholder="UserID">
    <br><br>
    <input type ="password" name ="password" placeholder="Enter Password">
    <br><br>
    <input type="checkbox" > Remember Me<br><br>
    <input type ="Submit" name ="login" value ="login">
    <input type ="Submit" name ="register" value ="register">
    </form>
    <p style="color:red;"> <u> Forgot Password</u> </p> 
    </div>
</html>