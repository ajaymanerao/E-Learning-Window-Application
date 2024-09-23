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

public class SqlCourse {

	private JFrame frmSqlCourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SqlCourse window = new SqlCourse();
					window.frmSqlCourse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SqlCourse() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSqlCourse = new JFrame();
		frmSqlCourse.setIconImage(Toolkit.getDefaultToolkit().getImage(CCourse.class.getResource("/Images/logo.png")));
		frmSqlCourse.setTitle("SQL");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int width = screenSize.width;
		int height =screenSize.height;
		frmSqlCourse.setSize(width, height);
		frmSqlCourse.setLocationRelativeTo(null);
	//	frmCCourse.setBounds(100, 100, 450, 300);
		frmSqlCourse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSqlCourse.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SQL Course");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 50));
		lblNewLabel.setBounds(337, 22, 834, 71);
		frmSqlCourse.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(SqlCourse.class.getResource("/Images/sql-database-icon-logo-design-ui-ux-app-orange-inscription-shadow-96841969.jpg")));
		lblNewLabel_1.setBounds(25, 118, 744, 422);
		frmSqlCourse.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("- SQL, or Structured Query Language, is a domain-specific language used for managing and");
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2.setBounds(25, 568, 714, 27);
		frmSqlCourse.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("- It provides a standardized way for developers and database administrators to interact with ");
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(25, 615, 756, 27);
		frmSqlCourse.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("manipulating relational databases.");
		lblNewLabel_2_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_3.setBounds(35, 591, 368, 27);
		frmSqlCourse.getContentPane().add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_4 = new JLabel("- SQL is a powerful and widely adopted language in the field of database management. ");
		lblNewLabel_2_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_4.setBounds(25, 663, 628, 27);
		frmSqlCourse.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("databases, perform operations, and retrieve or modify data.");
		lblNewLabel_2_5.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		lblNewLabel_2_5.setBounds(35, 639, 537, 27);
		frmSqlCourse.getContentPane().add(lblNewLabel_2_5);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmSqlCourse.setVisible(false);
			}
		});
		btnBack.setForeground(new Color(0, 0, 0));
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.setBounds(119, 720, 123, 48);
		frmSqlCourse.getContentPane().add(btnBack);
		
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
		frmSqlCourse.getContentPane().add(btnExit);
	}
}
