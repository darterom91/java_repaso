import java.util.Scanner;

public class Ejercicio2 {
	Scanner s = new Scanner(System.in);

	public int multiple() {
		int num = 0, mult = 0, falta = 0, resultado = 0;
		System.out.println("Escribe el multiple: ");
		mult = s.nextInt();
		System.out.println("Escribe el un valor por teclado: ");
		do {
			num = s.nextInt();
			resultado = num * mult;
			System.out.println("El resultado " + mult + ": " + resultado);
			resultado = num % mult;
			num = num + resultado;
			System.out.println("Es mod de 7: " + resultado + "\n El resultado: " + num);
			System.out.println("Escribe el un valor por teclado: ");

		} while (resultado != 0);
		return resultado;
	}

	public double areaTriangulo() {
		double altura, base, area;
		System.out.println("inserta el valor de altura y base.");
		altura = s.nextDouble();
		base = s.nextDouble();
		area = base * altura;
		area = area / 2;
		return area;
	}

	public double polinimios() {
		double a, b, c, y = 0, x, x2;
		System.out.println("introduce el valor de X: ");
		x = s.nextDouble();
		System.out.println("El valor de X:" + x);
		x2= Math.pow(x, 2);
		System.out.println("El valor de X:" + x2);
		System.out.println("introduce el valor de a: ");
		a=s.nextDouble();
		System.out.println("introduce el valor de b: ");
		b=s.nextDouble();
		System.out.println("introduce el valor de c: ");
		c=s.nextDouble();
		
		a=a*x;
		b=b*x2;
		y=a+b+c;
		System.out.println("El valor de y:" + y);
		return y;
	}
	
	public void cuentaMetros() {
		double m, cm, mm, cmT = 0;
		System.out.println("introduce el valor de los Metros: ");
		m = s.nextDouble();
		m=m/100;
		System.out.println("El resultado de cm:"+m);
		System.out.println("introduce el valor de los cm: ");
		cm=s.nextDouble();
		System.out.println("introduce el valor de los mm: ");
		mm=s.nextDouble();
		mm=mm*10;
		System.out.println("El resultado de cm:"+mm);
		cmT=m+cm+mm;
		System.out.println("\nEl resultado total de cm:"+cmT);
	}

	public void cuentaPatas() {
		int hormigas, araña, cochinillas, patas, res;
		System.out.println("introduce el valor de las hormigas: ");
		hormigas=s.nextInt();
		hormigas=hormigas*6;
		System.out.println("El resultado de cm:"+hormigas);
		System.out.println("introduce el valor de las araña: ");
		araña=s.nextInt();
		araña=araña*8;
		System.out.println("El resultado de cm:"+araña);
		System.out.println("introduce el valor de las cochinillas: ");
		cochinillas=s.nextInt();
		cochinillas=cochinillas*14;
		System.out.println("El resultado de cm:"+cochinillas);
		patas=hormigas+araña+cochinillas;
		System.out.println("\nEl resultado total de cm:"+patas);
	}
	
	public static void main(String[] args) {
		Ejercicio2 e2 = new Ejercicio2();
		Scanner s = new Scanner(System.in);
		int res=0, opcion = 0;
		double area, y=0;
		System.out.println("Selecciona una opcion:\n1 Multiple\n2 Area triangulo\n3 Polinimios\n4 cuentaMetros\n5 Salir\n6 cuentaPatas");
		opcion=s.nextInt();
		do {
			switch (opcion) {

			case 1:
				System.out.println("1 Multiple");
				res = e2.multiple();
				System.out.println("Selecciona una opcion:\n1 Multiple\n2 Area triangulo\n3 Polinimios\n4 cuentaMetros\n5 Salir\n6 cuentaPatas");
				opcion=s.nextInt();
				break;
			case 2:
				System.out.println("2 Area triangulo");
				area = e2.areaTriangulo();
				System.out.println("El valor de el area del triangulo es:" + area);
				System.out.println("Selecciona una opcion:\n1 Multiple\n2 Area triangulo\n3 Polinimios\n4 cuentaMetros\n5 Salir\n6 cuentaPatas");
				opcion=s.nextInt();
				break;
			case 3:
				System.out.println("3 Polinimios");
				y = e2.polinimios();
				System.out.println("Selecciona una opcion:\n1 Multiple\n2 Area triangulo\n3 Polinimios\n4 cuentaMetros\n5 Salir\n6 cuentaPatas");
				opcion=s.nextInt();
				break;
			case 4:
				System.out.println("4 cuentaMetros");
				e2.cuentaMetros();
				System.out.println("Selecciona una opcion:\n1 Multiple\n2 Area triangulo\n3 Polinimios\n4 cuentaMetros\n5 Salir\n6 cuentaPatas");
				opcion=s.nextInt();
				break;
			case 5:
				System.out.println("5 cuentaPatas");
				e2.cuentaPatas();
				System.out.println("Selecciona una opcion:\n1 Multiple\n2 Area triangulo\n3 Polinimios\n4 cuentaMetros\n5 Salir\n6 cuentaPatas");
				opcion=s.nextInt();
				break;
			case 6:
				System.out.println("6 Salir");
				break;
			default: 
				System.out.println("Er Option not correct");
				System.out.println("Selecciona una opcion:\n1 Multiple\n2 Area triangulo\n3 Polinimios\n4 cuentaMetros\n5 Salir\n6 cuentaPatas");
				opcion=s.nextInt();
				break;
			}

		} while (opcion != 5);

		

	}
}
