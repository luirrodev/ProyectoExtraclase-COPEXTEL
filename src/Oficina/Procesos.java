package Oficina;

import java.util.*;
import Clases.Solicitudes;
import EDA.*;

public class Procesos {
	
	ListaSE<Solicitudes> milista = new ListaSE<Solicitudes>();
  
	public ListaSE<Solicitudes> getMilista() {
		return milista;
	}

	public void setMilista(ListaSE<Solicitudes> milista) {
		this.milista = milista;
	}
	
}
