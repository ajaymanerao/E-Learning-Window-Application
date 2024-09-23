package mainpackage;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;

public class Approval {

	private JFrame frmApproval;
	private JTable table;
	private JTextField txtSerialNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Approval window = new Approval();
					window.frmApproval.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Approval() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmApproval = new JFrame();
		frmApproval.getContentPane().setBackground(new Color(255, 234, 255));
		frmApproval.setForeground(new Color(255, 128, 255));
		frmApproval.setBackground(new Color(255, 128, 255));
		frmApproval.setIconImage(Toolkit.getDefaultToolkit().getImage(Approval.class.getResource("/Images/logo.png")));
		//frmGedgearExamApproval.setIconImage(Toolkit.getDefaultToolkit().getImage(ExamApprovalPage.class.getResource("/image/CompanyLogo.png")));
		frmApproval.setTitle("Admin Approval");
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension dim = kit.getScreenSize();
		int width = dim.width;
		int height = dim.height;
		frmApproval.setSize(width, height);
		//frmGedgearExamApproval.setBounds(100, 100, 1100, 700);
		frmApproval.setLocationRelativeTo(null);
		frmApproval.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmApproval.getContentPane().setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(131, 176, 1207, 350);
		frmApproval.getContentPane().add(scrollPane);

		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"serialnumber", "firstname", "lastname", "email", "mobile","course","cstatus"
				}
				));
		table.getColumnModel().getColumn(0).setPreferredWidth(98);
		table.getColumnModel().getColumn(1).setPreferredWidth(98);
		table.getColumnModel().getColumn(2).setPreferredWidth(98);
		table.getColumnModel().getColumn(3).setPreferredWidth(130);
		table.getColumnModel().getColumn(4).setPreferredWidth(95);
		table.getColumnModel().getColumn(5).setPreferredWidth(97);
		table.getColumnModel().getColumn(6).setPreferredWidth(97);
		scrollPane.setViewportView(table);

		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(new Color(0, 0, 205));
		separator_1.setBounds(131, 571, 1207, 2);
		frmApproval.getContentPane().add(separator_1);

		JLabel lblNewLabel_1 = new JLabel("Enter Serial Number For Approval");
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(177, 692, 403, 46);
		frmApproval.getContentPane().add(lblNewLabel_1);

		txtSerialNumber = new JTextField();
		txtSerialNumber.setHorizontalAlignment(SwingConstants.CENTER);
		txtSerialNumber.setFont(new Font("Arial Black", Font.BOLD, 25));
		txtSerialNumber.setBounds(576, 692, 125, 52);
		frmApproval.getContentPane().add(txtSerialNumber);
		txtSerialNumber.setColumns(10);

		JButton btnNewButton = new JButton("Approve");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//				long mobile = Long.parseLong(txtMobile.getText());
				int serialnumber = Integer.parseInt(txtSerialNumber.getText());
				JDBCHandling jd = new JDBCHandling();
				int status = jd.approve(serialnumber);
				if(status ==1) {
					JOptionPane.showMessageDialog(null,"User Approved !");
				}else {
					JOptionPane.showMessageDialog(null,"Technical Error,Try After Some Time");
				}
			}
		});
		btnNewButton.setForeground(new Color(0, 64, 0));
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnNewButton.setBounds(723, 690, 189, 52);
		frmApproval.getContentPane().add(btnNewButton);

		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnExit.setForeground(new Color(255, 69, 0));
		btnExit.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnExit.setBounds(1175, 687, 142, 52);
		frmApproval.getContentPane().add(btnExit);

		JSeparator separator = new JSeparator();
		separator.setBounds(131, 132, 1207, 2);
		frmApproval.getContentPane().add(separator);

		JButton btnShowData = new JButton("Show Users");
		btnShowData.setBackground(new Color(255, 255, 255));
		btnShowData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JDBCHandling jd = new JDBCHandling();
				ResultSet result = jd.getTable();

				DefaultTableModel model = new DefaultTableModel();
				String[] columnNames = {"serialnumber","firstname","lastname","email","mobile","course","cstatus"};
				model.setColumnIdentifiers(columnNames);

				try {
					while(result.next()) {
						model.addRow(new Object[] {
								result.getInt(1),
								result.getString(2),
								result.getString(3),
								result.getString(4),
								result.getLong(5),
								result.getString(6),
								result.getBoolean(7)
						});
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				table.setModel(model);
				table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);








			}
		});
		btnShowData.setForeground(new Color(0, 176, 45));
		btnShowData.setFont(new Font("Arial Black", Font.BOLD, 30));
		btnShowData.setBounds(617, 583, 274, 66);
		frmApproval.getContentPane().add(btnShowData);

		JLabel lblNewLabel_1_1 = new JLabel("HAAP Institute");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(255, 0, 0));
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 45));
		lblNewLabel_1_1.setBounds(131, 18, 1266, 47);
		frmApproval.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("Admin Approval");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setForeground(new Color(0, 128, 255));
		lblNewLabel_1_1_1.setFont(new Font("Arial Black", Font.BOLD, 30));
		lblNewLabel_1_1_1.setBounds(131, 75, 1266, 47);
		frmApproval.getContentPane().add(lblNewLabel_1_1_1);
	}
}
