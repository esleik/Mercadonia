package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

	

	public class ConexionSQL {

		public static String url = "jdbc:mysql://localhost:3306/Mercadonia";
		public static String usuario = "root";
		public static String contrasena = "123456";
		public static String clase = "com.mysql.cj.jdbc.Driver";
		private static Connection conexion;

		
		public static Connection conectar() throws ClassNotFoundException {

			try {
				Class.forName(clase);
				conexion = (Connection) DriverManager.getConnection(url, usuario, contrasena);

				System.out.println("Conexion establecida");

			} catch (SQLException e) {
				System.out.println(e);

			}
			return conexion;

		}
	}

