package com.restfull.core.entities;

public class Login {
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	private long idLogin;
	private String usuario;
	private String password;
	private long perfil_id;
	private long persona_id;

	  public Login(long id_login, String usuario, String password, long perfil_id, long persona_id) {
		super();
		this.idLogin = id_login;
		this.usuario = usuario;
		this.password = password;
		this.perfil_id = perfil_id;
		this.persona_id = persona_id;
	}

	public long getId_login() {
		return idLogin;
	}

	public void setIdLogin(long idLogin) {
		this.idLogin = idLogin;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPerfil_id() {
		return perfil_id;
	}

	public void setPerfil_id(long perfil_id) {
		this.perfil_id = perfil_id;
	}

	public long getPersona_id() {
		return persona_id;
	}

	public void setPersona_id(long persona_id) {
		this.persona_id = persona_id;
	}
	
	  
}
