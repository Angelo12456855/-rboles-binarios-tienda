package Venta;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class InterfazUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField jField1;
	private JTextField jField2;
	private JTextField jField3;
	private JTextField jField4; 
	private JTextField Field;
	private JTextField Field01;
	
	Arbol nuevoArbol = new Arbol(); //LLAMADO A CLASE ARBOL PARA LOS METODOS

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazUsuario frame = new InterfazUsuario();
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
	public InterfazUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 502);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setIcon(new ImageIcon(InterfazUsuario.class.getResource("/imagenes/imagenT.jpg")));
		lblNewLabel.setBounds(369, 150, 200, 313);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(InterfazUsuario.class.getResource("/imagenes/logo (2)j.jpg")));
		lblNewLabel_1.setBounds(369, 35, 200, 82);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("VENTAS DE PRENDA ");
		lblNewLabel_2.setFont(new Font("Roboto Black", Font.BOLD, 24));
		lblNewLabel_2.setBounds(28, 11, 367, 49);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Clave");
		lblNewLabel_3.setFont(new Font("Roboto Light", Font.BOLD, 14));
		lblNewLabel_3.setBounds(28, 56, 141, 26);
		contentPane.add(lblNewLabel_3);
		
		jField1 = new JTextField();
		jField1.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		jField1.setBounds(179, 57, 181, 26);
		contentPane.add(jField1);
		jField1.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Prenda a vender");
		lblNewLabel_3_1.setFont(new Font("Roboto Light", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(28, 93, 122, 26);
		contentPane.add(lblNewLabel_3_1);
		
		jField2 = new JTextField();
		jField2.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		jField2.setColumns(10);
		jField2.setBounds(178, 95, 181, 26);
		contentPane.add(jField2);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Total cancelado");
		lblNewLabel_3_1_1.setFont(new Font("Roboto Light", Font.BOLD, 14));
		lblNewLabel_3_1_1.setBounds(28, 218, 122, 26);
		contentPane.add(lblNewLabel_3_1_1);
		
		jField3 = new JTextField();
		jField3.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		jField3.setColumns(10);
		jField3.setBounds(178, 219, 181, 26);
		contentPane.add(jField3);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Opciones", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, null, new Color(0, 0, 0)));
		panel.setBounds(28, 335, 321, 117);
		contentPane.add(panel);
		panel.setLayout(null);
		
		//EVENTO BOTÓN DE BUCAR
		JButton Buscar = new JButton("Buscar");
		Buscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int clave = Integer.parseInt(jField4.getText());//TOMA LOS DATOS DE JTXTTFAILD	
				nuevoArbol.encontrado(clave);
				jField4.setText("");
			}
		});
		Buscar.setForeground(Color.BLACK);
		Buscar.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		Buscar.setBackground(SystemColor.activeCaption);
		Buscar.setBounds(31, 71, 92, 35);
		panel.add(Buscar);
		
		jField4 = new JTextField();
		jField4.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		jField4.setColumns(10);
		jField4.setBounds(31, 33, 92, 26);
		panel.add(jField4);
		
		//EVENTO BOTÓN MOSTRAR LOS REGISTROS
		JButton Mostrar = new JButton("Mostrar ventas");
		Mostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nuevoArbol.alturaArbol();
				nuevoArbol.imprimirNivel();
			}
		});
		Mostrar.setForeground(Color.BLACK);
		Mostrar.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		Mostrar.setBackground(SystemColor.activeCaption);
		Mostrar.setBounds(154, 44, 140, 35);
		panel.add(Mostrar);
		
		//FUNCIÓN PARA VENDER EL PRODUCTO	 
		JButton Button1 = new JButton("Vender producto");
		Button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			int clave = Integer.parseInt(jField1.getText());//TOMA LOS DATOS DE JTXTTFAILD
			int unidades = Integer.parseInt(Field01.getText());//TOMA LA CANTIDAD DE UNIDADES 
			int totalPagado = Integer.parseInt(jField3.getText());//TOMA EL TOTAL QUE SE INGRESA DEL JTXT 
			String nombrePrenda = jField2.getText(); //TOMA EL NOMBRE DE LA PRENDA VENDIDA
			String talla = Field.getText(); //TOMA EL NOMBRE DE LA PRENDA VENDIDA
			
			nuevoArbol.insertar(clave, nombrePrenda, unidades,talla, totalPagado); //EL BOTON1 HACE LLAMADO AL METODO INSERTAR
			//MOSTRAMOS QUE LA VENTA SE REGISTRO
			JOptionPane.showMessageDialog(null,"¡La venta ha sido realizada!");
			//LIMPIAMOS LOS JTEXTFIELD
			jField1.setText("");
			jField2.setText("");
			Field.setText("");
			Field01.setText("");
			jField3.setText("");
			}
		});
		Button1.setForeground(Color.BLACK);
		Button1.setBackground(SystemColor.activeCaption);
		Button1.setFont(new Font("Rockwell Condensed", Font.PLAIN, 18));
		Button1.setBounds(135, 270, 141, 35);
		contentPane.add(Button1);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Talla de prenda");
		lblNewLabel_3_1_1_1.setFont(new Font("Roboto Light", Font.BOLD, 14));
		lblNewLabel_3_1_1_1.setBounds(28, 176, 122, 26);
		contentPane.add(lblNewLabel_3_1_1_1);
		
		Field = new JTextField();
		Field.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		Field.setColumns(10);
		Field.setBounds(178, 177, 181, 26);
		contentPane.add(Field);
		
		Field01 = new JTextField();
		Field01.setFont(new Font("Roboto Light", Font.PLAIN, 13));
		Field01.setColumns(10);
		Field01.setBounds(178, 140, 181, 26);
		contentPane.add(Field01);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Unidades");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Roboto Light", Font.BOLD, 14));
		lblNewLabel_3_1_1_1_1.setBounds(28, 139, 122, 26);
		contentPane.add(lblNewLabel_3_1_1_1_1);
		
		JLabel lblNewLabel_4 = new JLabel("Le ofrecemos variedad");
		lblNewLabel_4.setBounds(421, 116, 158, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("de estilos a la moda");
		lblNewLabel_4_1.setBounds(421, 128, 148, 14);
		contentPane.add(lblNewLabel_4_1);
	}
}
