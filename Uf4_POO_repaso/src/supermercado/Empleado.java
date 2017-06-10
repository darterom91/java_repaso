package supermercado;

public abstract class Empleado {
	String nom;
	String ciudad;
	String lloc;

	public Empleado() {
		this.nom=nom;
		this.ciudad=ciudad;
		this.lloc=lloc;		
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getLloc() {
		return lloc;
	}

	public void setLloc(String lloc) {
		this.lloc = lloc;
	}

	public String lloc(){
		return "";	
	}
	public String ciutatOrigen(){
		return "";	
	}
	public double salariDiari(){
	return 0;
	}
}
