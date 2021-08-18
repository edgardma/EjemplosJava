package pe.com.dyd.ejemplos.spring.tipocambio.model.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.dyd.ejemplos.spring.tipocambio.model.dao.ITipoCambioDao;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.CalculoTipoCambio;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.ResultadoCalculoTipoCambio;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.TipoCambio;

@Service
public class TipoServicioService implements ITipoCambioService {

	@Autowired
	private ITipoCambioDao tipoCambioDao;
	
	@Override
	public List<TipoCambio> getTipoCambio() {
		return (List<TipoCambio>) tipoCambioDao.findAll();
	}

	@Override
	public ResultadoCalculoTipoCambio calcularTipoCambio(CalculoTipoCambio calculoTipoCambio) {
		ResultadoCalculoTipoCambio resultado = new ResultadoCalculoTipoCambio();
		Optional<TipoCambio> cambio = tipoCambioDao.findById(calculoTipoCambio.getMonedaOrigen().toUpperCase());
		
		if (cambio.isPresent()) {
			TipoCambio tipoCambio = cambio.get();
			double montoTipoCambio = calculoTipoCambio.getMonto() * tipoCambio.getTipoCambio();
			resultado.setMonedaOrigen(calculoTipoCambio.getMonedaOrigen().toUpperCase());
			resultado.setMonedaDestino(calculoTipoCambio.getMonedaDestino().toUpperCase());
			resultado.setMonto(calculoTipoCambio.getMonto());
			resultado.setMontoTipoCambio(montoTipoCambio);
			resultado.setTipoCambio(tipoCambio.getTipoCambio());
		}
		
		return resultado;
	}
	
}
