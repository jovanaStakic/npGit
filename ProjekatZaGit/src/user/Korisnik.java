package user;

public class Korisnik {
	String ime;
	String prezime;
	int brojGodina;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getBrojGodina() {
		return brojGodina;
	}
	public void setBrojGodina(int brojGodina) {
		this.brojGodina = brojGodina;
	}
	@Override
	public String toString() {
		return "Korisnik [ime=" + ime + ", prezime=" + prezime + ", brojGodina=" + brojGodina + "]";
	}
	
	
}
