package vendedor;

public class principal {
	public static void main(String []arg){
		vendedor v = new vendedor();
		v.introduceDatos();
		v.sal();
		System.out.println("EL DNI es: "+v.getDni());
		System.out.println("EL nombre es: "+v.getNombre());
		System.out.println("EL apellido es: "+v.getApellido());
		System.out.println("EL sexo es: "+v.getSexo());
		System.out.println("EL edad es: "+v.getEdad());
		System.out.println("EL salario es: "+v.getSalario());
	}
}
