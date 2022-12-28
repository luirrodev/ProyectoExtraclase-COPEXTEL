package Clases;

public class DesktopPC extends Computer{

	private String tipo_mon;
	private boolean backup;	

	public DesktopPC(String id, String marca, double peso, double precio_base, 
					 String tipo_mon, boolean backup) {
		super(id, marca, peso, precio_base);
		this.tipo_mon = tipo_mon;
		this.backup = backup;
	}	
	
	@Override
	public double PrecioVenta() {		
		
		double exedente=0;		
		if(backup) {
			exedente=50;
		}		
		if(tipo_mon.equalsIgnoreCase("CRT")) {
			return getPrecio_base()*getPeso()+(0.10*getPrecio_base()+exedente);					
		}else {
			return getPrecio_base()*getPeso()+(0.15*getPrecio_base()+exedente);
		}		
		
	}

}
