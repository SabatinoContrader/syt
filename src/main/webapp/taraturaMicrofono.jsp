
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
     
	<h1>2. Taratura del microfono del tuo dispositivo.</h1>
	<h2>Segui i passaggi per la taratura del tuo microfono.</h2>

    <form action = "/canzoneController/provaregControl" method= "post">
	
    <p> Canzone scelta:"${canz.getTitolo()}"</p>

	<!-- qui va inserito il path per la taratura del microfono. -->
		
 <button type = "submit" name="canzonescelta" value="${canz.getIdCanzone()}" >Procedi</button>
</form>
</div>
</body>
</html>