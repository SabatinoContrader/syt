<html>
<head>
<title>SYT Login</title>
</head>
<html>
<body>
<h1>LOGIN</h1>
	<h2>Inserisci le tue credenziali SYT</h2>
   <div>
     <form action = "/login/loginControl" method= "post">
     <h3>Username: <input type = "text" id = "user" name ="username" placeholder = "inserisci username"></h3>
     <h3>Password: <input type = "password" id = "pass" name ="password" placeholder = "inserisci password"></h3>
     <button type = "submit" value = "Login" name = "pulsante">Login In</button><br>
     <h4>Arrivederci!</h4>
     <a href="register.jsp"> Registrati </a>
     </form>
   </div>
</body>
</html>