package coches;

import java.util.Scanner;

public class motor extends marca {
	Scanner s = new Scanner(System.in);
	String tipo_motor;
	int km;
	double Deposito;
	double cv;
	
	public motor(){
		super();
		this.tipo_motor=tipo_motor;
		this.Deposito=Deposito;
		this.km=km;
		this.cv=cv;
	}
	
	public String getTipo_motor() {
		return tipo_motor;
	}

	public void setTipo_motor(String tipo_motor) {
		this.tipo_motor = tipo_motor;
	}

	public double getDeposito() {
		return Deposito;
	}

	public void setDeposito(double deposito) {
		Deposito = deposito;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getCv() {
		return cv;
	}

	public void setCv(double cv) {
		this.cv = cv;
	}

	public void seleccionMotor(){
		int opcion;
		do{
			System.out.println("menu de motor:\n1- gasolina\n2- diesel\n3- electrico\n4- hibrido\n5- salir");
			opcion=s.nextInt();
			
			switch(opcion){
			case 1:
				System.out.println("Motor Gasolina");
				setTipo_motor("Gasolina");
				break;
			case 2:
				System.out.println("Motor Diesel");
				setTipo_motor("Diesel");
				break;
			case 3:
				System.out.println("Motor Electrico");
				setTipo_motor("Electrico");
				break;
			case 4:
				System.out.println("Motor Hibrido");
				setTipo_motor("Hibrido");
				break;
			case 5:
				System.out.println("Motor Salir");
				break;
			default:
				System.out.println("Error esa opcion no existe.");
				break;	
			}		
		}while(opcion!=5);
	}
	public void introducirDatos(){
		System.out.println("Introduce los valores\n----------- --- -------");
		System.out.println("\nIntroduce la matricula: ");
		setMatricula(s.next());
		System.out.println("\nIntroduce el color: ");
		setColor(s.next());
		System.out.println("\nIntroduce el año: ");
		setAño(s.nextInt());	
		
		System.out.println("\nIntroduce la marca: ");
		setMarca(s.next());
		System.out.println("\nIntroduce el modelo: ");
		setModelo(s.next());
		System.out.println("\nIntroduce el garantia: ");
		setGarantia(s.nextInt());
		System.out.println("\nIntroduce la precio: ");
		setPrecio(s.nextInt());
		
		seleccionMotor();
		
		System.out.println("Introduce los deposito:");
		setDeposito(s.nextDouble());
		System.out.println("Introduce los km:");
		setKm(s.nextInt());
		System.out.println("Introduce los cv:");
		setCv(s.nextDouble());
	}
	
	public void mostrarDatos(){
		
		System.out.println("Mostrar los valores:\n----------- --- -------");
		System.out.println("\nMostrar la matricula: "+getMatricula());
		System.out.println("Mostrar el color: "+getColor());
		System.out.println("Mostrar el año: "+getAño());
		
		System.out.println("Mostrar la marca: "+getMarca());
		System.out.println("Mostrar el modelo: "+getModelo());
		System.out.println("Mostrar el garantia: "+getGarantia());
		System.out.println("Mostrar la precio: "+getPrecio());
		
		System.out.println("Mostrar los Motor: "+getTipo_motor());
		
		System.out.println("Mostrar los deposito:"+getDeposito());
		System.out.println("Mostrar los km:"+getKm());
		System.out.println("Mostrar los cv:"+getCv());
	}
}
