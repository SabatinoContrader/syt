<%@ page import="com.virtualpairprogrammers.model.Canzone"%>
<%@ page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<html>
<head>
<title>Tutorial</title>
<%
 Canzone canzone= (Canzone)request.getSession().getAttribute("canzonescelta");
%>
</head>
<body>
   <div>
     
	<h1>3.Prova a registrare.</h1>
	<h2>Prova a fare la tua prima registrazione sulla canzone <%=canzone.getTitolo()%> </h2>
	
	<p> Canzone scelta:<%=canzone.getTitolo()%></p>
	
	qui va inserito il player di youtube con la url della canzone scelta.
	
	<input type = "button" onclick = "location.href='HomeCantante.jsp'" value = "Termina tutorial"/>

   </div>
</body>
</html>