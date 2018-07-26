<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.sytSpring.model.Registrazione" %>
<%@ page import="com.sytSpring.model.Canzone" %>
<%@ page import="com.sytSpring.model.Utente" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>
<h2>Classifica Sistema</h2>
	 	<table>
	 	<tr>
	 	<th>Posizione</th>
  		  <th>ID Registrazione</th>
  		  <th>Data Creazione</th>
  		  <th>ID Canzone</th>
  		  <th>ID Cantante</th>
  		  <th>Vota</th>
  		</tr>
  		
  			<c:set var="count" value="0" scope="page" />
  		
			<c:forEach items="${classificaRegistrazioni}" var="registrazione">
    		<form action="/giudiceController/vota" value="${registrazione.idRegistrazione}" method="get">
				
				<tr>
				<c:set var="count" value="${count + 1}" scope="page"/>
					<td>${count}° posizione</td>
					<td>${registrazione.idRegistrazione}</td>
					<td>${registrazione.dataCreazione}</td>
					<td>${registrazione.idCanzone.idCanzone}</td>
					<td>${registrazione.idUtente.idUtente}</td>
					<td><button type = "submit">Vota</button></td>
					</form>
				</tr>
				
			</c:forEach>
		
		</table>
 
</body>
</body>
</html>