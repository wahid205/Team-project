package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



/**
 *
 * @author Faysal Ahmed
 */


public class DataBaseConnection {

    //Connection conn = null;
    public static Connection connectTODB()
    {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:4306/hotel","root","");
          //  JOptionPane.showMessageDialog(null, "Connection Establishment");
            return conn;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            return null;
        }
        
        
    }
    
}
