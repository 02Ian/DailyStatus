<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring Boot</title>
</head>
<body>
  <h1>Your Daily-Status</h1>
  <hr>
  <h2>Your name is ${name}</h2>
  <h2>Your Jira-id id ${ticketnumbertoday}</h2>
  <h2>Your Today's Description is ${todaysstatus}</h2>
  <h2>Your Jira-id is ${ticketnumbertommows}</h2>
  <h2>Your Tommorow's Description is ${tommmorowsstatus}</h2>
</body>
</html>