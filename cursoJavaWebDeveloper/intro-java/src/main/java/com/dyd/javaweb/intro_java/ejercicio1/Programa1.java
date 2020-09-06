package com.dyd.javaweb.intro_java.ejercicio1;

import java.util.Scanner;

public class Programa1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CuentaBancaria cuenta = null;
		boolean salir = false;
		int opcion;
		
		do {
			System.out.println("##############################");
			System.out.println("Elige una opción del menú");
			System.out.println("1. Crear Cuenta");
			System.out.println("2. Hacer un depósito");
			System.out.println("3. Hacer retiro");
			System.out.println("4. Consultar saldo");
			System.out.println("5. Salir");
			
			opcion = sc.nextInt();
			
			switch (opcion) {
				case 1:
					System.out.println("Ingresa el número de cuenta");
					String numeroCuenta = sc.next();
					
					System.out.println("Ingresa el titular de cuenta");
					String titularCuenta = sc.next();
					
					System.out.println("¿Desae realizar un depósito incial (true/false)?");
					boolean isDeposito = sc.nextBoolean();
					
					if (isDeposito) {
						System.out.println("Ingresa el monto inicial");
						double monto = sc.nextDouble();
						
						cuenta = new CuentaBancaria(numeroCuenta, titularCuenta, monto);
					} else {
						cuenta = new CuentaBancaria(numeroCuenta, titularCuenta);
					}
					
					break;
				case 2:
					System.out.println("Ingresa el monto a depositar:");
					cuenta.deposito(sc.nextDouble());
					
					break;
				case 3:
					System.out.println("Ingresa el monto a retirar:");
					cuenta.retiro(sc.nextDouble());
					
					break;
				case 4:
					System.out.println("El saldo es: " + cuenta.getSaldo());
					
					break;
				default:
					System.out.println("Gracias por tu visita");
					salir = true;
					break;
			}
			
			System.out.println("Cuenta: " + cuenta.toString());
		} while (!salir);
	}
	
}
