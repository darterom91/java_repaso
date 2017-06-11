package ArrayCliente;

import java.util.ArrayList;
import java.util.Scanner;

public class cliente {
	ArrayList cli = new ArrayList();
	String dni;
	String nombre;
	int edad;
	public cliente(String dni, String nombre, int edad){
		this.dni=dni;
		this.nombre=nombre;
		this.edad=edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void intDatos(){	
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el dni: ");
		setDni(s.nextLine());
		System.out.println("Introduce el nombre: ");
		setNombre(s.nextLine());
		System.out.println("Introduce el edad: ");
		setEdad(s.nextInt());
	}
	public String toString(){
		return "DNI: "+getDni()+" Nombre: "+getNombre()+" Edad: "+getEdad()+"\n";
		
	}
}
