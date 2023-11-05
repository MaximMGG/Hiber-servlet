<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<html>
    <head>
        <Tittle>Get</Tittle>
    </head>
    <bode>

        <form action="${pageContext.request.contextPath}/get" method="post">
            <label for="name">Name of castomer :
                <input type="text" name="name" id="name">
            </label><br>
            <label for="package">Packages :
                <input type="text" name="package" id="package">
            </label><br>
            <label for="date">Date of packages : 
                <input type="date" name="date" id="date">
            </label><br>
            <button type="submit">SEND</button>
        </form>
    </bode>
</html>