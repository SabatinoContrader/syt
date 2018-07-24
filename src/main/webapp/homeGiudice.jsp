<%@ page import="com.sytSpring.model.Utente" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Home Giudice</title>
</head>
<html>
<body>
<h1>Benvenuto <%= request.getSession().getAttribute("utente")%></h1>
Seleziona:
<ul>
  <li><a href="RicercaCantante.jsp">Ricerca cantante</a></li>
  <li><a href="ClassificaSistema.jsp">Visualizza classifica</a></li>
  <li><a href="logout.jsp">Logout</a></li>
</ul> 
</body>
</html>