<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Paint Tool</title>
</head>
<body>

<form action="HandyPaintServlet" method="post">
		Enter the height of your room in feet:
		<input type="text" name="wallHeight" size="10"></br>
		Enter the width of you room in feet:
		<input type="text" name="wallWidth" size="10"></br>
		<input type="submit" value="Calculate Paint required" />
		</form>

</body>
</html>