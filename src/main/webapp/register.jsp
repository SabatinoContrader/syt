<html>
<head>
<title>SYT Registrazione</title>
</head>
<body>
   <div>
     <form action="Register/registered" method="post">
	<h1>REGISTRAZIONE</h1>
	<h2>Inserisci i tuoi dati personali</h2>
	
	<h3>Nome: <input type = "text" name ="nome" ></h3>
	<h3>Cognome: <input type = "text" name ="cognome"></h3>
	<h3>Email: <input type = "text" name ="email"></h3>
	<h3>Data di nascita: <input type = "text" name ="datanascita"placeholder = "AAAA-MM-GG"></h3>
	<h3>Luogo di nascita: <input type = "text" name ="luogonascita"></h3>
	<h3>Sesso:<br>
	 	<input type="radio" name="sesso" value="M" checked> M<br>
  		<input type="radio" name="sesso" value="F"> F<br>
  	</h3>	
    <h3>Telefono: <input type = "text" id = "phonenumber" name ="phonenumber"></h3>
   	
   	<h2>Inserisci i tuoi dati SYT</h2>
   	
   	<h3>Username: <input type = "text" name ="username" ></h3>
   	<h3>Password: <input type = "text" name ="password"></h3>
   	<h3>Ruolo:<br>
   	<input type="radio" name="ruolo" value="C" checked> Cantante <br>
   	<input type="radio" name="ruolo" value="G"> Giudice<br>
   	</h3>
   	<h3>Genere: <input type = "text" name ="genere" ></h3>
   	<!--<h3>Avatar: <input type = "text" id = "avatar" name ="avatar" ></h3>-->
    <button type = "submit">Registrati</button><br>
    <a href="index.jsp"> Login </a>
    </form>
   </div>
</body>
</html>