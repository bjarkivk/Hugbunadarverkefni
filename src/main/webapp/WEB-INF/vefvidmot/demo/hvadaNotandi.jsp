<!DOCTYPE html>

<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="is">
    <head>
        <meta charset="UTF-8">
        <title>Hver er notandinn</title>
    </head>
    <body>
        <form method="POST" action="/demo/hver">
            <label for="nafn">Hvað heitirðu?<label>
            <input id="nafn" name="nafn" type="text" placeholder="Nafn">
            <label for="submit"></label>
            <input id="submit" type="submit" value="í lagi">
        </form>
    </body>
</html>