
    <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"
 import="test.AdminBean"%>
 <!DOCTYPE html>
 <html>
 <head>
 <meta charset="ISO-8859-1">
 <title>Insert title here</title>
 </head>
 <body>
 <%
 AdminBean ab = (AdminBean)session.getAttribute("abean");
 out.println("Welcome Admin : "+ab.getfName()+"<br>");
 %>
 <a href="book.html">AddBook</a>
 <a href="view">ViewBooks</a>
 <a href="logout">Logout</a>
 </body>
 </html>