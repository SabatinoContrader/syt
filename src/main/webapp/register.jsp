<html>
<head>
<title>SYT Registrazione</title>
</head>
<body>
   <div>
     <form action = "RegisterServlet" method= "post">
	<h1>REGISTRAZIONE</h1>
	<h2>Inserisci i tuoi dati personali</h2>
	
	<h3>Nome: <input type = "text" id = "user" name ="username" ></h3>
	<h3>Cognome: <input type = "text" id = "user" name ="username"></h3>
	<h3>Email: <input type = "text" id = "user" name ="username"></h3>
	<h3>Data di nascita (AAAA-MM-GG): <input type = "text" id = "user" name ="username"></h3>
	<h3>Luogo di nascita: <input type = "text" id = "user" name ="username"></h3>
	<h3>Sesso: <input type = "text" id = "user" name ="username"></h3>
    <h3>Telefono: <input type = "text" id = "user" name ="username"></h3>
   	
   	<h2>Inserisci i tuoi dati SYT</h2>
   	
   	<h3>Username: <input type = "text" id = "pass" name ="password" ></h3>
   	<h3>Password: <input type = "text" id = "user" name ="username"></h3>
   	<h3>Ruolo:<br>
   	<input type="radio" name="ruolo" value="C" checked> Cantante <br>
   	<input type="radio" name="ruolo" value="G"> Giudice<br>
   	</h3>
   	<h3>Genere: <input type = "text" id = "user" name ="username" ></h3>
   	<h3>Avatar: <input type = "text" id = "user" name ="username" ></h3>
    <button type = "submit" value = "Register" name = "pulsante">Registrati</button><br>
    <a href="index.jsp"> Login </a>
    </form>
   </div>
</body>
</html>