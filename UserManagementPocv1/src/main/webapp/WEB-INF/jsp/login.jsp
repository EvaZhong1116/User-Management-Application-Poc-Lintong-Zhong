<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<c:set var="contextPath" value="" />
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial- scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">
<title>Log in with your credentials</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<form method="POST" action="/customizelogin" class="form-
signin">
			<h2 class="form-heading">Log in</h2>
			<div class="form-group ">
				<span></span> 
				<input class="form-control" name="username"
					type="text" placeholder="Username" autofocus="true" /> 
				<input
					class="form-control" name="password" type="password"
					placeholder="Password" />
					
					
					<span></span>
				<button class="btn btn-lg btn-primary btn-block" type="submit">Log in 
					
			</div>
		</form>
		
		<form action="https://accounts.google.com/o/oauth2/auth" method="get">
    		<input type="hidden" name="client_id" value="416398195151-dj6ov14uiheaf3190cmu631jh007007a.apps.googleusercontent.com">
    		<input type="hidden" name="redirect_uri" value="http://localhost:8080/welcome">
    		<input type="hidden" name="response_type" value="code">
    		<input type="hidden" name="scope" value="openid profile email">
    		<button type="submit">Login with Google</button>
		</form>
		
		<a href="/register">Register New User</a>
	</div>
	<!-- /container -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>