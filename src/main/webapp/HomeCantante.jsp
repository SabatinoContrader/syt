<%@ page import="com.virtualpairprogrammers.model.Utente" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<title>Home Cantante</title>
<%Utente utente =(Utente) request.getSession().getAttribute("utente");%>
</head>
<html>
<body>
<h1>Benvenuto <%=utente.getNome()%></h1>
<ul>
<ol><a href="CanzoneServlet?scelta=tutorial">Vai al tutorial</a></ol>
<ol><a href="CiaoServlet?scelta=tutorial">Vai al ciao</a></ol>
</ul>

</body>
</html>