<%@ page import="com.sytSpring.model.Utente" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Home Cantante</title>
</head>
<html>
<body>
<h1>Benvenuto <%= request.getSession().getAttribute("utente")%></h1>
Seleziona:
<ul>

  <li><a href="/canzoneController/canzoneControl">Vai al Tutorial</a></li>
  <li><a href="ricercaCantanteDaCantante.jsp">Ricerca Cantante</a></li>
  <li><a href="/cantanteController/getClassificaFinale">Visualizza classifica finale</a></li>
  <li><a href="logout.jsp">Logout</a></li>
</ul> 

</body>
</html>