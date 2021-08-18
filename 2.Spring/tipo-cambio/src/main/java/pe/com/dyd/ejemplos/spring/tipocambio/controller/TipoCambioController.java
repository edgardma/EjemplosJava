package pe.com.dyd.ejemplos.spring.tipocambio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.dyd.ejemplos.spring.tipocambio.model.service.ITipoCambioService;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.CalculoTipoCambio;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.ResultadoCalculoTipoCambio;
import pe.com.dyd.ejemplos.spring.tipocambio.model.entity.TipoCambio;

@RestController
@RequestMapping("/v1/tipocambio")
public class TipoCambioController {
	
	@Autowired
	private ITipoCambioService tipoCambioService;
	
	@GetMapping(value="tipoCambio")
    public List<TipoCambio> getTipoCambio() {
        return tipoCambioService.getTipoCambio();
    }
	
	@GetMapping(value="calcular")
    public ResultadoCalculoTipoCambio calcularTipoCambio(@RequestBody CalculoTipoCambio calculoTipoCambio) {
        return tipoCambioService.calcularTipoCambio(calculoTipoCambio);
    }
}
