<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>File Upload</title>
</head>
<body>
	<div class="text-center border w-75 container pt-2">
		<c:if test="${!empty error}">
			<p style="color: red;">
				<c:out value="${error}" />
			</p>
		</c:if>
		<c:if test="${!empty success}">
			<p style="color: green;">
				<c:out value="${success}" />
			</p>
		</c:if>
		<form method="post" action="Upload" enctype="multipart/form-data">
			<fieldset>
				<h2>Carica File</h2>
				<hr>
				<p>
					<label>Seleziona il file che vuoi caricare</label><br /> 
					<input class="btn btn-primary" type="file" name="file"id="file" />
				</p>
				<p>
					<input class="btn btn-success" type="submit" name="uploadFile" value="Carica file" />
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>