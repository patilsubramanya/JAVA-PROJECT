package db;
import java.sql.*;
import javax.swing.JOptionPane;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static{
        try{
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/expensetracker"+"?useSSL=false","root", "root");
            st=c.createStatement();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
