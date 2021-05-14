package died_parcial1_ej01;

import java.time.LocalDate;
import java.util.List;

public class EnConvenio extends Empleado {

	private Integer antiguedad;
	private Double sueldoBasico;
	
	private List<Venta> ventasRealizadas;
	
	@Override
	public Double sueldo() {
		
		double aux = 0.0;
		
		for (int i=0; i<ventasRealizadas.size(); i++) {
			
			aux += ventasRealizadas.get(i).getMonto();
			
		}
		
		
		if (LocalDate.now().getMonth().equals(this.fechaNac.getMonth())) {

			return this.sueldoBasico + aux * 0.15 + 20000;
			
		} else {
			
			return this.sueldoBasico + aux * 0.15;
		}
		
	
	}
	
	
	
}
