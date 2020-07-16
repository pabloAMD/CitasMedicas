package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DaoFactory;
import Dao.PacienteDao;
import modelo.Paciente;




/**
 * Servlet implementation class InsertarUsuarioServlet
 */
@WebServlet(name ="/InsertarPacienteServlet", urlPatterns = {"/insertar-paciente"})
public class InsertarPacienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	PacienteDao dao = DaoFactory.getFactory().getPacienteDao();
	Paciente paciente = new Paciente();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarPacienteServlet() {
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
		
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String direccion=request.getParameter("direccion");
		String telefono=request.getParameter("telefono");
		String cedula=request.getParameter("cedula");
		String email=request.getParameter("email");
		
		System.out.println("Mostrando datos");
		
		PacienteDao dao = DaoFactory.getFactory().getPacienteDao();
		Paciente paciente = new Paciente();
		
		paciente.setNombre(nombre);
		paciente.setApellido(apellido);
		paciente.setDireccion(direccion);
		paciente.setTelefono(telefono);
		paciente.setCedula(cedula);
		paciente.setEmail(email);
		
		System.out.println("Valores");
		System.out.println(paciente.toString());
		dao.create(paciente);
		System.out.println();
		response.sendRedirect("/insertaPaciente.jsp");
		}

}
