import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
	Scanner s = new Scanner(System.in);

	public void menu() {
		int option = 0;
		do {
			System.out.println(
					"Menu Ejercicio9\n\n1 Busca Palabra\n2 Lola Remplazar\n3 Hello Remplazar\n4 Bye Remplazar\n5 Contar Letras\n6 salir");
			option = s.nextInt();
			switch (option) {
			case 1:
				System.out.println("1 Busca Palabra");
				buscaPalabra();
				break;
			case 2:
				System.out.println("2 Lola Remplazar");
				lolaRemplazar();
				break;
			case 3:
				System.out.println("3 Hello Remplazar");
				helloRemplazar();
				break;
			case 4:
				System.out.println("4 Bye Remplazar");
				byeRempplazar();
				break;
			case 5:
				System.out.println("5 Contar Letras");
				contarLetras();
				break;
			case 6:
				System.out.println("6 salir");
				break;
			default:
				System.out.println("Error +20001:Option not correct!!");
				break;
			}

		} while (option != 6);
	}

	public void buscaPalabra() {
		String frase, frase2[] = {};
		int count = 0;
		System.out.println("introduce una frase: ");
		s.nextLine();
		frase = s.nextLine();
		frase2 = frase.split(" ");

		for (int i = 0; i < frase2.length; i++) {
			if (frase2[i].equals("hola")) {
				System.out.println(frase2[i] + " i: " + i);
				count++;
			}
		}
		System.out.println("cuantos hola hay? " + count);

		if (count == 1) {
			System.out.println("he encontrado hola");
		} else if (count > 1) {
			System.out.println("hay muchos hola...");
		} else {
			System.out.println("no se encontro hola");
		}

	}

	public void lolaRemplazar() {
		String frase, frase2[] = {};
		int count = 0;
		System.out.println("introduce una frase: ");
		s.nextLine();
		frase = s.nextLine();
		frase2 = frase.split(" ");

		for (int i = 0; i < frase2.length; i++) {
			if (frase2[i].equals("hola")) {
				frase2[i] = "lola";
			}
		}

		for (int i = 0; i < frase2.length; i++) {
			System.out.println(frase2[i]);
		}
	}

	public void helloRemplazar() {
		String frase, frase2[] = {};
		int count = 0;
		System.out.println("introduce una frase: ");
		s.nextLine();
		frase = s.nextLine();
		frase2 = frase.split(" ");

		for (int i = 0; i < frase2.length; i++) {
			if (frase2[i].equals("hola")) {
				frase2[i] = "hello";
			}
		}

		for (int i = 0; i < frase2.length; i++) {
			System.out.println(frase2[i]);
		}

	}

	public void byeRempplazar() {
		String frase, frase2[] = {};
		int count = 0;
		System.out.println("introduce una frase: ");
		s.nextLine();
		frase = s.nextLine();
		frase2 = frase.split(" ");

		for (int i = 0; i < frase2.length; i++) {
			if (frase2[i].equals("hola")) {
				frase2[i] = "bye";
			}
		}

		for (int i = 0; i < frase2.length; i++) {
			System.out.println(frase2[i]);
		}

	}

	public void contarLetras() {
		String frase = "", aux = "", aux2 = "  ";
		char letra;
		int count = 0, countI = 0;
		System.out.println("Escribe una frase: ");
		System.out.print(">");
		s.nextLine();
		frase = s.nextLine();
		char letras[]=new char[frase.length()];

		for (int i = 0; i < frase.length(); i++) {
			letras[i] = frase.charAt(i);
		}
		Arrays.sort(letras);
		for(int i=0; i<letras.length;i++){
			System.out.println(letras[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio9 e9 = new Ejercicio9();
		e9.menu();
	}

}
