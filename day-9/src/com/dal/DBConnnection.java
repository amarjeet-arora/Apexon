package com.dal;

 
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;



public class DBConnnection {
	// declaration
	Properties prop = new Properties();
	Connection conn = null;
	PreparedStatement stmt = null;
	private String driver = prop.getProperty("driverClassName");
	private String url = prop.getProperty("dbUrl");
	private String username = prop.getProperty("username");
	private String password = prop.getProperty("password");

	// resource loading
	public DBConnnection() {
		try {
			prop.load(this.getClass().getResourceAsStream("db.properties"));
		} catch (IOException e) {

		}

	}

//connection
	public Connection getConnection() {
		try {
			Class.forName(driver);

			conn = DriverManager.getConnection(url, username, password);

		} catch (Exception e) {
		}
		return conn;
	}

}
