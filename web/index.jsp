<%-- 
    Document   : index
    Created on : 5/09/2017, 09:14:45 PM
    Author     : jcortes
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="ServletAplicacion" method="POST">
            nombre : <input type="text" name="nombre"/><br/>
            apellido : <input type="text" name="apellido"/><br/>
            <input type="submit" value ="Guardar" /><br/>
        </form>
        <form action="ServletAplicacion" method="GET">
            <input type="submit" value ="Consultar" />
        </form>
    </body>
</html>
