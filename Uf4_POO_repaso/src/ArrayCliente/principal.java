package ArrayCliente;

import java.util.Scanner;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String dni = "";
		String nombre = "";
		int edad = 0;
		cliente c = new cliente(dni, nombre, edad) ;
		int num=0;
		System.out.println("introduce el numero de clientes");
		num=s.nextInt();
		
		for(int i=0; i<num;i++){
		System.out.println("introduce los datos");
		c.intDatos();
		c.cli.add(new cliente(c.getDni(), c.getNombre(), c.getEdad()));
		}
		
		System.out.println(c.cli);
		System.out.println(c.cli.iterator());
	
	}

}
