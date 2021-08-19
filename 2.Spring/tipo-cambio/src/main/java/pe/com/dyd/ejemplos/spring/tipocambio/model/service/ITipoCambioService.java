package pe.com.dyd.ejemplos.spring.tipocambio.model.service;

import java.util.List;

import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.ActualizaTipoCambio;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.CalculoTipoCambio;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.ResultadoCalculoTipoCambio;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.TipoCambio;

public interface ITipoCambioService {
	public List<TipoCambio> getTipoCambio();
	
	public ResultadoCalculoTipoCambio calcularTipoCambio(CalculoTipoCambio calculoTipoCambio);
	
	public int modificarTipoCambio(List<ActualizaTipoCambio> actualizaTipoCambio);
}
