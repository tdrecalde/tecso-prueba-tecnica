package ejercicio2Res;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Persona {
	
	public Persona(Integer nroDocumento, String nombre, String apellido, LocalDate fechaNacimiento,
			TipoDocumento tipodocumento) {
		this.nroDocumento = nroDocumento;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.tipodocumento = tipodocumento;
	}
	Integer nroDocumento; 
	 String nombre;
	 String apellido; 
	 LocalDate  fechaNacimiento;
	 TipoDocumento tipodocumento;
	public Integer getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(Integer nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate  getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public TipoDocumento getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(TipoDocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	@Override
	public String toString() {
		return "nroDocumento=" + nroDocumento + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fechaNacimiento=" + fechaNacimiento + ", tipodocumento=" + tipodocumento;
	}
	 
	

}
