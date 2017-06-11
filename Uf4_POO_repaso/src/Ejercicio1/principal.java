package Ejercicio1;

import java.util.Scanner;

public class principal {
	public static void main(String[]args){
		//menu 1
		Scanner s = new Scanner(System.in);		
		int option=-1;
		menu m = new menu();	
		do{
			System.out.println("Menu Productos\n1- Agregar\n2- Eliminar\n3- Obtener\n4- buscar\n5- Grandaria\n0- salir");
			option=s.nextInt();
			switch(option){
			case 1:
				System.out.println("1- Agregar");
				m.agregar();
				break;
			case 2:
				System.out.println("2- Eliminar");
				System.out.println(m.prod);
				m.eliminar();
				break;
			case 3:
				System.out.println("3- Obtener");
				m.obtenir();
				break;
			case 4:
				System.out.println("4- Buscar");
				m.buscar();
				break;
			case 5:
				System.out.println("5- Grandaria");
				m.grandaria();
				break;
			case 0:
				System.out.println("0- salir");
				break;
			}
			System.out.println("Camtidad de listas: "+m.prod.size());
		}while(option!=0);
		//menu 2
		option=-1;
		if(!m.prod.isEmpty()){
		do{
			System.out.println("Menu Productos 2\n1- prodRep\n2- oficina\n0- salir");
			option=s.nextInt();
			switch(option){
			case 1:
				System.out.println("1- prodRep");
				m.prodRep();
				break;
			case 2:
				System.out.println("2- oficina");
				m.oficina();
				break;
			case 3:
				System.out.println("3- ");
				m.obtenir();
				break;
			case 4:
				System.out.println("4- ");
				m.buscar();
				break;
			case 5:
				System.out.println("5- ");
				m.grandaria();
				break;
			case 0:
				System.out.println("0- salir");
				break;
			}
			System.out.println("Camtidad de listas: "+m.prod.size());
		}while(option!=0);
		}else{
			System.out.println("No hay datos");
		}
		
	}
}
