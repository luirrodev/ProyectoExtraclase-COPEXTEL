package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Solicitudes;
import Clases.SolicitudesEstatales;
import Clases.SolicitudesParticulares;
import EDA.ListaSE;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Queue;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class AgregarSolicitudEstatal extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txt_ID;
	private JTextField txt_Solicitante;
	private JTextField txt_CantPC;
	private JComboBox comboBox_Marca;
	private JComboBox comboBox_TipoPago;
	private JComboBox comboBox_TipoEntidad;
	private JSpinner spinner_PesoMax;
	private JSpinner spinner_PesoMin;
	private JSpinner spinner_CantPC;
	private JButton btn_Crear;
	private ListaSE<Solicitudes> miLista;

	public AgregarSolicitudEstatal(ListaSE<Solicitudes> miLista) {

		this.miLista = miLista;
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setSize(500, 520);
		setLocationRelativeTo(null);
		setTitle("AGREGAR SOLICITUD ESTATAL");
		setResizable(false);
		iniciarComponentes();
	}

	private void iniciarComponentes() {

		JPanel PanelPrincipal = new JPanel();
		PanelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(PanelPrincipal);
		PanelPrincipal.setLayout(null);

		JLabel lbl_Title = new JLabel("SOLICITUD ESTATAL");
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

		JLabel lbl_TipoEntidad = new JLabel("Tipo de Entidad:");
		lbl_TipoEntidad.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lbl_TipoEntidad.setBounds(30, 360, 200, 25);
		PanelPrincipal.add(lbl_TipoEntidad);

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
		comboBox_Marca
				.setModel(new DefaultComboBoxModel(new String[] { "Seleccione...", "Haier", "HP", "DELL", "TOSHIBA" }));
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
		comboBox_TipoPago.setModel(new DefaultComboBoxModel(new String[] { "Seleccione...", "Cheque", "Efectivo" }));
		comboBox_TipoPago.setBounds(320, 320, 135, 25);
		comboBox_TipoPago.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(comboBox_TipoPago);

		comboBox_TipoEntidad = new JComboBox();
		comboBox_TipoEntidad
				.setModel(new DefaultComboBoxModel(new String[] { "Seleccione...", "Empresa", "Centro Educacional" }));
		comboBox_TipoEntidad.setBounds(320, 360, 135, 25);
		comboBox_TipoEntidad.setFont(new Font("Tahoma", Font.PLAIN, 15));
		PanelPrincipal.add(comboBox_TipoEntidad);

		JSeparator separator = new JSeparator();
		separator.setBounds(30, 400, 425, 5);
		PanelPrincipal.add(separator);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(30, 470, 425, 5);
		PanelPrincipal.add(separator_1);

		btn_Crear = new JButton("A\u00F1adir Solicitud");
		btn_Crear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_Crear.setBounds(143, 420, 200, 30);
		btn_Crear.addActionListener(this);
		PanelPrincipal.add(btn_Crear);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn_Crear) {

			Solicitudes miSolicitud = new SolicitudesEstatales(txt_ID.getText(), txt_Solicitante.getText(),
					comboBox_Marca.getSelectedItem().toString(), comboBox_TipoPago.getSelectedItem().toString(),
					Integer.parseInt(spinner_CantPC.getValue().toString()),
					Double.parseDouble(spinner_PesoMax.getValue().toString()),
					Double.parseDouble(spinner_PesoMin.getValue().toString()),
					comboBox_TipoEntidad.getSelectedItem().toString());
			miLista.Adicionar(miSolicitud);
			this.dispose();
		}
	}
}