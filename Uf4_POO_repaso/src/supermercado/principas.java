package supermercado;

import java.util.Scanner;

public class principas {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		// TODO Auto-generated method stub
		int option;
		Empleado e[] ={}; 
		cajero c = new cajero();
		mostrador m = new mostrador();
		neteja n = new neteja();
		int i=0;
		do{
			System.out.println("introduce el empledo\n1- Cajero\n2- Mostrador\n3- Neteja");
			option=s.nextInt();
			switch(option){
			case 1:
				System.out.println("Cajero:");
				System.out.println("Nombre");
				c.setNom(s.next());
				c.lloc();
				c.ciutatOrigen();
				System.out.println("\n\nDatos del caixer");
				c.Mostrar();
				break;
			case 2:
				System.out.println("mostrador:");
				System.out.println("Nombre");
				m.setNom(s.next());
				m.lloc();
				m.ciutatOrigen();
				System.out.println("\n\nDatos del Mostrador");
				m.Mostrar();
				break;
			case 3:
				System.out.println("neteja:");
				n.setNom(s.next());
				n.lloc();
				n.ciutatOrigen();
				System.out.println("\n\nDatos de Netejant");
				n.Mostrar();
				break;
			case 4:
				System.out.println("salir: ");
				break;
			};
			
		}while(option!=4);
	}

}
