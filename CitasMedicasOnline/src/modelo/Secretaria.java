package modelo;

public class Secretaria extends Persona {

	public Agenda agenda;

	public Secretaria() {

	}

	public Secretaria(String nombre, String apellido, String direccion, String telefono, String cedula, String email,
			Agenda agenda) {
		super(nombre, apellido, direccion, telefono, cedula, email);
		this.agenda = agenda;
		// TODO Auto-generated constructor stub
	}

	public Agenda getAgenda() {
		return agenda;
	}

	public void setAgenda(Agenda agenda) {
		this.agenda = agenda;
	}

	

}
