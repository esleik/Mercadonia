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
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class vistaInicia extends JFrame {

	int xMouse,yMouse;
	int x,y;
	private JPanel contentPane;
	private JLabel label;
	static vistaInicia frame;
	private JTextField textField;
	private JTextField textField_1;


	public static void abrir() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new vistaInicia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public vistaInicia() {
		setUndecorated(true);
		setResizable(false);
		setBounds(350, 200, 613, 639);
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
		header.setBounds(0, 0, 613, 50);
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
				frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				
			}
		});
		boton_borrar.setBorder(new LineBorder(new Color(255, 99, 125), 2));
		boton_borrar.setBackground(new Color(255, 248, 127));
		boton_borrar.setBounds(567, 0, 47, 49);
		header.add(boton_borrar);
		
		JLabel xTexto = new JLabel("X");
		xTexto.setFont(new Font("Tahoma", Font.PLAIN, 29));
		boton_borrar.add(xTexto);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new LineBorder(new Color(255, 99, 125), 2));
		lblNewLabel.setIcon(new ImageIcon(vistaInicia.class.getResource("/imagenes/logomerca.png")));
		lblNewLabel.setBounds(0, 0, 102, 49);
		header.add(lblNewLabel);
		
		JPanel boton_borrar_1 = new JPanel();
		boton_borrar_1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			frame.setExtendedState(ICONIFIED);
				
			}
		});
		boton_borrar_1.setBorder(new LineBorder(new Color(255, 99, 125), 2));
		boton_borrar_1.setBackground(new Color(255, 248, 127));
		boton_borrar_1.setBounds(519, 0, 47, 49);
		header.add(boton_borrar_1);
		
		JLabel xTexto_1 = new JLabel("X");
		xTexto_1.setFont(new Font("Tahoma", Font.PLAIN, 29));
		boton_borrar_1.add(xTexto_1);
		
		textField = new JTextField();
		textField.setBounds(316, 217, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(316, 295, 96, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("No tengo una cuenta");
		lblNewLabel_1.setBounds(152, 362, 150, 14);
		contentPane.add(lblNewLabel_1);
	}
}