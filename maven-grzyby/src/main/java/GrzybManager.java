import java.util.Vector;

public class GrzybManager {
	public GrzybManager() {
		grzyby = new Vector<Grzyb>();
	}
	
	public void add(Grzyb e) {
		grzyby.add(e);
	}
	
	public void remove(int index) {
		grzyby.remove(index);
	}
	
	public Grzyb getGrzyb(int index) {
		return grzyby.get(index);
	}
	
	public void edit(int index, Grzyb e) {
		grzyby.remove(index);
		grzyby.add(index, e);
	}
	
	
	Vector<Grzyb> grzyby;

}
