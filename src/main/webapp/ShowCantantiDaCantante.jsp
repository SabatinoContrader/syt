<%@ page import="com.virtualpairprogrammers.model.Utente"%>
<%@ page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Lista cantanti</title>
<%
	List<Utente> cantanti = (List<Utente>) request.getAttribute("all_cantanti");
%>
</head>
<body>
<h1>Seleziona il cantante</h1>
	<form action = "CantanteChoiceServlet" method= "post">
		<h2><select name="username">
			<%
				for (Utente utenti : cantanti) {
			%>
	
				<option value=<%=utenti.getUsername()%>><%=utenti.getUsername()%></option>
			<%
				}
			%>
		</select></h2>
	
		<h3>
			<input type="radio" name="operazione" value="vota" checked> Vota
			<input type="radio" name="operazione" value="ascolta"> Ascolta le registrazioni
			
	  	</h3>
	  	
		<h4>
			<button type = "submit" value = "Choice" name = "pulsante">Vai</button>
		</h4>
	</form>
	
		<ul>
		  <li><a href="RicercaCantante.jsp">Ripeti la ricerca</a></li>
		  <li><a href="HomeCantante.jsp">Torna alla home</a></li>
		  <li><a href="logout.jsp">Logout</a></li>
		</ul>

</body>
</html>