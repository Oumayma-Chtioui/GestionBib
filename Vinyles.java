package stock;
enum GenreV{Rock, Pop, Jazz, Classique, Métal}
public class Vinyles extends Article{
	private GenreV genre;
	private String singer;
	public Vinyles(String t, String r, int d,GenreV genre,String singer){
		super(t,r,d);
		this.genre=genre;
		this.singer=singer;
	}
	public Vinyles(String t, String r, float p,GenreV genre,String singer){
		super(t,r,p);
		this.genre=genre;
		this.singer=singer;
	}
	public String getSinger() {
		return singer;
	}
	public GenreV getGenre() {
		return genre;
	}
	public void setSinger(String singer) {
		this.singer=singer;
	}
	public void setGenre(GenreV genre) {
		this.genre=genre;
	}
	public String toString() {
		String s="Album: "+title+", Singer: "+singer+", Genre: "+genre;
		return s;
	}
}
