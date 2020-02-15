
public interface Grzyb {
	public void setName(String name);
	public void setGenus(String name);
	public void setCommonnames(String names);
	public void setPicture(String link);
	public void setAdditionalInfo(String info);
	
	public String getName();
	public String getGenus();
	public String getCommonnames();
	public String getPicture();
	public String getAdditionalInfo();
	public String getToxic();

}
