import java.sql.*;

public class trabajar_bbdd_basic {

	public static void main (String []args) throws ClassNotFoundException, SQLException{
		String user = "root";
		String pass = "root";
		String bbdd = "usuarios";
		String Localhost = "localhost:8888";
		String urlDades="jdbc:mysql://"+Localhost+"//"+bbdd;
		
		String Nombre ="David";
		String apellido1 ="Artero";
		String apellido2 ="Martin";
		int edad = 25 ;
		Class.forName("com.mysql.jdbc.Driver");		
		Connection conexion = DriverManager.getConnection(urlDades,user, pass);
		
			System.out.println("Conectado a MySQL");
		
		Statement st = conexion.createStatement();
		
		//ResultSet rs = st.executeQuery("Select * from user");
		
		/*while(rs.next()){
			System.out.println("Nombre: "+rs.getString(1)+ "Lugar de NAcimiento: "+rs.getString("LNacimiento"));
		}*/
		
		PreparedStatement pst = conexion.prepareStatement("insert into user(Nombre, apellido1, apellido2, edad )values (?, ?, ?, ?)");
		
		pst.setString(1, Nombre);
		pst.setString(2, apellido1);
		pst.setString(3, apellido2);
		pst.setLong(4, edad);
		pst.executeUpdate();
		
	}
	
}
