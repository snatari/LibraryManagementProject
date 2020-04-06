<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddDvd</title>
<style >
body {
background-image: url("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/book-quotes-1531945007.jpg?crop=1.00xw:0.753xh;0,0.247xh&resize=980:*");
    background-repeat: no-repeat;
    background-attachment: fixed;  
       	background-size: cover;       
     } 
        </style>
</head>
<body>
<div align="center">
<h1>Add New DVD</h1>
<form action="savedvd"  method="post">
<!--  <form method="post" action="SearchOption">-->
<table>
<tr>
<td>Image</td>
          <td><input type="text" name="imgSource" /> </td>
</tr>
        
         <tr>
          <td>Title</td>
          <td><input type="text" name="dTitle" /> </td>
</tr>
<tr>
          <td>Author</td>
          <td><input type="text" name="dAuthor" /> </td>
</tr> 

 
    <tr>
          <td>No.Of.Copies</td>
          <td><input type="number" name="dcopies" /> </td>
</tr>
<tr>
          <td>Rating</td>
          <td><input type="text" name="vRating" /> </td>
</tr>
          
       <tr>
<td><button type="submit">Submit</button> </td>
</tr> 
   
  </table>
    </form>
        </div>
      
</body>
</html>