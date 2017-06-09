package coches;

public class coche {
	String matricula;
	String color;
	int año;
	public coche(){
		this.matricula=matricula;
		this.color=color;
		this.año=año;
	}
	public coche(String matricula, String color, int año){
		this.matricula=matricula;
		this.color=color;
		this.año=año;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
}
