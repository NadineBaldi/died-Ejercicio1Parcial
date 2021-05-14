package died_parcial1_ej01;

import java.time.LocalDate;
import java.util.List;

public abstract class Empleado {
	
	protected Integer cuil;
	protected String nombre;
	protected LocalDate fechaNac;
	protected String email;
	
	protected List<Venta> ventas;
	
	//getters and setters

	public Integer getCuil() {
		return cuil;
	}

	public void setCuil(Integer cuil) {
		this.cuil = cuil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Venta> getVentas() {
		return ventas;
	}

	public void setVentas(List<Venta> ventas) {
		this.ventas = ventas;
	} 
	
	
	public abstract Double sueldo();

}
