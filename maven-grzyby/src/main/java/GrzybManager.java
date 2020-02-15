import java.util.Vector;

import javax.swing.JOptionPane;

public class GrzybManager {
	public GrzybManager() {
		grzyby = new Vector<Grzyb>();
		currentIndex = -1;
	}
	
	private boolean exists(String name) {
		for(int i=0; i<grzyby.size(); i++)
			if(grzyby.get(i).getName() == name)
				return true;
		
		return false;
	}
	
	public void add(String name, String genus, String names, String addInfo, String link, int type) {
		
		if(exists(name))
		{
			JOptionPane.showMessageDialog(null, "Podany grzyb ju¿ istnieje!", "Info", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		Grzyb nowy;
		
		if(type == 0)
			nowy = new GrzybJadalny();
		else if(type == 1)
			nowy = new GrzybNiejadalny();
		else
			nowy = new GrzybTrujacy();
		
		nowy.setAdditionalInfo(addInfo);
		nowy.setCommonnames(names);
		nowy.setGenus(genus);
		nowy.setName(name);
		nowy.setPicture(link);
		
		
		grzyby.add(nowy);
		
		if(currentIndex == -1)
			currentIndex = 0;
	}
	
	public void remove() {
		if(currentIndex == -1)
			return;
		
		grzyby.remove(currentIndex);
		
		if(grzyby.size()>0)
			currentIndex = 0;
		else
			currentIndex = -1;
	}
	
	public Grzyb getGrzyb(int index) {
		return grzyby.get(index);
	}
	
	public void edit(String name, String genus, String names, String addInfo, String link, int type) {
		if(currentIndex == -1)
			return;
		
		if(exists(name))
		{
			JOptionPane.showMessageDialog(null, "Podany grzyb ju¿ istnieje!", "Info", JOptionPane.INFORMATION_MESSAGE);
			return;
		}
		
		grzyby.remove(currentIndex);
		
		Grzyb nowy;
		
		if(type == 0)
			nowy = new GrzybJadalny();
		else if(type == 1)
			nowy = new GrzybNiejadalny();
		else
			nowy = new GrzybTrujacy();
		
		nowy.setAdditionalInfo(addInfo);
		nowy.setCommonnames(names);
		nowy.setGenus(genus);
		nowy.setName(name);
		nowy.setPicture(link);
		
		grzyby.add(currentIndex, nowy);
	}
	
	public Grzyb getNext() {
		if(currentIndex == -1)
			return null;
		
		if(currentIndex<grzyby.size()-1)
			currentIndex+=1;
		else
			currentIndex=0;
		
		return grzyby.get(currentIndex);
	}
	
	public Grzyb getPrev() {
		if(currentIndex == -1)
			return null;
		
		if(currentIndex>0)
			currentIndex-=1;
		else
			currentIndex=grzyby.size()-1;
		
		return grzyby.get(currentIndex);
	}
	
	public Grzyb getCurrent() {
		if(currentIndex == -1)
			return null;
		
		return grzyby.get(currentIndex);
	}
	
	
	int currentIndex;
	
	Vector<Grzyb> grzyby;

}
