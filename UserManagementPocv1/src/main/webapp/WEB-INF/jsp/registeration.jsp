<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<body>
	<h3 style="color: red;">Register New User</h3>
	<div id="registerEmployee">
		<form:form action="/register" method="post" modelAttribute="user">
			<p>
				<label>Enter username</label>
				<form:input path="username" />
			</p>
			
			<p>
				<label>Enter password</label>
				<form:password path="password" />
			</p>
			
			<p>
    			<label>Enter email</label>
    			<form:input path="email" id="email" type="email" />
			</p>
			
			<input type="SUBMIT" value="Submit" />
		</form:form>
	</div>
</body>
</html>