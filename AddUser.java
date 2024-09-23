package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class AddUser {

	private JFrame frmAddUser;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtEmail;
	private JTextField txtMiddleName;
	private JTextField txtcity;
	private JTextField txtpassword;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddUser window = new AddUser();
					window.frmAddUser.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddUser() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddUser = new JFrame();
		frmAddUser.getContentPane().setBackground(new Color(151, 193, 240));
		frmAddUser.getContentPane().setForeground(new Color(187, 156, 64));
		frmAddUser.setIconImage(Toolkit.getDefaultToolkit().getImage(AddUser.class.getResource("/Images/logo.png")));
		frmAddUser.setTitle("User Details");
		frmAddUser.setBounds(250,20, 1050, 800);
		frmAddUser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddUser.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add User Details");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 0, 987, 64);
		frmAddUser.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 62, 1016, 2);
		frmAddUser.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(55, 74, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(55, 194, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(55, 254, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(55, 322, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_6 = new JLabel("Degree");
		lblNewLabel_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6.setBounds(55, 442, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_6);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 642, 1016, 2);
		frmAddUser.getContentPane().add(separator_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Arial Black", Font.BOLD, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BE", "MCA", "ME", "MBA"}));
		comboBox.setBounds(227, 453, 192, 33);
		frmAddUser.getContentPane().add(comboBox);
		
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(0, 128, 192));
		txtFirstName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtFirstName.setBounds(227, 86, 743, 30);
		frmAddUser.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setForeground(new Color(0, 128, 192));
		txtLastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(227, 206, 743, 30);
		frmAddUser.getContentPane().add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setForeground(new Color(0, 128, 192));
		txtMobile.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(227, 266, 743, 30);
		frmAddUser.getContentPane().add(txtMobile);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(0, 128, 192));
		txtEmail.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(227, 334, 743, 30);
		frmAddUser.getContentPane().add(txtEmail);
		
		txtcity = new JTextField();
		txtcity.setForeground(new Color(0, 128, 192));
		txtcity.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtcity.setColumns(10);
		txtcity.setBounds(227, 394, 743, 30);
		frmAddUser.getContentPane().add(txtcity);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Password");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(55, 562, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_3_1);
		
		txtpassword = new JTextField();
		txtpassword.setForeground(new Color(0, 128, 192));
		txtpassword.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtpassword.setColumns(10);
		txtpassword.setBounds(227, 574, 743, 30);
		frmAddUser.getContentPane().add(txtpassword);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("City");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3_2.setBounds(55, 382, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_3_2);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddUser.setVisible(false);
				
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBounds(37, 669, 123, 48);
		frmAddUser.getContentPane().add(btnBack);
		
		JButton btnSave = new JButton("Save");
		btnSave.setBackground(new Color(0, 255, 128));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			String firstname = txtFirstName.getText();
			String middlename = txtMiddleName.getText();
			String lastname = txtLastName.getText();
			
			long mobile = Long.parseLong(txtMobile.getText());
			
			String email = txtEmail.getText();
			
			//System.out.println(firstName+lastname+mobile+address);
			

			String city = null ;
			String password = null;
		
			String city1 = txtcity.getText();
		
			String password1 = txtpassword.getText();
			
			
			String degree = null;
			
			degree = (String)comboBox.getSelectedItem();
			
			System.out.println(degree);
				
				
			JDBCHandling db = new JDBCHandling();	
				
				
			int status = db.insertData( firstname,middlename, lastname, mobile, email, city1, degree, password1);
				
			if(status==1) {
				JOptionPane.showMessageDialog(null, "Data Updated");
			}else {
				JOptionPane.showMessageDialog(null, "Problem in Add data");
			}
	
			}
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(319, 669, 123, 48);
		frmAddUser.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(255, 255, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText("");
				txtMiddleName.setText("");
				txtLastName.setText("");
				txtMobile.setText("");
				txtEmail.setText("");
				txtcity.setText("");
				txtpassword.setText("");
				
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(589, 669, 123, 48);
		frmAddUser.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(872, 669, 123, 48);
		frmAddUser.getContentPane().add(btnExit);
		
		
		
		JLabel lblNewLabel_1_8 = new JLabel("Middle Name");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_8.setBounds(55, 134, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_8);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setForeground(new Color(0, 128, 192));
		txtMiddleName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBounds(227, 146, 743, 30);
		frmAddUser.getContentPane().add(txtMiddleName);
		
		
		textField = new JTextField();
		textField.setBounds(358, 512, 612, 30);
		frmAddUser.getContentPane().add(textField);
		textField.setColumns(10);
		
		
		JButton btnOpen = new JButton("Open");
		btnOpen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser file = new JFileChooser();
				file.setCurrentDirectory(new File("user.dir"));
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("All Pic","png","jpg","jpeg","gif");
				file.addChoosableFileFilter(filter);
				
				int a = file.showSaveDialog(null);
				if(a==JFileChooser.APPROVE_OPTION) {
		
					textField.setText(file.getSelectedFile().getAbsolutePath());
				}
			}
		});
		btnOpen.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnOpen.setBounds(227, 512, 103, 30);
		frmAddUser.getContentPane().add(btnOpen);
		
		JLabel lblNewLabel_1_6_1 = new JLabel("Photo");
		lblNewLabel_1_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_6_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_6_1.setBounds(55, 502, 162, 50);
		frmAddUser.getContentPane().add(lblNewLabel_1_6_1);
	
		
		
		
		
	}
}
