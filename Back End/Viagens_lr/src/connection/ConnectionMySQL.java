package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMySQL {
	public static Connection createConnectionMySQL() throws Exception{
		
		//CARREGAR A CLASSE PELO JVM
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//CRIAR A CONEXÃO COM O BANCO
		Connection connection = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/viagens_lr?user=root&password=REcode7975@*");
		return connection;
	}
	
	public static void main (String[] args) throws Exception {
		
		//RECUPERA A CONEXÃO COM O BANCO
		Connection con = createConnectionMySQL();
		
		//TESTE DE CONEXÃO
		if (con != null) {
			System.out.print(con + "\n****CONEXÃO BEM SUCEDIDA****\n");
			con.close();
		}
	}

}