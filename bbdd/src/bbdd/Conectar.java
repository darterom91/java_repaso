package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conectar {
	public static void main (String []args) throws SQLException, ClassNotFoundException{
		String user = "root";
		String pass = "root";
		String bbdd = "usuarios";
		String local = "localhost:8889";
		String url = "jdbc:mysql://"+local+"/"+bbdd;
		
		Class.forName("com.mysql.jdbc.Driver");		
		Connection conexion = DriverManager.getConnection(url,user, pass);
		System.out.println("Conectado a MySQL");
		
		String Nombre = "David";
		String apellido1 = "Artero";
		String apellido2 = "Martin";
		int edad = 25;


		PreparedStatement pst = conexion.prepareStatement("insert into user(Nombre, apellido1, apellido2, edad )values (?, ?, ?, ?)");
		
		pst.setString(1, Nombre);
		pst.setString(2, apellido1);
		pst.setString(3, apellido2);
		pst.setLong(4, edad);
		pst.executeUpdate();
	}
}
