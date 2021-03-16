<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculator</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
</head>
<body>
	<section class="container">
	<h1 class="display-4" align="center">Calculator</h1>
	</section>
	<form class="container" method=post action="calculator">
	<div>
	<label for="exampleInputNumber1" class="col-auto">First Number</label>
 	<input type=text name=number1 class="a">
 	</div><br/>
 	<div>
 	<label for="exampleSelectOperator" class="col-auto">Select Operator</label>
 	<select name=operator class="a">
  	<option selected>+ (Addition)</option>
  	<option>- (Subtraction)</option>
  	<option>* (Multiplication)</option>
  	<option>/ (Division)</option>
  	<option>% (Modulus)</option>
 	</select>
 	</div> <br/>
 	<div>
 	<label for="exampleInputNumber2" class="col-auto">Second Number</label>
 	<input type=text name=number2 class="a">
 	</div> <br/>
 	<div>
 	<input type=submit value="=" class="a">
 	</div> <br/> 
	</form> 
</body>
</html>