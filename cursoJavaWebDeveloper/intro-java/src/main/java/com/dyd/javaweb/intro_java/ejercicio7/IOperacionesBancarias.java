package com.dyd.javaweb.intro_java.ejercicio7;

public interface IOperacionesBancarias extends IOperacionBancaPorInternet {
	public void deposito(double monto);
	
	public void retiro(double monto);
	
	default void transferencia() {
		System.out.println("Invoca transferencia");
	}
}
