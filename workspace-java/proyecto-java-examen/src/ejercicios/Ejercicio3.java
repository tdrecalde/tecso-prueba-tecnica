/**
 * 
 */
package ejercicios;

import java.time.LocalDate;

import ejercicio2Res.Persona;
import ejercicio2Res.TipoDocumento;
import ejercicio3Res.Alumno;

/**
 * A. Crear una clase Alumnno con los siguientes campos
 * (con sus respectivos getters, setters y constructor)
 * 
 * Persona
 * Legajo - Integer
 * 
 *  
 * @author examen
 *
 */
public class Ejercicio3 {

	/**
	 * 
	 */
	public Ejercicio3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alumno alumno = new Alumno(33489857, "Tomás", "Recalde", LocalDate.parse("1988-02-21"), TipoDocumento.dni, 11111);
		imprimirValoresAlumno(alumno);

	}

	public static void imprimirValoresAlumno(Alumno alumno) {
		System.out.println("Los datos del alumno son:\n " + alumno.toString());
	}
}
