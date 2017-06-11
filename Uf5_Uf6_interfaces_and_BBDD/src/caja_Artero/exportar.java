package caja_Artero;

import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class exportar extends JFrame{
	JPanel panel = new JPanel();
	JLabel titulo = new JLabel("Welcome");
	JLabel user = new JLabel("user");
	JTextField cant = new JTextField("Cantidad");
	JButton aceptar = new JButton("Aceptar"); 
	JButton cancelar = new JButton("Cancelar"); 
	Font h1 = new Font("Arial", Font.BOLD,250);
	public exportar(){
		this.setTitle("Exportar");
		this.setSize(300,300);
		this.setResizable(false);
		this.add(panel);
		GridLayout gl = new GridLayout(0,1); 
		panel.setLayout(gl);
		
		panel.add(titulo, gl);
		panel.add(user, gl);
		panel.add(cant, gl);
		panel.add(aceptar, gl);
		panel.add(cancelar, gl);
		
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public Connection conexion() throws SQLException{
		String users="root";
		String pass="root";
		String bbdd = "usuarios";
		String local= "localhost:8889";
		String url = "jdbc:mysql://"+local+"/"+bbdd;;
		Connection conexion = DriverManager.getConnection(url,users, pass);
		System.out.print("\n Conectado a MySQL");
		return conexion;
	}
}
