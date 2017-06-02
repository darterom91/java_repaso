import java.util.Scanner;

public class ejercicio4 {
	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ejercicio4 e4 = new ejercicio4();
		e4.menu();
		

	}
	
	public void menu(){
		int option=0;
		System.out.println("1 Contar cable\n2 Numeros Locos\n3 Calcular importe\n4\n5 salir");
		System.out.print(">: ");
		option=s.nextInt();
		do {
			switch (option) {
			case 1:
				System.out.println("1 Contar cable");
				contarCableHoras();
				break;
			case 2:
				System.out.println("2 Numeros locos");
				numerosLocos();
				break;
			case 3:
				System.out.println("3 Calcular importe");
				calcularImporte();
				break;
			case 4:
				System.out.println("4");
				break;
			case 5:
				System.out.println("5 Salir");
				break;
			default:
				System.out.println("err-- +2001: option is not correct");
				System.out.println("1 Contar cable\n2 Numeros Locos\n3 Calcular importe\n4\n5 salir");
				System.out.print(">: ");
				option=s.nextInt();
				break;
			}
			System.out.println("1 Contar cable\n2 Numeros Locos\n3 Calcular importe\n4\n5 salir");
			System.out.print(">: ");
			option=s.nextInt();
		} while (option != 5);
		
	}
	
	public void contarCableHoras(){
		int Phora=30, horas = 0, resH=0;
		double Pcable=0.5, resC=0,metros=0, res=0, iva =1.21, resI=0;
		Scanner s = new Scanner(System.in);
		System.out.println("introduce la cantidad horas trabajadas: ");
		System.out.print(">: ");
		horas=s.nextInt();
		System.out.println("introduce la cantidad de metros de cable utilizados: ");
		System.out.print(">: ");
		metros=s.nextDouble();
		resH=Phora*horas;
		resC=Pcable*metros;
		
		System.out.println("El resultado de las horas es: "+resH);
		System.out.println("El resuktado de los metros es: "+resC);
		
		res=resH+resC;
		resI=res*iva;
		System.out.println("El precio bruto: "+res);
		System.out.println("El precio con el iva: "+resI);
	}
	
	public void numerosLocos(){
		int num[]=new int[3], i=0;
		for(i=0;i<num.length;i++){
			System.out.println("introduce el numero "+i+": ");
			num[i]=s.nextInt();
		}
		if ((num[0]>num[1]&&num[1]<num[2])||(num[0]<num[1]&&num[1]>num[2])){
			System.out.println("1 numeros desordenados "+num[0]+" | "+num[1]+" | "+num[2]);
		}else if (num[0]<num[1]&&num[1]<num[2]){
			System.out.println("2 numeros ordenados "+num[0]+" | "+num[1]+" | "+num[2]);
		}else if (num[0]>num[1]&&num[2]<num[1]&&num[2]<num[0]){
			System.out.println("3 numeros ordenados "+num[0]+" | "+num[1]+" | "+num[2]);
		}
	}

	public void calcularImporte(){
		int horasT=0, precioH=0;
		double hExtras=1.5, impTE=0,impT=0;
		
		System.out.println("Introduce las horas trabajadas: ");
		System.out.print(">: ");
		horasT=s.nextInt();
		System.out.println("Precio de las horas: ");
		System.out.print(">: ");
		precioH=s.nextInt();
		
		impT=horasT*precioH;
		
		if(horasT>35){
			impTE=impT*1.5;
			System.out.println("Horas trabajadas: "+horasT);
			System.out.println("Precio horas: "+precioH);
			System.out.println("Importe total: "+impT);
			System.out.println("Importe total con horas [Extras]: "+impTE);
		}else{
			System.out.println("Importe total con horas [Extras]: "+impTE);
			System.out.println("Horas trabajadas: "+horasT);
			System.out.println("Precio horas: "+precioH);
			System.out.println("Importe total: "+impT);
		}
	}
}
