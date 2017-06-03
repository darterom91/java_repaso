import java.util.Scanner;

public class Ejercicio6 {
	public static void main(String[]args){
		Ejercicio6 e6 = new Ejercicio6();
		e6.Triangulo();
	}
	
	public void Triangulo(){
		int cantidad, aux, i, j, k;
		int z = 0;
		String espacio= "";
		
		System.out.println("Introduce la cantidad de a:");
		Scanner s = new Scanner(System.in);
		cantidad=s.nextInt();
		aux=cantidad;
		
		for(i=1;i<cantidad;i++){
			for(j=aux; j>=0;j--){
				espacio=espacio+" ";
			}
			k=i;
			k = 2*k-1;
			for(j=1;j<=k;j++){
				espacio+="*";	
			}
			espacio+="       i: "+i+"   ";
			System.out.println(espacio);
			espacio= "";
			aux--;
		}
		
		aux=cantidad;
		for(i=1;i<=cantidad;i++){
			
			for(j=aux; j>=1;j--){
			}
			k=i;
			for(j=1;j<=k;j++){
				espacio+="*";	
			}
			espacio+="       i: "+i+"   ";
			System.out.println(espacio);
			espacio= "";
			aux--;
		}
		aux=cantidad;
		for(i=1;i<cantidad;i++){
			for(j=aux; j>=0;j--){
				espacio=espacio+" ";
			}
			
			k=i;
			k = 2*k-1;
			for(j=1;j<=k;j++){
				espacio+=" *"+" ";
				
			}
			espacio+="      j: "+(j-1);
			
			System.out.println(espacio);
			espacio= "";
			aux--;
		}
		
		for(i=1;i<cantidad;i++){
			for(j=aux; j>=0;j--){
			}
			
			k=i;
			for(j=1;j<=k;j++){
				for(z=k;z <=k;z++){
				
				}
				
			}
			espacio+="******************"
					+ "";
			espacio+="      j: "+(j-1);
			
			System.out.println(espacio);
			espacio= "";
			aux--;
		}
	}
}
