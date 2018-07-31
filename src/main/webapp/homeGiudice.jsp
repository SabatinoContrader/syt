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
  <li><a href="/ricercaCantante.jsp">Ricerca cantante</a></li>
  <li><a href="/giudiceController/getClassifica">Visualizza classifica</a></li>
   <li><a href="/giudiceController/getClassificaFinale">Visualizza classifica finale</a></li>
  <li><a href="/logout/out">Logout</a></li>
</ul> 
</body>
</html>