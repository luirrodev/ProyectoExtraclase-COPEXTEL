package Clases;

public class SolicitudesEstatales extends Solicitudes{
	
	private String tipo_entidad;

	public SolicitudesEstatales(String id, String solicitante, String marca, String tipo_pago,
			int cant, double peso_max, double peso_min, String tipo_entidad) {
		super(id, solicitante, marca, tipo_pago, cant, peso_max, peso_min);
		this.tipo_entidad = tipo_entidad;
	}

	public String getTipo_entidad() {
		return tipo_entidad;
	}
	
	
		
}
