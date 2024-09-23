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

public class LoginPage {

	private JFrame frmLoginPage;
	private JTextField txtLoginName;
	private JPasswordField txtPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage window = new LoginPage();
					window.frmLoginPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LoginPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLoginPage = new JFrame();
		frmLoginPage.setBackground(new Color(30, 162, 162));
		frmLoginPage.getContentPane().setBackground(new Color(133, 190, 182));
		frmLoginPage.getContentPane().setForeground(new Color(255, 255, 128));
		frmLoginPage.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/Images/logo.png")));
		frmLoginPage.setTitle("HAAP Institue");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int w = (int)dim.getWidth();
		int h = (int)dim.getHeight();
		frmLoginPage.setSize(w/2, h/2);
		frmLoginPage.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmLoginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLoginPage.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HAAP Institute Admin Login");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblNewLabel.setBounds(45, 10, 683, 48);
		frmLoginPage.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 76, 720, 2);
		frmLoginPage.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("User Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(45, 109, 129, 35);
		frmLoginPage.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("   Password");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(34, 190, 129, 35);
		frmLoginPage.getContentPane().add(lblNewLabel_1_1);
		
		txtLoginName = new JTextField();
		txtLoginName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtLoginName.setBounds(184, 112, 480, 28);
		frmLoginPage.getContentPane().add(txtLoginName);
		txtLoginName.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtPassword.setBounds(184, 193, 480, 28);
		frmLoginPage.getContentPane().add(txtPassword);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 260, 720, 2);
		frmLoginPage.getContentPane().add(separator_1);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(0, 255, 128));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String loginName = txtLoginName.getText();
				String password = txtPassword.getText();
				
			//	System.out.println(loginName + Password);
				switch (loginName) {
	            case "Harshal":
	                if (password.equals("2407")) {
	                    AdminWelcome.main(null);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Invalid User");
	                }
	                break;

	            case "Ajay":
	                if (password.equals("ajay@123")) {
	                	 AdminWelcome.main(null);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Invalid User");
	                }
	                break;

	            case "Aniket":
	                if (password.equals("56789")) {
	                	 AdminWelcome.main(null);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Invalid User");
	                }
	                break;

	            case "Pratik":
	                if (password.equals("2504")) {
	                	 AdminWelcome.main(null);
	                } else {
	                    JOptionPane.showMessageDialog(null, "Invalid User");
	                }
	                break;

	            default:
	                JOptionPane.showMessageDialog(null, "Invalid User");
	                break;
	        }
	   
				
				
			}
		});
		btnLogin.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnLogin.setBounds(332, 309, 111, 35);
		frmLoginPage.getContentPane().add(btnLogin);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 23, 5));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(574, 309, 111, 35);
		frmLoginPage.getContentPane().add(btnExit);
		
//		JButton btnSignup = new JButton("Sign up");
//		btnSignup.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				AddAdmin.main(null);
//			}
//		});
//		btnSignup.setFont(new Font("Tahoma", Font.BOLD, 14));
//		btnSignup.setBounds(367, 337, 95, 21);
//		frmLoginPage.getContentPane().add(btnSignup);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmLoginPage.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(83, 309, 111, 35);
		frmLoginPage.getContentPane().add(btnBack);
	}
}
