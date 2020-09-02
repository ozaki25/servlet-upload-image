<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="hello" scope="request" type="java.lang.String" />
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Java Sample</title>
    <link type="text/css" rel="stylesheet" href="/css/main.css" />
  </header>
  <body>
    <h1>Hello</h1>
    <p><%= hello %></p>
  </body>
</html>
