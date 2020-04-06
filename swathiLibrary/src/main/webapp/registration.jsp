<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Library Registration</title>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Registration Page</title>
<style>
body {
	background-image:
		url("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/book-quotes-1531945007.jpg?crop=1.00xw:0.753xh;0,0.247xh&resize=980:*");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
.center {
	width: 300px;
	border: 3px solid #73AD21;
	padding: 10px;
	text-align: center;
}
label {
	width: 100px;
	display: inline-block;
	text-align: right;
}

th, td {
  padding: 10px;
}

table {
  border-spacing: 5px;
}
</style>
<script>
function ValidateEmail()
{
  var uemail = document.registration.email;
  var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;

  if(uemail.value.match(mailformat))
  {
  	document.registration.desc.focus();
  	return true;
  }
  else
  {
  	alert("You have entered an invalid email address!");
  	uemail.focus();
  	return false;
  }
};
function validate()
{
alert("Validate() - 1");
var x = document.getElementById("firstname").value; 
alert("x");
 
return true;
}

function validateForm() {
var fn = document.getElementById("firstname").value;
var ln = document.getElementById("lastname").value;
submitOK = "true";

alert(document.getElementById("firstname").value);

if (fn.length < 1) {
  alert("Its not a valid first name. please enter correct details");
  submitOK = "false";
}

if (ln.length < 1) {
  alert("Its not a valid last name. please enter correct details");
  submitOK = "false";
}

if (submitOK == "false") {
  return false;
} 
}
</script>
</head>
<body>
<div align="center">
	<h1 style="text-align: center; color: blue">Welcome to the The
		Library - Register Here</h1>
     <form name="myForm" action="Registration"  onsubmit="return validateForm()" method="post" >
      		<table style="center">
				<tr>
					<td><label>First Name:<sup style="color: red">&#9913;</sup></label></td>
					<td><input type="text" name="firstname" required></td>
				</tr>
				<tr>
					<td><label>Last Name:<sup style="color: red;">&#9913;</sup></label></td>
					<td><input type="text" name="lastname" required></td>
				</tr>
				<tr>
					<td><label>Email:<sup style="color: red">&#9913;</sup></label></td>
					<td><input type="email" name="email" onchange="ValidateEmail()" required></td>
				</tr>
				<tr>
					<td><label>Address L1:<sup style="color: red;"> &#9913;</sup> </label></td>
					<td><input type="text" name="addressL1" required></td>
				</tr>
				<tr>
					<td><label>Address L2:<sup> &#9913;</sup> </label></td>
					<td><input type="text" name="addressL2"></td>
				</tr>
				<tr>
					<td><label>State:<sup style="color: red;">&#9913;</sup></label></td>
					<td><input type="text" name="State" required></td>
				</tr>
				<tr>
					<td><label>City:<sup style="color: red;"> &#9913;</sup>	</label></td>
					<td><input type="text" name="City" required></td>
				</tr>
				<tr>
					<td><label>ZipCode:<sup style="color: red;">&#9913;</sup> </label></td>
					<td><input type="number" name="ZipCode" required><br><br></td>
				</tr>
				<tr>
					<td><label>UserName:<sup style="color: red">&#9913;</sup></label></td>
					<td><input type="text" name="username" required></td>
				</tr>
				<tr>
					<td><label>Password:<sup style="color: red"> &#9913;</sup></label></td>
					<td><input type="password" name="password" required>
					</td>
				</tr>
				<tr>
					<td><label>DOB:<sup style="color: red"> &#9913;</sup></label></td>
					<td><input type="Date" name="dob"> <br> <br></td>
				</tr>
				<tr>
					<td><label>Phone<sup style="color: red"> &#9913;</sup></label></td>
					<td><input type="number"   name="phone" required></td>
				</tr>
				<tr>
			</table>
	    	<input type="Submit" name="Submit" value="Submit">
			<input type="Reset" name="Reset" value="Reset"> <br>
			<p style="color: red;">"Please fill out all * Required Fields!"</p>
			<br>${errorMessage} <br> <br>
			</form>
	</div>
</body>
</html>