import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;

public class GrzybMainWindow {

	private JFrame frmKatalogGrzybw;
	
	private GrzybManager gMng;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GrzybMainWindow window = new GrzybMainWindow();
					window.frmKatalogGrzybw.setVisible(true);
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
		frmKatalogGrzybw = new JFrame();
		frmKatalogGrzybw.setResizable(false);
		frmKatalogGrzybw.setTitle("Katalog grzyb\u00F3w");
		frmKatalogGrzybw.setBounds(100, 100, 1020, 600);
		frmKatalogGrzybw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmKatalogGrzybw.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nazwa:");
		lblNewLabel.setBounds(500, 30, 500, 30);
		frmKatalogGrzybw.getContentPane().add(lblNewLabel);
		
		JLabel lblRodzina = new JLabel("Rodzina:");
		lblRodzina.setBounds(500, 120, 500, 30);
		frmKatalogGrzybw.getContentPane().add(lblRodzina);
		
		JLabel lblPopularneNazwy = new JLabel("Popularne nazwy:");
		lblPopularneNazwy.setBounds(500, 210, 500, 30);
		frmKatalogGrzybw.getContentPane().add(lblPopularneNazwy);
		
		JLabel lblDodatkoweInfo = new JLabel("Dodatkowe info:");
		lblDodatkoweInfo.setBounds(500, 290, 500, 30);
		frmKatalogGrzybw.getContentPane().add(lblDodatkoweInfo);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(500, 70, 500, 30);
		frmKatalogGrzybw.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(500, 160, 500, 30);
		frmKatalogGrzybw.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(500, 240, 500, 30);
		frmKatalogGrzybw.getContentPane().add(textField_2);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(500, 330, 500, 150);
		frmKatalogGrzybw.getContentPane().add(textArea);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 30, 450, 392);
		frmKatalogGrzybw.getContentPane().add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(20, 443, 450, 37);
		frmKatalogGrzybw.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Nast\u0119pny");
		btnNewButton.setBounds(766, 525, 140, 23);
		frmKatalogGrzybw.getContentPane().add(btnNewButton);
		
		JButton btnPoprzedni = new JButton("Poprzedni");
		btnPoprzedni.setBounds(616, 525, 140, 23);
		frmKatalogGrzybw.getContentPane().add(btnPoprzedni);
		
		JButton btnEdytuj = new JButton("Edytuj");
		btnEdytuj.setBounds(282, 525, 89, 23);
		frmKatalogGrzybw.getContentPane().add(btnEdytuj);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.setBounds(84, 525, 89, 23);
		frmKatalogGrzybw.getContentPane().add(btnDodaj);
		
		JButton btnUsu = new JButton("Usu\u0144");
		btnUsu.setBounds(183, 525, 89, 23);
		frmKatalogGrzybw.getContentPane().add(btnUsu);
	}
}
