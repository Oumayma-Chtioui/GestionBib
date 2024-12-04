package stock;
enum GenreM{Fiction,Tech,Sports,News}
public class Magazine extends Article {
	String publisher;
	GenreM genre;
	public Magazine(String t, String r, int d, String publisher, GenreM genre) {
		super(t,r,d);
		this.genre=genre;
		this.publisher=publisher;
	}
	public Magazine(String t, String r, float p, String publisher, GenreM genre) {
		super(t,r,p);
		this.genre=genre;
		this.publisher=publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	public GenreM getGenre() {
		return genre;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	public void setGenre(GenreM genre) {
		this.genre=genre;
	}
	public String toString() {
		String s="Title: "+title+", Publisher: "+publisher+", Genre: "+genre;
		return s;
	}
}
