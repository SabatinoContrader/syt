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

  <li><a href="/homeCantante/canzoneControl">Vai al Tutorial</a></li>
   <li><a href="/ricercaCantanteDaCantante.jsp">Ricerca cantante</a></li>
  <li><a href="logout.jsp">Logout</a></li>
</ul> 

</body>
</html>