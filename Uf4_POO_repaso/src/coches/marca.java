package coches;

import java.util.Scanner;

public class marca extends coche {
	Scanner s = new Scanner(System.in);
	String marca;
	String modelo;
	int garantia=2;
	int precio;
	
	public marca(){
		super();
		this.marca=marca;
		this.modelo=modelo;
		this.garantia=garantia;
		this.precio=precio;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getGarantia() {
		return garantia;
	}

	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
}
