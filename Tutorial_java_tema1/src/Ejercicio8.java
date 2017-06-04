import java.util.Scanner;

public class Ejercicio8 {
	Scanner s = new Scanner(System.in);
	public void menu(){
		int option=0;
		do{
			System.out.println("Menu ejercicio 8:\n\n1 Longitud Frase\n2 ordenInvers\n3 Concat Frase\n4 Remplaçant Lletras\n5 Cuenta Palabras\n6 Orden Palabras\n7 Borrar A\n8 Salir");
			option=s.nextInt();
			switch(option){
			case 1:
				System.out.println("1 Longitud Frase");
				longitudFrase();
				break;
			case 2:
				System.out.println("2 Orden Invers");
				ordenInvers();
				break;
			case 3:
				System.out.println("3 Concat Frase");
				concatFrase();
				break;
			case 4:
				System.out.println("4 Remplaçant Lletras");
				remplaçantLletras();
				break;
			case 5:
				System.out.println("5 Cuenta Palabras");
				cuentaPalabras();
				break;
			case 6:
				System.out.println("6 Orden Palabras");
				ordenPalabras();
				break;
			case 7:
				System.out.println("7 Borrar A");
				borrarA();
				break;
			case 8:
				System.out.println("7 salir");
				break;
			default:
				System.out.println("Err -20001: option not correct ");
				System.out.println("Menu ejercicio 8:\n\n1 Longitud Frase\n2 ordenInvers\n3 Concat Frase\n4 Remplaçant Lletras\n5 Cuenta Palabras\n6 Orden Palabras\n7 Borrar A\n8 Salir");
				option=s.nextInt();
				break;
			}
		}while(option!=8);
		System.out.println("has salido del programa");
	}
	public void longitudFrase() {
		System.out.println("Escribe una frase: ");
		System.out.print(">");
		String frase="";
		s.nextLine();
		frase=s.nextLine();
		int cantCaracters= frase.length(), count=0, espacios = 0, res;
		char letra;		
		for(int i=0; i<frase.length();i++){
			letra=frase.charAt(i);
			if(letra==' '){
				frase.charAt(i);
				count++;
				espacios=count;
			}
		}
		System.out.println("Espacios: "+espacios);
		res=cantCaracters-espacios;
		System.out.println("El numero de caracteres es: "+res);
	}
	
	public void ordenInvers() {
		System.out.println("Escribe una frase: ");
		System.out.print(">");
		String frase="", aux;
		s.nextLine();
		frase=s.nextLine();
		aux=frase;
		frase=" "+frase;
		int cantCaracters= frase.length(), count=0, espacios = 0, res;
		char letra;		
		for(int i=frase.length()-1; i>0;i--){
			System.out.println("El numero "+i+" tiene el caracteres es: "+frase.charAt(i));
			count++;
		}
		System.out.println("El resultado es: "+count);
		count=0;
		for(int i=0; i<aux.length();i++){
			System.out.println("El numero "+i+" tiene el caracteres es: "+aux.charAt(i));
			count++;
		}
		System.out.println("El resultado es: "+count);
	}
	public void concatFrase() {
		String frase="", frase2="", aux="";
		System.out.println("Escribe 2 frases: ");
		System.out.print(">");
		frase=s.next();
		System.out.print(">");
		frase2=s.next();
		aux=frase+"\t"+frase2;
		System.out.println(aux);
	}
	public void remplaçantLletras() {
		String frase="", aux = "";
		char letra;
		int count=0, a = 0;
		System.out.println("Escribe una frase: ");
		System.out.print(">");
		s.nextLine();
		frase=s.nextLine();
		
		for(int i=0; i<frase.length();i++){
			letra=frase.charAt(i);
			if(letra=='a'){
				frase.charAt(i);
				aux=frase.replace('a', 'o');
				count++;
				a=count;
			}
		}
		System.out.println("El numero de a es: "+a);
		System.out.println("La frase es: "+aux);

	}
	public void cuentaPalabras() {
		String frase="", aux[]={};
		char letra;
		int count=0, a = 0, i=0;
		System.out.println("Escribe una frase: ");
		System.out.print(">");
		s.nextLine();
		frase=s.nextLine();
		
		for(i=0; i<frase.length();i++){
			aux=frase.split(" ");
		}
		
		for(i=0; i<aux.length;i++){
			System.out.println(aux[i]);
		}

	}
	public void ordenPalabras() {
		String palabra1, palabra2;
		char letra1, letra2;
		System.out.println("Introduce 2 nombres: ");
		System.out.print(">");
		palabra1=s.next();
		System.out.print(">");
		palabra2=s.next();
		
		letra1=palabra1.charAt(0);
		letra2=palabra2.charAt(0);
		
		System.out.println(letra1);
		System.out.println(letra2);
		
		if(letra1<letra2){
			System.out.println("palabra: "+palabra1);
			System.out.println("palabra: "+palabra2);
		} else if(letra1>letra2){
			System.out.println("palabra: "+palabra2);
			System.out.println("palabra: "+palabra1);
		} else{
			System.out.println("palabra: "+palabra1);
			System.out.println("palabra: "+palabra2);
		}	
	}
	public void borrarA() {
		String frase="",aux = "", aux2="  ";
		char letra, letras;
		int count=0, a = 0;
		System.out.println("Escribe una frase: ");
		System.out.print(">");
		s.nextLine();
		frase=s.nextLine();
		
		for(int i=0; i<frase.length();i++){
			letra=frase.charAt(i);
			if(letra=='a'){
				frase.charAt(i);
				aux=frase.replace('a', ' ');
				count++;
				a=count;
			}
		}
		for(int i=0; i<aux.length();i++){
			letras=aux.charAt(i);
			if(letras !=' '){
			System.out.println(letras);
			aux2+=letras;
			}
		}
		System.out.println("El numero de a es: "+a);
		System.out.println("La frase es: "+aux2);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio8 e8 = new Ejercicio8();
		e8.menu();
	}

}
