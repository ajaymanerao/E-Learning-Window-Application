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

public class CppCourse {

	private JFrame frmCppCourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CppCourse window = new CppCourse();
					window.frmCppCourse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CppCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCppCourse = new JFrame();
		frmCppCourse.setIconImage(Toolkit.getDefaultToolkit().getImage(CCourse.class.getResource("/Images/logo.png")));
		frmCppCourse.setTitle("C Course");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height =screenSize.height;
		frmCppCourse.setSize(width, height);
		frmCppCourse.setLocationRelativeTo(null);
	//	frmCCourse.setBounds(100, 100, 450, 300);
		frmCppCourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCppCourse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C++ Course");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(341, 20, 834, 71);
		frmCppCourse.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(CppCourse.class.getResource("/Images/c_1-580x387.jpg")));
		lblNewLabel_1.setBounds(29, 127, 581, 387);
		frmCppCourse.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- C++ is comes under object oriented programming.");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2.setBounds(25, 544, 462, 27);
		frmCppCourse.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("- C++ is a versatile programming language that is widely used in various domains,");
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(25, 566, 585, 27);
		frmCppCourse.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("including application development, game development, system programming.");
		lblNewLabel_2_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(35, 590, 682, 27);
		frmCppCourse.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("- It was created by Bjarne Stroustrup and first released in 1983.");
		lblNewLabel_2_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(25, 619, 628, 27);
		frmCppCourse.getContentPane().add(lblNewLabel_2_4);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCppCourse.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(119, 699, 123, 48);
		frmCppCourse.getContentPane().add(btnBack);
		
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
		frmCppCourse.getContentPane().add(btnExit);
	}
}
