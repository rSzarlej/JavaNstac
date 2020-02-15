
public class GrzybNiejadalny implements Grzyb{
		public void setName(String name) {this.name = name;};
		public void setGenus(String name){this.genus = name;};
		public void setCommonnames(String names){this.commonnames = names;};
		public void setPicture(String link){this.linkToPicture = link;};
		public void setAdditionalInfo(String info){this.info = info;};
		
		public String getName() {return name;};
		public String getGenus() {return genus;};
		public String getCommonnames() {return commonnames;};
		public String getPicture() {return linkToPicture;};
		public String getAdditionalInfo() {return info;};
		public String getToxic() {return "Niejadalny";};
		
		String name, genus, commonnames, linkToPicture, info;
}
