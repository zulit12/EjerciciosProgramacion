package modFabricante;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class ControladorFabricante {

	
	
	private static ControladorFabricante instance = null;
	public Connection conn = null;
	
	public static ControladorFabricante getInstance () throws SQLException {
		
		
		
		if (instance == null) {
			instance = new ControladorFabricante();
		}
		return instance;
	}
	
	public ControladorFabricante() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Fabricante findPrimero () {
		try {
		Statement s = this.conn.createStatement();
		s.executeQuery("select * from tutoriraljavacoches.fabricante ")
		if (rs.next()) {
			f = new Fabricante();
			f.setId(rs.getInt(id));
			f.setCif(rs.getString("cif"));
			f.setNombre(rs.getString("nombre"));
		}
		}
		catch (Exception e) {
			ex.printStackTrace();		}
	}
	
}
