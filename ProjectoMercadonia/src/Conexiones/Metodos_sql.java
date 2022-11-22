package Conexiones;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Conexiones.ConexionSQL;

public class Metodos_sql {

	public static ConexionSQL conexion = new ConexionSQL();

	public static PreparedStatement sentenciaPreparada;

	public static ResultSet resultado;

	public static String sql;

	public static int resultadoNumero = 0;
	
	
	
	public static String BuscarUsuarioRegistrado(String correo, String contraseña) {

		String busquedaUsuario = null;
		Connection conexion = null;

		try {
			conexion = ConexionSQL.conectar();
			String sentenciaBuscarUsuario = ("SELECT nombreUsuario,correo,contraseña FROM usuarios WHERE correo ='" + correo
					+ "' && contraseña ='" + contraseña + "'");
			sentenciaPreparada = conexion.prepareStatement(sentenciaBuscarUsuario);
			resultado = sentenciaPreparada.executeQuery();

			if (resultado.next()) {

				busquedaUsuario = "usuario encontrado";
			} else {
				busquedaUsuario = "usuario no existe";
			}

			conexion.close();

		} catch (Exception e) {

			System.out.println(e);
		}
		return busquedaUsuario;
	}
	
	
	

}
