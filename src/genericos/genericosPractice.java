package genericos;

import java.util.ArrayList;
import java.util.List;

public class genericosPractice {

	public static void main(String[] args) {
		
		// Los genericos permiten definir que tipo de valor se puede ingresar
		
		// Como no se define el tipo de lista se castea
		//List lista = new ArrayList<>();
		//lista.add("Hola");
		
		//final String ejemplo = (String) lista.get(0);
		
		// Ya no se castea
		List<String> lista = new ArrayList<>();
		lista.add("Hola");
		lista.add("Adios");
		
		final String ejemplo = lista.get(0);	
		
		// Generico creado
		Generico<Double> generico = new Generico(1.5);
		
		generico.show();
		
		// String no hereda de nombre
		//Generico<String> genericoString = new Generico("Hola Mundo");
		//generico.show();
		
		// Tipos acotados que tipo debe ser la clase
		
		Generico.mostrar(1);
		
		Generico.mostrarMasDeUno(1, "Hola");
	}
}
