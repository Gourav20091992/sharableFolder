package com.sakshath.core.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sakshath.core.Exception.AddressException;
import com.sakshath.core.Exception.FormValidationException;
import com.sakshath.core.Exception.InvalidAuthenticationException;

@RestController
@RequestMapping("/api/data")
public class Utility {
	
	
	
	@PostMapping("/save")
	public void transferDataFromOracleToPostGres()
			throws FormValidationException, InvalidAuthenticationException, AddressException {
		
		
		// Oracle database connection parameters
        String oracleUrl = "jdbc:oracle:thin:@//172.17.148.178:1521/your_oracle_sid";
        String oracleUsername = "your_oracle_username";
        String oraclePassword = "your_oracle_password";
 
        // PostgreSQL database connection parameters
        String postgresUrl = "jdbc:postgresql://172.17.89.180:5432/mdm";
        String postgresUsername = "postgres";
        String postgresPassword = "mdmdb";
 
        try {
            // Establish connections to Oracle and PostgreSQL databases
            Connection oracleConnection = DriverManager.getConnection(oracleUrl, oracleUsername, oraclePassword);
            Connection postgresConnection = DriverManager.getConnection(postgresUrl, postgresUsername, postgresPassword);
 
            // Execute query on Oracle and fetch data
            Statement oracleStatement = oracleConnection.createStatement();
            ResultSet resultSet = oracleStatement.executeQuery("SELECT * FROM your_oracle_table");
 
            // Iterate through the result set and store data in PostgreSQL
            PreparedStatement postgresStatement = postgresConnection.prepareStatement(
                    "INSERT INTO your_postgres_table (column1, column2, column3) VALUES (?, ?, ?)");
 
            while (resultSet.next()) {
                // Assuming the columns in your Oracle table are column1, column2, and column3
                String column1Value = resultSet.getString("column1");
                int column2Value = resultSet.getInt("column2");
                String column3Value = resultSet.getString("column3");
 
                // Insert data into PostgreSQL table
                postgresStatement.setString(1, column1Value);
                postgresStatement.setInt(2, column2Value);
                postgresStatement.setString(3, column3Value);
                postgresStatement.executeUpdate();
            }
 
            // Close resources
            resultSet.close();
            oracleStatement.close();
            postgresStatement.close();
            oracleConnection.close();
            postgresConnection.close();
 
            System.out.println("Data transfer completed successfully.");
 
        } catch (SQLException e) {
            e.printStackTrace();
            System.err.println("Error while transferring data: " + e.getMessage());
        }
    }
}
	

		

	
	
	
	
	
		    
	        

	
	
