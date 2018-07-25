<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Lista cantanti</title>
</head>
<body>
	<form action="/search/SearchCantante" method="get">
		<table>
			<tr>
				<th></th>
				<th></th>
				<th>USERNAME</th>
			</tr>


			<c:forEach items="${listUtenti}" var="utente">

				<tr>
					<td>${utente.username}</td>
				</tr>
			</c:forEach>
	</table>
</form>
<form action="/giudiceController/votaAscolta" method="get">
		<h3>
			<input type="radio" name="scelta" value= "vota" checked> Vota
			<input type="radio" name="scelta" value= "ascolta"> Ascolta le registrazioni
			
	  	</h3>
	  	
		<h4>
			<button type = "submit">Vai</button>
		</h4>
	</form>
	
	<!-- <ul>
		  <li><a href="RicercaCantante.jsp">Ripeti la ricerca</a></li>
		  <li><a href="HomeGiudice.jsp">Torna alla home</a></li>
		  <li><a href="logout.jsp">Logout</a></li>
		</ul> -->

</body>
</html>