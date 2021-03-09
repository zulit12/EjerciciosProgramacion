package capitulo7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;





public class Ejercicio1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		int opcion;
	
		do {
			
			opcion = menu();
	
			switch (opcion) {
			case 0: 
				System.out.println("Adios!");
				break;
			case 1:
				listar();
				
				break;
			case 2:
				creacionDatosFabricantes();
				
				break;
			case 3:
				eliminacionDatosFabricantes();
				
			case 4:
				modificarDatosFabricantes();
				break;

				
			default:
				System.out.println("Opción no válida");
			}
			
			
		} while (opcion != 0);
		conexion.close(); 
	}
	
	private static void listar () {
		try {
			// A trav�s de la siguiente l�nea comprobamos si tenemos acceso al driver MySQL, si no fuera as�
			// no podemos trabajar con esa BBDD.
			Class.forName("com.mysql.cj.jdbc.Driver");
		   
			// Necesitamos obtener un acceso a la BBDD, eso se materializa en un objeto de tipo Connection, al cual
			// le tenemos que pasar los par�metros de conexi�n.
			Connection conexion = getConexion();
		   
			
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) conexion.createStatement(); 
			
			// La ejecuci�n de la consulta se realiza a trav�s del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   
			// Navegaci�n del objeto ResultSet
			while (rs.next()) { 
				System.out.println (rs.getInt("id") + " " + rs.getString (2)+ 
						" " + rs.getString(3)); 
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
			ex.printStackTrace();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecuci�n SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	private static void creacionDatosFabricantes () throws SQLException{
		Connection conexion = getConexion();
		
		Statement s = (Statement) conexion.createStatement();
		int registrosInsertados;
			
		
		System.out.println("\nInsertando registros de en la tabla fabricante");


			String cif = JOptionPane.showInputDialog("Inserte el cif");
			String nombre = JOptionPane.showInputDialog("Inserte el nombre del fabricante");
			
			String sql = "INSERT INTO fabricante (id, cif, nombre) " +
					"VALUES  (" + nextIdEnTabla(conexion, "fabricante") + ", '" + cif + "', '" + nombre + "')";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			
			
		s.close();
	}
	
	
	private static void eliminacionDatosFabricantes () throws SQLException{
		Connection conexion = getConexion();
		
		Statement s = (Statement) conexion.createStatement();
		int registrosInsertados;
			
		
		System.out.println("\nEliminando registros de en la tabla fabricante");


			int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del fabricante que desea modificar"));
			
			String sql = "DELETE FROM fabricante WHERE id = '" + id +"'";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			
			
		s.close();
	}
	
	private static void modificarDatosFabricantes () throws SQLException{
		Connection conexion = getConexion();
		
		Statement s = (Statement) conexion.createStatement();
		int registrosInsertados;
			
		
		System.out.println("\nInsertando registros de en la tabla fabricante");

		    int id = Integer.parseInt(JOptionPane.showInputDialog("Inserte el id del fabricante que desea modificar"));
			String cif = JOptionPane.showInputDialog("Inserte el cif");
			String nombre = JOptionPane.showInputDialog("Inserte el nombre del fabricante");
			 
			
			String sql = "UPDATE fabricante Set nombre = '" + nombre + "', cif = '"+ cif+ "' WHERE id = '" + id + "'";
			registrosInsertados = s.executeUpdate(sql);
			if (registrosInsertados != 1) {
				throw new SQLException ("No ha sido posible la inserci�n con la cadena:\n" + sql);
			}
			
			
		s.close();
	}
	
	
	
	
	
	
	
	
	
	
	public static int menu () {
		String strMenu = "\n\nMenú"
				+ "\n0.- Salir"
				+ "\n1.- Listar Fabricante"
				+ "\n2.- Añadir Fabricante"
				+ "\n3.- Eliminar Fabricante"
				+ "\n4.- Editar Fabricante";
				

		int opcionUsuario = Integer.parseInt(JOptionPane.showInputDialog(strMenu));

		return opcionUsuario;
	}
	
	
	
	
	
	
	
	
	
	private static int nextIdEnTabla (Connection conn, String tabla) throws SQLException {
		return maxIdEnTabla(conn, tabla) + 1;
	}
	
	
	private static int maxIdEnTabla (Connection conn, String tabla) throws SQLException {
		Statement s = (Statement) conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches." + tabla;
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max;
	}
	
	
	/*
	 * INICIAR LA CONEXIÓN
	 */
	
	
private static Connection conexion = null;
	
	
	public static Connection getConexion () throws SQLException {
		// Si es la primera vez que accedemos a la conexi�n, debemos instanciarla
		if (conexion == null) {
			conectar();
		}
		// Compruebo si la conexi�n sigue estando activa
		while (!conexion.isValid(5)) {
			conectar();
		}
		
		return conexion;
	}
	
	private static void conectar () throws SQLException {
		String driver = JDBCPropiedades.getProperty("JDBC_DRIVER_CLASS");
		String user = JDBCPropiedades.getProperty("JDBC_USER");
		String password = JDBCPropiedades.getProperty("JDBC_PASSWORD");
		String host = JDBCPropiedades.getProperty("JDBC_HOST");
		String schema = JDBCPropiedades.getProperty("JDBC_SCHEMA_NAME");
		String properties = JDBCPropiedades.getProperty("JDBC_PROPERTIES");

		
		try {
			Class.forName(driver);
		   
			conexion = (Connection) DriverManager.getConnection ("jdbc:mysql://" + host + "/" + schema + properties, user, password);			   
		}
		catch (ClassNotFoundException ex) {
			System.out.println("Imposible acceder al driver Mysql");
		}
	}
	
	
	
	
	
	
	

}
