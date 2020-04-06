<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddBook</title>
<style>
body {
	background-image:
		url("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/book-quotes-1531945007.jpg?crop=1.00xw:0.753xh;0,0.247xh&resize=980:*");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
</head>
<body>
	<div align="center">
		<h1>Add New Book</h1>
		<form action="save" method="post">
			<!--  <form method="post" action="SearchOption">-->
			<table>
				<tr>
					<td>BookImg</td>
					<td><input type="imagesrc" name="bookimage" /></td>
				</tr>
				<tr>
					<td>Title</td>
					<td><input type="text" name="bTitle" /></td>
				</tr>
				<tr>
					<td>ISBN</td>
					<td><input type="number" name="iSBN" /></td>
				</tr>

				<tr>
					<td>Book Author</td>
					<td><input type="text" name="bookAuthor" /></td>
				</tr>
				<tr>
					<td>No.Of.Copies</td>
					<td><input type="number" name="copies" /></td>
				</tr>
				<tr>
					<td>Illustrator</td>
					<td><input type="text" name="bookillustrator" /></td>
				</tr>

				<tr>
					<td><button type="submit">Submit</button></td>
				</tr>

			</table>
		</form>
	</div>
</body>
</html>