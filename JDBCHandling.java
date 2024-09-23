package mainpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCHandling {

	Connection con = null;
	PreparedStatement pstmt = null;
	Statement stmt;
	ResultSet result;

	JDBCHandling(){

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Got Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Problem in loading driver");
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdata", "root", "root");
			System.out.println("Wow : connection ho gaya");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem in connection");
		}
	}



	int insertData(String firstname, String middlename,String lastname, long mobile, String email, String city, String degree, String password ) {
		int status=0;

		try {
			pstmt = con.prepareStatement("insert into usertable values(default,?,?,?,?,?,?,?,?)");
			pstmt.setString(1,firstname);
			pstmt.setString(2,middlename);
			pstmt.setString(3,lastname);
			pstmt.setLong(4,mobile);
			pstmt.setString(5,email);
			pstmt.setString(6,city);
			pstmt.setString(7,degree);
			pstmt.setString(8,password);


			status = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return status;
	}

	int insertData(String firstname, String middlename,String lastname, long mobile, String email,  String password, String confirmpass ) {
		int status=0;

		try {
			pstmt = con.prepareStatement("insert into admintable values(default,?,?,?,?,?,?,?)");
			pstmt.setString(1,firstname);
			pstmt.setString(2,middlename);
			pstmt.setString(3,lastname);
			pstmt.setLong(4,mobile);
			pstmt.setString(5,email);
			pstmt.setString(6,password);
			pstmt.setString(7, confirmpass);


			status = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



		return status;
	}

	int vaildate(String firstname,String password) {
		int status = 0;

		String query  = "select * from usertable where firstname=? and password=?";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, firstname);
			pstmt.setString(2, password);

			ResultSet result = pstmt.executeQuery();

			if (result.next()) {
				boolean Password = result.getBoolean("password");
				if (Password == result.getBoolean("password")) {
					status = 1;
				}else {
					status = 0;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}


	int insertData(String firstname, String lastname, String email,long mobile,String course) {

		int status = 0;


		try {
			pstmt = con.prepareStatement("insert into approval values (default,?,?,?,?,?,default)");
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);
			pstmt.setString(3, email);
			pstmt.setLong(4, mobile);
			pstmt.setString(5, course);
			

			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}


	ResultSet getTable() {
		try {
			stmt = con.createStatement();
			result = stmt.executeQuery("select * from approval");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;
	}
	int approve(int serialnumber) {
		int status =0;
		try {
			pstmt = con.prepareStatement("UPDATE approval SET cstatus=true WHERE serialnumber = ?");
			pstmt.setInt(1, serialnumber);
			status = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	int validateApproval(String firstname, String lastname) {
		int status = 0;

		String query = "SELECT * FROM approval WHERE firstname=? AND lastname=? AND cstatus = true";
		try {
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, firstname);
			pstmt.setString(2, lastname);

		    ResultSet resultSet = pstmt.executeQuery();
		    
		    if(resultSet.next()) {
		    	status =1;
		    }

		}
		catch (Exception e) {
			// TODO: handle exception
		}
		return status;

	}
}

