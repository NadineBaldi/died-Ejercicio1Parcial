package died_parcial1_ej01;

import java.time.Instant;

public class Venta {

	private Integer nroVenta;
	private Instant fecha;
	private Double monto;
	
	
	public Integer getNroVenta() {
		return nroVenta;
	}
	public void setNroVenta(Integer nroVenta) {
		this.nroVenta = nroVenta;
	}
	public Instant getFecha() {
		return fecha;
	}
	public void setFecha(Instant fecha) {
		this.fecha = fecha;
	}
	public Double getMonto() {
		return monto;
	}
	public void setMonto(Double monto) {
		this.monto = monto;
	}
	
	
	
}
