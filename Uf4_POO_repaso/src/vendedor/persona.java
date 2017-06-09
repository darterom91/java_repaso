package vendedor;
import java.util.Scanner;

public class persona {
	Scanner s = new Scanner(System.in);
	String dni;
	String nombre;
	String apellido;
	String sexo;
	int edad;
	public persona(){
		
	}
	
	public persona(String dni, String nombre, String apellido, String sexo, int edad){
		this.dni=dni;
		this.nombre=nombre;
		this.apellido=apellido;
		this.sexo=sexo;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void introduceDatos(){
		System.out.println("Seleciona tu dni: ");
		setDni(s.next());
		System.out.println("Seleciona tu Nombre ");
		setNombre(s.next());
		System.out.println("Seleciona tu apellido ");
		setApellido(s.next());
		System.out.println("Seleciona tu sexo ");
		setSexo(s.next());
		System.out.println("Seleciona tu edad: ");
		setEdad(s.nextInt());
		
	}
	
}
