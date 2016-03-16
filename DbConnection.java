// Connect to Access Database using JDBC-ODBC Bridge
// Displaying the contents of table S in database S_P_SP.
// Java core packages
import java.awt.*;
import java.sql.*;
import java.util.*;

// Java extension packages
import javax.swing.*;
public class DbConnection extends JFrame {
	ResultSet rs;
	Statement sta;
	Connection con;
   public DbConnection()
   {
	   try {
	         // load database driver class
	         Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );
	         // connect to database
	         con = DriverManager.getConnection(
	            "jdbc:odbc:Game Store1" );
	         // create Statement to query database
	         sta = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
 
	         
	      }
	      // detect problems interacting with the database
	      catch ( SQLException sqlException ) {
	         JOptionPane.showMessageDialog( null,
	            sqlException.getMessage(), "Database Error",
	            JOptionPane.ERROR_MESSAGE );
	         System.exit( 1 );
	      }
	      // detect problems loading database driver
	      catch ( ClassNotFoundException classNotFound ) {
	         JOptionPane.showMessageDialog( null,
	            classNotFound.getMessage(), "Driver Not Found",
	            JOptionPane.ERROR_MESSAGE );
	         System.exit( 1 );
	      }
	   } 
	  
}