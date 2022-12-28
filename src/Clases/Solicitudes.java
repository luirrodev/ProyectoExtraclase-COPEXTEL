package Clases;

public class Solicitudes {
	private String id;
	private String solicitante;
	private String marca;
	private String tipo_pago;
	private int cant;
	private double peso_max;
	private double peso_min;
	
	public Solicitudes(String id, String solicitante, String marca, String tipo_pago, 
			int cant, double peso_max, double peso_min) {
		this.id = id;
		this.solicitante = solicitante;
		this.marca = marca;
		this.tipo_pago = tipo_pago;
		this.cant = cant;
		this.peso_max = peso_max;
		this.peso_min = peso_min;
	}

	public String getId() {
		return id;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public String getMarca() {
		return marca;
	}

	public String getTipo_pago() {
		return tipo_pago;
	}

	public int getCant() {
		return cant;
	}

	public double getPeso_max() {
		return peso_max;
	}

	public double getPeso_min() {
		return peso_min;
	}	
		
}
