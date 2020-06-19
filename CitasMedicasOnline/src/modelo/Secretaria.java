package modelo;

public class Secretaria extends Persona {

	private Agenda agenda;
	
public Secretaria() {
		
		
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
