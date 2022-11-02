package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.User;
import utils.JDBCUtils;


public class UserDao {

	public int registerEmployee(User employee) throws ClassNotFoundException {
		String INSERT_USERS_SQL = "INSERT INTO users"
				+ "  (first_name, last_name, username, password) VALUES "
				+ " (?, ?, ?, ?);";

		int result = 0;
		try (Connection connection = JDBCUtils.getConnection();
				// Step 2: Tạo một câu lệnh bằng cách sử dụng đối tượng kết nối
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
			preparedStatement.setString(1, employee.getFirstName());
			preparedStatement.setString(2, employee.getLastName());
			preparedStatement.setString(3, employee.getUsername());
			preparedStatement.setString(4, employee.getPassword());

			System.out.println(preparedStatement);
			// Step 3: Thực thi truy vấn hoặc cập nhật truy vấn
			result = preparedStatement.executeUpdate();

		} catch (SQLException e) {
			// xử lý ngoại lệ sql
			JDBCUtils.printSQLException(e);
		}
		return result;
	}

}
