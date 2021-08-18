package pe.com.dyd.ejemplos.spring.tipocambio.model.entity;

import java.io.Serializable;

public class ActualizaTipoCambio implements Serializable  {
	private static final long serialVersionUID = 1L;
	
	private String monedaOrigen;
	private String monedaDestino;
	private double tipoCambio;
	
	public String getMonedaOrigen() {
		return monedaOrigen;
	}
	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}
	public String getMonedaDestino() {
		return monedaDestino;
	}
	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}
	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

}
