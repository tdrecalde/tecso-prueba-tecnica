package ejercicio3Res;

import java.time.LocalDate;

import ejercicio2Res.Persona;
import ejercicio2Res.TipoDocumento;

public class Alumno extends Persona {


	public Alumno(Integer nroDocumento, String nombre, String apellido, LocalDate fechaNacimiento,
			TipoDocumento tipodocumento, Integer legajo) {
		super(nroDocumento, nombre, apellido, fechaNacimiento, tipodocumento);
		Legajo = legajo;
	}

	Integer Legajo;

	public Integer getLegajo() {
		return Legajo;
	}

	public void setLegajo(Integer legajo) {
		Legajo = legajo;
	}

	@Override
	public String toString() {
		return super.toString() + ", Legajo=" + Legajo  ;
	}
	
	

}
