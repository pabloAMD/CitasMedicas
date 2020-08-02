package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



/**
 * Servlet implementation class IniciarSesion
 */

@WebServlet(name ="/IniciarSesion", urlPatterns = {"/iniciar-sesion"})
public class IniciarSesion extends HttpServlet {
	private static final long serialVersionUID = 1L;
		
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IniciarSesion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			HttpSession session=request.getSession(true);
			
			String user=request.getParameter("nombre");
			String contra=request.getParameter("contra");
			String rol=request.getParameter("contra");
			System.out.println("datos "+user + "    contraseña"+contra);
			
			
			if (rol=="admin") {	
				response.sendRedirect(request.getContextPath()+"PaginaAdministrador.html");
				
			}else if(rol=="user")
			
				response.sendRedirect(request.getContextPath()+"/html/index.html");
	
	}
}
