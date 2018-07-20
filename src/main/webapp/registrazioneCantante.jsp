<%@ page import="com.virtualpairprogrammers.model.Registrazione"%>
<%@ page import="java.util.*"%>
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

<%
	List<Registrazione> rec = (List<Registrazione>) request.getAttribute("all_registrazioni");
%>

<title>Vota registrazione</title>

</head>
<body>
<table>
  <tr>
    <th>ID Registrazione</th>
    <th>Data Creazione</th>
    <th>ID Canzone</th>
  </tr>
  		<%
			for (Registrazione registrazioni : rec) {
		%>
  <tr>
    <td><%=registrazioni.getIdRegistrazione()%></td>
    <td><%=registrazioni.getDataCreazione()%></td>
    <td><%=registrazioni.getIdCanzone()%></td>
  </tr>
  		<%
			}
		%>
</table>
<form action = "VotaCantanteServlet" method= "post">
  
  
  <h1>Inserisci ID registrazione <input type = "text" id = "idReg" name ="idRegistrazione" ></h1>
  <h1><center>ESPRIMI LA VALUTAZIONE PER PARAMETRI</center></h1>
  <h1>Orecchiabilità: <input type = "number" id = "orecchiabilita" name ="orecchiabilita" ></h1>
  <h1>Lo scaricheresti?: <input type = "number" id = "download" name ="download" ></h1>
  
  <button type = "submit" value = "Registrazione" name = "pulsante"> OK </button>
</form>
<br>
  <p>
  <a href="RicercaCantanteDaCantante.jsp"> Torna al menu' di ricerca</a>
  <p>
  <a href="HomeCantante.jsp"> Torna al menu' principale</a>
  
  </ol>  
 
</body>
</html>