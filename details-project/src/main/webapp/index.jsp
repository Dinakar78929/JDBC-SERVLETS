<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index Page</title>
</head>
<body>
<form method="post" action="send">
<div>
<label>Name:</label>
<input type="text" name="name">
</div>
<div>
<label>Qualification:</label>
<input type="text" name="qualification">
</div>
<div>
<label>Stream:</label>
<select name="stream">
<option value="0">--Select Stream--</option>
<option value="mechanical">Mechanical</option>
<option value="civil">Civil</option>
<option value="cs">CS</option>
<option value="ec">EC</option>
<option value="eee">EEE</option>
</select>
</div>
<div>
<label>Course:</label>
<select name="course">
<option value="0">--Select Course--</option>
<option value="be">BE</option>
<option value="btech">BTech</option>
</select></div>
<div>
<label>College:</label>
<input type="text" name="college">
</div>
<div>
<label>City:</label>
<input type="text" name="city">
</div>
<div>
<label>State:</label>
<input type="text" name="state">
</div>
<div>
<label>Country:</label>
<input type="text" name="country">
</div>
<input type="submit" value="Send">
<input type="reset" value="Clear">
</form>
</body>
</html>