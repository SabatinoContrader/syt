<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ page import="com.sytSpring.model.Registrazione" %>
<%@ page import="com.sytSpring.model.Canzone" %>
<%@ page import="com.sytSpring.model.Utente" %>
<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
<body>
<form action = "/votaController/votazione" method= "post">
  
  
  <h1><center>ESPRIMI LA VALUTAZIONE PER PARAMETRI</center></h1>
  <h1>Inserisci qui l'intonazione: <input type = "number" name ="intonazione" ></h1>
  <h1>Inserisci qui il timbro: <input type = "number" name ="timbro" ></h1>
  <h1>Inserisci qui il tono: <input type = "number" name ="tono" ></h1>
  <h1>Inserisci qui l'unicità del cantante: <input type = "number" name ="unicita" ></h1>
  
  <button type = "submit"> OK </button>
</form>
<br>
  <p>
  <a href="RicercaCantante.jsp"> Torna al menu' di ricerca</a>
  <p>
  <a href="HomeGiudice.jsp"> Torna al menu' principale</a>
  
  </ol>  
 
</body>
</html>