import java.util.Scanner;

public class Ejercicio3 {
	Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio3 e3=new Ejercicio3();
		e3.numeroAnumero();
		e3.menu();

	}
	public void calcularLetra(){
		int DNI=0;
		System.out.println("Introduce tu numero de dni: "); 
		DNI=s.nextInt();
		int resultado=0;
		char letra[]={'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		System.out.println("El DNI es: "+DNI);
		resultado=DNI%23;
		System.out.println("El resultado es: "+resultado);
		System.out.println("LA letra es: "+letra[resultado]);		
		
	}
	
	public void numeroAnumero(){
		int num=19234, resto, num2, inv=0;
		while(num != 0){
			resto = num %10;
			num=num/10;
			inv=inv*10+resto;
		}
		while(inv!=0){
			resto = inv % 10;
			inv = inv/10;
			System.out.println("El numero: "+resto);
		}
		
	}
	
	public void kilosComida(){
		int comidaDiaria=10, kilosAnimal=2;
		int animales=10, numAnimales=0;
		numAnimales=comidaDiaria/kilosAnimal;
		if(numAnimales==animales){
			System.out.println("todos los animales pueden comer!!!");
		}else{
			System.out.println("No hay comida suficiente solo hay para: "+numAnimales);
			
		}
		
	}
	
	public void menu(){
		int opcion=0;
		System.out.println("introduce la opcion deseada:\n1- Calcular DNI,\n2-Calcular Comida\n3 numero a numero\n4 salir");
		opcion=s.nextInt();
		do{
			switch(opcion){
			case 1:
				System.out.println("1 Calcular DNI");
				calcularLetra();
				break;
			case 2:
				System.out.println("2 Calcular Comida");
				kilosComida();
				break;
			
			case 3:
				System.out.println("3 numero a numero");
				numeroAnumero();
				break;
			
			case 4:
				System.out.println("4 Salir");
				break;
				
			default:
				System.out.println("err -2001 not corret option");
				System.out.println("introduce la opcion deseada:\n1- Calcular DNI,\n2-Calcular Comida\n3-salir");
				opcion=s.nextInt();
				break;
			
			}
			System.out.println("introduce la opcion deseada:\n1- Calcular DNI,\n2-Calcular Comida\n3-salir");
			opcion=s.nextInt();
		}while(opcion!=4);
	}

}
