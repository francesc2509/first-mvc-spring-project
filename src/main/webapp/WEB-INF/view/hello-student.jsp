<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello Students!</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/public/css/styles.css"  />
</head>
<body>
<p>Hello ${param.name}!</p>
<p class="red">${message}</p>
<img alt="Hello" src="${pageContext.request.contextPath}/public/img/image.png">
</body>
</html>