package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexiones.ConexionSQL;
import funciones.usuario;

public class Metodos_sql {

	public static ConexionSQL conexion = new ConexionSQL();

	public static PreparedStatement sentenciaPreparada;

	public static ResultSet resultado;

	public static String sql;

	public static int resultadoNumero = 0;
	
	
	
	public static String BuscarUsuarioRegistrado(String correo, String contrasena) {

		String busquedaUsuario = null;
		Connection conexion = null;

		try {
			conexion = ConexionSQL.conectar();
			String sentenciaBuscarUsuario = ("SELECT nombreUsuario,correo,contrasena FROM usuarios WHERE correo ='" + correo
					+ "' && contrasena ='" + contrasena + "'");
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
	
	
	public static void eliminar() {
	try {
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/aplicacion", "root",
                "123456");
        Statement comando = conexion.createStatement();
        int cantidad = comando.executeUpdate("delete from iniciosesion where nombreUsuario ='"
                + usuario.nombreUsuario + "'");
        if (cantidad == 1) {

        } 

        conexion.close();
    } catch (SQLException ex) {
        ex.printStackTrace();
    }
	}
	
	public static int guardar(String nombreUsuario, String apellidoUsua, String correo, String contraseña) {

        int resultado = 0;
        Connection conexion = null;

        String sentencia_guardar = ("INSERT INTO iniciosesion (nombreUsuario,apellidoUsua,correo,contraseña) VALUES(?,?,?,?)");

        try {
    		System.out.println(usuario.nombreUsuario);
            conexion = ConexionSQL.conectar();
            sentenciaPreparada = conexion.prepareStatement(sentencia_guardar);
            sentenciaPreparada.setString(1, usuario.nombreUsuario);
            sentenciaPreparada.setString(2, usuario.apellidoUsua);
            sentenciaPreparada.setString(3, usuario.correo);
            sentenciaPreparada.setString(4, usuario.contrasena);

            resultado = sentenciaPreparada.executeUpdate();

            sentenciaPreparada.close();

            conexion.close();

        } catch (Exception e) {

            System.out.println(e);

        }
        return resultado;

    }
	
	
	

}
