package pe.com.dyd.ejemplos.spring.tipocambio.model.dao;

import org.springframework.data.repository.CrudRepository;

import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.TipoCambio;

public interface ITipoCambioDao extends CrudRepository<TipoCambio, String> {

}
