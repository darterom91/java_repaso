import java.util.Scanner;

public class Ejercicio7 {
	Scanner s = new Scanner(System.in);

	public void mostrarInterval() {
		int n1 = 0, n2 = 0, i=0;
		System.out.println("introduce los numeros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		if (n1 > n2) {
			do {
				System.out.println("Error: introduce los numeros: ");
				n1 = s.nextInt();
				n2 = s.nextInt();

			} while (n1 > n2);
		}
		System.out.println(" ");

		for (i = n1; i < n2; i++) {
			System.out.print(i + ", ");
		}
		System.out.print(i);
		System.out.println("");
	}

	public void sumaInterval() {
		int n1 = 0, n2 = 0, suma = 0;
		System.out.println("introduce 2 numeros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		if (n1 > n2) {
			do {
				System.out.println("Error: introduce los numeros: ");
				n1 = s.nextInt();
				n2 = s.nextInt();

			} while (n1 > n2);
		}
		System.out.println(" ");

		for (int i = n1; i < n2; i++) {
			
			System.out.println(i);
			suma+=i;
			
			System.out.println("El resultado es: "+suma);
		}
		System.out.println("La suma es: "+suma);
	}
	
	public void LlistaMultiples() {
		int n1 = 0, n2 = 0, suma = 0, resto=0;
		System.out.println("introduce 2 numeros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		if (n1 > n2) {
			do {
				System.out.println("Error: introduce los numeros: ");
				n1 = s.nextInt();
				n2 = s.nextInt();

			} while (n1 > n2);
		}
		System.out.println(" ");

		for (int i = n1; i < n2; i++) {
			suma=suma+i;
			resto=suma%n1;
			if(resto==0){
				if(suma<=n2){
				System.out.println("numero: "+suma);
				}
			}
		}
	}
	
	public void LlistaDivisores() {
		int n1 = 0, i=0, num = 0;
		System.out.println("introduce el numero: ");
		n1 = s.nextInt();
		if (n1 <= 1) {
			do {
				System.out.println("Error: introduce el numero: ");
				n1 = s.nextInt();

			} while (n1 <= 1);
		}
		System.out.println(" ");
		for ( i = 1; i <= n1-1; i++) {
			if(n1%i==0){
				num=i;
			}
			
		}
		
		if(num==1){
			System.out.println("no se ha encontrado divisor");
		}else{
		System.out.println("numero: "+num);
		}
	}
	
	public void CuentaComptaXifres() {
		int n1 = 0, i=0, num = 0, count=0;
		System.out.println("introduce el numero: ");
		n1 = s.nextInt();
		System.out.println(" ");
		while(n1!=0){
			n1=n1/10;
			count++;
		}
		
		System.out.println("Numero de decimales: "+count);
	}
	public void SumarFinsLimit() {
		int n1 = 0, i=0, num = 0, count=0;
		System.out.println("introduce el numero: ");
		n1 = s.nextInt();
		System.out.println(" ");
		for(i=0;i<n1;i++){
			num+=i;
			if(num<=n1){
				count=num;
			}
		}
		System.out.println("Resultado: "+count);
	}
	public void ParellsDinsInterval() {
		int n1 = 0, n2 = 0, suma = 0, resto=0, count=0;
		System.out.println("introduce 2 numeros: ");
		n1 = s.nextInt();
		n2 = s.nextInt();
		if (n1 > n2) {
			do {
				System.out.println("Error: introduce los numeros: ");
				n1 = s.nextInt();
				n2 = s.nextInt();

			} while (n1 > n2);
		}
		System.out.println(" ");

		for (int i = n1; i < n2; i++) {
			if(i%2==0){
				System.out.println("numeros pares: "+i);
				count++;
			}
		}
		System.out.println("cantidad de pares: "+count);
	}
	public void menu() {
		int option = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("\n\n-------------------\n| Menu ejercicio 7 |\n-------------------\n\n1 Mostara interval\n2 suma intervalo\n3 Llista Multiples\n4 Llista Divisores\n5 Cuenta Compta Xifres\n6 Sumar Fins Limit\n7 Parells Dins Interval\n8 salir");
		option=s.nextInt();
		do {
			switch (option) {
			case 1:
				System.out.println("\n1 Mostrar Intervalo");
				mostrarInterval();
				break;
			case 2:
				System.out.println("\n2 Sumar Intervalo");
				sumaInterval();
				break;
			case 3:
				System.out.println("\n3 Llista Multiples");
				LlistaMultiples();
				break;
			case 4:
				System.out.println("\n4 Llista Divisores");
				LlistaDivisores();
				break;
			case 5:
				System.out.println("\n5 Cuenta Compta Xifres");
				CuentaComptaXifres();
				break;
			case 6:
				System.out.println("\n6 Sumar Fins Limit");
				SumarFinsLimit();
				break;
			case 7:
				System.out.println("\n7 Parells Dins Interval");
				ParellsDinsInterval();
				break;
			case 8:
				System.out.println("\n8 salir");
				break;
			default:
				System.out.println("Error -20001: La opcion introducida no existe");
				System.out.println("\n\n-------------------\n| Menu ejercicio 7 |\n-------------------\n\n1 Mostara interval\n2 suma intervalo\n3 Llista Multiples\n4 Llista Divisores\n5 Cuenta Compta Xifres\n6 Sumar Fins Limit\n7 Parells Dins Interval\n8 salir");

				option=s.nextInt();
				break;
				
			}
			System.out.println("\n\n-------------------\n| Menu ejercicio 7 |\n-------------------\n\n1 Mostara interval\n2 suma intervalo\n3 Llista Multiples\n4 Llista Divisores\n5 Cuenta Compta Xifres\n6 Sumar Fins Limit\n7 Parells Dins Interval\n8 salir");
			option=s.nextInt();
		} while (option != 8);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio7 e7 = new Ejercicio7();
		e7.menu();
	}

}
