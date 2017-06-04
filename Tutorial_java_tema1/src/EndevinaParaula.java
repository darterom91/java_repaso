import java.util.Scanner;

public class EndevinaParaula {
	// La paraula per endevinar és "objecte".
	public static final String PARAULA_SECRETA = "java";

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Comencem el joc.");
		System.out.println("Endevina el valor de la paraula del diccionari.");
		boolean haEncertat = false;
		while (!haEncertat) {
			System.out.print("Quina paraula creus que és? ");
			String paraulaUsuari = lector.next();
			lector.nextLine();
			int posicio = paraulaUsuari.compareTo(PARAULA_SECRETA);
			System.out.println("El numero de la palabra: "+posicio);

			if (posicio < 0) {
				// La paraula de l'usuari és anterior a la secreta.
				System.out.println("Has fallat! La paraula va després...");
				System.out.println("El numero de la palabra: "+posicio);
			} else if (posicio > 0) {
				// La paraula de l'usuari és posterior a la secreta
				System.out.println("Has fallat! La paraula va abans...");
				System.out.println("El numero de la palabra: "+posicio);
			} else {
				// Si val 0, és que s'ha encertat.
				System.out.println("El numero de la palabra: "+posicio);
				haEncertat = true;
			}
		}
		System.out.println("Enhorabona. Has encertat!");
	}
}