package ejercicios;

import java.time.LocalDate;

import ejercicio2Res.Persona;
import ejercicio2Res.TipoDocumento;

/**
 * A. Crear una clase Persona con los siguientes campos (con sus respectivos
 * getters, setters y constructor)
 * 
 * TipoDocumento - enum (dni/libretacivica) NroDocumento - Integer Nombre -
 * String Apellido - String FechaNacimiento - Date
 * 
 * B. En el método main de la clase "Ejercicio2" crear una nueva instancia de
 * la clase persona y settearle valores reales con tus datos
 * 
 * 
 * C. En el método main de la clase "Ejercicio 2" imprimir los valores en
 * consola (crear método main e imprimir valores)
 * 
 * @author examen
 *
 */
public class Ejercicio2 {

	/**
	 * 
	 */
	public Ejercicio2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Persona persona = new Persona(33489857, "Tom�s", "Recalde", LocalDate.parse("1988-02-21"), TipoDocumento.dni);
		imprimirValoresPersona(persona);

	}

	public static void imprimirValoresPersona(Persona persona) {
		System.out.println("Los datos de la persona son:\n" + persona.toString());
	}

}
