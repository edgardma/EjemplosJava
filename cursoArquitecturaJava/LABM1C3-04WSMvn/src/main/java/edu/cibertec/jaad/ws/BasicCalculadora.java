package edu.cibertec.jaad.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "edu.cibertec.jaad.ws.Calculadora")
public class BasicCalculadora implements Calculadora{

    @Override
    public Integer restar(Integer arg0, Integer arg1) {
        return arg0 - arg1;
    }

    @Override
    public Integer sumar(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }
}
