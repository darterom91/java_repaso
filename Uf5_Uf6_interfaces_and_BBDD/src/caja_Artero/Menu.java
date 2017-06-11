package caja_Artero;

import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
	JPanel panel = new JPanel();
	JLabel titulo = new JLabel("Selecciona una opcion");
	JButton ingresar = new JButton("Ingresar");
	JButton exportar = new JButton("Exportar");
	JButton salir = new JButton("Salir");
	Font h1=new Font("Arial", Font.BOLD, 25);
	Font p=new Font("Arial", Font.PLAIN, 20);
	
	public Menu(){
		this.setSize(300,300);
		this.setResizable(false);
		this.add(panel);
		GridLayout GL=new GridLayout(0,1);	
		panel.setLayout(GL);
		
		
		panel.setBackground(Color.MAGENTA);
		titulo.setForeground(Color.YELLOW);
		titulo.setBackground(Color.yellow);
		titulo.setFont(h1);
		ingresar.setForeground(Color.BLUE);
		ingresar.setBackground(Color.yellow);
		ingresar.setFont(p);
		exportar.setForeground(Color.BLUE);
		exportar.setBackground(Color.yellow);
		exportar.setFont(p);
		salir.setForeground(Color.RED);
		salir.setBackground(Color.yellow);
		salir.setFont(p);
		
		panel.add(titulo);
		panel.add(ingresar, GL);
		panel.add(exportar, GL);
		panel.add(salir, GL);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
