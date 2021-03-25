package gestionVentaCoches.controladores;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import gestionVentaCoches.Cliente;
import gestionVentaCoches.Coche;
import gestionVentaCoches.Fabricante;

public class ControladorCliente {
	
	private static ControladorCliente instance = null;
	public Connection conn = null;
	
	/**
	 * 
	 * @return
	 */
	public static ControladorCliente getInstance () {
		if (instance == null) {
			instance = new ControladorCliente();
		}
		return instance;
	}
	
	/**
	 * 
	 */
	public ControladorCliente() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = (Connection) DriverManager.getConnection ("jdbc:mysql://localhost/tutorialjavacoches?serverTimezone=UTC","java", "1234");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		   

	}
	
	
	/**
	 * 
	 * @return
	 */
	public Cliente findPrimero () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("idFabricante"));
				c.setNombre(rs.getString("bastidor"));
				c.setApellido(rs.getString("modelo"));
				c.setLocalidad(rs.getString("color"));
				c.setDniNie(rs.getString("dni"));
				c.setFechaNac(rs.getString("fecha nacimiento"));
				c.setActivo(rs.getBoolean("Activo"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findUltimo () {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("idFabricante"));
				c.setNombre(rs.getString("bastidor"));
				c.setApellido(rs.getString("modelo"));
				c.setLocalidad(rs.getString("color"));
				c.setDniNie(rs.getString("dni"));
				c.setFechaNac(rs.getString("fecha nacimiento"));
				c.setActivo(rs.getBoolean("Activo"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findSiguiente (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id > " + idActual + " order by id limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("idFabricante"));
				c.setNombre(rs.getString("bastidor"));
				c.setApellido(rs.getString("modelo"));
				c.setLocalidad(rs.getString("color"));
				c.setDniNie(rs.getString("dni"));
				c.setFechaNac(rs.getString("fecha nacimiento"));
				c.setActivo(rs.getBoolean("Activo"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	/**
	 * 
	 * @return
	 */
	public Cliente findAnterior (int idActual) {
		Cliente c = null;
		try {
			Statement s = this.conn.createStatement();
			ResultSet rs =  s.executeQuery("select * from tutorialjavacoches.cliente where id < " + idActual + " order by id desc limit 1");
			if (rs.next()) {
				c = new Cliente();
				c.setId(rs.getInt("idFabricante"));
				c.setNombre(rs.getString("bastidor"));
				c.setApellido(rs.getString("modelo"));
				c.setLocalidad(rs.getString("color"));
				c.setDniNie(rs.getString("dni"));
				c.setFechaNac(rs.getString("fecha nacimiento"));
				c.setActivo(rs.getBoolean("Activo"));
			}
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return c;
	}
	

	
	/**
	 * 
	 * @return
	 */
	public int modificar (Fabricante f) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update cliente set cif='" + f.getCif() + "', " +
					" nombre='" + f.getNombre() + "' where id=" + f.getId() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

	/**
	 * 
	 * @param f
	 * @return
	 */
	public int nuevo (Fabricante f) {
		int registrosAfectados = 0;
		int idNuevoRegistro = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			idNuevoRegistro = nextId();
			registrosAfectados = s.executeUpdate ("insert into cliente values(" + idNuevoRegistro + ", " +
			"'" + f.getCif() + "', '" + f.getNombre() + "');");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return idNuevoRegistro;

	}

	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	private int nextId () throws SQLException {
		Statement s = (Statement) this.conn.createStatement();

		String sql = "select max(id) from tutorialjavacoches.cliente";
		ResultSet rs = s.executeQuery(sql);
		int max = 1; 
		if (rs.next() ) {
			max = rs.getInt(1);
		}
		rs.close();
		s.close();
		return max + 1;
	}
	
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public int borrar(int id) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("delete from cliente where id=" + id + ";");
			
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
	}

	
	
	/**
	 * 
	 * @return
	 */
	public int modificar (Coche c) {
		int registrosAfectados = 0;
		try {
			Statement s = (Statement) this.conn.createStatement(); 

			registrosAfectados = s.executeUpdate ("update cliente set idFabricante=" + c.getIdFabricante() + ", " +
					" bastidor='" + c.getBastidor() + "', modelo='" + c.getModelo() + "', color='" + c.getColor() + "' where id=" + c.getId() + ";");
		   	
			// Cierre de los elementos
			s.close();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return registrosAfectados;
		
	}

}
