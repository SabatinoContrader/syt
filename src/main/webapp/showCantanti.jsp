<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Lista cantanti</title>
</head>
<body>
<form action="/giudiceController/ascolta" method="get">
		
		<h2><select name="username">
		<c:forEach items="${listUtenti}" var="utente">	
	
				<option value=${utente.username}>${utente.username}</option>
	</c:forEach>
</select></h2>

		<h4>
			<button type = "submit">Ascolta le registrazioni</button>
		</h4>
	</form>
	
	<!-- <ul>
		  <li><a href="RicercaCantante.jsp">Ripeti la ricerca</a></li>
		  <li><a href="HomeGiudice.jsp">Torna alla home</a></li>
		  <li><a href="logout.jsp">Logout</a></li>
		</ul> -->

</body>
</html>