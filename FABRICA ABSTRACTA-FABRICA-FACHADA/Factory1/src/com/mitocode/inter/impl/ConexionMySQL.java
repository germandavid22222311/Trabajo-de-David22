package com.mitocode.inter.impl;

public class ConexionMySQL {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionMySQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contrasena = "123";
	}

	public void conectar() {
		// Aqui puede ir código JDBC
		System.out.println("Se conectó a MySQL");

	}

	public void desconectar() {
		System.out.println("Se desconectó de MySQL");
	}

	@Override
	public String toString() {
		return "ConexionMySQL [host=" + host + ", puerto=" + puerto + ", usuario=" + usuario + ", contrasena="
				+ contrasena + "]";
}
}