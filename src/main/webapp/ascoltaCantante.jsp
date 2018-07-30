<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
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
<title>Lista registrazioni</title>
</head>
<body>
<h1>Elenco registrazioni</h1>

<table>
  <tr>
    <th>ID Registrazione</th>
    <th>Data Creazione</th>
    <th>ID Canzone</th>
  </tr>
  	<c:forEach items="${listRegistrazioni}" var="registrazione">


			
  <tr>
    <td>${registrazione.idRegistrazione}</td>
    <td>${registrazione.dataCreazione}</td>
    <td>${registrazione.idCanzone.idCanzone}</td>
  </tr>
</c:forEach>
</table>

	<!--<ul>
	  <li><a href="RicercaCantante.jsp">Ripeti la ricerca</a></li>
	  <li><a href="HomeGiudice.jsp">Torna alla home</a></li>
	  <li><a href="logout.jsp">Logout</a></li>
	</ul> -->
	
</body>
</html>