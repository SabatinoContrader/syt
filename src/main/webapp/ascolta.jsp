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
<title>Lista registrazioni</title>
<%
	List<Registrazione> rec = (List<Registrazione>) request.getAttribute("all_registrazioni");
%>
</head>
<body>
<h1>Elenco registrazioni</h1>

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

	<ul>
	  <li><a href="RicercaCantante.jsp">Ripeti la ricerca</a></li>
	  <li><a href="HomeGiudice.jsp">Torna alla home</a></li>
	  <li><a href="logout.jsp">Logout</a></li>
	</ul>
	
</body>
</html>