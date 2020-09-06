package com.dyd.javaweb.intro_java.ejercicio6;

public class CuentaBancaria {
	
	// Variables de instancia
	private String numeroCuenta;
	private String titular;
	private double saldo;
	
	protected EstadoCuenta estado;
	
	// Variables de clase
	public static final double COMISION_RETIRO = 5;
	
	public CuentaBancaria() {
		
	}
	
	public CuentaBancaria(String numeroCuenta, String titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = 0;
		this.estado = EstadoCuenta.ACTIVA;
	}

	public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.titular = titular;
		this.saldo = saldo;
		this.estado = EstadoCuenta.ACTIVA;
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return "CuentaBancaria [numeroCuenta=" + numeroCuenta + ", titular=" + titular + ", saldo=" + saldo
				+ ", estado=" + estado + "]";
	}

	void deposito(double monto) {
		if (monto < 0) {
			System.out.println("Ingresa un numero mayor a cero");
		} else {
			this.saldo += monto;
		}
	}
	
	void retiro(double monto) {
		if (monto < 0) {
			System.out.println("Ingresa un numero mayor a cero");
		} else {
			this.saldo -= monto;
			this.saldo -= COMISION_RETIRO;
		}
	}
}
