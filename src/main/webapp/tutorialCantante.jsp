<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page import="com.sytSpring.model.Canzone" %>
<%@ page import="java.util.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Tutorial</title>
<%
List<Canzone> listcanz = (List<Canzone>) request.getAttribute("canzoni");
%>
</head>
<body>  
<div>

	<h1>1. Seleziona una canzone.</h1>
	<h2>Seleziona una canzone tra quelle disponibili per il tuo livello.</h2>		
	  <form action = "/homeCantante/canzonesceltaControl" method= "post">
	<select name="canzonescelta">
	 <c:forEach items="${canzoni}" var="canz">
	  <option value="${canz.getIdCanzone()}">"${canz.getTitolo()}"</option>
   </c:forEach>
   </select>
     <button type = "submit" >Procedi</button>
	</form>
	</div>
	
</body>
</html>