package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DaoFactory;
import Dao.PacienteDao;
import Dao.SuscripcionDao;
import modelo.Paciente;
import modelo.Suscripcion;




/**
 * Servlet implementation class InsertarUsuarioServlet
 */
@WebServlet(name ="/agregarSuscripcion", urlPatterns = {"/insertar-suscripcion"})
public class agregarSuscripcion extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SuscripcionDao suscripciondao = DaoFactory.getFactory().getSuscripcionDao();
	PacienteDao pacientedao = DaoFactory.getFactory().getPacienteDao();
	Paciente paciente = new Paciente();
	Suscripcion suscripcion = new Suscripcion();	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public agregarSuscripcion() {
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String accion=request.getParameter("accion");
		System.out.println("buscar xxxxxxxxxxxxxx");
		if (accion.equalsIgnoreCase("Listar")) {
			System.out.println("shdbsdhfbshfbsfh");
			  response.sendRedirect("/CitasMedicasOnline/agregarSuscripcion.jsp");  
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession(true);
		
		System.out.println("Entrooo a suscripcionnn.......");
		/**String sal=  request.getParameter("saldo");
		double saldo = Double.parseDouble(sal); **/
				
		System.out.println("Llego a suscripcion");
		
		
		String accion=request.getParameter("accion");
		String dato=request.getParameter("buscar");
		
		try {
			System.out.println("Legooooooo al tryyyyy");
			List<Paciente> lista = pacientedao.findbyPaciente(dato);
			System.out.println(lista);
			request.setAttribute("paciente", lista);
			
			request.getRequestDispatcher("/CitasMedicasOnline/ListarLibro.jsp").forward(request, response);
		} catch (Exception e) {
			
			System.out.println("Leggo al catch");
			request.getRequestDispatcher("/CitasMedicasOnline/agregarSuscripcion.jsp").forward(request, response);

		}
		/**
		System.out.println("Mostrando datos");
		
		suscripcion.setSaldo(saldo);
		
		//paciente.setApellido(apellido);
	
		
		suscripciondao.create(suscripcion);
		System.out.println();
		response.sendRedirect("/insertaPaciente.jsp");**/
		}

}
