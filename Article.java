package stock;

public class Article {
	String title;
	String reference;
	float prix;
	int duree;
	public Article(String t, String r, float p) {
		title=t;
		reference=r;
		prix=p;
	}
	public Article(String ref,String title, int duree) {
		reference=ref;
		this.title=title;
		this.duree=duree;
	}
	/*public String genererReference(String nom,int id) {
		String reference="";
		for(int i=0;i<nom.length();i++) {
			if(nom.charAt(i)!=' ') {
				reference=reference+nom.charAt(i);
			}
		}
		reference=reference+id;
		return reference;
	}*/
	public String getTitle() {
		return title;
	}
	public String getReference() {
		return reference;
	}
	public float getPrix() {
		return prix;
	}
	public void setTitle(String t) {
		title=t;
	}
	public void setReference(String ref) {
		reference=ref;
	}
	public void setPrix(float p) {
		prix=p;
	}
	
	
}	
