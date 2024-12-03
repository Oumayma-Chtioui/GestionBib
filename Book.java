package stock;
enum GenreB{Fiction,NonFiction, Poésie, BD, Enfant}
public class Book extends Article{
	String author;
	GenreB genre;
	
	public Book(String  author, GenreB genre, String t, String r, float p) {
		super(t,r,p);
		this.author=author;
		this.genre=genre;
	}
	public String getAuthor() {
		return author;
	}
	public GenreB getGenre() {
		return genre;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public void setGenre(GenreB genre) {
		this.genre=genre;
	}
	public String toString() {
		String s="Title: "+title+", Author: "+author+", Genre: "+genre;
		return s;
	}
}
