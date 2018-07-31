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


<title>Vota registrazione</title>

</head>
<body>

<form action = "/votaController/inserisciVotazioneCantante" method= "post">
  
  <h1><center>ESPRIMI LA VALUTAZIONE PER PARAMETRI della registrazione con id <c:out value="${idRegistrazione}"></c:out></center></h1>
  <h1>Orecchiabilità: <input type = "number" id = "orecchiabilita" name ="orecchiabilita" ></h1>
  <h1>Lo scaricheresti?: <input type = "number" id = "download" name ="download" ></h1>
  <input type="hidden" value="${idRegistrazione}" name="idReg" />
  <button type = "submit"> OK </button>
</form>
<br>
  <p>
  <a href="ricercaCantanteDaCantante.jsp"> Torna al menu' di ricerca</a>
  <p>
  <a href="homeCantante.jsp"> Torna al menu' principale</a>

 
</body>
</html>