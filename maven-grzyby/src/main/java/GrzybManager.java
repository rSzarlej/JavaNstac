import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Vector;

import javax.print.DocFlavor.URL;
import javax.swing.JOptionPane;

public class GrzybManager {
	
	private int currentIndex;	
	private Vector<Grzyb> grzyby;
	
	public GrzybManager() {
		grzyby = new Vector<Grzyb>();
		currentIndex = -1;
		
//		this.loadAll();
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
		
//		saveAll();
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
	
	
//	public void saveAll() {	
//		File file = new File("D:\\test.txt");
//        FileWriter fr = null;
//        BufferedWriter br = null;
//        try{
//            fr = new FileWriter(file);
//            br = new BufferedWriter(fr);
//            
//            for(int i = 0; i<grzyby.size(); i++){
//            	
//            	Grzyb tmp = grzyby.elementAt(i);
//            	
//            	String tmpString = tmp.getName()+System.getProperty("line.separator");
//                br.write(tmpString);
//                
//                tmpString = tmp.getGenus() +System.getProperty("line.separator");
//                br.write(tmpString);
//                
//                tmpString = tmp.getCommonnames() +System.getProperty("line.separator");
//                br.write(tmpString); 
//                
//                tmpString = tmp.getToxic() +System.getProperty("line.separator");
//                br.write(tmpString);
//                
//                tmpString = tmp.getPicture() +System.getProperty("line.separator");
//                br.write(tmpString);
//                
//                tmpString = tmp.getAdditionalInfo() +System.getProperty("line.separator");
//                br.write(tmpString);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                br.close();
//                fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//		
//	}
//	
//	public void loadAll() {
//		File file = new File("D:\\test.txt");
//		FileReader fr=null; 
//		BufferedReader br=null;
//		String line;  
//		String name, genus, commonnames, toxic, picture, additionalinfo;
//		
//		try{
//			fr=new FileReader(file);
//			br=new BufferedReader(fr);
//			
//			while((line=br.readLine())!=null)  
//			{  
//				name = line;
//			
//				line=br.readLine();
//				genus = line;
//			
//				line=br.readLine();
//				commonnames = line;
//			
//				line=br.readLine();
//				toxic = line;
//					
//				line=br.readLine();
//				picture = line;
//				
//				line=br.readLine();
//				additionalinfo = line;
//				
//				Grzyb nowy;
//				
//				if(toxic == "Jadalny")
//					nowy = new GrzybJadalny();
//				else if(toxic == "Niejadalny")
//					nowy = new GrzybNiejadalny();
//				else
//					nowy = new GrzybTrujacy();
//				
//				nowy.setAdditionalInfo(additionalinfo);
//				nowy.setCommonnames(commonnames);
//				nowy.setGenus(genus);
//				nowy.setName(name);
//				nowy.setPicture(picture);
//				
//				
//				grzyby.add(nowy);
//				
//				if(currentIndex == -1)
//					currentIndex = 0;
//			
//			}  
//		}catch (IOException e) {
//            e.printStackTrace();
//        }finally{
//            try {
//                br.close();
//                fr.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }	
//	}

}
