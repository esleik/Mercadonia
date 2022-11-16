package Aplicacion;

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
		setBounds(100, 100, 679, 438);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(102, 215, 209));
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 248, 127)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("New label");
		label.setBounds(563, 376, -91, -44);
		contentPane.add(label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 69, 0));
		panel.setBounds(517, 336, -108, 39);
		contentPane.add(panel);
		
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
		header.setBorder(null);
		header.setBackground(new Color(255, 248, 127));
		header.setBounds(0, 0, 679, 61);
		contentPane.add(header);
		header.setLayout(null);
		
		JPanel boton_borrar = new JPanel();
		boton_borrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		boton_borrar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				boton_borrar.setBackground(new Color(255, 0, 0));
				
			}
			
			public void mouseExited(MouseEvent e) {
				boton_borrar.setBackground(new Color(255, 102, 102));
			}
			
			public void mouseClicked(MouseEvent e) {
				System.exit(1);
			}
		});
		boton_borrar.setBorder(null);
		boton_borrar.setBackground(new Color(255, 248, 127));
		boton_borrar.setBounds(632, 0, 47, 45);
		header.add(boton_borrar);
		
		JLabel xTexto = new JLabel("X");
		xTexto.setFont(new Font("Tahoma", Font.PLAIN, 29));
		boton_borrar.add(xTexto);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(vistaPrincipal.class.getResource("/imagenes/logomerca.png")));
		lblNewLabel.setBounds(0, 0, 109, 61);
		header.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(76, 90, 537, 39);
		contentPane.add(panel_1);
		panel_1.setBackground(new Color(255, 99, 125));
	}
}