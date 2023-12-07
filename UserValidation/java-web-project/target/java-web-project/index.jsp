<!-- <!DOCTYPE html>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
    <h2>Login</h2>
    <form action="/login" method="POST">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br><br>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br><br>
        <input type="submit" value="Login">
    </form>
</body>
</html> -->

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Information Input</title>
</head>
<body>
    <h1>Enter Book Information</h1>
    <form action="/books" method="post">
        <label for="id">ID:</label>
        <input type="text" name="id" id="id"><br><br>

        <label for="title">Title:</label>
        <input type="text" name="title" id="title"><br><br>

        <label for="author">Author:</label>
        <input type="text" name="author" id="author"><br><br>

        <label for="price">Price:</label>
        <input type="text" name="price" id="price"><br><br>

        <label for="qty">Quantity:</label>
        <input type="text" name="qty" id="qty"><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
