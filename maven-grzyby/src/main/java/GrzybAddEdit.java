import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;
import javax.swing.DropMode;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class GrzybAddEdit extends JDialog {

	private final JPanel contentPanel = new JPanel();

	
	private GrzybManager mngTmp;
	private JTextField nameField;
	private JTextField rodzinaField;
	private JTextField namesField;
	private JTextField imageField;
	/**
	 * Launch the application.
	 */
	public GrzybAddEdit() {
		initDialog();
	}
	
	public GrzybAddEdit(GrzybManager mng) {//obiekty przesylane przez referencje
		mngTmp = mng;
		initDialog();	
	}
	
	/**
	 * Create the dialog.
	 */
	private void initDialog() {
		final JLabel labelInfo = new JLabel("Przepis na danie:");
		final JComboBox comboBox = new JComboBox();
		final JTextPane infoField = new JTextPane();
		
		setBounds(100, 100, 450, 768);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblNewLabel = new JLabel("Rodzaj:");
			lblNewLabel.setBounds(10, 11, 416, 30);
			contentPanel.add(lblNewLabel);
		}
		{
			comboBox.setBounds(10, 52, 416, 30);
			comboBox.addItem("Jadalny");
			comboBox.addItem("Niejadalny");
			comboBox.addItem("Truj¹cy");
			
			comboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					if(comboBox.getSelectedIndex() == 0) {
						labelInfo.setText("Przepis na danie:");
					}else
						if(comboBox.getSelectedIndex() == 1) {
							labelInfo.setText("Jak rozpoznaæ:");
						}else
							if(comboBox.getSelectedIndex() == 2) {
								labelInfo.setText("Objawy zatrucia:");
							}
				}
			});
			
			contentPanel.add(comboBox);
			
		}
		{
			JLabel lblNazwa = new JLabel("Nazwa:");
			lblNazwa.setBounds(10, 93, 416, 30);
			contentPanel.add(lblNazwa);
		}
		
		nameField = new JTextField();
		nameField.setBounds(10, 134, 416, 30);
		contentPanel.add(nameField);
		nameField.setColumns(10);
		
		JLabel lblRodzina = new JLabel("Rodzina:");
		lblRodzina.setBounds(10, 185, 416, 30);
		contentPanel.add(lblRodzina);
		
		rodzinaField = new JTextField();
		rodzinaField.setColumns(10);
		rodzinaField.setBounds(10, 226, 416, 30);
		contentPanel.add(rodzinaField);
		
		JLabel lblInnePopularneNazwy = new JLabel("Inne popularne nazwy:");
		lblInnePopularneNazwy.setBounds(10, 349, 416, 30);
		contentPanel.add(lblInnePopularneNazwy);
		
		namesField = new JTextField();
		namesField.setColumns(10);
		namesField.setBounds(10, 390, 416, 30);
		contentPanel.add(namesField);
		
		
		labelInfo.setBounds(10, 444, 416, 30);
		contentPanel.add(labelInfo);
		
		
		infoField.setBounds(10, 485, 416, 162);
		contentPanel.add(infoField);
		
		JLabel lblLinkDoZdjcia = new JLabel("Link do zdj\u0119cia:");
		lblLinkDoZdjcia.setBounds(10, 267, 416, 30);
		contentPanel.add(lblLinkDoZdjcia);
		
		imageField = new JTextField();
		imageField.setColumns(10);
		imageField.setBounds(10, 308, 416, 30);
		contentPanel.add(imageField);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						//sprawdzenie poprawnosci informacji
						int type = comboBox.getSelectedIndex();
						String name = nameField.getText();
						String rodzina = rodzinaField.getText();
						String names = namesField.getText();
						String info = infoField.getText();
						String link = imageField.getText();
						
						if(name.isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Brak nazwy!", "Info", JOptionPane.INFORMATION_MESSAGE);
							return;
						}
						
						if(rodzina.isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Brak podanej rodziny!", "Info", JOptionPane.INFORMATION_MESSAGE);
							return;
						}
						
						if(names.isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Brak dodatkowych nazw! Mo¿na wpisaæ: brak", "Info", JOptionPane.INFORMATION_MESSAGE);
							return;
						}
						
						if(info.isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Brak dodatkowych informacji! Mo¿na wpisaæ: brak", "Info", JOptionPane.INFORMATION_MESSAGE);
							return;
						}
						
						if(link.isEmpty())
						{
							JOptionPane.showMessageDialog(null, "Brak zdjêcia!", "Info", JOptionPane.INFORMATION_MESSAGE);
							return;
						}
						
//						Grzyb nowy;
//						
//						if(type == 0)
//							nowy = new GrzybJadalny();
//						else if(type == 1)
//							nowy = new GrzybNiejadalny();
//						else
//							nowy = new GrzybTrujacy();
//						
//						nowy.setAdditionalInfo(info);
//						nowy.setCommonnames(names);
//						nowy.setGenus(rodzina);
//						nowy.setName(name);
//						nowy.setPicture(link);
						
						mngTmp.add(name, rodzina, names, info, link, type);
						
						dispose();
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
