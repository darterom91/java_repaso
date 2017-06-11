package supermercado;

import java.util.Scanner;

public class mostrador extends Empleado {
	Scanner s = new Scanner(System.in);
	int vendes;
	double salario;

	public mostrador() {
		this.vendes = vendes;
		this.salario = salario;
	}

	public int getVendes() {
		return vendes;
	}

	public void setVendes(int vendes) {
		this.vendes = vendes;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String lloc() {
		System.out.println("Introduce el lloc donde trabajas:");
		setLloc(s.next());
		return getLloc();
	}

	public String ciutatOrigen() {
		System.out.println("introduce la ciudad: ");
		setCiudad(s.next());
		return getCiudad();
	}

	public double salariDiari() {
		System.out.println("Introduce el vendes: ");
		setVendes(s.nextInt());
		double precio = getVendes() * 1.5;
		return 50 + precio;
	}

	public void Mostrar(){
		setSalario(salariDiari());
		System.out.println("Mostrar mostrador: ");
		System.out.println(getNom());
		System.out.println(getCiudad());
		System.out.println(getLloc());
		System.out.println(getSalario());
	}
}
