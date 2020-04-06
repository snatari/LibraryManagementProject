<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Library Books</title>
<style>
body {
	background-image:
		url("https://image.freepik.com/free-vector/abstract-paper-hexagon-white-background_51543-7.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}

.header {
	background-color: deeppink;
	padding: 30px 16px;
}

.footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: gray;
	color: white;
	text-align: center;
}

* {
	box-sizing: border-box
}

/* Set height of body and the document to 100% */
body, html {
	height: 100%;
	margin: 0;
	font-family: Arial;
}

/* Style tab links */
.tablink {
	background-color: black;
	color: white;
	float: left;
	border: none;
	outline: none;
	cursor: pointer;
	padding: 14px 16px;
	font-size: 17px;
	width: 33.333%;
}

.tablink:hover {
	background-color: #777;
}

/* Style the tab content (and add height:100% for full page content) */
.tabcontent {
	color: black;
	display: none;
	padding: 100px 20px;
	height: 100%;
}

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}
</style>
</head>
<body>
<script>
//A JavaScript function is a block of JavaScript code.
//The function is invoked (called) when a button is clicked.
function myFunctionEvents() {
	//window.location.href returns the href (URL) of the current page
	window.location.href = "Events";
}

function myFunctionItemsDue() {
	window.location.href = "ItemsDue";
}
function myFunctionContact() {
	window.location.href = "Contact";
}
function Checkout() {
	//document.getElementsByClassName(name) is a method in JavaScript.
	//It will find elements by class name.
	var checks = document.getElementsByClassName('checks');
	//In JS variables are loosley-typed ,so it doesn't require a
	//Datatype to be declared.It can Hold any Datatype.
	var bookschecked = '';
	for (i = 0; i < checks.length; i++) {

		if (checks[i].checked === true) {
			bookschecked += checks[i].value + ",";
		}
	}
	//One of many JavaScript HTML methods is getElementById()
	document.getElementById("thisField").value = bookschecked;

}
function Hold() {
	var holds = document.getElementsByClassName('holds');
	var bookshold = '';
	for (i = 0; i < holds.length; i++) {

		if (holds[i].checked === true) {
			bookshold += holds[i].value + ",";
		}
	}

	document.getElementById("anotherField").value = bookshold;
	alert(bookshold);

}

		
	</script>
</head>
<body>
	<header class="header" style="text-align: center">
		<img
			src="https://s3.amazonaws.com/libapps/accounts/50/images/library_logo.jpg"
			style="width: 100px; height: 60px"> <br>
		<br>Welcome To The Library ${username} &nbsp; &nbsp;
		<%
			String type = (String) session.getAttribute("usertype");
			if (type.equals("admin")) {
		%>
		<a href="/Admin"> Admin </a>

		<%
			}
		%>
		&nbsp; &nbsp; <a href="/Logout"> Logout </a> <br>
		<br>

		<form method="post" action="Search">
			<div class="b" style="text-align: center">
				<label style="color: orange;" style="font-size:small">Type:</label>
				
				<select name="searchoption">
				
					<option value="BOOK">book</option>
					<option value="DVD">dvd</option>
					<option value="MAGAZINE">magazine</option>
				</select> <label style="color: yellowgreen;">SearchBy:</label> <select
					name="SearchCategory">
					<option value="ByAuthor">ByAuthor</option>
					<option value="ByTitle">ByTitle</option>
					<option value="ByISBN">ByISBN</option>
				</select> <input type="text" name="">
				<button title="click me">Search</button>
			</div>
		</form>
	</header>
	<button class="tablink" onclick="myFunctionEvents()">Events</button>
	<button class="tablink" onclick="myFunctionItemsDue()">Items Due</button>
	<button class="tablink" onclick="myFunctionContact()">Contact</button>
	<div id="Home" class="tabcontent"></div>

	

		<table>
		<tr>
			<th>Book</th>
			<th>Title</th>
			<th>ISBN</th>
			<th>Book Author</th>
			<th>Available Copies</th>
			<th>Illustrator</th>
			<th>CheckOut</th>
			<th>Hold</th>
		</tr>
		<c:forEach items="${books}" var="bk">
			<tr>
				<td><img src="${bk.imgSrc}" style="width: 60px; height: 60px;">
				</td>
				<td>${bk.bTitle}</td>
				<td>${bk.ISBN}</td>
				<td>${bk.author}</td>
				<td>${bk.bCopies}</td>
				<td>${bk.illustrator}</td>
				<td><input type="checkbox" class="checks" id="${bk.bCopies}"
					value="${bk.ISBN}" onclick="Checkout()"></td>
				<td><input type="checkbox" class="holds" id="${bk.bCopies}"
					value="${bk.ISBN}" onclick="Hold()"></td>
			</tr>
		</c:forEach>
	</table>
	<br>
	<br>
	<form name="myform" action="Checkout" method="post">
		<div align="center">
			<input type="hidden" id="thisField" name="thisField" value="">
			<input type="hidden" id="anotherField" name="anotherField" value="">
			<input class="tablink" type="Submit" name="Checkout"
				value="Complete Checkout">
		</div>
	</form>
</body>
</html>