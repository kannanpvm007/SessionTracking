
    <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>profile</title>
    <meta http-equiv="refresh" content="21">
</head>
<body>

  hai
  Keep the page ideal for 20 seconds
  <br> And try reloading the page
  <br> you will be redirected to home page automatically
 <br>
<% if (session != null) {
    if (session.getAttribute("user") != null) {
        String name = (String) session.getAttribute("user");
        out.print("Hello, " + name + "  Welcome to ur Profile");
    } else {
        response.sendRedirect("index.jsp");
        response.setIntHeader("Login", 5);
    }
}%>
</br>
 <form action="/Logout" method="POST">
     <input type="submit" value="Logout">
 </form>


    
</body>
</html>