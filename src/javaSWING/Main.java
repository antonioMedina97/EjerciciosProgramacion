package javaSWING;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Main extends JFrame{
	
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	
	
	public Main() {
		//Creating the window
		super("Datos del usuario");
		
	
		this.setBounds(0, 0, WIDTH, HEIGHT);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));	
		//adding items
		
		//NAME
		JPanel panelNombre = new JPanel();
		panelNombre.add(new JLabel("Nombre"));
		JTextField txtfld = new JTextField();
		txtfld.setPreferredSize(new Dimension(100, 24));
		panelNombre.add(txtfld);
		this.add(panelNombre);
		
		//SURNAME 1
		JPanel panelAp1 = new JPanel();
		panelAp1.add(new JLabel("Apellido 1"));
		JTextField txtAp1 = new JTextField();
		txtAp1.setPreferredSize(new Dimension(100, 24));
		panelNombre.add(txtAp1);
		this.add(panelAp1);
		
		//SURNAME 2
		JPanel panelAp2 = new JPanel();
		panelAp2.add(new JLabel("Apellido 2"));
		JTextField txtAp2 = new JTextField();
		txtAp2.setPreferredSize(new Dimension(100, 24));
		panelAp2.add(txtAp2);
		this.add(panelAp2);
		
		//ID
		JPanel panelID = new JPanel();
		panelID.add(new JLabel("DNI"));
		JTextField txtID = new JTextField();
		txtID.setPreferredSize(new Dimension(100, 24));
		panelID.add(txtID);
		this.add(panelID);

		//LOCALIDAD
		JPanel panelLocalidad = new JPanel();
		panelLocalidad.add(new JLabel("Localidad"));
		JTextField txtLcd = new JTextField();
		txtLcd.setPreferredSize(new Dimension(100, 24));
		panelLocalidad.add(txtLcd);
		this.add(panelLocalidad);
		
		//Button
		this.add(new JButton("Enviar"));
	}

	public static void main(String[] args) {
		Main e = new Main();
	}

}
