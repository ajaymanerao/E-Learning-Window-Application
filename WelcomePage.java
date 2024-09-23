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

public class WelcomePage {

	private JFrame frmHAAPinstitute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomePage window = new WelcomePage();
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
	public WelcomePage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHAAPinstitute = new JFrame();
		frmHAAPinstitute.getContentPane().setBackground(new Color(192, 192, 192));
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
		
		JLabel lblNewLabel = new JLabel("Welcome To HAAP Institute");
		lblNewLabel.setForeground(new Color(128, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(117, 25, 1288, 68);
		frmHAAPinstitute.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(117, 112, 1257, 0);
		frmHAAPinstitute.getContentPane().add(separator);
		
		JButton btnUser = new JButton("");
		btnUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage2.main(null);
				
			}
		});
		btnUser.setIcon(new ImageIcon(WelcomePage.class.getResource("/Images/user1.png")));
		btnUser.setBounds(805, 300, 164, 203);
		frmHAAPinstitute.getContentPane().add(btnUser);
		
		JButton btnAdmin = new JButton("");
		btnAdmin.setForeground(new Color(255, 128, 255));
		btnAdmin.setBackground(new Color(255, 128, 255));
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage.main(null);
				
			}
		});
		btnAdmin.setIcon(new ImageIcon(WelcomePage.class.getResource("/Images/admin.png")));
		btnAdmin.setBounds(1086, 300, 164, 203);
		frmHAAPinstitute.getContentPane().add(btnAdmin);
		
		JLabel lblNewLabel_1 = new JLabel("USER");
		lblNewLabel_1.setForeground(new Color(255, 128, 64));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Algerian", Font.BOLD, 32));
		lblNewLabel_1.setBounds(747, 244, 275, 46);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ADMIN");
		lblNewLabel_1_1.setForeground(new Color(255, 128, 64));
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Algerian", Font.BOLD, 32));
		lblNewLabel_1_1.setBounds(1024, 244, 275, 46);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_1_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(117, 656, 1257, 2);
		frmHAAPinstitute.getContentPane().add(separator_1);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(1159, 699, 123, 48);
		frmHAAPinstitute.getContentPane().add(btnExit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 0, 0));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHAAPinstitute.setVisible(false);
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBounds(148, 699, 123, 48);
		frmHAAPinstitute.getContentPane().add(btnBack);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(148, 112, 1257, 2);
		frmHAAPinstitute.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("Welcome !");
		lblNewLabel_2.setFont(new Font("Vivaldi", Font.BOLD, 99));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(null);
		lblNewLabel_2.setBounds(200, 286, 408, 217);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hello,");
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 80));
		lblNewLabel_3.setBounds(200, 238, 345, 84);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("One of the best coding institute for beginners.");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_4.setBounds(142, 513, 608, 119);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Trusted by 1M students,");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(143, 499, 375, 46);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_5);
	}
}
