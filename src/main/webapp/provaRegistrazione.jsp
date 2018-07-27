<%@ page import="com.sytSpring.model.Canzone" %>
<%@ page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Tutorial</title>

</head>
<body>
   <div>
   

     <h1>3.Prova a registrare.</h1>
	<h2>Prova a fare la tua prima registrazione sulla canzone "${canz.getTitolo()}" </h2>
	<p> Canzone scelta:"${canz.getTitolo()}"</p>
	
	<table>
	<td>
	<iframe width="500" height="360" src="${canz.getUrlcanzone()}">>
	</iframe>
	
	</td>
	</table>
	 
	
   </div>
 <input type = "button" onclick="location.href='/homeCantante.jsp'" value = "Termina tutorial"/> 
</body>
</html>