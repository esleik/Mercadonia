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
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ProductosAdmin extends JFrame {

	private JPanel fondo;
	int xMouse, yMouse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductosAdmin frame = new ProductosAdmin();
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
	public ProductosAdmin() {
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

		JPanel panelTablaProductos = new JPanel();
		panelTablaProductos.setBounds(45, 75, 623, 380);
		fondo.add(panelTablaProductos);
		panelTablaProductos.setLayout(null);
	}

}
