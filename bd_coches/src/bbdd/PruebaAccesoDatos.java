
package bbdd;

import java.sql.SQLException;

public class PruebaAccesoDatos {
	public static void main (String [] args) throws ClassNotFoundException, SQLException{
		AccesoDatos AD = new AccesoDatos(); 
		//AD.conexion();
		AD.menu();
	}
}
