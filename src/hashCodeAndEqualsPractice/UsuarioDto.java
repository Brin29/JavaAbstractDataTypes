package hashCodeAndEqualsPractice;

public class UsuarioDto {

	private String nombre;
	
	private String email;
	
	public UsuarioDto(String nombre, String email) {
		
		this.nombre = nombre;
		this.email = email;
		
	}
	
	public UsuarioDto() {}
	// Es un identificador de 32 bits que se almacena en un hash
	public int HashCode() {
		int result =  nombre != null ? nombre.hashCode() : 0;
		
		return result;
	}
	
}
