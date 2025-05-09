package cgu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Exp11 {
    public static void main(String[] args) {

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/cgu";
        String uname = "root";
        String pwd = "AN24iket@raj";

        try {
            Class.forName(driver);
            System.out.println("Driver is ready.");

            Connection con = DriverManager.getConnection(url, uname, pwd);
            System.out.println("Connection is ready.");

            String query = "SELECT * FROM student";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            // Print table header
            System.out.printf("%-10s %-15s %-10s %-25s %-15s\n", 
                "Reg No", "Name", "Branch", "Email", "Phone");
            System.out.println("--------------------------------------------------------------------------");

            // Loop through and print each record
            while (rs.next()) {
                int reg = rs.getInt(1);
                String name = rs.getString(2);
                String branch = rs.getString(3);
                String email = rs.getString(4);
                String phone = rs.getString(5);

                System.out.printf("%-10d %-15s %-10s %-25s %-15s\n", 
                    reg, name, branch, email, phone);
            }

            rs.close();
            st.close();
            con.close();
            System.out.println("\nConnection closed.");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
