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

public class WebDevCourse {

	private JFrame frmHtmlCourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WebDevCourse window = new WebDevCourse();
					window.frmHtmlCourse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WebDevCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHtmlCourse = new JFrame();
		frmHtmlCourse.setIconImage(Toolkit.getDefaultToolkit().getImage(CCourse.class.getResource("/Images/logo.png")));
		frmHtmlCourse.setTitle("HTML");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height =screenSize.height;
		frmHtmlCourse.setSize(width, height);
		frmHtmlCourse.setLocationRelativeTo(null);
	//	frmCCourse.setBounds(100, 100, 450, 300);
		frmHtmlCourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHtmlCourse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HTML Course");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(337, 31, 834, 71);
		frmHtmlCourse.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(WebDevCourse.class.getResource("/Images/html5-hypertext-markup-language-logo-html-5-illustration-wallpaper-preview.jpg")));
		lblNewLabel_1.setBounds(25, 131, 705, 413);
		frmHtmlCourse.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- HTML, or HyperText Markup Language, is the standard markup language for creating and ");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2.setBounds(25, 568, 705, 27);
		frmHtmlCourse.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("- It forms the backbone of web pages and is essential for building web documents.");
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(25, 615, 642, 27);
		frmHtmlCourse.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("structuring content on the World Wide Web.");
		lblNewLabel_2_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(35, 591, 368, 27);
		frmHtmlCourse.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("- HTML is foundational to web development, serving as the starting point for creating ");
		lblNewLabel_2_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(24, 640, 628, 27);
		frmHtmlCourse.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("dynamic and interactive websites. ");
		lblNewLabel_2_5.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_5.setBounds(34, 665, 537, 27);
		frmHtmlCourse.getContentPane().add(lblNewLabel_2_5);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmHtmlCourse.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(119, 720, 123, 48);
		frmHtmlCourse.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(1255, 710, 123, 48);
		frmHtmlCourse.getContentPane().add(btnExit);
	}
}
