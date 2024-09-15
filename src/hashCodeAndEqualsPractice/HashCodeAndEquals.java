package hashCodeAndEqualsPractice;

public class HashCodeAndEquals {
	
	public static void main(String[] args) {
		
		// Heredan de la clase Object
		// HashCode 
		
		UsuarioDto usuarioDto = new UsuarioDto("Breiner", "br@gmail.com");
		
		
		// hashCode = devuelve el codigo hash del objeto
		int hash = usuarioDto.HashCode();
		
		System.out.print(hash);
	}

}
