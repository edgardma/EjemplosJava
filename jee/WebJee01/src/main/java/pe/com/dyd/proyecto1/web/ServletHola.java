package pe.com.dyd.proyecto1.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.com.dyd.proyecto1.ejb.MensajeLocal;

/**
 * Servlet implementation class ServletHola
 */
@WebServlet("/ServletHola")
public class ServletHola extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	MensajeLocal servicio;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Hola desde un Servlet. ").append(servicio.mensaje());
	}

}
