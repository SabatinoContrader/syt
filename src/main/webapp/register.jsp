<html>
<head>
<title>SYT Registrazione</title>
</head>
<body>
   <div>
     <form action = "RegisterServlet" method= "post">
	<h1>REGISTRAZIONE</h1>
	<h2>Inserisci i tuoi dati personali</h2>
	
	<h3>Nome: <input type = "text" id = "nome" name ="nome" ></h3>
	<h3>Cognome: <input type = "text" id = "cognome" name ="cognome"></h3>
	<h3>Email: <input type = "text" id = "email" name ="email"></h3>
	<h3>Data di nascita: <input type = "text" id = "datanascita" name ="datanascita"placeholder = "AAAA-MM-GG"></h3>
	<h3>Luogo di nascita: <input type = "text" id = "luogonascita" name ="luogonascita"></h3>
	<h3>Sesso:<br>
	 	<input type="radio" name="sesso" value="M" checked> M<br>
  		<input type="radio" name="sesso" value="F"> F<br>
  	</h3>	
    <h3>Telefono: <input type = "text" id = "phonenumber" name ="phonenumber"></h3>
   	
   	<h2>Inserisci i tuoi dati SYT</h2>
   	
   	<h3>Username: <input type = "text" id = "username" name ="username" ></h3>
   	<h3>Password: <input type = "text" id = "password" name ="password"></h3>
   	<h3>Ruolo:<br>
   	<input type="radio" name="ruolo" value="C" checked> Cantante <br>
   	<input type="radio" name="ruolo" value="G"> Giudice<br>
   	</h3>
   	<h3>Genere: <input type = "text" id = "genere" name ="genere" ></h3>
   	<h3>Avatar: <input type = "text" id = "avatar" name ="avatar" ></h3>
    <button type = "submit" value = "Register" name = "inviadati">Registrati</button><br>
    <a href="index.jsp"> Login </a>
    </form>
   </div>
</body>
</html>