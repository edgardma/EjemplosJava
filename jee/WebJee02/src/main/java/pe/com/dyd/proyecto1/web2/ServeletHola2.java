package pe.com.dyd.proyecto1.web2;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.com.dyd.proyecto1.ejb2.Mensaje2Local;

/**
 * Servlet implementation class ServeletHola2
 */
@WebServlet("/ServeletHola2")
public class ServeletHola2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	@EJB
	Mensaje2Local servicio;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Hola desde Servlet2").append(servicio.mensaje());
	}
}
