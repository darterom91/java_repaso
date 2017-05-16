import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

public class Ejercicio2 extends JFrame implements ActionListener {

	JPanel panel = new JPanel();
	JLabel titulo = new JLabel();
	JLabel label[] = new JLabel[6];

	JTextField name = new JTextField(20);
	JTextField address = new JTextField(20);
	JTextField phone = new JTextField(20);
	JTextField email = new JTextField(20);

	JButton save = new JButton("save");
	JButton delete = new JButton("delete");
	JButton clear = new JButton("clear");
	JButton exit = new JButton("exit");

	public Ejercicio2() {
		this.setSize(400, 400);
		this.setResizable(false);

		for (int i = 0; i < label.length; i++) {
			label[i] = new JLabel();
			label[i].setForeground(Color.green);
		}
		GridBagConstraints gbc = new GridBagConstraints();
		GridBagLayout gbl = new GridBagLayout();
		panel.setLayout(gbl);

		// labels
		gbc.insets = new Insets(10, 10, 10, 10);
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 0;
		gbc.gridy = 0;

		gbc.weightx = 1;
		gbc.weighty = 0;

		gbc.gridheight = 1;
		gbc.gridwidth = 1;

		label[0].setText("name:");
		panel.add(label[0], gbc);

		gbc.gridx = 0;
		gbc.gridy = 1;
		label[1].setText("address:");
		panel.add(label[1], gbc);

		gbc.gridx = 0;
		gbc.gridy = 2;
		label[2].setText("phone:");
		panel.add(label[2], gbc);

		gbc.gridx = 0;
		gbc.gridy = 3;
		label[3].setText("email:");
		panel.add(label[3], gbc);

		// text
		gbc.gridx = 1;
		gbc.gridy = 0;
		panel.add(name, gbc);

		gbc.gridx = 1;
		gbc.gridy = 1;
		panel.add(address, gbc);

		gbc.gridx = 1;
		gbc.gridy = 2;
		panel.add(phone, gbc);

		gbc.gridx = 1;
		gbc.gridy = 3;
		panel.add(email, gbc);

		gbc.gridx = 0;
		gbc.gridy = 4;
		save.addActionListener(this);
		panel.add(save, gbc);

		// botones
		gbc.gridx = 1;
		gbc.gridy = 4;
		delete.addActionListener(this);
		panel.add(delete, gbc);

		gbc.gridx = 2;
		gbc.gridy = 4;
		clear.addActionListener(this);
		panel.add(clear, gbc);

		gbc.gridx = 3;
		gbc.gridy = 4;
		exit.addActionListener(this);
		panel.add(exit, gbc);

		this.add(panel);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ejercicio2 ej2 = new Ejercicio2();
	}
	public void crearFichero() throws IOException{
        File archivo = new File("archivo.txt");
        String Messager="";
        FileWriter fichero = null;
       
       //PrintWriter pw=null;
        BufferedWriter bw = null;
        if(archivo.exists()) {
            try {
            	BufferedReader br = new BufferedReader(new FileReader(archivo));
				bw = new BufferedWriter(new FileWriter(archivo));
				
				//pw = new PrintWriter(fichero);
				System.out.println("Funciona");
				Messager +="|name: "+name.getText()+"|\r\n ";
				Messager +="----------------------\r\n";
				Messager +="|address: "+address.getText()+"|\r\n";
				Messager +="----------------------\r\n";
				Messager +="|phone: "+phone.getText()+"|\r\n";
				Messager +="----------------------\r\n";
				Messager +="|email: "+email.getText()+"|\r\n";
				Messager +="----------------------\r\n";
				bw.newLine();	
				bw.write(Messager);
				bw.newLine();
				bw.flush();
				Messager=br.readLine();
				System.out.println(Messager);
				while (Messager!=null){
					System.out.println(Messager);
					Messager=br.readLine();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            try {
				bw = new BufferedWriter(new FileWriter(archivo));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
	}
	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		String cmd = ev.getActionCommand();
		if (cmd.equals(save.getText())) {
			System.out.println("Save");
			try {
				crearFichero();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (cmd.equals(delete.getText())) {
			System.out.println("delete");
			try {
				borrarLina();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (cmd.equals(clear.getText())) {
			System.out.println("clear");

		} else if (cmd.equals(exit.getText())) {
			System.exit(0);
		}
	}

	private void borrarLina() throws IOException {
	    File archivo = new File("archivo.txt");
        String Messager="";
        FileWriter fichero = null;
       
       //PrintWriter pw=null;
        BufferedWriter bw = null;
        if(archivo.exists()) {
            try {
            	BufferedReader br = new BufferedReader(new FileReader(archivo));
				bw = new BufferedWriter(new FileWriter(archivo));
				
				//pw = new PrintWriter(fichero);
				System.out.println("Funciona");
				Messager +="|name: \r\n ";
				Messager +="----------------------\r\n";
				Messager +="|address: \r\n";
				Messager +="----------------------\r\n";
				Messager +="|phone: \r\n";
				Messager +="----------------------\r\n";
				Messager +="|email: \r\n";
				Messager +="----------------------\r\n";
				bw.newLine();	
				bw.write(Messager);
				bw.newLine();
				bw.flush();
				Messager=br.readLine();
				System.out.println(Messager);
				while (Messager!=null){
					System.out.println(Messager);
					Messager=br.readLine();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        } else {
            try {
				bw = new BufferedWriter(new FileWriter(archivo));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            bw.write("Acabo de crear el fichero de texto.");
        }
        bw.close();
	}		
}

