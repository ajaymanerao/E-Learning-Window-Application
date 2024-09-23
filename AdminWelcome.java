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

public class AdminWelcome {

	private JFrame frmHAAPinstitute;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminWelcome window = new AdminWelcome();
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
	public AdminWelcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHAAPinstitute = new JFrame();
		frmHAAPinstitute.getContentPane().setBackground(new Color(255, 242, 230));
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
		lblNewLabel.setForeground(new Color(0, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(117, 25, 1288, 68);
		frmHAAPinstitute.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(117, 112, 1257, 0);
		frmHAAPinstitute.getContentPane().add(separator);
		
		JButton btnUserInfo = new JButton("Click Here To See User's Information");
		btnUserInfo.setForeground(new Color(0, 0, 0));
		btnUserInfo.setBackground(new Color(128, 255, 255));
		btnUserInfo.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnUserInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Approval.main(null);
				
			}
		});
		btnUserInfo.setIcon(null);
		btnUserInfo.setBounds(416, 463, 760, 101);
		frmHAAPinstitute.getContentPane().add(btnUserInfo);
		
		
		
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Welcome Admin !");
		lblNewLabel_2.setFont(new Font("Vladimir Script", Font.BOLD, 99));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(255, 255, 255));
		lblNewLabel_2.setIcon(null);
		lblNewLabel_2.setBounds(441, 236, 805, 217);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Hello,");
		lblNewLabel_3.setBackground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 80));
		lblNewLabel_3.setBounds(454, 165, 345, 84);
		frmHAAPinstitute.getContentPane().add(lblNewLabel_3);
	}
}
