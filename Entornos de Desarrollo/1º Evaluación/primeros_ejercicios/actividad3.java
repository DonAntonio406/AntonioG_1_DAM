package primeros_ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.JComboBox;

public class actividad3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					actividad3 frame = new actividad3();
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
	public actividad3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnNewButton_4 = new JButton("UNO");
		btnNewButton_4.setBounds(10, 10, 53, 21);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton = new JButton("DOS");
		btnNewButton.setBounds(10, 41, 53, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("TRES");
		btnNewButton_1.setBounds(10, 72, 57, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("CUATRO");
		btnNewButton_2.setBounds(10, 103, 71, 21);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("CINCO");
		btnNewButton_3.setBounds(10, 134, 63, 21);
		contentPane.add(btnNewButton_3);
	}
}
