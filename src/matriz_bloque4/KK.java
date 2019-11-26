package matriz_bloque4;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class KK {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KK window = new KK();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public KK() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnBotonA = new JButton("Boton A");
		btnBotonA.setBounds(12, 13, 97, 25);
		frame.getContentPane().add(btnBotonA);
		
		JButton btnBotonB = new JButton("Boton B");
		btnBotonB.setBounds(323, 13, 97, 25);
		frame.getContentPane().add(btnBotonB);
		
		JButton btnBotonC = new JButton("Boton C");
		btnBotonC.setBounds(12, 215, 97, 25);
		frame.getContentPane().add(btnBotonC);
		
		JButton btnBotonD = new JButton("Boton D");
		btnBotonD.setBounds(323, 215, 97, 25);
		frame.getContentPane().add(btnBotonD);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(110, 38, 211, 179);
		frame.getContentPane().add(textPane);
	}
}
