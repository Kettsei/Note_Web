package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDatabase {
	public ConnectToDatabase() {
		
	}
	// Tạo phương thức để lấy kết nối database
	public static Connection getConnect() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbshop","root", "2550");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Error when you connect to database! Error is: "+ e.getMessage());
		}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println(getConnect());
	}
	
	// Thực thi các truy vấn
	public void excuteSql(String sql) throws Exception {
		 Connection connect = getConnect();
		 Statement smt =  connect.createStatement();
		 smt.executeUpdate(sql);
	}
	// Truyền vào truy vấn
	public ResultSet selectData(String sql) throws Exception {
		Connection connect = getConnect();
		Statement smt =  connect.createStatement();
		 ResultSet rs = smt.executeQuery(sql);
		return rs;
	}
}
