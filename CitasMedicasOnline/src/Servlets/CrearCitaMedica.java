package Servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.CitaMedicaDao;
import Dao.DaoFactory;
import Dao.MedicoDao;
import Dao.PacienteDao;
import modelo.CitaMedica;
import modelo.Medico;
import modelo.Paciente;

/**
 * Servlet implementation class CrearCitaMedica
 */
@WebServlet("/CrearCitaMedica")
public class CrearCitaMedica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CrearCitaMedica() {
        super();
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
		doGet(request, response);
		
		String dato = request.getParameter("tipo");
		System.out.println(dato+"+++++++++++++++++");
	System.out.println("llega el servlet");
	PacienteDao daoUsu = DaoFactory.getFactory().getPacienteDao();
		
		Paciente paciente = (Paciente) daoUsu.buscarPorId("1");
		System.out.println(paciente.getApellido());
	MedicoDao med = DaoFactory.getFactory().getMedicoDao();
	List<Medico> medicos = med.buscarMedicos();
	
	
	System.out.println("Medicos---------");
	for (Medico medico : medicos) {
		System.out.println(medico.getApellido());
		
	}
	
	Medico medic = med.buscarMedico("1");
	System.out.println("medico encontrado +++++++++++++"+ medic.getNombre()+medic.getId_medico());
		
	//Crear citaMedica
	
	CitaMedica citamedica = new CitaMedica();
	citamedica.setId(1);
	citamedica.setPaciente(paciente);
	citamedica.setMedico(medic);
	citamedica.setMotivo("Dolor de pansa aguda me duele mucho la pancita");
	citamedica.setTurno(1);
	citamedica.setPrecio(20.00);
	citamedica.setFecha("18-07-2020");
	
	
	System.out.println(citamedica.getId());
	System.out.println(citamedica.getPaciente());
	System.out.println(citamedica.getMedico());
	System.out.println(citamedica.getMotivo());
	System.out.println(citamedica.getTurno());
	System.out.println(citamedica.getPrecio());
	System.out.println(citamedica.getFecha());
	
	
	CitaMedicaDao cita = DaoFactory.getFactory().getCitaMedicaDao();
	cita.create(citamedica);
	System.out.println("Creado con exito");
	

	}

}
