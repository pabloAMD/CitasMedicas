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

import Dao.AgendaDao;
import Dao.DaoFactory;
import Dao.PacienteDao;
import modelo.Agenda;
import modelo.Paciente;




/**
 * Servlet implementation class InsertarUsuarioServlet
 */
@WebServlet(name ="/InsertarAgendaServlet", urlPatterns = {"/insertar-agenda"})
public class InsertarAgendaServlets extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	AgendaDao dao = DaoFactory.getFactory().getAgendaDao();
	
	Agenda agenda = new Agenda();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertarAgendaServlets() {
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
		
		String notas=request.getParameter("notas");
		String fecha=request.getParameter("fecha");
		
		System.out.println("Mostrando datos");
		
		AgendaDao dao = DaoFactory.getFactory().getAgendaDao();
		
		Agenda agenda = new Agenda();
		agenda.setNotas(notas);
		agenda.setFecha(fecha);
		
		
			
		System.out.println("Valores");
		System.out.println(agenda.toString());
		dao.create(agenda);
		System.out.println();
		response.sendRedirect("/crearAgenda.jsp");
		
	}
	

}
