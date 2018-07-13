package main.model;

public class Utente {
	
		private int idUtente;
		private String nome;
		private String cognome;
		private String email;
		private String luogoNascita;
		private String dataNascita;
		private String sesso;
		private String genere;
		private int tentativi;
		private int livello;
		private String telefono;
		private String password;
		private String username;
		private String ruolo;
		private boolean cantanteToGiudice;
		private String avatar;
		
		public Utente(int idUtente, String nome, String cognome, String email, String luogoNascita, String dataNascita, String sesso, String genere, int tentativi, int livello, String telefono, String password, String username, String ruolo, boolean cantanteToGiudice, String avatar) {
			
			this.idUtente =  idUtente;
			this.nome =  nome;
			this.cognome = cognome;
			this.email = email;
			this.luogoNascita = luogoNascita;
			this.dataNascita = dataNascita;
			this.sesso = sesso;
			this.genere = genere;
			this.tentativi = tentativi;
			this.livello = livello;
			this.telefono = telefono;
			this.password = password;
			this.username = username;
			this.ruolo = ruolo;
			this.cantanteToGiudice = cantanteToGiudice;
			this.avatar = avatar;
			
		}

		public int getidUtente() {
			return idUtente;
		}

		public void setidUtente(int idUtente) {
			this.idUtente = idUtente;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCognome() {
			return cognome;
		}

		public void setCognome(String cognome) {
			this.cognome = cognome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getluogoNascita() {
			return luogoNascita;
		}

		public void setluogoNascita(String luogoNascita) {
			this.luogoNascita = luogoNascita;
		}

		public String getdataNascita() {
			return dataNascita;
		}

		public void setdataNascita(String dataNascita) {
			this.dataNascita = dataNascita;
		}

		public String getSesso() {
			return sesso;
		}

		public void setSesso(String sesso) {
			this.sesso = sesso;
		}

		public String getGenere() {
			return genere;
		}

		public void setGenere(String genere) {
			this.genere = genere;
		}

		public int getTentativi() {
			return tentativi;
		}

		public void setTentativi(int tentativi) {
			this.tentativi = tentativi;
		}

		public int getLivello() {
			return livello;
		}

		public void setLivello(int livello) {
			this.livello = livello;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getRuolo() {
			return ruolo;
		}

		public void setRuolo(String ruolo) {
			this.ruolo = ruolo;
		}

		public boolean iscantanteToGiudice() {
			return cantanteToGiudice;
		}

		public void setcantanteToGiudice(boolean cantanteToGiudice) {
			this.cantanteToGiudice = cantanteToGiudice;
		}

		public String getAvatar() {
			return avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}

		@Override
		public String toString() {
			return "[ID = " + idUtente + ", Nome = " + nome + ", Cognome = " + cognome + ", Email = " + email
					+ ", Username = " + username + "]";
		}
}
