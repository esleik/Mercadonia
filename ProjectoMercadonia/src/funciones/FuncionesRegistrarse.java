package funciones;

import Conexiones.Metodos_sql;

public class FuncionesRegistrarse {
	public static void guardar() {
		Metodos_sql.guardar(usuario.nombreUsuario, usuario.apellidoUsua, usuario.correo, usuario.contrasena);
	}

}

