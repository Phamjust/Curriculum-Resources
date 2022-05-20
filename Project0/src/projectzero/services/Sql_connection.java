package projectzero.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sql_connection {
	
	
	public static void main (String[] args) {
		// 5/19 Lectures on connecting java to database
		//final String URL = jdbc:postgresql://{host}[:{port}]/[{database}]
		final String URL = "jdbc:postgresql://database-1.cujgkusgasn5.us-east-1.rds.amazonaws.com:5432/postgres";
		final String USERNAME = "java_login";
		final String PASSWORD = "p4ssw0rd";
		
		Connection connection;
		
		try {
			// First we connect to our database
			connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
			System.out.println("Im Connected!");
			
			//Second we try to insert something in.
			String insert = "insert into bankuser (first_name, last_name, birthdate, has_checking, has_savings, checking, savings, user_name, pss_word) values ('Jerry', 'Berry', '05/14/2020', true, false, 1000, 0, 'MilkMan', 'ladybug')";
			
			//We instantiate a statement from the connection.
			Statement statement = connection.createStatement();
			
			//Execute the string by passing it to the statement
			statement.execute(insert);
			
			//Now we try to retrieve the data back
			String selection = "select * from bankuser";
			//create an object to collect all the records we recieve
			ResultSet rs = statement.executeQuery(selection);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		
		
		
		
		
	}
}
