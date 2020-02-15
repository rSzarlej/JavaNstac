import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class GrzybMainWindow {

	private JFrame frmKatalogGrzybw;
	
	private GrzybManager gMng;
	private JTextField nameField;
	private JTextField genusField;
	private JTextField namesField;
	private JLabel typeField;
	private JPanel panel;
	private JLabel infoLabel;
	private JTextPane infoFIeld;
	
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
		
		GrzybInitBase tmp = new GrzybInitBase(gMng);
		tmp.initBase();
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
			infoFIeld.setText("brak");
			typeField.setText("brak");
			
			infoLabel.setText("Dodatkowe info:");
			
			Image image = null;
		    try {
		    	URL url = GrzybMainWindow.class.getResource("no_image.jpg");
		        image = ImageIO.read(url);
		    } catch (MalformedURLException ex) {
		        System.out.println("Malformed URL");
		    } catch (IOException iox) {
		        System.out.println("Can not load file");
		    }
		    JLabel labelTmp = new JLabel(new ImageIcon(image));
		    panel.add(labelTmp, BorderLayout.CENTER);
		    
		}else
		{
			nameField.setText(tmp.getName());
			genusField.setText(tmp.getGenus());
			namesField.setText(tmp.getCommonnames());
			infoFIeld.setText(tmp.getAdditionalInfo());
			typeField.setText(tmp.getToxic());	
			
			
			panel.removeAll();
			Image image = null;
		    URL url = null;
		    
		    boolean error = false;
		    try {
		        url = new URL(tmp.getPicture());
		        image = ImageIO.read(url);
		    } catch (MalformedURLException ex) {
		        System.out.println("Malformed URL");
		        error = true;
		    } catch (IOException iox) {
		        System.out.println("Can not load file");
		        error = true;
		    }
		    
		    if(error)
		    {
		    	 try {
		    		 	url = GrzybMainWindow.class.getResource("no_image.jpg"); 
				        image = ImageIO.read(url);
				    } catch (MalformedURLException ex) {
				        System.out.println("Malformed URL");
				    } catch (IOException iox) {
				        System.out.println("Can not load file");
				        error = true;
				    }    	
		    }
		    
		    JLabel labelTmp = new JLabel(new ImageIcon(image));
		    panel.add(labelTmp, BorderLayout.CENTER);
		    
		    if(tmp.getToxic() == "Jadalny")
		    	infoLabel.setText("Przepis na danie:");
		    else if(tmp.getToxic() == "Niejadalny")
		    	infoLabel.setText("Jak rozpoznaæ:");
		    else 
		    	infoLabel.setText("Objawy zatrucia:");
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
		
		infoLabel = new JLabel("Dodatkowe info:");
		infoLabel.setBounds(500, 290, 500, 30);
		frmKatalogGrzybw.getContentPane().add(infoLabel);
		
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
		
		panel = new JPanel();
		panel.setBounds(20, 30, 450, 392);
		frmKatalogGrzybw.getContentPane().add(panel);
		panel.setLayout(new BorderLayout());
		
		
		typeField = new JLabel("Brak");
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
		btnEdytuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GrzybAddEdit dialog = new GrzybAddEdit(gMng, true);
					dialog.setTitle("Edytuj grzyba");
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception eee) {
					eee.printStackTrace();
				}
			}
		});
		btnEdytuj.setBounds(282, 525, 89, 23);
		frmKatalogGrzybw.getContentPane().add(btnEdytuj);
		
		JButton btnDodaj = new JButton("Dodaj");
		btnDodaj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GrzybAddEdit dialog = new GrzybAddEdit(gMng, false);
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
		
		infoFIeld = new JTextPane();
		infoFIeld.setBounds(500, 330, 500, 150);
		frmKatalogGrzybw.getContentPane().add(infoFIeld);
	}
}
