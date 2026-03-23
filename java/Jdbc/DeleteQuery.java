package Jdbc;
import java.sql.*;


public class DeleteQuery {
    public static void main(String[] args) {
        Connection con  = null;
        PreparedStatement ps = null;

        // Driver load
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver load");
        }
        catch (ClassNotFoundException e){
            System.out.println(e);
        }
        // Databse connection
        try {
            con = DriverManager.getConnection("jdbc:mysql:/dataflair","root","root");
            System.out.println("Connection Done...");
        }
        catch (SQLException e){
            System.out.println(e);
        }
        // Query Exceution
        try {
            String sql;
            sql = "Delete from student where studid= 101";
            ps = con.prepareStatement(sql);

            ps.executeUpdate();
        }
        catch (SQLException e){
            System.out.println(e);
        }

    }
}
