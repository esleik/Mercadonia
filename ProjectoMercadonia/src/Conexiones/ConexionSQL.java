package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionSQL {
	

	public class ConexionPrimaria {

		public String url = "jdbc:mysql://localhost:3306/Mercadonia";
		public String usuario = "root";
		public String contraseña = "123456";
		public String clase = "com.mysql.cj.jdbc.Driver";
		private Connection conexion;

		
		public Connection conectar() throws ClassNotFoundException {

			try {
				Class.forName(clase);
				conexion = (Connection) DriverManager.getConnection(url, usuario, contraseña);

				System.out.println("Conexion establecida");

			} catch (SQLException e) {
				System.out.println(e);

			}
			return conexion;

		}
	}
}
