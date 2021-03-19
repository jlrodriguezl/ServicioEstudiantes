package co.edu.poli.estudiantes.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Estudiantes {
	@Id
	private Long identificacion;
	private String nombres;
	private String apellidos;
	private String correo;
	
	public Estudiantes() {}

	public Long getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Long identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
