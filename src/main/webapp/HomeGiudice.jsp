<%@ page import="com.virtualpairprogrammers.model.Utente" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Home Giudice</title>
<%Utente utente =(Utente) request.getSession().getAttribute("utente");%>
</head>
<html>
<body>
<h1>Benvenuto <%= utente.getUsername()%></h1>
Seleziona:
<select name="choice">
<option>--Seleziona la tua scelta--</option>
<option>Ricerca cantante</option>
<option>Visualizza classifica</option>
<option>Logout</option>
</body>
</html>