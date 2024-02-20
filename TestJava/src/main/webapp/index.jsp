<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
</head>
<body>

<h2>Отправить POST-запрос</h2>

<form action="myServlet" method="post">
    Имя:<br>
    <input type="text" name="name">
    <br>
    Возраст:<br>
    <input type="text" name="age">
    <br><br>
    <input type="submit" value="Send">
</form>

</body>
</html>
