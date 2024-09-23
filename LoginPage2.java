package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPage2 {

	private JFrame frmLoginPage2;
	private JTextField txtfirstname;
	private JPasswordField txtpassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage2 window = new LoginPage2();
					window.frmLoginPage2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage2 = new JFrame();
		frmLoginPage2.setBackground(new Color(30, 162, 162));
		frmLoginPage2.getContentPane().setBackground(new Color(181, 142, 153));
		frmLoginPage2.getContentPane().setForeground(new Color(255, 255, 128));
		frmLoginPage2.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage2.class.getResource("/Images/logo.png")));
		frmLoginPage2.setTitle("HAAP Institue");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int w = (int)dim.getWidth();
		int h = (int)dim.getHeight();
		frmLoginPage2.setSize(w/2, h/2);
		frmLoginPage2.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmLoginPage2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HAAP Institute User Login");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblNewLabel.setBounds(45, 10, 683, 48);
		frmLoginPage2.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 76, 720, 2);
		frmLoginPage2.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(45, 109, 129, 35);
		frmLoginPage2.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("   Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(34, 190, 129, 35);
		frmLoginPage2.getContentPane().add(lblNewLabel_1_1);
		
		txtfirstname = new JTextField();
		txtfirstname.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtfirstname.setBounds(184, 112, 480, 28);
		frmLoginPage2.getContentPane().add(txtfirstname);
		txtfirstname.setColumns(10);
		
		txtpassword = new JPasswordField();
		txtpassword.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtpassword.setBounds(184, 193, 480, 28);
		frmLoginPage2.getContentPane().add(txtpassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 260, 720, 2);
		frmLoginPage2.getContentPane().add(separator_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(0, 255, 128));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstname = txtfirstname.getText();
				String password = txtpassword.getText();
				
			//	System.out.println(loginName + Password);
				
				JDBCHandling jd = new JDBCHandling();
				int status = jd.vaildate(firstname,password);
				
				if (status == 1) {
			//		JOptionPane.showMessageDialog(null, "Welcome to HAAP institute");
					CoursesAvailable.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Invalid credentials");
				}
				
			}
		});
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnLogin.setBounds(310, 279, 111, 35);
		frmLoginPage2.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 23, 5));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(543, 279, 111, 35);
		frmLoginPage2.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_2 = new JLabel("Don't have an account?");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(227, 342, 138, 13);
		frmLoginPage2.getContentPane().add(lblNewLabel_2);
		
		JButton btnSignup = new JButton("Sign up");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddUser.main(null);
			}
		});
		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSignup.setBounds(371, 339, 95, 21);
		frmLoginPage2.getContentPane().add(btnSignup);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginPage2.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(73, 279, 111, 35);
		frmLoginPage2.getContentPane().add(btnBack);
	}
}
