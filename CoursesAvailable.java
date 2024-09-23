package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoursesAvailable {

	private JFrame frmHAAPinstitute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoursesAvailable  window = new CoursesAvailable ();
					window.frmHAAPinstitute.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CoursesAvailable () {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHAAPinstitute = new JFrame();
		frmHAAPinstitute.getContentPane().setForeground(new Color(192, 192, 192));
		frmHAAPinstitute.getContentPane().setBackground(new Color(255, 222, 189));
		frmHAAPinstitute.setBackground(new Color(64, 0, 64));
		frmHAAPinstitute.setForeground(new Color(64, 0, 64));
		frmHAAPinstitute.setIconImage(Toolkit.getDefaultToolkit().getImage(WelcomePage.class.getResource("/Images/logo.png")));
		frmHAAPinstitute.setTitle("HAAP Institute");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height =screenSize.height;
		frmHAAPinstitute.setSize(width, height);
		frmHAAPinstitute.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmHAAPinstitute.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHAAPinstitute.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(117, 112, 1257, 0);
		frmHAAPinstitute.getContentPane().add(separator);
		
		JButton btnc = new JButton("C ");
		btnc.setFont(new Font("Algerian", Font.BOLD, 50));
		btnc.setForeground(new Color(0, 0, 0));
		btnc.setBackground(new Color(0, 255, 255));
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			CCourse.main(null);
				
			}
		});
		btnc.setIcon(null);
		btnc.setBounds(240, 179, 174, 212);
		frmHAAPinstitute.getContentPane().add(btnc);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(117, 679, 1257, 2);
		frmHAAPinstitute.getContentPane().add(separator_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1159, 712, 123, 48);
		frmHAAPinstitute.getContentPane().add(btnExit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHAAPinstitute.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBounds(148, 712, 123, 48);
		frmHAAPinstitute.getContentPane().add(btnBack);
		
		JButton btncpp = new JButton("C++");
		btncpp.setFont(new Font("Algerian", Font.BOLD, 50));
		btncpp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CppCourse.main(null);
			}
		});
		btncpp.setIcon(null);
		btncpp.setForeground(new Color(0, 0, 0));
		btncpp.setBackground(new Color(0, 255, 255));
		btncpp.setBounds(667, 181, 174, 210);
		frmHAAPinstitute.getContentPane().add(btncpp);
		
		JButton btnpython = new JButton("PYTHON");
		btnpython.setFont(new Font("Algerian", Font.BOLD, 35));
		btnpython.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PythonCourse.main(null);
			}
		});
		btnpython.setIcon(null);
		btnpython.setForeground(new Color(0, 0, 0));
		btnpython.setBackground(new Color(0, 255, 255));
		btnpython.setBounds(1088, 179, 174, 212);
		frmHAAPinstitute.getContentPane().add(btnpython);
		
		JButton btnjava = new JButton("Java");
		btnjava.setFont(new Font("Algerian", Font.BOLD, 42));
		btnjava.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaCourse.main(null);
			}
		});
		btnjava.setForeground(new Color(0, 0, 0));
		btnjava.setBackground(new Color(255, 128, 192));
		btnjava.setBounds(240, 457, 174, 212);
		frmHAAPinstitute.getContentPane().add(btnjava);
		
		JButton btnsql = new JButton("SQL");
		btnsql.setFont(new Font("Algerian", Font.BOLD, 43));
		btnsql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SqlCourse.main(null);
			}
		});
		btnsql.setForeground(new Color(0, 0, 0));
		btnsql.setBackground(new Color(255, 128, 192));
		btnsql.setBounds(667, 457, 174, 212);
		frmHAAPinstitute.getContentPane().add(btnsql);
		
		JButton btnweb = new JButton("HTML");
		btnweb.setFont(new Font("Algerian", Font.BOLD, 42));
		btnweb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WebDevCourse.main(null);
			}
		});
		btnweb.setForeground(new Color(0, 0, 0));
		btnweb.setBackground(new Color(255, 128, 192));
		btnweb.setBounds(1088, 457, 174, 212);
		frmHAAPinstitute.getContentPane().add(btnweb);
		
		JLabel lblNewLabel = new JLabel("Hey,What's Up!!");
		lblNewLabel.setForeground(new Color(128, 64, 64));
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel.setBounds(39, 10, 420, 47);
		frmHAAPinstitute.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome To HAAP Institute.");
		lblNewLabel_2.setForeground(new Color(128, 64, 64));
		lblNewLabel_2.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_2.setBounds(39, 54, 420, 48);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Which Programming Language do you have instrest in??");
		lblNewLabel_2_1.setForeground(new Color(64, 0, 64));
		lblNewLabel_2_1.setFont(new Font("Sylfaen", Font.BOLD, 32));
		lblNewLabel_2_1.setBounds(39, 101, 819, 48);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBackground(new Color(255, 243, 232));
		lblNewLabel_1.setIcon(new ImageIcon(CoursesAvailable.class.getResource("/Images/logo.png")));
		lblNewLabel_1.setBounds(1293, 9, 219, 93);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_1);
	}
}
