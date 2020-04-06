<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddMagazine</title>
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
<h1>Add New Magazine</h1>
<form action="savemagazine"  method="post">

<table>
<tr>

        <td>ImageSrc</td>
          <td><input type="text" name="mImage" /> </td>
</tr> 
         <tr>
          <td>Title</td>
          <td><input type="text" name="mTitle" /> </td>
</tr>
<tr>
          <td>Publisher</td>
          <td><input type="text" name="mPublisher" /> </td>
</tr> 

 
    <tr>
          <td>No.Of.Copies</td>
          <td><input type="number" name="mcopies" /> </td>
</tr>
<tr>
          <td>Rating</td>
          <td><input type="text" name="mRating" /> </td>
</tr>
          
       <tr>
<td><button type="submit">Submit</button> </td>
</tr> 
   
  </table>
    </form>
        </div>
      
</body>
</html>