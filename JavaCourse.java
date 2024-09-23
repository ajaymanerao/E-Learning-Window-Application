package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;
import java.awt.TextArea;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class JavaCourse {

	private JFrame frmJavaCourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaCourse window = new JavaCourse();
					window.frmJavaCourse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmJavaCourse = new JFrame();
		frmJavaCourse.setIconImage(Toolkit.getDefaultToolkit().getImage(CCourse.class.getResource("/Images/logo.png")));
		frmJavaCourse.setTitle("Java");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height =screenSize.height;
		frmJavaCourse.setSize(width, height);
		frmJavaCourse.setLocationRelativeTo(null);
	//	frmCCourse.setBounds(100, 100, 450, 300);
		frmJavaCourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmJavaCourse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("JAVA Course");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(341, 20, 834, 71);
		frmJavaCourse.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(JavaCourse.class.getResource("/Images/javaa.jpg")));
		lblNewLabel_1.setBounds(25, 111, 712, 420);
		frmJavaCourse.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- Java is a high-level, versatile, and object-oriented programming language.");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2.setBounds(25, 541, 749, 27);
		frmJavaCourse.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("- Java's platform independence, robustness, security features, and strong community support make it  ");
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(25, 568, 749, 27);
		frmJavaCourse.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("  a popular choice for developing a wide range of applications, from small-scale projects to large-scale ");
		lblNewLabel_2_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(25, 592, 758, 27);
		frmJavaCourse.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("  enterprise solutions.");
		lblNewLabel_2_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(25, 616, 628, 27);
		frmJavaCourse.getContentPane().add(lblNewLabel_2_4);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmJavaCourse.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(119, 699, 123, 48);
		frmJavaCourse.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(1254, 688, 123, 48);
		frmJavaCourse.getContentPane().add(btnExit);
	}
}
