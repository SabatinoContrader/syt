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
<ul>
<ol><a href="CanzoneServlet?scelta=tutorial">Vai al tutorial</a></ol>
<ol><a href="RicercaCantanteDaCantante.jsp">Ricerca un cantante</a></ol>
<ol><a href="/cantanteController/getClassifica">Classifica registrazioni</a></ol>
</ul>

</body>
</html>