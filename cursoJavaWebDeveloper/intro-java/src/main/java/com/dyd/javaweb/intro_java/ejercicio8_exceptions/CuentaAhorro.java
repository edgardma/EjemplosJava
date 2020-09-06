package com.dyd.javaweb.intro_java.ejercicio8_exceptions;

public class CuentaAhorro extends CuentaBancaria implements IOperacionesBancarias {
	
	private double tasaInteres;

	public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
		super(numeroCuenta, titular, saldo);
	}

	public CuentaAhorro(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public void deposito(double monto) {
		super.saldo += monto;
	}

	@Override
	public void retiro(double monto) throws FondosInsuficientesException, CuentaBloqueadaException {
		if (monto < 0) {
			System.out.println("Monto inválido");
		} else if (saldo < monto) {
			throw new FondosInsuficientesException("Saldo no es mayor a " + monto);
		} else if (estado == EstadoCuenta.BLOQUEADA) {
			throw new CuentaBloqueadaException("La cuenta " + numeroCuenta + " está bloqueada");
		} else {
			this.saldo -= monto;
		}
	}

	@Override
	public String toString() {
		return "CuentaAhorro [tasaInteres=" + tasaInteres + ", numeroCuenta=" + numeroCuenta + ", titular=" + titular
				+ ", saldo=" + saldo + ", estado=" + estado + "]";
	}

	@Override
	public void consultarProducto() {
		// TODO Auto-generated method stub
		
	}
	
}
