			package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DaoFactory;
import Dao.MedicoDao;
import modelo.Medico;





/**
 * Servlet implementation class InsertarUsuarioServlet
 */
@WebServlet(name ="/InsertarMedicoServlet", urlPatterns = {"/insertar-medico"})
public class InsertarMedicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	MedicoDao dao = DaoFactory.getFactory().getMedicoDao();
	Medico medico = new Medico();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarMedicoServlet() {
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
		String HorarioAtencion=request.getParameter("horarioAtencion");
		String sal=  request.getParameter("sueldo");
		double saldo = Double.parseDouble(sal);
		
		System.out.println("Mostrando datos");
		
		MedicoDao dao = DaoFactory.getFactory().getMedicoDao();
		Medico medico = new Medico();
		
		medico.setNombre(nombre);
		medico.setApellido(apellido);
		medico.setDireccion(direccion);
		medico.setTelefono(telefono);
		medico.setCedula(cedula);
		medico.setEmail(email);
		medico.setHorarioAtencion(HorarioAtencion);
		medico.setSueldo(saldo);
		System.out.println("Valores");
		System.out.println(medico.toString());
		dao.create(medico);
		System.out.println();
		response.sendRedirect("/crearMedico.jsp");
		}

}
