package bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AccesoDatos {
	
	String user = "root";
	String pass = "root";
	String bbdd = "datoscoches";
	String local = "localhost:8889";
	String url = "jdbc:mysql://"+local+"/"+bbdd;
	
	public void conexion() throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.jdbc.Driver");
	Connection cn = DriverManager.getConnection(url, user , pass);
	Statement st = cn.createStatement();
	System.out.println("Te conectaste a MySQL:" +user);
	
	Scanner s = new Scanner(System.in);
	String res="";
	System.out.println("Quieres salir ?");
	do{
		res=s.nextLine();
		if(res.equals("si")){
			desconectar();
		}
	}while(res.equals("no"));
	
	}
	
	public void desconectar() throws SQLException{
		Connection cn = DriverManager.getConnection(url, user, pass);
		System.out.println("Has salido de MySQL");
		cn.close();
		
	}
	
	public void menu () throws SQLException{
		int opcion = 0;
		
		System.out.println("===== Bienvenido a COCHE MENU =====");
		System.out.println("1 -obtener coches segun precio ");
		System.out.println("2 -propietario coche");
		System.out.println("3 -cambiar precio del coche");
		System.out.println("4 -Borrar coche de la bbdd");
		System.out.println("5 -Insertar Nuevo coche");
		
		Scanner s = new Scanner (System.in);
		Connection cn = DriverManager.getConnection(url, user , pass);
		Statement st = cn.createStatement();
		PreparedStatement pst =cn.prepareStatement(bbdd);
		ResultSet rs = null;
		do{
			opcion=s.nextInt();
		switch(opcion){
			
			case 1: 
					rs =st.executeQuery("select * from coches order by precio ");
					while(rs.next()){
						System.out.println("Matricula: "+rs.getString(1)+"Marca: "+rs.getString(2)+"Precio: "+rs.getLong(3)+"DNI: "+rs.getString(4));
				
					}
					
					break;
			
			case 2: System.out.println("Caso 2");
					rs =st.executeQuery("select * from coches");
					
					while(rs.next()){
						System.out.println("Matricula: "+rs.getString(1)+"Marca: "+rs.getString(2)+"DNI: "+rs.getString(4));
					}
					
					break;
			
			case 3:
					String Matricula="";
					int precio = 0, cantidad=0;
					System.out.println("Inserta la matricula para modificar el precio:");				
					Matricula=s.next();	
					rs=st.executeQuery("select ? from coches where ?");
					System.out.print("Precio: "+rs.getInt(precio)+"Matricula"+rs.getString( Matricula));
					System.out.print("inserta una cantidad");
					cantidad=s.nextInt();
					
					
					precio=precio+cantidad;
					System.out.println("Precio: "+precio);
					String query = "update COCHES set precio =? where Matricula = ? ";
				    pst = cn.prepareStatement(query);
				    pst.setLong(1, precio);
				    pst.setString(2, Matricula);
				    pst.executeUpdate();
				     
					
					break;
			
			case 4: System.out.println("Caso 4"); 
					break;
			
			case 5: System.out.println("Caso 5"); 
					break;
			
			case 6:	System.out.println("Saliendo de MySQL");
					desconectar();
					break;
					
			default:
					System.out.println("opcion no valida...");
		}
		
		if(opcion<=5){
		System.out.println("===== Bienvenido a COCHE MENU =====");
		System.out.println("1 -obtener coches segun precio ");
		System.out.println("2 -propietario coche");
		System.out.println("3 -cambiar precio del coche");
		System.out.println("4 -Borrar coche de la bbdd");
		System.out.println("5 -Insertar Nuevo coche");
		}else{
			System.out.println("Desconectado y fuera de la aplicacion.");
		}
		
		}while(opcion!=6);
	}
}
