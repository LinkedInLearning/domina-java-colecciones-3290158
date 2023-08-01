
public class PersonaMal {
	protected String nombre;
	protected String apellido;
	
	public PersonaMal(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	@Override
	public String toString() {
		return nombre + " " +  apellido;
	}
}
