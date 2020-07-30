package Servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import Dao.DaoFactory;
import Dao.OrdenMedicaDao;
import modelo.OrdenMedica;





/**
 * Servlet implementation class InsertarUsuarioServlet
 */
@WebServlet(name ="/crearOrdenMedicaServlets", urlPatterns = {"/insertar-orden"})
public class crearOrdenMedicaServlets extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	OrdenMedicaDao dao= DaoFactory.getFactory().getOrdenMedicaDao();
	OrdenMedica ordenMedica = new OrdenMedica();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public crearOrdenMedicaServlets() {
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
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(true);
		
		String receta=request.getParameter("receta");
		
		
		System.out.println("Mostrando datos");
		System.out.println("receta es: "+receta);
		
		OrdenMedicaDao dao= DaoFactory.getFactory().getOrdenMedicaDao();
		OrdenMedica ordenMedica = new OrdenMedica();
		
		ordenMedica.setReceta(receta);
		
		
			
		System.out.println("Valores");
		System.out.println(ordenMedica.toString());
		dao.create(ordenMedica);
		System.out.println();
		response.sendRedirect("/crearOrdenMedica.jsp");
		
	}
	

}
