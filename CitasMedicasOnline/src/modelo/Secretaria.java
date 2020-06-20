package modelo;


public class Secretaria extends Persona{


	public Agenda agenda;
	
public Secretaria() {
		
		
	}


	public Secretaria(String nombre, String apellido, String direccion, String telefono, String cedula, String email,Agenda agenda) {
	super(nombre, apellido, direccion, telefono, cedula, email);
	this.agenda=agenda;
	// TODO Auto-generated constructor stub
}
 

	public Secretaria(Agenda agenda) {
		
		this.agenda = agenda;
	}
	
	

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	@Override
	public void validarCedula() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validarCorreo() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
