package supermercado;

import java.util.Scanner;

public class neteja extends Empleado{
	Scanner s = new Scanner(System.in);
	double salario;
	int dias;
	public neteja() {
		super();
		this.salario=salario;
		this.dias=dias;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}

	public String lloc() {
		System.out.println("Introduce el lloc: ");
		setLloc(s.next());
		return getLloc();
	}
	
	public String ciutatOrigen() {
		System.out.println("Introduce el Ciudad: ");
		setCiudad(s.next());
		return getCiudad();
	}

	public double salariDiari() {
		System.out.println("Introduce el dias: ");
		setDias(s.nextInt());
		return 	getDias()*15;
	}
	
	public void Mostrar(){
		setSalario(salariDiari());
		System.out.println("Mostrar neteja: ");
		System.out.println(getNom());
		System.out.println(getCiudad());
		System.out.println(getLloc());
		System.out.println(getSalario());
	}
}
