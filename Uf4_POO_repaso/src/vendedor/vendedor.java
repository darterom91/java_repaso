package vendedor;

public class vendedor extends persona {
	int salario;
	
	public vendedor(){
		super();
		this.salario=salario;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	public void sal(){
		System.out.println("Introduce el salario: ");
		setSalario(s.nextInt());
	}
}
