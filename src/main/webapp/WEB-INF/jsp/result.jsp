<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">

<head>
<link rel="stylesheet" type="text/css" href="/resources/css/bootstrap.min.css" />
<c:url value="/resources/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
</head>

<body>

	<nav class="navbar navbar-inverse">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">XQuery Processor</a>
			</div>
			<div id="navbar" class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#about">About</a></li>
				</ul>
			</div>
		</div>
	</nav>
	  
<div class="container">
   	<div class="left">
			<form method = "POST" action = "/XQuery" id="query">
				<textarea name="query" rows="35" cols="80">${query}</textarea> 
    			<input type = "submit" value = "Submit" class = "button">
			</form>
		</div>

   	<div class="center">
			${file}
			<form method = "POST" action = "/upload" id="upload" enctype="multipart/form-data">
				<input type="file" name="file" /><br/>
    			<input type="submit" value="Upload" class = "button">
			</form>
			<form method = "POST" action = "/clean" id="query">
    			<input type="submit" value="Clean" class = "button">
			</form>
		</div>
		
   	<div class="right">
			<textarea name="result" rows="35" cols="80">${result}</textarea>
		</div>
</div>
</body>

</html>
