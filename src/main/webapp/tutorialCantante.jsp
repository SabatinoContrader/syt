<%@ page import="com.virtualpairprogrammers.model.Canzone"%>
<%@ page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>




<html>
<head>
<title>Tutorial</title>
<%
 List<Canzone> listaCanzoni= (List<Canzone>)request.getAttribute("listacanzoni");
%>
</head>
<body>
   <div>
     
	<h1>1. Seleziona una canzone.</h1>
	<h2>Seleziona una canzone tra quelle disponibili per il tuo livello.</h2>
	
	<form action = "CanzoneServlet" method= "post">
	<select name="listacanzoni">
	<%
	for(Canzone c: listaCanzoni){	
	%>
		<option value=<%=c.getIdCanzone()%>><%=c.getTitolo()%></option>
 		
 	<%}%>
	</select>
	<button type = "submit" value = "Canzone" name = "canzonescelta">Procedi</button>
	</form>

   </div>
</body>
</html>