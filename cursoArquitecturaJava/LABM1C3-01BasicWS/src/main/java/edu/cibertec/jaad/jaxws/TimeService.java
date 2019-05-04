/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 *
 * @author JAVA ARCHITECT
 */
@WebService
public interface TimeService {
    @WebMethod(operationName="timeStr")
    @WebResult(name="timeResponse", partName="partTimeResponse")
    String getTimeAsString();
    
    @WebMethod
    Long getTimeAsElapsed();
}
