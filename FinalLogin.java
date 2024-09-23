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

public class FinalLogin {

	private JFrame frmFinalLogin;
	private JTextField txtFirstName;
	private JPasswordField txtLastName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinalLogin window = new FinalLogin();
					window.frmFinalLogin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FinalLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFinalLogin = new JFrame();
		frmFinalLogin.setBackground(new Color(30, 162, 162));
		frmFinalLogin.getContentPane().setBackground(new Color(255, 255, 255));
		frmFinalLogin.getContentPane().setForeground(new Color(255, 255, 128));
		frmFinalLogin.setIconImage(Toolkit.getDefaultToolkit().getImage(LoginPage.class.getResource("/Images/logo.png")));
		frmFinalLogin.setTitle("HAAP Institue");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int w = (int)dim.getWidth();
		int h = (int)dim.getHeight();
		frmFinalLogin.setSize(w/2, h/2);
		frmFinalLogin.setLocationRelativeTo(null);
		//frame.setBounds(100, 100, 450, 300);
		frmFinalLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFinalLogin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HAAP Institute ");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 34));
		lblNewLabel.setBounds(45, 10, 683, 48);
		frmFinalLogin.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(34, 76, 720, 2);
		frmFinalLogin.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1.setBounds(45, 109, 129, 35);
		frmFinalLogin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(34, 190, 129, 35);
		frmFinalLogin.getContentPane().add(lblNewLabel_1_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtFirstName.setBounds(184, 112, 480, 28);
		frmFinalLogin.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JPasswordField();
		txtLastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtLastName.setBounds(184, 193, 480, 28);
		frmFinalLogin.getContentPane().add(txtLastName);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(24, 260, 720, 2);
		frmFinalLogin.getContentPane().add(separator_1);
		
		
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(250, 23, 5));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(588, 306, 111, 35);
		frmFinalLogin.getContentPane().add(btnExit);
		

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmFinalLogin.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(63, 306, 111, 35);
		frmFinalLogin.getContentPane().add(btnBack);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String firstname = txtFirstName.getText();
				//	JLabel txtLastName = null;
				String lastname = txtLastName.getText();

				JDBCHandling jd = new JDBCHandling();
//				String firstname = null;
//				String lastname = null;
				int status = jd.validateApproval(firstname, lastname);
				System.out.println(status);
				if (status == 1) {
			
					CCourseStart.main(null);
				}else {
					JOptionPane.showMessageDialog(null, "Sorry,Please purchase the course");
				}
				
			}
		});
		btnStart.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnStart.setBackground(new Color(255, 128, 0));
		btnStart.setBounds(327, 306, 111, 35);
		frmFinalLogin.getContentPane().add(btnStart);
	}
}
