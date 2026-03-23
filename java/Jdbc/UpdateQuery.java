package Jdbc;
import java.sql.*;

public class UpdateQuery {
    public static void main(String[] args) {
        Connection con =null;
        PreparedStatement ps = null;
        // Driver load
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load");
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        // Database Connection
        try {
            con = DriverManager.getConnection("jdbc:mysql:/dataflair","root","root");
            System.out.println("Connection Done");
        }
        catch(SQLException e){
            System.out.println(e);
        }
        // Query Exceution
        String sql;
        try{
            sql = "UPDATE student SET studname = 'Ankit'  WHERE studid = 102 ";
            ps = con.prepareStatement(sql);
           // ps.setString(1,"Ankit");
           // ps.setInt(2,101);
         int rows =   ps.executeUpdate();
            System.out.println(rows + " Record update");

        }
        catch (SQLException e){
            System.out.println(e);
        }
    }
}
