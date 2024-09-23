package mainpackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;

public class AddAdmin {

	private JFrame frmAddAdmin;
	private JTextField txtFirstName;
	private JTextField txtLastName;
	private JTextField txtMobile;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtEmail;
	private JTextField txtMiddleName;
	private JTextField txtpassword;
	private JTextField txtconfirm;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAdmin window = new AddAdmin();
					window.frmAddAdmin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAddAdmin = new JFrame();
		frmAddAdmin.getContentPane().setBackground(new Color(210, 210, 155));
		frmAddAdmin.getContentPane().setForeground(new Color(187, 156, 64));
		frmAddAdmin.setIconImage(Toolkit.getDefaultToolkit().getImage(AddUser.class.getResource("/Images/logo.png")));
		frmAddAdmin.setTitle("Admin Details");
		frmAddAdmin.setBounds(250,20, 1050, 800);
		frmAddAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAddAdmin.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Admin Details");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 40));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(24, 0, 987, 64);
		frmAddAdmin.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 62, 1016, 2);
		frmAddAdmin.getContentPane().add(separator);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(55, 84, 162, 50);
		frmAddAdmin.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Last Name");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(55, 240, 162, 50);
		frmAddAdmin.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Mobile");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(41, 319, 162, 50);
		frmAddAdmin.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Email");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(41, 399, 162, 50);
		frmAddAdmin.getContentPane().add(lblNewLabel_1_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 642, 1016, 2);
		frmAddAdmin.getContentPane().add(separator_1);
		
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(new Color(0, 128, 192));
		txtFirstName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtFirstName.setBounds(227, 96, 743, 30);
		frmAddAdmin.getContentPane().add(txtFirstName);
		txtFirstName.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setForeground(new Color(0, 128, 192));
		txtLastName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtLastName.setColumns(10);
		txtLastName.setBounds(227, 252, 743, 30);
		frmAddAdmin.getContentPane().add(txtLastName);
		
		txtMobile = new JTextField();
		txtMobile.setForeground(new Color(0, 128, 192));
		txtMobile.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtMobile.setColumns(10);
		txtMobile.setBounds(227, 331, 743, 30);
		frmAddAdmin.getContentPane().add(txtMobile);
		
		txtEmail = new JTextField();
		txtEmail.setForeground(new Color(0, 128, 192));
		txtEmail.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtEmail.setColumns(10);
		txtEmail.setBounds(227, 411, 743, 30);
		frmAddAdmin.getContentPane().add(txtEmail);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Password");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_3_1.setBounds(41, 486, 162, 50);
		frmAddAdmin.getContentPane().add(lblNewLabel_1_3_1);
		
		txtpassword = new JTextField();
		txtpassword.setForeground(new Color(0, 128, 192));
		txtpassword.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtpassword.setColumns(10);
		txtpassword.setBounds(227, 498, 743, 30);
		frmAddAdmin.getContentPane().add(txtpassword);
		
		
		JButton btnBack = new JButton("Back");
		btnBack.setBackground(new Color(255, 128, 128));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmAddAdmin.setVisible(false);
				
			}
		});
		btnBack.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnBack.setBounds(37, 669, 123, 48);
		frmAddAdmin.getContentPane().add(btnBack);
		
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
			

			
			String password = null;
		    String password1 = txtpassword.getText();
			
		    String confirmpass = null;
		    String confirmpass1 = txtpassword.getText();
		    
			
				
				
			JDBCHandling db = new JDBCHandling();	
				
				
			int status = db.insertData( firstname,middlename, lastname, mobile, email, password1,confirmpass1);
				
			if(status==1) {
				JOptionPane.showMessageDialog(null, "Data Updated");
			}else {
				JOptionPane.showMessageDialog(null, "Problem in Add data");
			}
	
			}
		});
		btnSave.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnSave.setBounds(319, 669, 123, 48);
		frmAddAdmin.getContentPane().add(btnSave);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setBackground(new Color(255, 255, 0));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtFirstName.setText("");
				txtMiddleName.setText("");
				txtLastName.setText("");
				txtMobile.setText("");
				txtEmail.setText("");
				txtpassword.setText("");
				txtconfirm.setText("");
			
				
				
				
				
				
			}
		});
		btnReset.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnReset.setBounds(589, 669, 123, 48);
		frmAddAdmin.getContentPane().add(btnReset);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBackground(new Color(255, 0, 0));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnExit.setBounds(872, 669, 123, 48);
		frmAddAdmin.getContentPane().add(btnExit);
		
		
		
		JLabel lblNewLabel_1_8 = new JLabel("Middle Name");
		lblNewLabel_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_8.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_8.setBounds(55, 160, 162, 50);
		frmAddAdmin.getContentPane().add(lblNewLabel_1_8);
		
		txtMiddleName = new JTextField();
		txtMiddleName.setForeground(new Color(0, 128, 192));
		txtMiddleName.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtMiddleName.setColumns(10);
		txtMiddleName.setBounds(227, 172, 743, 30);
		frmAddAdmin.getContentPane().add(txtMiddleName);
		
		JLabel btnconfirm = new JLabel("Confirm  pass");
		btnconfirm.setHorizontalAlignment(SwingConstants.CENTER);
		btnconfirm.setFont(new Font("Arial Black", Font.BOLD, 20));
		btnconfirm.setBounds(8, 559, 209, 50);
		frmAddAdmin.getContentPane().add(btnconfirm);
		
		txtconfirm = new JTextField();
		txtconfirm.setForeground(new Color(0, 128, 192));
		txtconfirm.setFont(new Font("Arial Black", Font.BOLD, 15));
		txtconfirm.setColumns(10);
		txtconfirm.setBounds(227, 571, 743, 30);
		frmAddAdmin.getContentPane().add(txtconfirm);
		
		
		
		
		
	}
}
