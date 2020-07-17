package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.DaoFactory;

import Dao.SecretariaDao;
import modelo.Secretaria;





/**
 * Servlet implementation class InsertarUsuarioServlet
 */
@WebServlet(name ="/InsertarSecretariaServlet", urlPatterns = {"/insertar-secretaria"})
public class InsertarSecretariaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	SecretariaDao dao = DaoFactory.getFactory().getSecretariaDao();
	Secretaria secretaria = new Secretaria();
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarSecretariaServlet() {
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
		
		String sal=  request.getParameter("sueldo");
		double saldo = Double.parseDouble(sal);
		
		System.out.println("Mostrando datos");
		
		SecretariaDao dao = DaoFactory.getFactory().getSecretariaDao();
		Secretaria secretaria = new Secretaria();
		
		secretaria.setNombre(nombre);
		secretaria.setApellido(apellido);
		secretaria.setDireccion(direccion);
		secretaria.setTelefono(telefono);
		secretaria.setCedula(cedula);
		secretaria.setEmail(email);
		secretaria.setSueldo(saldo);
		
			
		System.out.println("Valores");
		System.out.println(secretaria.toString());
		dao.create(secretaria);
		System.out.println();
		response.sendRedirect("/crearSecretaria.jsp");
		}

}
