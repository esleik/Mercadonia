package funciones;

public class usuario {
	public static String nombreUsuario;
	public static String apellidoUsua;
	public static String correo;
	public static String contrasena;
	
	public usuario(String nombreUsuario, String apellidoUsua, String correo, String contrasena) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.apellidoUsua = apellidoUsua;
		this.correo = correo;
		this.contrasena = contrasena;
	}
	
	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApellidoUsua() {
		return apellidoUsua;
	}

	public void setApellidoUsua(String apellidoUsua) {
		this.apellidoUsua = apellidoUsua;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}


	

}
