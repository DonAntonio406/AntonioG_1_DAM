package primeros_ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Panel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class actividad5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad5 frame = new actividad5();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public actividad5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 943, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(new Color(128, 0, 255));
		panel_1.setBounds(0, 0, 680, 408);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(216, 176, 255));
		textField.setBounds(185, 107, 259, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(216, 176, 255));
		passwordField.setBounds(185, 202, 259, 32);
		panel_1.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario");
		lblNewLabel_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_1.setBounds(185, 84, 106, 13);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Contraseña");
		lblNewLabel_1_1.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(185, 179, 106, 13);
		panel_1.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(64, 0, 128));
		btnNewButton.setBounds(270, 308, 85, 21);
		panel_1.add(btnNewButton);
		
		
		// Añadiendo el ActionListener al botón
	    btnNewButton.addActionListener(e -> {
	        String usuario = textField.getText();
	        String contraseña = new String(passwordField.getPassword());

	        if (usuario.equals("sara") && contraseña.equals("123")) {
	            System.out.println ("Usuario y contraseña correctos");
	        } else {
	        	System.out.println("Intentelo de nuevo");
	        }
	    });
		
		Panel panel = new Panel();
		panel.setBounds(676, 0, 253, 408);
		panel.setBackground(new Color(64, 0, 128));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(26, 104, 200, 200);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Sara\\Desktop\\295128.png"));
	}
}
