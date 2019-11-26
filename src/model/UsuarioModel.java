package model;

public class UsuarioModel {
	
	private int cod_user;
	private String name;
	private int senha;
	
	public UsuarioModel() {
		
	}

	public int getCod_user() {
		return cod_user;
	}

	public void setCod_user(int cod_user) {
		this.cod_user = cod_user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}
