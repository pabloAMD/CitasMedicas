package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.DaoFactory;
import Dao.PacienteDao;

import modelo.Paciente;

@WebServlet("/ListarLibro")
public class ListarLibro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	    private PacienteDao dao;
	 
	    /**
	     * @see HttpServlet#HttpServlet()
	     */
	    public ListarLibro() {
	        
	        dao=DaoFactory.getFactory().getPacienteDao();
	        // TODO Auto-generated constructor stub
	    }

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
		/**
		List<Paciente>lista=dao.findbyPaciente(cedula);
		System.out.println(lista.toString());
		request.setAttribute("paciente", lista);
		request.getRequestDispatcher("/JSPs/ListarLibro.jsp").forward(request, response);
		**/
		}
}
