package Clases;

public class Laptop extends Computer{

	private int bat_dur;
	private boolean webcam;	
	
	public Laptop(String id, String marca, double peso, double precio_base, 
			      int bat_dur, boolean webcam) {
		super(id, marca, peso, precio_base);
		this.bat_dur = bat_dur;
		this.webcam = webcam;
	}
	
	@Override	
	public double PrecioVenta() {
		
		if(webcam) {
			return getPrecio_base()*getPeso()+((getPrecio_base()*0.05*bat_dur)+70);
		}else {
			return getPrecio_base()*getPeso()+(getPrecio_base()*0.05*bat_dur);
		}		
	}
	
}
