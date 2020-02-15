import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class GrzybMainWindow {

	private JFrame frmKatalogGrzybw;
	
	private GrzybManager gMng;
	private JTextField nameField;
	private JTextField genusField;
	private JTextField namesField;
	private JTextPane infoField;
	private JLabel typeField;
	
	private enum WW{
		WW_Prev,
		WW_Next,
		WW_Curr
	}

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

	private void updateDialog(WW whichWay) {
		Grzyb tmp = null;
		
		if(whichWay == WW.WW_Prev)
			tmp = gMng.getPrev();
		else if (whichWay == WW.WW_Next)
			tmp = gMng.getNext();
		else if(whichWay == WW.WW_Curr)
			tmp = gMng.getCurrent();
		
		if(tmp == null) 
		{
			nameField.setText("brak");
			genusField.setText("brak");
			namesField.setText("brak");
			infoField.setText("brak");
			typeField.setText("brak");
		}else
		{
			nameField.setText(tmp.getName());
			genusField.setText(tmp.getGenus());
			namesField.setText(tmp.getCommonnames());
			infoField.setText(tmp.getAdditionalInfo());
			typeField.setText(tmp.getToxic());		
		}
		
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
		
		nameField = new JTextField();
		nameField.setEditable(false);
		nameField.setBounds(500, 70, 500, 30);
		frmKatalogGrzybw.getContentPane().add(nameField);
		nameField.setColumns(10);
		
		genusField = new JTextField();
		genusField.setEditable(false);
		genusField.setColumns(10);
		genusField.setBounds(500, 160, 500, 30);
		frmKatalogGrzybw.getContentPane().add(genusField);
		
		namesField = new JTextField();
		namesField.setEditable(false);
		namesField.setColumns(10);
		namesField.setBounds(500, 240, 500, 30);
		frmKatalogGrzybw.getContentPane().add(namesField);
		
		JPanel panel = new JPanel();
		panel.setBounds(20, 30, 450, 392);
		frmKatalogGrzybw.getContentPane().add(panel);
		
		typeField = new JLabel("New label");
		typeField.setHorizontalAlignment(SwingConstants.CENTER);
		typeField.setForeground(Color.RED);
		typeField.setBackground(Color.WHITE);
		typeField.setFont(new Font("Tahoma", Font.BOLD, 20));
		typeField.setBounds(20, 443, 450, 37);
		frmKatalogGrzybw.getContentPane().add(typeField);
		
		JButton btnNewButton = new JButton("Nast\u0119pny");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateDialog(WW.WW_Next);				
			}
		});
		btnNewButton.setBounds(766, 525, 140, 23);
		frmKatalogGrzybw.getContentPane().add(btnNewButton);
		
		JButton btnPoprzedni = new JButton("Poprzedni");
		btnPoprzedni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				updateDialog(WW.WW_Prev);
			}
		});
		btnPoprzedni.setBounds(616, 525, 140, 23);
		frmKatalogGrzybw.getContentPane().add(btnPoprzedni);
		
		JButton btnEdytuj = new JButton("Edytuj");
		btnEdytuj.setBounds(282, 525, 89, 23);
		frmKatalogGrzybw.getContentPane().add(btnEdytuj);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GrzybAddEdit dialog = new GrzybAddEdit(gMng);
					dialog.setTitle("Dodaj grzyba");
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception eee) {
					eee.printStackTrace();
				}
			}
		});
		btnDodaj.setBounds(84, 525, 89, 23);
		frmKatalogGrzybw.getContentPane().add(btnDodaj);
		
		JButton btnUsu = new JButton("Usu\u0144");
		btnUsu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gMng.remove();
				updateDialog(WW.WW_Curr);
			}
		});
		btnUsu.setBounds(183, 525, 89, 23);
		frmKatalogGrzybw.getContentPane().add(btnUsu);
		
		infoField = new JTextPane();
		infoField.setEditable(false);
		infoField.setBounds(500, 330, 500, 150);
		frmKatalogGrzybw.getContentPane().add(infoField);
	}
}
