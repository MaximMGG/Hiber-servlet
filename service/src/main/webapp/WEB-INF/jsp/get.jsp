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
            <label for="orderStatus">Chose status of order : </label>
            <select name="status">
                <option value="INSERT">INSERT</option>
                <option value="DELETE">DELETE</option>
                <option value="UPDATE">UPDATE</option>
            </select><br>
            <button type="submit">SEND</button>
        </form>
    </bode>
</html>