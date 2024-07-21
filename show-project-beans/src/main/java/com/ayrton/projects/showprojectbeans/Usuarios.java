package com.ayrton.projects.showprojectbeans;

public class Usuarios {
	
	private String primeiroNome;
	private String ultimoNome;
	private String email;
	
	// DECLARACAO DE CONSTRUTOR
	public Usuarios(String primeiroNome, String ultimoNome) {
		super();
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
	}

	public String getPrimeiroNome() {
		return primeiroNome;
	}

	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}

	public String getUltimoNome() {
		return ultimoNome;
	}

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "user{" + "Primeiro nome: " + primeiroNome
				+ ", ultimo nome: " + ultimoNome + "}";
				
	}
	
	
	

}
