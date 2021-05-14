package died_parcial1_ej01;

import java.time.LocalDate;
import java.util.List;

public class Contratado extends Empleado {
	
	private Integer totalHorasTrabPorMes;
	private Double costoPorHora;
	
	private List<Venta> ventasRealizadas;
	
	
	@Override
	public Double sueldo() {
		
		double aux = 0.0;
		int contador = 0;
		
		for (int i=0; i<ventasRealizadas.size(); i++) {
			
			if (ventasRealizadas.get(i).getMonto() > 10000) {
				
				contador = contador+1; //cuento las ventas que realizó
				
			}
			
		}
		
		aux = contador * 10; //multiplico a la cant de ventas que realizó por el equivalente a 10 horas trabajadas
		
		
		if (LocalDate.now().getMonth().equals(this.fechaNac.getMonth())) {

			return this.costoPorHora * aux + 20000;
			
		} else {
			
			return this.costoPorHora * aux;
		}
		
		
	}
	

}
