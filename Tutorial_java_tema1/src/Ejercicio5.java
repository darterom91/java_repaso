import java.util.Scanner;

public class Ejercicio5 {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Ejercicio5 e5 = new Ejercicio5();
		e5.menu();
	}

	public void menu() {
		System.out.println(
				"\n--------------------\nMenu Ejercicio 5:\n\n1 Notas\n2 Efectivo Empleado\n3 Descuento Tienda\n4 Parking\n5 Divisas\n6 salir");
		int option = 0;
		option = s.nextInt();
		do {
			switch (option) {
			case 1:
				System.out.println("1 Notas:");
				notas();
				break;
			case 2:
				System.out.println("2 Efectivo Empleado");
				efectivoEmp();
				break;
			case 3:
				System.out.println("3 Descuento Tienda");
				descTienda();
				break;
			case 4:
				System.out.println("4 Parking");
				parking();
				break;
			case 5:
				System.out.println("5 Divisas");
				Divisas();
				break;
			case 6:
				System.out.println("6 salir");
				break;
			default:
				System.out.println("Err-- +20001: Option not exist");
				break;
			}
			System.out.println(
					"\n--------------------\nMenu Ejercicio 5:\n\n1 Notas\n2 Efectivo Empleado\n3 Descuento Tienda\n4 Parking\n5 Divisas\n6 salir");
			option = s.nextInt();
		} while (option != 6);

	}

	public void notas() {
		double nota = 0;
		System.out.println("Introduce una nota del 0 al 10");
		nota = s.nextDouble();
		if (nota < 0 || nota > 10) {
			do {
				System.out.println("Error la nota es menor [0] o mayor [10]");
				System.out.println("Introduce una nota del 0 al 10");
				nota = s.nextDouble();

			} while (nota < 0 || nota > 10);
		}
		if (nota < 5) {
			System.out.println("El alumno ha suspendido.");
		} else if (nota >= 5 && nota < 6.5) {
			System.out.println("El alumno ha Aprobado.");
		} else if (nota >= 6.5 && nota < 8.5) {
			System.out.println("El alumno ha Notable.");
		} else if (nota >= 8.5 && nota < 11) {
			System.out.println("El alumno ha Excelte.");
		}
	}

	public void efectivoEmp() {
		int carProd = 0, carDef = 0, minCargDef = 200, maxCargProd = 10000;
		System.out.println("Introduce carProd mayor y carDef: ");
		System.out.println(" carDef: ");
		carDef = s.nextInt();
		System.out.println(" carProd: ");
		carProd = s.nextInt();

		if (carProd < 0 || carDef < 0) {
			do {
				System.out.println("Error carProd es menor [0] o carDef [0]");
				System.out.println("Introduce carProd mayor [0] y carDef mayor [0]");
				carDef = s.nextInt();
				carProd = s.nextInt();
			} while (carProd < 0 || carDef < 0);
		}
		System.out.println(" carDef: " + carDef + " carProd: " + carProd);

		if (carDef < 201 && carProd < 10001) {
			System.out.println("grau 6");
		} else if (carDef > 201 && carProd > 10001) {
			System.out.println("grau 7");
		} else if (carDef < 201 && carProd > 10001) {
			System.out.println("grau 8");
		} else if (carDef > 201 && carProd < 10001) {
			System.out.println("grau 5");
		}
	}

	public void descTienda() {
		double num = 0, precioKg = 0.99, desc = 0, total = 0;
		System.out.println("Introduce numero kilos: ");
		System.out.println(" numero de kg: ");
		num = s.nextDouble();
		do {
			System.out.println("Introduce numero kilos menor a [0]");
			System.out.println(" numero de kg: ");
			num = s.nextDouble();
		} while (num < 0);

		if (num >= 0 && num <= 2) {
			System.out.println("descuento 0");
			total = num * precioKg;
			System.out.println("resultado sin desuento: " + total);
		} else if (num >= 2.01 && num <= 5) {
			System.out.println("descuento 10");
			desc = 0.10;
			total = num * precioKg;
			System.out.println("resultado sin desuento: " + total);
			desc = total * desc;
			total = total - desc;
		} else if (num >= 5.01 && num <= 10) {
			System.out.println("descuento 15");
			desc = 0.15;
			total = num * precioKg;
			System.out.println("resultado sin desuento: " + total);
			desc = total * desc;
			total = total - desc;
		} else if (num >= 10.01) {
			System.out.println("descuento 20");
			desc = 0.20;
			total = num * precioKg;
			System.out.println("resultado sin desuento: " + total);
			desc = total * desc;
			total = total - desc;
		}
		System.out.println("resultado con desuento: " + total);

	}

	public void parking() {
		int horas = 0, minutos = 0, horaE, minE, contH, contM, horaS, minS, res;
		System.out.println("Introduce la hora de entrada: ");
		System.out.print("\n hora: ");
		horaE = s.nextInt();
		System.out.print("\n minutos: ");
		minE = s.nextInt();

		System.out.println("Introduce la hora de Salida: ");
		System.out.print("\n hora: ");
		horaS = s.nextInt();
		System.out.print("\n minutos: ");
		minS = s.nextInt();

		horas = horaS - horaE;
		System.out.println("res horas: " + horas);
		minutos = minS - minE;
		System.out.println("res minutos: " + minutos);

		if (horas <= 0) {
			res = 24 + horas;
			horas = res;
			System.out.println("total horas: " + horas);
		}
		if (minutos < 0) {
			res = 60 + minutos;
			minutos = res;
			System.out.println("total horas: " + horas);
			System.out.println("total minutos: " + minutos);
		}

		if (horas < 1 && minutos < 30) {
			System.out.println("pagas 1€");
		} else {
			System.out.println("Pagas 2€");
			System.out.println("\n---------------\ntotal horas: " + horas);
			System.out.println("total minutos: " + minutos);

		}

		/*
		 * contH=horaE/horaS;
		 * System.out.println("la cantidad de horas son: "+contH);
		 * contM=horaE/(horaS*minS);
		 * System.out.println("la cantidad de Minutos son: "+contM);
		 */

	}

	public void Divisas() {
		double cant=0,eurosT=0, yenesT=0, dolarsT=0;
		double dolarE=1.12, yenE=10.5, yenD=11.62;
		System.out.println("Menu Divisas\n---- -------\n1 Euros\n2 Dolares\n3 Yenes\n4 Salir");
		int opcion = 0;
		boolean bol = false;
		opcion=s.nextInt();
		do{
			
			
			switch(opcion){
			case 1:
				System.out.println("Euros");
				System.out.println("Cantidad Euros: ");
				cant=s.nextDouble();
				eurosT=cant*dolarE;
				System.out.println("Euro - Dolar: "+eurosT);
				eurosT=cant*yenE;
				System.out.println("Euro - Yenes: "+eurosT);
				break;
			case 2:	
				System.out.println("Dolares");
				System.out.println("Cantidad Dolares: ");
				cant=s.nextDouble();
				dolarsT=cant/dolarE;
				System.out.println("Dolar - Euro: "+dolarsT);
				dolarsT=cant*yenD;
				System.out.println("Dolar - Yenes: "+dolarsT);
				break;
			case 3:
				System.out.println("Yenes");
				System.out.println("Cantidad Yenes: ");
				cant=s.nextDouble();
				yenesT=cant/yenE;
				System.out.println("Yenes - Euro: "+yenesT);
				yenesT=cant/yenD;
				System.out.println("Dolar - Yenes: "+yenesT);
				break;
			case 4:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Error:  esa opcion no existe");
				System.out.println("Menu Divisas\n---- -------\n1 Euros\n2 Dolares\n3 Yenes\n4 Salir");
				opcion=s.nextInt();
			}
			System.out.println("Menu Divisas\n---- -------\n1 Euros\n2 Dolares\n3 Yenes\n4 Salir");
			opcion=s.nextInt();

		}while(opcion!=4);
		/*contH=horaE/horaS;
		System.out.println("la cantidad de horas son: "+contH);
		contM=horaE/(horaS*minS);
		System.out.println("la cantidad de Minutos son: "+contM);
		*/
		 
	}
}
