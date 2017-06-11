package Ejercicio1;

public class Producto {
	int count;
	
	int cod;
	String nom;
	String tipus;
	double preu;
	int stock;

	public Producto() {
		this.cod = cod;
		this.nom = nom;
		this.tipus = tipus;
		this.preu = preu;
		this.stock = stock;
	}
	
	public Producto(int cod, String nom, String tipus, double preu, int stock) {
		this.cod = cod;
		this.nom = nom;
		this.tipus = tipus;
		this.preu = preu;
		this.stock = stock;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getTipus() {
		return tipus;
	}

	public void setTipus(String tipus) {
		this.tipus = tipus;
	}

	public double getPreu() {
		return preu;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String toString() {
		return "Codi: " + getCod() + " Nombre: " + getNom() + " Tipus: " + getTipus() + " Preu: " + getPreu()+" Stock: "+getStock()+"\n\n";
		
	}
}
