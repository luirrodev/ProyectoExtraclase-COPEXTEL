package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Solicitudes;
import Oficina.Procesos;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;

public class MenuPrincipal extends JFrame implements ActionListener{

	private JPanel PanelPrincipal;	
	private JMenuItem mn_SolicitudParticular;
	private JMenuItem mn_SolicitudEstatal;	
	private JMenuItem mn_MostrarSolicitudes;
	private Procesos misProcesos;

	public MenuPrincipal() {
		
		misProcesos = new Procesos();		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 450);				
		setLocationRelativeTo(null);		
		setTitle("COPEXTEL");
		setResizable(false);
		iniciarComponentes();
		
	}

	private void iniciarComponentes() {
		
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 500, 30);
		PanelPrincipal.add(menuBar);
		
		JMenu Jmenu_Solicitudes = new JMenu("SOLICITUDES");
		Jmenu_Solicitudes.addActionListener(this);
		menuBar.add(Jmenu_Solicitudes);
		
		JMenu JMenu_AgregarSolicitudes = new JMenu("Agregar Solicitud");
		Jmenu_Solicitudes.add(JMenu_AgregarSolicitudes);
		
		mn_SolicitudParticular = new JMenuItem("Solicitud Particular");
		mn_SolicitudParticular.addActionListener(this);
		JMenu_AgregarSolicitudes.add(mn_SolicitudParticular);
				
		mn_SolicitudEstatal = new JMenuItem("Solicitud Estatal");
		mn_SolicitudEstatal.addActionListener(this);
		JMenu_AgregarSolicitudes.add(mn_SolicitudEstatal);
		
		mn_MostrarSolicitudes = new JMenuItem("Mostrar Solicitudes");
		mn_MostrarSolicitudes.addActionListener(this);
		Jmenu_Solicitudes.add(mn_MostrarSolicitudes);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==mn_SolicitudParticular) {
			AgregarSolicitudParticular sp = new AgregarSolicitudParticular
			(misProcesos.getMilista());			
			sp.setVisible(true);
		}
		else if(e.getSource()==mn_SolicitudEstatal) {
			AgregarSolicitudEstatal se = new AgregarSolicitudEstatal
			(misProcesos.getMilista());			
			se.setVisible(true);		
		}	
		else if(e.getSource()==mn_MostrarSolicitudes) {			
			TablaSolicitudes ts = new TablaSolicitudes
			(misProcesos.getMilista());	
			ts.LlenarTabla();
			ts.setVisible(true);
		}		
	}
}
