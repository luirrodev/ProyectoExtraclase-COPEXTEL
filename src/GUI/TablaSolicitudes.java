package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Solicitudes;
import Clases.SolicitudesEstatales;
import Clases.SolicitudesParticulares;
import EDA.*;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class TablaSolicitudes extends JFrame implements ActionListener{

	private JPanel PanelPrincipal;	
	private JTable Tabla_Solicitudes;
	private DefaultTableModel model;
	private JButton btn_Atras;
	private JButton btn_Atend;
	private ListaSE miLista;

	public TablaSolicitudes(ListaSE<Solicitudes> Lista) {		
		
		this.miLista=Lista;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(900, 600);
		setLocationRelativeTo(null);
		setTitle("SOLICITUDES");
		setResizable(false);
		iniciarComponentes();
		
	}	

	private void iniciarComponentes() {
		
		PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		JLabel lbl_Title = new JLabel("SOLICITUDES");
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setBackground(Color.BLACK);
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lbl_Title.setBounds(0, 0, 886, 50);
		lbl_Title.setOpaque(true);
		PanelPrincipal.add(lbl_Title);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 50, 886, 427);
		PanelPrincipal.add(scrollPane);
		
		Tabla_Solicitudes = new JTable();
		Tabla_Solicitudes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		model = new DefaultTableModel();
		Tabla_Solicitudes.setModel(model);
		model.addColumn("Tipo de Solicitud");
		model.addColumn("Identificador");
		model.addColumn("Nombre del Solicitante");
		model.addColumn("Cantidad de PC");
		model.addColumn("Marca");
		model.addColumn("Peso Max");
		model.addColumn("Peso Min");
		model.addColumn("Tipo de Pago");
		model.addColumn("Tipo de Entidad");
		model.addColumn("Salario del Solicitante");
		
		scrollPane.setViewportView(Tabla_Solicitudes);		
		
		btn_Atras = new JButton("Atras");
		btn_Atras.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Atras.setBounds(100, 505, 150, 30);
		btn_Atras.addActionListener(this);
		PanelPrincipal.add(btn_Atras);
		
		btn_Atend = new JButton("Atender Solicitud");
		btn_Atend.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_Atend.setBounds(650, 505, 150, 30);
		btn_Atend.addActionListener(this);
		PanelPrincipal.add(btn_Atend);
		
	}
		
	 public void LlenarTabla() {		 
		
		for(int i=0; i<miLista.Longitud(); i++) {
			
			Object[] fila = new Object[10];
		
			if(((Solicitudes) miLista.Obtener(i)) instanceof SolicitudesEstatales) {
				fila[0]="Estatal";
				fila[8]=(((SolicitudesEstatales) miLista.Obtener(i)).getTipo_entidad());
				fila[9]="---";				
			}else {
				fila[0]="Particular";
				fila[8]="---";
				fila[9]=(((SolicitudesParticulares) miLista.Obtener(i)).getSalario_solicitante());
			}
			fila[1]=((Solicitudes) miLista.Obtener(i)).getId();
			fila[2]=((Solicitudes) miLista.Obtener(i)).getSolicitante();
			fila[3]=((Solicitudes) miLista.Obtener(i)).getCant();
			fila[4]=((Solicitudes) miLista.Obtener(i)).getMarca();
			fila[5]=((Solicitudes) miLista.Obtener(i)).getPeso_max();
			fila[6]=((Solicitudes) miLista.Obtener(i)).getPeso_min();
			fila[7]=((Solicitudes) miLista.Obtener(i)).getTipo_pago();
			
			model.addRow(fila);
		}
		 
	 } 	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_Atras) {
			this.dispose();
		}
	}

	
}
