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
    <form action="upload" method="post" enctype="multipart/form-data">
      <input type="hidden" name="action_name" value="upload" />
      <input type="text"" name="name" />
      <input type="file" name="file" />
      <button>Upload</button>
    </form>
  </body>
</html>
