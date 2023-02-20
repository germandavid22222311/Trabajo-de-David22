package com.mitocode;

import com.mitocode.inter.IConexion;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new IConexion();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new IConexion();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new IConexion();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new IConexion();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new IConexion();
		}
		return new IConexion();
	}
}
