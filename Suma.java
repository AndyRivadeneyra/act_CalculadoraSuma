import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Suma extends JFrame implements ActionListener{
	private JLabel mensaje;
	private JLabel mensaje2;
	private JButton boton;
	private JTextField caja;
	private JTextField caja2;
	
	public Suma(){
		super();
		configurarVentana();
		crearComponente();
	}
	
	private void configurarVentana(){
		this.setTitle("SUMAS");
		this.setSize(300,200);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		this.setResizable(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private void crearComponente(){
		mensaje = new JLabel();
		mensaje.setText("DIGITOS A SUMAR:");
		mensaje.setBounds(85,30,150,30);
		mensaje.setForeground(Color.RED);
		this.add(mensaje);
		
		mensaje2 = new JLabel();
		mensaje2.setText("+");
		mensaje2.setBounds(135,60,150,30);
		mensaje2.setForeground(Color.BLACK);
		this.add(mensaje2);
		
		caja = new JTextField();
		caja.setBounds(75,60,50,30);
		this.add(caja);
		
		caja2 = new JTextField();
		caja2.setBounds(155,60,50,30);
		this.add(caja2);
		
		boton = new JButton();
		boton.setText("SUMAR");
		boton.setBounds(90,100,100,30);
		boton.addActionListener(this);
		this.add(boton);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
		double r1=Double.parseDouble(caja.getText());
		double r2=Double.parseDouble(caja2.getText());
		double suma= r1+r2;
		JOptionPane.showMessageDialog(this,"EL RESULTADO ES: "+suma);
	}
	
	public static void main(String[] args){
		Suma holi = new Suma();
		holi.setVisible(true);
	}
}
