import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GrzybMainWindow {

	private JFrame frame;
	private JTextField nameField;
	
	private GrzybManager gMng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrzybMainWindow window = new GrzybMainWindow();
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
	public GrzybMainWindow() {
		initialize();
		
		gMng = new GrzybManager();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {		
		frame = new JFrame();
		frame.setBounds(100, 100, 1031, 821);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JLabel msgLabel = new JLabel("");
		msgLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		msgLabel.setBounds(289, 187, 464, 62);
		frame.getContentPane().add(msgLabel);
		
		JButton helloBtn = new JButton("Click me");
		helloBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String imie = nameField.getText();
				String wiadomosc = "Hello " + imie + " po zmianie";
				msgLabel.setText(wiadomosc);
				
			}
		});
		helloBtn.setFont(new Font("Tahoma", Font.PLAIN, 20));
		helloBtn.setBounds(331, 441, 341, 92);
		frame.getContentPane().add(helloBtn);
		
		JLabel lblNewLabel = new JLabel("Podaj imie:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(289, 283, 464, 47);
		frame.getContentPane().add(lblNewLabel);
		
		nameField = new JTextField();
		nameField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		nameField.setBounds(289, 341, 464, 47);
		frame.getContentPane().add(nameField);
		nameField.setColumns(10);
	}
}
