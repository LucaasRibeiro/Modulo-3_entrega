package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
	public static Connection createConnectionMySQL() throws Exception{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/viagenslr?user=root&password=REcode7975@*");
		return connection;
	}

}