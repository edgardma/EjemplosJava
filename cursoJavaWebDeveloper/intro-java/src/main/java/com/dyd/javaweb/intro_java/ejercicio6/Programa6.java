package com.dyd.javaweb.intro_java.ejercicio6;

public class Programa6 {
	
	public static void main(String[] args) {
		CuentaBancaria cuenta = new CuentaBancaria("123-456", "Kenia");
		
		System.out.println("Cuenta: " + cuenta.toString());
		
		if (cuenta.estado == EstadoCuenta.ACTIVA) {
			System.out.println("Cuenya Activa");
		} else if (cuenta.estado == EstadoCuenta.BLOQUEADA) {
			System.out.println("Cuenya Bloqueada");
		}
		
		for(EstadoCuenta estado : EstadoCuenta.values()) {
			System.out.println(estado);
		}
	}
	
}
