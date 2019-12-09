<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<a href="hello">Hello SpringMVC</a>
	<br/>
REST
	<form action="user" method="post">
		<input type="submit" value="POST">
	</form>
	<br/>
	<form action="user/1" method="post">
		<input type="hidden" name="_method" value="delete">
		<input type="submit" value="DELETE">
	</form>
	<br/>
	<form action="user" method="post">
		<input type="hidden" name="_method" value="put">
		<input type="submit" value="PUT">
	</form>
	<br/>
	<a href="user/1">GET</a>
	<br/>
	<a href="users">GET ALL</a>
	
<br/>
Test RequestParam
	<form action="testRequestParam">
		<input type="text" name="id">
		<input type="text" name="name">
		<input type="submit" value="submit">
	</form>
	<br>
	<a href="testRequestParam?name=张三">Test RequestParam</a>
	<br>
	<a href="testRequestHeader">Test RequestHeader</a>
	<br>
	<a href="testCookieValue">Test CookieValue</a>
	<br>
	<a href="success">Test view controller</a>
	<br>
	<a href="testRedirect">Test Redirect</a>
	<br>
	<a href="testJson">Test JSON</a>
</body>
</html>
