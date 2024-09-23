package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class JavaPaymentForm {

	private JFrame frmHaapInstitute;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtEmailAddress;
	private JTextField txtPhoneNumber;
	private JTextField txtcourse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaPaymentForm window = new JavaPaymentForm();
					window.frmHaapInstitute.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public JavaPaymentForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmHaapInstitute = new JFrame();
		frmHaapInstitute.setTitle("HAAP Institute");
		frmHaapInstitute.setIconImage(Toolkit.getDefaultToolkit().getImage(JavaPaymentForm.class.getResource("/Images/logo.png")));
		//frame.setBounds(100, 100, 450, 300);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmHaapInstitute.setSize(width,height);
		frmHaapInstitute.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHaapInstitute.getContentPane().setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(164, 106, 1207, 2);
		frmHaapInstitute.getContentPane().add(separator);
		
		JLabel lblJavaExamEnrollment = new JLabel("Course Enrollment");
		lblJavaExamEnrollment.setToolTipText("");
		lblJavaExamEnrollment.setHorizontalAlignment(SwingConstants.CENTER);
		lblJavaExamEnrollment.setForeground(Color.GRAY);
		lblJavaExamEnrollment.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 30));
		lblJavaExamEnrollment.setBounds(360, 51, 801, 45);
		frmHaapInstitute.getContentPane().add(lblJavaExamEnrollment);
		
		JLabel lblNewLabel_1 = new JLabel("HAAP Institute");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setForeground(new Color(0, 64, 128));
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 40));
		lblNewLabel_1.setBounds(128, 0, 1266, 47);
		frmHaapInstitute.getContentPane().add(lblNewLabel_1);
		
		txtFirstName = new JTextField();
		txtFirstName.setHorizontalAlignment(SwingConstants.CENTER);
		txtFirstName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtFirstName.setBounds(921, 141, 450, 37);
		frmHaapInstitute.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setHorizontalAlignment(SwingConstants.CENTER);
		txtLastName.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(921, 241, 450, 37);
		frmHaapInstitute.getContentPane().add(txtLastName);
		
		txtEmailAddress = new JTextField();
		txtEmailAddress.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmailAddress.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtEmailAddress.setColumns(10);
		txtEmailAddress.setBounds(921, 338, 450, 37);
		frmHaapInstitute.getContentPane().add(txtEmailAddress);
		
		txtPhoneNumber = new JTextField();
		txtPhoneNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhoneNumber.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtPhoneNumber.setColumns(10);
		txtPhoneNumber.setBounds(921, 438, 450, 37);
		frmHaapInstitute.getContentPane().add(txtPhoneNumber);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(JavaPaymentForm.class.getResource("/Images/SC.jpg")));
		lblNewLabel_2.setBounds(-78, 118, 761, 543);
		frmHaapInstitute.getContentPane().add(lblNewLabel_2);
		
		JButton btnSubmit = new JButton("SUBMIT");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				JOptionPane.showMessageDialog(null,"Please Wait for some time & START the Test");
				
				String firstName = txtFirstName.getText();
				String lastName = txtLastName.getText();
				String email = txtEmailAddress.getText();
				long mobile = Long.parseLong(txtPhoneNumber.getText());
				String course = txtcourse.getText();
				
				JDBCHandling jd = new JDBCHandling();
				int status = jd.insertData(firstName, lastName, email, mobile,course);
				
				if(status ==1) {
					JOptionPane.showMessageDialog(null,"Payment Success,Login After Some Time");
					
					frmHaapInstitute.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null," Technical Error Found !");
				}
			}
		});
		btnSubmit.setForeground(new Color(255, 255, 255));
		btnSubmit.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		btnSubmit.setBackground(new Color(255, 0, 0));
		btnSubmit.setBounds(1008, 606, 283, 45);
		frmHaapInstitute.getContentPane().add(btnSubmit);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setBounds(756, 147, 138, 23);
		frmHaapInstitute.getContentPane().add(lblNewLabel);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setHorizontalAlignment(SwingConstants.CENTER);
		lblLastName.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblLastName.setBounds(756, 247, 138, 23);
		frmHaapInstitute.getContentPane().add(lblLastName);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblEmail.setBounds(756, 344, 138, 23);
		frmHaapInstitute.getContentPane().add(lblEmail);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setHorizontalAlignment(SwingConstants.CENTER);
		lblMobile.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblMobile.setBounds(756, 444, 138, 23);
		frmHaapInstitute.getContentPane().add(lblMobile);
		
		JLabel lblCource = new JLabel("Course");
		lblCource.setHorizontalAlignment(SwingConstants.CENTER);
		lblCource.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblCource.setBounds(756, 530, 138, 23);
		frmHaapInstitute.getContentPane().add(lblCource);
		
		txtcourse = new JTextField();
		txtcourse.setHorizontalAlignment(SwingConstants.CENTER);
		txtcourse.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 15));
		txtcourse.setColumns(10);
		txtcourse.setBounds(921, 517, 450, 37);
		frmHaapInstitute.getContentPane().add(txtcourse);
		
	}
}
