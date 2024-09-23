package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
import javax.swing.JTextField;

public class CCourse {

	private JFrame frmCCourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CCourse window = new CCourse();
					window.frmCCourse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCCourse = new JFrame();
		frmCCourse.getContentPane().setBackground(new Color(81, 160, 174));
		frmCCourse.setIconImage(Toolkit.getDefaultToolkit().getImage(CCourse.class.getResource("/Images/logo.png")));
		frmCCourse.setTitle("C Course");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height =screenSize.height;
		frmCCourse.setSize(width, height);
		frmCCourse.setLocationRelativeTo(null);
	//	frmCCourse.setBounds(100, 100, 450, 300);
		frmCCourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCCourse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("C Programming Course");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(327, 21, 834, 71);
		frmCCourse.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(CCourse.class.getResource("/Images/HD-wallpaper-c-sharp-metal-logo-grunge-programming-language-signs-blue-metal-background-c-sharp-creative-programming-language-c-sharp-logo.jpg")));
		lblNewLabel_1.setBounds(37, 135, 615, 405);
		frmCCourse.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- C remains a powerful and widely used language.");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2.setBounds(25, 568, 368, 27);
		frmCCourse.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("- It's important to note that it may have a steeper learning curve for beginners ");
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(25, 593, 585, 27);
		frmCCourse.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel(" compared to some more modern languages.");
		lblNewLabel_2_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(29, 615, 368, 27);
		frmCCourse.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("- However, the principles and skills gained from learning C are valuable and applicable");
		lblNewLabel_2_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(24, 640, 628, 27);
		frmCCourse.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel(" in various areas of computer science and software development.");
		lblNewLabel_2_5.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_5.setBounds(29, 663, 537, 27);
		frmCCourse.getContentPane().add(lblNewLabel_2_5);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCCourse.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(119, 720, 123, 48);
		frmCCourse.getContentPane().add(btnBack);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.setBounds(1247, 720, 123, 48);
		frmCCourse.getContentPane().add(btnExit);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setIcon(new ImageIcon(CCourse.class.getResource("/Images/cpl.jpg")));
		lblNewLabel_3.setBounds(921, 102, 253, 105);
		frmCCourse.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("New label");
		lblNewLabel_3_1.setIcon(new ImageIcon(CCourse.class.getResource("/Images/cpl.jpg")));
		lblNewLabel_3_1.setBounds(921, 217, 253, 105);
		frmCCourse.getContentPane().add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setIcon(new ImageIcon(CCourse.class.getResource("/Images/cpl.jpg")));
		lblNewLabel_3_2.setBounds(921, 332, 253, 105);
		frmCCourse.getContentPane().add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("New label");
		lblNewLabel_3_3.setIcon(new ImageIcon(CCourse.class.getResource("/Images/cpl.jpg")));
		lblNewLabel_3_3.setBounds(921, 447, 253, 105);
		frmCCourse.getContentPane().add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("New label");
		lblNewLabel_3_4.setIcon(new ImageIcon(CCourse.class.getResource("/Images/cpl.jpg")));
		lblNewLabel_3_4.setBounds(921, 568, 253, 105);
		frmCCourse.getContentPane().add(lblNewLabel_3_4);
		
		JButton btnBuyNow = new JButton(" Buy Now");
		btnBuyNow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JavaPaymentForm.main(null);
			}
		});
		btnBuyNow.setForeground(new Color(0, 0, 255));
		btnBuyNow.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBuyNow.setBounds(450, 720, 160, 48);
		frmCCourse.getContentPane().add(btnBuyNow);
		
		JButton btnPlay = new JButton("Play");
		btnPlay.setEnabled(false);
		btnPlay.setBackground(new Color(0, 255, 0));
		btnPlay.setForeground(new Color(0, 0, 0));
		btnPlay.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPlay.setBounds(1218, 135, 160, 48);
		frmCCourse.getContentPane().add(btnPlay);
		
		JButton btnPlay_1 = new JButton("Play");
		btnPlay_1.setEnabled(false);
		btnPlay_1.setForeground(Color.BLACK);
		btnPlay_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPlay_1.setBackground(Color.GREEN);
		btnPlay_1.setBounds(1218, 242, 160, 48);
		frmCCourse.getContentPane().add(btnPlay_1);
		
		JButton btnPlay_2 = new JButton("Play");
		btnPlay_2.setEnabled(false);
		btnPlay_2.setForeground(Color.BLACK);
		btnPlay_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPlay_2.setBackground(Color.GREEN);
		btnPlay_2.setBounds(1218, 357, 160, 48);
		frmCCourse.getContentPane().add(btnPlay_2);
		
		JButton btnPlay_3 = new JButton("Play");
		btnPlay_3.setEnabled(false);
		btnPlay_3.setForeground(Color.BLACK);
		btnPlay_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPlay_3.setBackground(Color.GREEN);
		btnPlay_3.setBounds(1218, 468, 160, 48);
		frmCCourse.getContentPane().add(btnPlay_3);
		
		JButton btnPlay_4 = new JButton("Play");
		btnPlay_4.setEnabled(false);
		btnPlay_4.setForeground(Color.BLACK);
		btnPlay_4.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnPlay_4.setBackground(Color.GREEN);
		btnPlay_4.setBounds(1218, 599, 160, 48);
		frmCCourse.getContentPane().add(btnPlay_4);
		
		JButton btnStartCourse = new JButton("Start Course");
		btnStartCourse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FinalLogin.main(null);
		
			}
		});
		btnStartCourse.setForeground(new Color(255, 0, 128));
		btnStartCourse.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnStartCourse.setBounds(784, 720, 194, 48);
		frmCCourse.getContentPane().add(btnStartCourse);
		
	}
}