<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
	<head>
		<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet" >
		<title>Add Todo Page</title>		
	</head>
	<body>
		<div class="container">
			<h1>Enter Todo details</h1>
			<form method="post" >
				Description: <input type="text" name="description"/>
				<input type="submit" class="btn">
			</form>
		</div>
		<script src="/META-INF/resources/webjars/bootstrap/5.1.3/js/bootstrap.bundle.min.js"></script>
		<script src="/META-INF/resources/webjars/jquery/3.6.0/jquery.min.js"></script>
		
	</body>
</html>