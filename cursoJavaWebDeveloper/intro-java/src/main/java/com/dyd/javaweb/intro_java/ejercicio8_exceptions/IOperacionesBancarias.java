package com.dyd.javaweb.intro_java.ejercicio8_exceptions;

public interface IOperacionesBancarias extends IOperacionBancaPorInternet {
	public void deposito(double monto);
	
	public void retiro(double monto) throws FondosInsuficientesException, CuentaBloqueadaException;
	
	default void transferencia() {
		System.out.println("Invoca transferencia");
	}
}
