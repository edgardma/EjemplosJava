package com.dyd.javaweb.intro_java.ejercicio7;

public class CuentaNegocio extends CuentaBancaria implements IOperacionesBancarias {
	
	private double limitePrestamo;

	public CuentaNegocio(String numeroCuenta, String titular, double saldo, double limitePrestamo) {
		super(numeroCuenta, titular, saldo);
		this.limitePrestamo = limitePrestamo;
	}
	
	public CuentaNegocio(String numeroCuenta, String titular, double saldo) {
		super(numeroCuenta, titular, saldo);
	}

	public CuentaNegocio(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	public double getLimitePrestamo() {
		return limitePrestamo;
	}

	public void setLimitePrestamo(double limitePrestamo) {
		this.limitePrestamo = limitePrestamo;
	}

	@Override
	public void deposito(double monto) {
		super.saldo += monto;
	}

	@Override
	public void retiro(double monto) {
		this.saldo -= (monto + COMISION_RETIRO);
	}
	
	void prestamo(double prestamo) {
		if (prestamo <= limitePrestamo) {
			deposito(prestamo - 10);
		} else {
			System.out.println("Supera el límite de prestamo");
		}
	}

	@Override
	public String toString() {
		return "CuentaNegocio [limitePrestamo=" + limitePrestamo + ", numeroCuenta=" + numeroCuenta + ", titular="
				+ titular + ", saldo=" + saldo + ", estado=" + estado + "]";
	}

	@Override
	public void consultarProducto() {
		// TODO Auto-generated method stub
		
	}
	
}
