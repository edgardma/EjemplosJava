package com.dyd.javaweb.intro_java.ejercicio7;

public class Programa7 {
	public static void main(String[] args) {
		CuentaAhorro cuenta1 = new CuentaAhorro("123456-121", "Joao", 500);
		System.out.println(cuenta1);
		cuenta1.retiro(100);
		System.out.println(cuenta1);
		
		CuentaNegocio cuenta2 = new CuentaNegocio("123456-122", "Jorge", 700, 300);
		System.out.println(cuenta2);
		cuenta2.retiro(100);
		System.out.println(cuenta2);
	}
}
