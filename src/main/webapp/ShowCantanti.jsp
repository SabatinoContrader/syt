<%@ page import="com.virtualpairprogrammers.model.Utente"%>
<%@ page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<%
	List<Utente> cantanti = (List<Utente>) request.getAttribute("all_cantanti");
%>
</head>
<body>

	<table>
		<tr>
			<td>Utenti con username cercato:</td>
			<td></td>
			
		</tr>
		<tr>
			<th></th>
			<th>USERNAME</th>



		</tr>
		<%
			for (Utente utenti : cantanti) {
		%>
		<tr>

			<td><%=utenti.getUsername()%></td>


		</tr>
		<%
			}
		%>
	</table>
</body>
</html>