package Jdbc;
import com.mysql.cj.jdbc.exceptions.MySQLQueryInterruptedException;

import java.sql.*;
import java.util.Scanner;

public class TastJdbc {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement ps = null;
        // Driver load
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        // Database Connection
        try {
            con = DriverManager.getConnection("jdbc:mysql:/dataflair", "root", "root");
            System.out.println("Connection Done");

        } catch (SQLException e) {
            System.out.println(e);
        }
        // Query Execution
        String sql;
        Scanner scan  = new Scanner (System.in);
        System.out.println("Enter Roll no");
        int rno = scan.nextInt();
        System.out.println("Enter name ");
        String name = scan.next();
        System.out.println("Enter Mobile no.");
        int mob = scan.nextInt();
        try {
            sql = "insert into student values(?,?,?)";
            ps = con.prepareStatement(sql);
            int n = 0;
            ps.setInt(1,rno);
            ps.setString(2,name);
            ps.setInt(3,mob);
            ps.executeUpdate();
            if(n ==1)
                System.out.println("Record inserted "+n);

            con.close();

        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
