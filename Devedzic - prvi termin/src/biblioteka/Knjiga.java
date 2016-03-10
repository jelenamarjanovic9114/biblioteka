package biblioteka;

import java.util.LinkedList;

//prvo treba add to index 
//pa onda commit

public class Knjiga {
	private String naslov;
	private long isbn;
	private LinkedList<Autor> autor;
	private int brojStrana;
	private String izdavac;
	private String izdanje;
	private int godinaIzdavanja;
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public long getIsbn() {
		return isbn;
	}
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	public LinkedList<Autor> getAutor() {
		return autor;
	}
	public void setAutor(LinkedList<Autor> autor) {
		this.autor = autor;
	}
	public int getBrojStrana() {
		return brojStrana;
	}
	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public String getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(String izdanje) {
		this.izdanje = izdanje;
	}
	public int getGodinaIzdavanja() {
		return godinaIzdavanja;
	}
	public void setGodinaIzdavanja(int godinaIzdavanja) {
		this.godinaIzdavanja = godinaIzdavanja;
	}
	
	
	
}
