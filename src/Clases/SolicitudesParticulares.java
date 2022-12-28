package Clases;

public class SolicitudesParticulares extends Solicitudes{
	
	private double salario_solicitante;

	public SolicitudesParticulares(String id, String solicitante, String marca, 
			String tipo_pago, int cant,	double peso_max, double peso_min, 
			double salario_solicitante) {
		super(id, solicitante, marca, tipo_pago, cant, peso_max, peso_min);
		this.salario_solicitante = salario_solicitante;
	}

	public double getSalario_solicitante() {
		return salario_solicitante;
	}
	
		
}
