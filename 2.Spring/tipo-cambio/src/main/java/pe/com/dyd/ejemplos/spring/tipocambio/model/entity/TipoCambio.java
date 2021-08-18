package pe.com.dyd.ejemplos.spring.tipocambio.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="TipoCambio")
@IdClass(TipoCambioKey.class)
public class TipoCambio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="monedaOrigen")
	private String monedaOrigen;
	@Id
	@Column(name="monedaDestino")
	private String monedaDestino;
	@Column(name="tipoCambio")
	private double tipoCambio;
	@Column(name="forma")
	private String forma;
	
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
	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
}

