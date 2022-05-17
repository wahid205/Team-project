/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

/**
 *
 * @author wahid
 */
import DB.DataBaseConnection;
import Classes.ForEmp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Faysal Ahmed
 */
public class EmpDB {
    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;
    
    public EmpDB()
    {
        conn = DataBaseConnection.connectTODB();
    }
      public void insertCustomer(ForEmp user)  {
        try {
            String SQL = "INSERT INTO employee_info"
                    + "('" + "name" + "'," + "'" + "address" + "','" + "phone" + "','" + "type" + "')"
                    + " values('"
                    + user.getName()
                    + "','" + user.getAddress() + "'"
                    + ",'" + user.getPhone_no() + "'"
                    + ",'" + "'"
                    + ")";

            conn = DriverManager.getConnection("jdbc:mysql://localhost:4306/hotel","root","");
            statement = conn.prepareStatement(SQL);
            System.out.println("connection done");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "InsertQuery Failed");
        }
        finally
        {
            flushStatementOnly();
        }
        
        
    }
    
    public void updateCustomer(ForEmp user) {
        // update userInfo set name = 'faysal' ,address = 'dhaka' where user_id = 3
        try {
            String SQL = "UPDATE employee_info SET  name = '"
                    + user.getName() + "',"
                    + "address = '" + user.getAddress() + "',"
                    + "phone = '" + user.getPhone_no() + "',"
                    + "' WHERE id= "
                    + user.getEmployee_id();
            conn = DriverManager.getConnection("jdbc:mysql://localhost:4306/hotel","root","");
            statement = conn.prepareStatement(SQL);
            statement.execute();
            JOptionPane.showMessageDialog(null, "successfully updated new Customer");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Update query Failed");
        }
        
        finally
        {
            flushStatementOnly();
        }

    }

    public void deleteCustomer(int userId) throws SQLException {
        try {
            String SQL = "DELETE FROM `employee_info` WHERE  id=?" + userId;
            conn = DriverManager.getConnection("jdbc:mysql://localhost:4306/hotel","root","");
            statement = conn.prepareStatement(SQL);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Deleted user");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Delete query Failed");
        }
        finally
        {
            flushStatementOnly();
        }

    }

    public ResultSet getAllCustomer() {
        try {
            String SQL = "SELECT * FROM employee_info";
            conn = DriverManager.getConnection("jdbc:mysql://localhost:4306/hotel","root","");
            statement = conn.prepareStatement(SQL);
            statement.execute();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n error coming from returning all customer DB Operation");
        }
        

        return result;
    }
     private void flushStatementOnly()
    {
        {
                        try
                        {
                            statement.close();
                            //conn.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }
     public void flushAll()
    {
        {
                        try
                        {
                            statement.close();
                            result.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> CLOSING DB");}
                    }
    }
}

    
