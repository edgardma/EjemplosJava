/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.ws;

import javax.jws.WebService;

/**
 *
 * @author JAVA ARCHITECT
 */
@WebService(endpointInterface="edu.cibertec.jaad.ws.Calculadora")
public class BasicCalculadora implements Calculadora {

    @Override
    public Integer restar(Integer arg0, Integer arg1) {
        return arg0 + arg1;
    }

    @Override
    public Integer sumar(Integer arg0, Integer arg1) {
        return arg0 + arg0;
    }
    
}
