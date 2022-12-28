package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import Clases.*;
import EDA.*;

public class AgregarSolicitudParticular extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txt_ID;
	private JTextField txt_Solicitante;
	private JSpinner spinner_CantPC;	
	private JSpinner spinner_PesoMax;
	private JSpinner spinner_PesoMin;
	private JComboBox comboBox_Marca;
	private JComboBox comboBox_TipoPago;
	private JButton btn_Crear;
	private JSpinner spinner_SalarioSolicitante;
	private ListaSE<Solicitudes> miLista;

	public AgregarSolicitudParticular(ListaSE<Solicitudes> miLista) {		
		
		this.miLista=miLista;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(500, 520);				
		setLocationRelativeTo(null);		
		setTitle("AGREGAR SOLICITUD PARTICULAR");
		setResizable(false);
		iniciarComponentes();
		
	}		

	private void iniciarComponentes() {
		
		JPanel PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);
		
		JLabel lbl_Title = new JLabel("SOLICITUD PARTICULAR");
		lbl_Title.setForeground(Color.WHITE);
		lbl_Title.setBackground(Color.BLACK);
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 28));
		lbl_Title.setBounds(0, 0, 490, 50);
		lbl_Title.setOpaque(true);
		PanelPrincipal.add(lbl_Title);
		
		JLabel lbl_ID = new JLabel("Identificador:");
		lbl_ID.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_ID.setBounds(30, 80, 200, 25);
		PanelPrincipal.add(lbl_ID);
		
		JLabel lbl_Solicitante = new JLabel("Solicitante:");
		lbl_Solicitante.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_Solicitante.setBounds(30, 120, 200, 25);
		PanelPrincipal.add(lbl_Solicitante);
		
		JLabel lbl_CantPC = new JLabel("Catidad de Computadoras:");
		lbl_CantPC.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_CantPC.setBounds(30, 160, 200, 25);
		PanelPrincipal.add(lbl_CantPC);
		
		JLabel lbl_Marca = new JLabel("Marca:");
		lbl_Marca.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_Marca.setBounds(30, 200, 200, 25);
		PanelPrincipal.add(lbl_Marca);
		
		JLabel lbl_PesoMax = new JLabel("Peso Maximo (Kg): ");
		lbl_PesoMax.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_PesoMax.setBounds(30, 240, 200, 25);
		PanelPrincipal.add(lbl_PesoMax);
		
		JLabel lbl_PesoMin = new JLabel("Peso Minimo (Kg):");
		lbl_PesoMin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_PesoMin.setBounds(30, 280, 200, 25);
		PanelPrincipal.add(lbl_PesoMin);
		
		JLabel lbl_TipoPago = new JLabel("Tipo de Pago:");
		lbl_TipoPago.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_TipoPago.setBounds(30, 320, 200, 25);
		PanelPrincipal.add(lbl_TipoPago);
		
		JLabel lbl_SalarioSolicitante = new JLabel("Salario del Solicitante:");
		lbl_SalarioSolicitante.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_SalarioSolicitante.setBounds(30, 360, 200, 25);
		PanelPrincipal.add(lbl_SalarioSolicitante);
		
		txt_ID = new JTextField();
		txt_ID.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_ID.setBounds(320, 80, 135, 25);
		PanelPrincipal.add(txt_ID);
		
		txt_Solicitante = new JTextField();
		txt_Solicitante.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txt_Solicitante.setBounds(320, 120, 135, 25);
		PanelPrincipal.add(txt_Solicitante);
		
		spinner_CantPC = new JSpinner();
		spinner_CantPC.setBounds(320, 160, 135, 25);
		spinner_CantPC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(spinner_CantPC);
		
		comboBox_Marca = new JComboBox();
		comboBox_Marca.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "Haier", "HP", "DELL", "TOSHIBA"}));
		comboBox_Marca.setBounds(320, 200, 135, 25);
		comboBox_Marca.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(comboBox_Marca);
		
		spinner_PesoMax = new JSpinner();
		spinner_PesoMax.setBounds(320, 240, 135, 25);
		spinner_PesoMax.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(spinner_PesoMax);
		
		spinner_PesoMin = new JSpinner();
		spinner_PesoMin.setBounds(320, 280, 135, 25);
		spinner_PesoMin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(spinner_PesoMin);
		
		comboBox_TipoPago = new JComboBox();
		comboBox_TipoPago.setModel(new DefaultComboBoxModel(new String[] {"Seleccione...", "Cheque", "Efectivo"}));
		comboBox_TipoPago.setBounds(320, 320, 135, 25);
		comboBox_TipoPago.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(comboBox_TipoPago);
		
		spinner_SalarioSolicitante = new JSpinner();
		spinner_SalarioSolicitante.setBounds(320, 360, 135, 25);
		spinner_SalarioSolicitante.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(spinner_SalarioSolicitante);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(30, 400, 425, 5);
		PanelPrincipal.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 470, 425, 5);
		PanelPrincipal.add(separator_1);
		
		btn_Crear = new JButton("Añadir Solicitud");
		btn_Crear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_Crear.setBounds(143, 420, 200, 30);
		btn_Crear.addActionListener(this);
		PanelPrincipal.add(btn_Crear);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==btn_Crear) {
			
			Solicitudes miSolicitud = new SolicitudesParticulares(
					txt_ID.getText(), 
					txt_Solicitante.getText(), 
					comboBox_Marca.getSelectedItem().toString(), 
					comboBox_TipoPago.getSelectedItem().toString(), 
					Integer.parseInt(spinner_CantPC.getValue().toString()),	
					Double.parseDouble(spinner_PesoMax.getValue().toString()), 
					Double.parseDouble(spinner_PesoMin.getValue().toString()),
					Double.parseDouble(spinner_SalarioSolicitante.getValue().toString()));
			
			/*System.out.println(""
					+txt_ID.getText()+"\n" 
					+(String) txt_Solicitante.getText()+"\n"
					+(String) comboBox_Marca.getSelectedItem()+"\n" 
					+(String) comboBox_TipoPago.getSelectedItem()+"\n" 
					+Integer.parseInt(spinner_CantPC.getValue().toString())+"\n"	
					+Double.parseDouble(spinner_PesoMax.getValue().toString())+"\n" 
					+Double.parseDouble(spinner_PesoMin.getValue().toString())+"\n"
					+Double.parseDouble(spinner_SalarioSolicitante.getValue().toString())+"\n"
					);*/			
			miLista.Adicionar(miSolicitud);
			this.dispose();
			
			
		}
		
		
		
		
		
}

}
