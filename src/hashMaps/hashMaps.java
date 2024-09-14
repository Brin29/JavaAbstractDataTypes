package hashMaps;

import java.util.HashMap;

public class hashMaps {
	
	public static void main(String[] args) {
		
	//Guarda en un generico la clave y su valor
	// Se puede usar cualquier tipo de dato
	HashMap<Integer, String> hash = new HashMap<>();
	
	hash.put(1000, "Pepito");
	hash.put(10, "Pepita");
	hash.put(1, "Pepiti");
	
	System.out.print(hash);
	}	
}
