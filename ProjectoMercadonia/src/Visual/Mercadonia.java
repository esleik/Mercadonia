package Visual;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

public class Mercadonia extends JFrame {

	private JPanel fondo;
	int xMouse, yMouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mercadonia frame = new Mercadonia();
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
	public Mercadonia() {
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

		JLabel logo = new JLabel("logo");
		logo.setIcon(new ImageIcon(Mercadonia.class.getResource("/imagenes/LOGO.png")));
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
		mDes1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mDesp.setVisible(false);
			}
		});
		mDes1.setBounds(10, 11, 25, 25);
		mDesp.add(mDes1);

		JLabel logo1 = new JLabel("logo");
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
		
		JLabel zonas = new JLabel("zonas");
		zonas.setBounds(191, 166, 430, 242);
		fondo.add(zonas);
				
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
						
						JPanel panelCambiacolorX = new JPanel();
						panelCambiacolorX.addMouseListener(new MouseAdapter() {
							@Override
							public void mouseEntered(MouseEvent e) {
								
								panelCambiacolorX.setBackground(new Color(214, 56, 14));
								
							}
							@Override
							public void mouseExited(MouseEvent e) {
								
								panelCambiacolorX.setBackground(new Color(0, 82, 0));
								
							}
							@Override
							public void mouseClicked(MouseEvent e) {
								System.exit(0);
							}
						});
						panelCambiacolorX.setBounds(670, 0, 31, 33);
						barra.add(panelCambiacolorX);
						panelCambiacolorX.setBackground(new Color(0, 82, 0));
						panelCambiacolorX.setLayout(null);
						
						JLabel lblNewLabel_3 = new JLabel("X");
						lblNewLabel_3.setBounds(0, 0, 31, 33);
						panelCambiacolorX.add(lblNewLabel_3);
						lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD, 23));
						lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
	}
}
