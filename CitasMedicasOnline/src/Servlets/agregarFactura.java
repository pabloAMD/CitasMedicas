package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CitaMedicaDao;
import Dao.DaoFactory;
import Dao.FacturaDao;

/**
 * Servlet implementation class agregarFactura
 */
@WebServlet("/agregarFactura")
public class agregarFactura extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CitaMedicaDao citamedicaDao= DaoFactory.getFactory().getCitaMedicaDao();
	FacturaDao facturaDao = DaoFactory.getFactory().getFacturaDao();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public agregarFactura() {
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
		doGet(request, response);
	}

}
