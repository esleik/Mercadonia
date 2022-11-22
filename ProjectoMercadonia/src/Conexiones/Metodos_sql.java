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
	
	
	
	public static String buscarNombre(String correo) {

		String BusquedaNombre = null;
		Connection conexion = null;
		try {

			conexion = ConexionSQL.conectar();
			String sentenciaBuscar = ("SELECT nombreUsuario,ApellidoUsua FROM iniciosesion WHERE correo = '" + correo + "'");
			sentenciaPreparada = conexion.prepareStatement(sentenciaBuscar);
			resultado = sentenciaPreparada.executeQuery();

			if (resultado.next()) {

				String nombres = resultado.getString("nombres");
				String apellidos = resultado.getString("apellidos");
				BusquedaNombre = (nombres + " " + apellidos);
			}

			conexion.close();

		} catch (Exception e) {

			System.out.println(e);

		}
		return BusquedaNombre;
	}
	
	
	

}
