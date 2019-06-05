/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cibertec.jaad.ws.handler;

import java.util.Set;
import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.NodeList;

/**
 *
 * @author JAVA ARCHITECT
 */
public class AutenticationHandler implements SOAPHandler<SOAPMessageContext>{
    private static final Logger LOG = LoggerFactory.getLogger(AutenticationHandler.class);
    
    @Override
    public Set<QName> getHeaders() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return null;
    }

    @Override
    public boolean handleMessage(SOAPMessageContext context) {
        Boolean isRequest = !(Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
        
        String usuario = "";
        String clave = "";
        
        try {
            if (isRequest) {
                SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
                SOAPHeader header = envelope.getHeader();
                
                if (header == null || !header.hasChildNodes()) {
                    SOAPFault fault = envelope.getBody().addFault();
                    fault.setFaultString("El mensaje no tiene header.");
                    return false;
                }
                
                NodeList nodos = header.getElementsByTagNameNS("http://security/", "*");
                
                for (int i = 0; i < nodos.getLength(); i++) {
                    if (nodos.item(i).getLocalName().equals("user")) {
                        usuario = nodos.item(i).getTextContent();
                    }
                    if (nodos.item(i).getLocalName().equals("clave")) {
                        clave = nodos.item(i).getTextContent();
                    }
                }
                
                if (usuario.equals("duke") && clave.equals("java")) {
                    LOG.info("Autenticación exitosa.");
                } else {
                    SOAPFault fault = envelope.getBody().addFault();
                    fault.setFaultString("Credenciales invalidas.");
                    return false;
                }
            }
        } catch(Exception ex) {
            LOG.error("erroror al procesar la autenticación.", ex);
        }
        
        return true;
    }

    @Override
    public boolean handleFault(SOAPMessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return false;
    }

    @Override
    public void close(MessageContext context) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
