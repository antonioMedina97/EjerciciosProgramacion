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
	
		this.setBounds(0, 0, WIDTH, HEIGHT);
		
		this.setContentPane(getPanelPrincipal());
		this.setVisible(true);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public JPanel getPanelPrincipal() {
		JPanel pnl = new JPanel();
		pnl.setBackground(Color.cyan);
		
		pnl.setLayout(new BoxLayout(pnl, BoxLayout.Y_AXIS));
		
		//Nombre
		JPanel pnlNombre = new JPanel();
		pnlNombre.add(new JLabel("Nombre de usuario:"));
		pnlNombre.add(new JTextField(40));
		pnl.add(pnlNombre);
		
		return pnl;
		
	}

	public static void main(String[] args) {
		Main e = new Main();
	}

}
