package stock;

public class Element {
	Article article;
	int quantite;
	public Element(Article article, int q) {
		this.article=article;
		quantite=q;
	}
	public Element(String t, String r,int d, int quantite, Article article){
		this.article=article;
		this.quantite=quantite;
		this.article =new Article(t,r,d);
	}
	public Element(String t, String r, float p, int quantite, Article article){
		this.article=article;
		this.quantite=quantite;
		this.article =new Article(t,r,p);
	}
	public Article getArticle() {
		return article;
	}
	public long getQuantite() {
		return quantite;
	}
	public String getReferenceArticle() {
		return (article.getReference());
	}
	public String getNomArticle() {
		return (article.getTitle());
	}
	public double getPrixArticle() {
		return (article.getPrix());
	}
	public Article setArticle(Article article) {
		this.article=article;
		return article;
	}
	public int setQuantite(int quantite) {
		this.quantite=quantite;
		return quantite;
	}
	public int incrementerQuantite(int q) {
		quantite=quantite+q;
		return quantite;
	}
	public void decrementerQuantite(int q) {
		quantite=quantite-q;
		if(quantite<0) {
			System.out.println("quantite inférieur à zéro!");
		}
	}
	public String toString() {
		String s;
		s="Article: "+getNomArticle()+", Reference: "+getReferenceArticle()+", Prix: "+getPrixArticle()+", Quantite: "+getQuantite();
		return s;
	}
	
	
}

	

