package supermercado;

import java.util.Scanner;

public class cajero extends Empleado {
	Scanner s = new Scanner(System.in); 
	int horas;
	double salario;
	public cajero() {
		this.s=s;
		this.horas=horas;
		this.salario=salario;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	

	@Override
	public String lloc() {
		System.out.println("Introduce el lloc: ");
		setLloc(s.next());
		return getLloc();
	}

	@Override
	public String ciutatOrigen() {
		System.out.println("Introduce el Ciudad: ");
		setCiudad(s.next());
		return getCiudad();
	}

	public double salariDiari() {
		System.out.println("Introduce el Horas: ");
		setHoras(s.nextInt());
		return 	getHoras()*15;

	}
	public void Mostrar(){
		setSalario(salariDiari());
		System.out.println("Mostrar cajero: ");
		System.out.println(getNom());
		System.out.println(getCiudad());
		System.out.println(getLloc());
		System.out.println(getSalario());
	}
}
