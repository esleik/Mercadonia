package Visual;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import funciones.FuncionesRegistrarse;
import funciones.usuario;

public class Registrarse extends JFrame {

	private JPanel fondo;
	private JTextField txtNombre;
	private JPasswordField txtPassword;
	int xMouse, yMouse;
	private JTextField txtCorreo;
	private JTextField txtApellido;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registrarse frame = new Registrarse();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Registrarse() {
		setBackground(new Color(128, 128, 128));
		setResizable(false);
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 540);
		fondo = new JPanel();
		fondo.setBackground(new Color(78, 169, 59));
		fondo.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(fondo);
		fondo.setLayout(null);

		JPanel barra = new JPanel();
		barra.setBorder(null);
		barra.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent e) {
				int x = e.getXOnScreen();
				int y = e.getYOnScreen();
				setLocation(x - xMouse, y - yMouse);
			}
		});
		barra.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		barra.setBackground(new Color(0, 82, 0));
		barra.setBounds(0, 0, 701, 33);
		fondo.add(barra);
		barra.setLayout(null);

		JLabel exit = new JLabel("X");
		exit.setForeground(new Color(0, 0, 0));
		exit.setBounds(661, 0, 40, 33);
		barra.add(exit);
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		exit.setFont(new Font("Roboto Thin", Font.BOLD, 25));
		exit.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel logo = new JLabel("logo");
		logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mercadonia obj = new Mercadonia();
				obj.setVisible(true);
				dispose();
			}
		});
		logo.setIcon(new ImageIcon(Registrarse.class.getResource("/imagenes/LOGO.png")));
		logo.setBounds(45, 44, 130, 27);
		fondo.add(logo);

		JPanel mDesp = new JPanel();
		mDesp.setBackground(new Color(0, 82, 0));
		mDesp.setBounds(0, 33, 195, 507);
		fondo.add(mDesp);
		mDesp.setVisible(false);
		mDesp.setLayout(null);

		JLabel mDes = new JLabel("mDes");
		mDes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mDesp.setVisible(true);
			}
		});
		mDes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mDes.setIcon(new ImageIcon(Mercadonia.class.getResource("/imagenes/MdesplegableF.png")));
		mDes.setBounds(10, 44, 25, 25);
		fondo.add(mDes);
		
		JLabel mDes1 = new JLabel("mDes");
		mDes1.setIcon(new ImageIcon(Registrarse.class.getResource("/imagenes/MdesplegableF.png")));
		mDes1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mDesp.setVisible(false);
			}
		});
		mDes1.setBounds(10, 11, 25, 25);
		mDesp.add(mDes1);

		JLabel logo1 = new JLabel("logo");
		logo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mercadonia obj = new Mercadonia();
				obj.setVisible(true);
				dispose();
			}
		});
		logo1.setBounds(45, 10, 130, 27);
		mDesp.add(logo1);

		JPanel btnLogin = new JPanel();
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login obj = new Login();
				obj.setVisible(true);
				dispose();
			}
		});
		btnLogin.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLogin.setBackground(new Color(0, 82, 0));
		btnLogin.setBounds(0, 136, 195, 40);
		mDesp.add(btnLogin);
		btnLogin.setLayout(null);

		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setBounds(0, 0, 195, 40);
		btnLogin.add(lblNewLabel);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto", Font.BOLD, 25));

		JPanel btnProductos = new JPanel();
		btnProductos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Productos obj=new Productos();
				obj.setVisible(true);
				dispose();
			}
		});
		btnProductos.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnProductos.setBackground(new Color(0, 82, 0));
		btnProductos.setBounds(0, 187, 195, 40);
		mDesp.add(btnProductos);
		btnProductos.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("Productos");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Roboto", Font.BOLD, 25));
		lblNewLabel_1.setBounds(0, 0, 195, 40);
		btnProductos.add(lblNewLabel_1);

		JPanel btnCarrito = new JPanel();
		btnCarrito.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Carrito obj=new Carrito();
				obj.setVisible(true);
				dispose();
			}
		});
		btnCarrito.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCarrito.setBackground(new Color(0, 82, 0));
		btnCarrito.setBounds(0, 238, 195, 40);
		mDesp.add(btnCarrito);
		btnCarrito.setLayout(null);

		JLabel lblNewLabel_2 = new JLabel("Carrito");
		lblNewLabel_2.setBounds(0, 0, 195, 40);
		btnCarrito.add(lblNewLabel_2);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Roboto", Font.BOLD, 25));

		JPanel carrito1 = new JPanel();
		carrito1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Carrito obj = new Carrito();
				obj.setVisible(true);
				dispose();
			}
		});
		carrito1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		carrito1.setBackground(new Color(78, 169, 59));
		carrito1.setBounds(595, 44, 106, 36);
		fondo.add(carrito1);
		carrito1.setLayout(null);

		JLabel carrito = new JLabel("Carrito");
		carrito.setBounds(0, 0, 106, 33);
		carrito1.add(carrito);
		carrito.setHorizontalAlignment(SwingConstants.CENTER);
		carrito.setFont(new Font("Roboto", Font.BOLD, 15));

		JPanel login = new JPanel();
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login obj = new Login();
				obj.setVisible(true);
				dispose();
			}
		});
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login.setBackground(new Color(78, 169, 59));
		login.setBounds(495, 44, 100, 36);
		fondo.add(login);
		login.setLayout(null);

		JLabel log = new JLabel("Login");
		log.setBounds(0, 0, 100, 36);
		login.add(log);
		log.setFont(new Font("Roboto", Font.BOLD, 15));
		log.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel lg = new JPanel();
		lg.setLayout(null);
		lg.setBackground(new Color(0, 82, 0));
		lg.setBounds(229, 91, 270, 323);
		fondo.add(lg);
		
		JLabel labelNombre = new JLabel("NOMBRE");
		labelNombre.setHorizontalAlignment(SwingConstants.LEFT);
		labelNombre.setForeground(new Color(255, 128, 64));
		labelNombre.setFont(new Font("Roboto", Font.PLAIN, 15));
		labelNombre.setBounds(20, 11, 220, 20);
		lg.add(labelNombre);
		
		JLabel labelApellido = new JLabel("APELLIDO");
		labelApellido.setHorizontalAlignment(SwingConstants.LEFT);
		labelApellido.setForeground(new Color(255, 128, 64));
		labelApellido.setFont(new Font("Roboto", Font.PLAIN, 15));
		labelApellido.setBounds(20, 73, 220, 20);
		lg.add(labelApellido);
		
		txtNombre = new JTextField();
		txtNombre.setText("Ingrese su nombre");
		txtNombre.setForeground(new Color(128, 0, 0));
		txtNombre.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtNombre.setColumns(10);
		txtNombre.setBorder(null);
		txtNombre.setBackground(new Color(78, 169, 59));
		txtNombre.setBounds(20, 42, 220, 20);
		lg.add(txtNombre);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(128, 0, 0));
		separator.setBackground(new Color(128, 0, 0));
		separator.setBounds(20, 63, 220, 20);
		lg.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(128, 0, 0));
		separator_1.setBackground(new Color(128, 0, 0));
		separator_1.setBounds(20, 124, 220, 20);
		lg.add(separator_1);
		
		txtPassword = new JPasswordField();
		txtPassword.setText("+++++++++++++");
		txtPassword.setForeground(new Color(128, 0, 0));
		txtPassword.setEchoChar('*');
		txtPassword.setBorder(null);
		txtPassword.setBackground(new Color(78, 169, 59));
		txtPassword.setBounds(20, 228, 220, 20);
		lg.add(txtPassword);
		
		JLabel labelCorreo = new JLabel("CORREO");
		labelCorreo.setHorizontalAlignment(SwingConstants.LEFT);
		labelCorreo.setForeground(new Color(255, 128, 64));
		labelCorreo.setFont(new Font("Roboto", Font.PLAIN, 15));
		labelCorreo.setBounds(20, 135, 220, 20);
		lg.add(labelCorreo);
		
		txtCorreo = new JTextField();
		txtCorreo.setText("Ingrese su correo");
		txtCorreo.setForeground(new Color(128, 0, 0));
		txtCorreo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtCorreo.setColumns(10);
		txtCorreo.setBorder(null);
		txtCorreo.setBackground(new Color(78, 169, 59));
		txtCorreo.setBounds(20, 166, 220, 20);
		lg.add(txtCorreo);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(new Color(128, 0, 0));
		separator_2.setBackground(new Color(128, 0, 0));
		separator_2.setBounds(20, 186, 220, 20);
		lg.add(separator_2);
		
		JLabel labelContraseña = new JLabel("CONTRASEÑA");
		labelContraseña.setHorizontalAlignment(SwingConstants.LEFT);
		labelContraseña.setForeground(new Color(255, 128, 64));
		labelContraseña.setFont(new Font("Roboto", Font.PLAIN, 15));
		labelContraseña.setBounds(20, 197, 220, 20);
		lg.add(labelContraseña);
		
		txtApellido = new JTextField();
		txtApellido.setText("Ingrese su apellido");
		txtApellido.setForeground(new Color(128, 0, 0));
		txtApellido.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtApellido.setColumns(10);
		txtApellido.setBorder(null);
		txtApellido.setBackground(new Color(78, 169, 59));
		txtApellido.setBounds(20, 104, 220, 20);
		lg.add(txtApellido);
		
		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setForeground(new Color(128, 0, 0));
		separator_2_1.setBackground(new Color(128, 0, 0));
		separator_2_1.setBounds(20, 249, 220, 20);
		lg.add(separator_2_1);
		
		JPanel btnOkey = new JPanel();
		btnOkey.setBounds(181, 280, 59, 21);
		lg.add(btnOkey);
		btnOkey.setLayout(null);
		btnOkey.setBackground(new Color(78, 169, 59));
		
		JLabel lblOkey = new JLabel("OKEY");
		lblOkey.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				usuario.nombreUsuario = txtNombre.getText();
				usuario.apellidoUsua = txtApellido.getText();
				usuario.contrasena = txtPassword.getText();
				usuario.correo = txtCorreo.getText();
				FuncionesRegistrarse.guardar();
			}
		});
		lblOkey.setBounds(0, 0, 59, 21);
		btnOkey.add(lblOkey);
		lblOkey.setHorizontalAlignment(SwingConstants.CENTER);
		lblOkey.setForeground(new Color(128, 0, 0));
		lblOkey.setFont(new Font("Roboto", Font.PLAIN, 20));
	}
}
