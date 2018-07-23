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
     
	<h1>2. Taratura del microfono del tuo dispositivo.</h1>
	<h2>Segui i passaggi per la taratura del tuo microfono.</h2>
	
	<p> Canzone scelta:<%=canzone.getTitolo()%></p>
	
	qui va inserito il path per la taratura del microfono.
	
	<input type = "button" onclick = "location.href='provaRegistrazione.jsp'" value = "Procedi"/>

   </div>
</body>
</html>