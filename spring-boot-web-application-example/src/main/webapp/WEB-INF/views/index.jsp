<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>

<title>Spring Boot</title>
</head>
<body>
  <h1>Spring Boot - MVC web application example</h1>
  <hr>
  <div>
    <form action="hello" method="post" class="container">
      <div style="text-align: center;">
        <br>
        <h1>Team Daily Status "7-11" </h1>
        <hr>
        <br>
        <label for="employeename">Name </label><br><br>
        <input list="employeename" name="name">
        <datalist id="employeename">
          <option value = "Pankaj Malviya">
          <option value = "Sunil Navsariwala">
          <option value = "Milan Delvadiya">
          <option value = "Vaibhav Shrivastava">
          <option value = "Mohit Athani">
          <option value = "Vikram Dibyal">
          <option value = "Suraj Pawar">
          <option value = "Amol Solao">
          <option value = "Swapnil Magdum">
          <option value = "Prathyusha Nagapuri">
          <option value = "Sandeep Kumar">
          <option value = "Prachi Mande">
          <option value = "Roopam Mishra">
          <option value = "Bhushan Ingle">
          <option value = "Ashwin Parrey">
        </datalist>
        <br>
        <hr>
        <label for="ticketnumbertoday">Today Jira-id Number</label><br>
        <input type="text" id="ticketnumbertoday" name="ticketnumbertoday" required><br>

        <label for="todaysstatus">Today Status</label><br>
        <input type="text" id="todaysstatus" name="todaysstatus" required><br>
        <hr>

        <label for="ticketnumbertommows">Tommorows Jira-id Number</label><br>
        <input type="text" id="ticketnumbertommows" name="ticketnumbertommows" ><br>

        <label for="tommmorowsstatus">Tommorows Status</label> <br>
        <input type="text" id="tommmorowsstatus" name="tommmorowsstatus" ><br>
        <hr>
        <input type="submit" value="Submit"><br>
      </div>
    </form>
  </div>
</body>
</html>

<%-- onsubmit="return validate()" --%>