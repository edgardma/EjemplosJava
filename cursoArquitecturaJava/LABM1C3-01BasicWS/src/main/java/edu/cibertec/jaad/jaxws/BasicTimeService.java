/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.jaxws;

import java.util.Date;
import javax.jws.WebService;

/**
 *
 * @author JAVA ARCHITECT
 */
@WebService(endpointInterface="edu.cibertec.jaad.jaxws.TimeService")
public class BasicTimeService implements TimeService {

    @Override
    public String getTimeAsString() {
        return new Date().toString();
    }

    @Override
    public Long getTimeAsElapsed() {
        return new Date().getTime();
    }
    
}
