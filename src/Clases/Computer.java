package Clases;

public abstract class Computer {
	
	private String id;
	private String marca;
	private double peso;
	private double precio_base;	
	
	public Computer(String id, String marca, double peso, double precio_base) {
		this.id = id;
		this.marca = marca;
		this.peso = peso;
		this.precio_base = precio_base;
	}

	public abstract double PrecioVenta();

	public String getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public double getPeso() {
		return peso;
	}

	public double getPrecio_base() {
		return precio_base;
	}	
		
}

	