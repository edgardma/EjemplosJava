package pe.com.dyd.ejemplos.spring.tipocambio.model.entity;

import java.io.Serializable;

public class TipoCambioKey implements Serializable {
	
	private String monedaOrigen;
	private String monedaDestino;
	
	public TipoCambioKey() {
		super();
	}
	public TipoCambioKey(String monedaOrigen, String monedaDestino) {
		super();
		this.monedaOrigen = monedaOrigen;
		this.monedaDestino = monedaDestino;
	}
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
	
}