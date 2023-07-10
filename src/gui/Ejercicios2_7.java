package gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicios2_7 extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicios2_7 frame = new Ejercicios2_7();
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
	public Ejercicios2_7() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[grow,fill][94.00][][][][115.00,grow][grow,fill]", "[grow,fill][][][][][][grow,fill]"));
		
		JLabel lblNewLabel = new JLabel("Selecciona un color");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblNewLabel, "cell 1 1 2 1");
		
		JPanel panelColor = new JPanel();
		contentPane.add(panelColor, "cell 4 2 2 4,grow");
		
		JRadioButton rdbAzul = new JRadioButton("Azul");
		rdbAzul.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				panelColor.setBackground(Color.BLUE);
			}
		});
		buttonGroup.add(rdbAzul);
		contentPane.add(rdbAzul, "cell 2 2 2 1");
		
		JRadioButton rdbRojo = new JRadioButton("Rojo");
		rdbRojo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				panelColor.setBackground(Color.RED);
			}
		});
		buttonGroup.add(rdbRojo);
		contentPane.add(rdbRojo, "cell 2 3 2 1");
		
		JRadioButton rdbVerde = new JRadioButton("Verde");
		rdbVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				panelColor.setBackground(Color.GREEN);
			}
		});
		buttonGroup.add(rdbVerde);
		contentPane.add(rdbVerde, "cell 2 4 2 1");
		
		JRadioButton rdbAmarillo = new JRadioButton("Magenta");
		rdbAmarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				panelColor.setBackground(Color.MAGENTA);
			}
		});
		buttonGroup.add(rdbAmarillo);
		contentPane.add(rdbAmarillo, "cell 2 5 2 1");
	}

}
