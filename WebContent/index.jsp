<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>The Handy Carpet and Tile figuring tool</title>
</head>
<body>

	<h1>Welcome to the Handy Carpet and Tile Tool!!!</h1>
	<h3>Figure the square yards required to cover the surface you have measured.</h3>
	

		<form action="handyCarpetServlet" method="post">
		Enter the length of your room:
		<input type="text" name="roomLength" size="10">
		Enter the width of you room:
		<input type="text" name="roomWidth" size="10">
		<input type="submit" value="Calculate Square Yards" />
		</form>
	
	
	
	
</body>
</html>