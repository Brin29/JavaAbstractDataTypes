package streamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {

	public static void main(String[] args) {
	
		// Nos permite trabajar colecciones de datos
		// Nos permite procesarlas y manipularlas
		List<String> paises = new ArrayList<>();
		paises.add("Hola");
		paises.add("Hola");
		
		
		System.out.print(paises.stream().distinct().count());
		
		
	}
}
