package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class menu implements ArrayProducto, FmProducto {
	ArrayList prod = new ArrayList();
	int count;
	int cod;
	String nom;
	String tipus;
	double preu;
	int stock;
	Producto p = new Producto(cod, nom, tipus, preu, stock);

	@Override
	public void prodRep() {
		// TODO Auto-generated method stub
		System.out.println(p.getNom());
		int vueltas = prod.size();
		if (!prod.isEmpty()) {
			for (int i = 0; i < vueltas; i++) {
				System.out.println(p.getNom());
				if (p.getNom().equals(p.getNom())) {
					prod.set(i, new Producto(p.getCod(), p.getNom(), p.getTipus(), p.getPreu() * 1.10,
							p.getStock() + p.getStock()));
				}
			}
		} else {
			System.out.println("No hay datos");
		}
		if (vueltas == 10) {
			for (int i = 0; i < vueltas; i++) {
				if (prod.get(0).equals(prod.get(i))) {
					prod.remove(i);
				}
			}
		}
	}

	@Override
	public void oficina() {
		// TODO Auto-generated method stub
		System.out.println("Oficina");
		int vueltas = prod.size();
		for (int i = 0; i < vueltas; i++) {
			System.out.println("Dentro");
			if (p.getTipus().equals("oficina")) {
				prod.set(i, new Producto(p.getCod(), p.getNom(), p.getTipus(), p.getPreu() * 1.10, p.getStock()));
			}
		}

	}

	@Override
	public void eliminarStock() {
		// TODO Auto-generated method stub

	}

	@Override
	public void prodArrayList() {
		// TODO Auto-generated method stub

	}

	@Override
	public void agregar() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		System.out.println("Introduce los datos");
		p.setCod(count);
		System.out.println("nombre: ");
		p.setNom(s.next());
		System.out.println("Tipo: ");
		p.setTipus(s.next());
		System.out.println("Precio: ");
		p.setPreu(s.nextDouble());
		System.out.println("Stock: ");
		p.setStock(s.nextInt());
		count++;
		prod.add(new Producto(p.getCod(), p.getNom(), p.getTipus(), p.getPreu(), p.getStock()));
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		int num;
		Scanner s = new Scanner(System.in);
		if (!prod.isEmpty()) {
			System.out.println("Introduce el nombre del producto a eliminar");
			num = s.nextInt();
			prod.remove(num);
		}
		System.out.println("no hay ningun producto introducido");
	}

	@Override
	public void obtenir() {
		// TODO Auto-generated method stub
		if (!prod.isEmpty()) {
			System.out.println(prod);
		}
		System.out.println("no hay ningun producto introducido");
	}

	@Override
	public void buscar() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		if (!prod.isEmpty()) {
			System.out.println("Introduce la lista que deseas encontrar");
			int id = 0;
			id = s.nextInt();
			System.out.println(prod.get(id));
		}
		System.out.println("no hay ningun producto introducido");
	}

	@Override
	public void grandaria() {
		// TODO Auto-generated method stub
		System.out.println("longitud de el array: " + prod.size());
	}

}
