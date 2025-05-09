import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LoadDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "com.mysql.cj.jdbc.Driver";
		String url ="jdbc:mysql://localhost:3306/cgu";
		String uname = "root"; //user name
		String pwd = "AN24iket@raj"; //pass
		
		try {
		
		Class.forName(driver);
		System.out.println("Driver is ready");
		
		Connection con=DriverManager.getConnection(url, uname, pwd);
		System.out.println("Connection is ready.");
		
		// FOR SELECTING THE TABLE or SEE THE DATABASE.
		
		String query = "select * from account";
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getInt(3));
		}
		
		// FOR UPDATEING THE DATABASE
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Acc Num: ");
//		int num = sc.nextInt();
//		System.out.println("Enter deposit amt: ");
//		int amt = sc.nextInt();
//		
//		String query = "update account set balance = balance + ? Where num = ?";
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setInt(1, amt);
//		ps.setInt(2, num);
//		
//		int count = ps.executeUpdate();
//		if(count == 0)
//			System.out.println("Invalid account");
//		else
//			System.out.println("Deposited");
		
		
		// FOR DELETING THE ACCOUNT
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter Acc Num to delete: ");
//		int num = sc.nextInt();
//		
//		String query = "delete from account where num=?";
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setInt(1, num);
//		int count = ps.executeUpdate();
//		if(count == 0) 
//			System.out.println("Invalid acc num given.");
//		else
//			System.out.println("Account deleted...");
//		
		
		
		// FOR INSERTING DATA IN TABLE
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the Account details: ");
//		int num = sc.nextInt();
//		String name = sc.next();
//		int balance = sc.nextInt();
//		
//		
//		String query = "insert into account values(?,?,?)";
//		PreparedStatement ps = con.prepareStatement(query);
//		ps.setInt(1, num);
//		ps.setString(2, name);
//		ps.setInt(3, balance);
//		
//		int count = ps.executeUpdate();
//		System.out.println("Inserted : "+ count);
		
		// NOTE: FOR CREATING TABLE IN MYSQL
		
//		String query = "create table account(num int, name varchar(20), balance int)";
//		Statement st =con.createStatement();
//		st.execute(query);
//		System.out.println("Table created.");
		// logic 
		// close method after the use.
		
		// sc.close();
		con.close();
		System.out.println("Connection closed.");

	}
		catch(ClassNotFoundException e) {
			System.out.println("Error: No driver");
		}
		catch(SQLException el) {
			System.out.println("Error : in Connection");
		}
	}
}
