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
<ul>
  <li><a href="RicercaCantante.jsp">Ricerca cantante</a></li>
  <li><a href="VisualizzaClassifica.jsp">Visualizza classifica</a></li>
  <li><a href="logout.jsp">Logout</a></li>
</ul> 
</body>
</html>