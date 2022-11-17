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
import javax.swing.border.MatteBorder;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaPrincipal extends JFrame {

	int xMouse,yMouse;
	int x,y;
	private JPanel contentPane;
	private JLabel label;
	static vistaPrincipal frame;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new vistaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public vistaPrincipal() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1106, 809);
		contentPane = new JPanel();

		contentPane.setBackground(new Color(255, 248, 127));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 248, 127))); 	
		contentPane.setBorder(new MatteBorder(1, 2, 1, 1, (Color) new Color(255, 102, 102)));


		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("New label");
		label.setBounds(563, 376, -91, -44);
		contentPane.add(label);
		
		JPanel header = new JPanel();
		
		header.addMouseListener(new MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent e) {
				xMouse = e.getX();
				yMouse = e.getY();
			}
		});
		
		header.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent e) {
				 x = e.getXOnScreen();
				 y = e.getYOnScreen();
				 frame.setLocation(x-xMouse,y-yMouse); 
			}
		});
		header.setBorder(new LineBorder(new Color(255, 99, 125), 2));
		header.setBackground(new Color(255, 248, 127));
		header.setBounds(0, 0, 1106, 84);
		contentPane.add(header);
		header.setLayout(null);
		
		JPanel boton_borrar = new JPanel();
		boton_borrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_borrar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				boton_borrar.setBackground(new Color(255, 0, 0));
				
			}
			
			public void mouseExited(MouseEvent e) {
				boton_borrar.setBackground(new Color(255, 248, 127));
			}
			
			public void mouseClicked(MouseEvent e) {
				System.exit(1);
			}
		});
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(102, 45, 1004, 39);
		header.add(panel_1);
		panel_1.setBackground(new Color(255, 99, 125));
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("iniciar sesion/carrito");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean inicio = false;
				if(inicio == false) {
				vistaInicia.abrir();
				}
				if(inicio == true ) {
					
				}
			}
		});
		btnNewButton.setBounds(760, 11, 234, 23);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("menu");
		btnNewButton_1.setBounds(31, 11, 700, 23);
		panel_1.add(btnNewButton_1);
		boton_borrar.setBorder(new LineBorder(new Color(255, 99, 125), 2));
		boton_borrar.setBackground(new Color(255, 248, 127));
		boton_borrar.setBounds(1059, 0, 47, 49);
		header.add(boton_borrar);
		
		JLabel xTexto = new JLabel("X");
		xTexto.setFont(new Font("Tahoma", Font.PLAIN, 29));
		boton_borrar.add(xTexto);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 99, 125), 2));
		lblNewLabel.setIcon(new ImageIcon(vistaPrincipal.class.getResource("/imagenes/logomerca.png")));
		lblNewLabel.setBounds(0, 0, 102, 84);
		header.add(lblNewLabel);
	}
}