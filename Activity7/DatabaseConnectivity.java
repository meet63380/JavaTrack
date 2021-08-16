/**
 * 
 */
package javaPractice;
import java.sql.*;
/**
 * @author shahm
 *
 */
class DatabaseConnectivity {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String DB_URL = "jdbc:mysql://localhost/sakila";
		String USER = "root";
		String PASS = "password";
		// Display the first and last names of all actors from the table actor.
		String QUERY1 = "select first_name, last_name from actor;";
		//Insert a record to represent Mary Smith renting 'Academy Dinosaur' from Mike Hillyer at Store 1 today .
		String QUERY2 = "insert into rental (rental_date, inventory_id, customer_id, staff_id) values (NOW(), 1, 1, 1);";
		//The actor HARPO WILLIAMS was accidentally entered in the actor table as GROUCHO WILLIAMS
		String QUERY3 = "update actor set first_name = 'HARPO', last_name = 'WILLIAMS' where first_name = 'GROUCHO' and last_name = 'WILLIAMS';";
		//You want to keep a description of each actor. You don't think you will be performing queries on a description, so create a column in the 
		//table actor named description and use the data type BLOB
		String QUERY4 = "ALTER TABLE actor ADD COLUMN description BLOB;";
		 // Delete the description column.
		String QUERY5 = "ALTER TABLE actor DROP COLUMN description;";
		
		Connection conn = DriverManager.getConnection(DB_URL, USER,PASS);
		
		Statement stmt = conn.createStatement();
        
		ResultSet rs = stmt.executeQuery(QUERY1);
        // Extract data from result set
        while (rs.next()) {
           // Retrieve by column name
           System.out.print("First: " + rs.getString("first_name"));
           System.out.println(" Last: " + rs.getString("last_name"));
        }
        
        int count = stmt.executeUpdate(QUERY2);
        System.out.println("number of rows affected by this query2= " + count);
        
        
        count = stmt.executeUpdate(QUERY3);
        System.out.println("number of rows affected by this query3= " + count);
        
        
        count = stmt.executeUpdate(QUERY4);
        System.out.println("number of rows affected by this query4= " + count);
        
       
        count = stmt.executeUpdate(QUERY5);
        System.out.println("number of rows affected by this query5= " + count);      
        
        conn.close();
	}

}
