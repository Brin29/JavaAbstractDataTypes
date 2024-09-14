package genericos;

import java.util.List;

// Creacion del generico
// Tipos acotados que tipo debe ser la clase
public class Generico<T extends Number> {
		
	private final T tipoObjeto;
	
	public Generico(T tipoObjeto) {
		this.tipoObjeto = tipoObjeto;
	}
	
	public void show() {
		System.out.println("Esta es la clase del generico" + tipoObjeto.getClass());
	}
	
	// Generico en clase
	static <T> void mostrar(T tipoObjeto) {
		System.out.println("Esta es la clase del generico" + tipoObjeto.getClass());
	}
	
	// Mas de uno
	static <T, D> void mostrarMasDeUno(T tipoObjeto, D segundoObjeto) {
		System.out.println("Esta es la clase del generico" + tipoObjeto.getClass() + segundoObjeto.getClass());
	}
	
	// Comodines
	static void mostrarConComodin(List<? extends Number> lista) {
		System.out.println("Esta es la clase del generico" + lista.getClass());
	}
}