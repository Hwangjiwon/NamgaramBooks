<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Upload File</title>
</head>
<body>
	<h1>Upload your file!!</h1>

	<form action="/sample/exUploadPost" method="post"
		enctype="multiPART/form-data">
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='file' name='files'>
		</div>
		<div>
			<input type='submit'>
		</div>
	</form>

</body>
</html>
