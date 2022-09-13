package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import connection.ConnectionMySQL;
import modelo.Clientes;

public class ClienteDAO {
public void save (Clientes cliente) {
	String sql = "INSERT INTO cliente (nome_cliente ,cpf_cliente , rg_cliente , email_cliente , senha_cliente , telefone_cliente , rua_cliente , numero_cliente , cep_cliente , bairro_cliente , cidade_cliente , estado_cliente ,país_cliente) VALUES (?,?,?,?,?,?,?.?,?,?,?,?,?)";

	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = ConnectionMySQL.createConnectionMySQL();
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, cliente.getNome_livro());
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		pstm.setDate(2, new Date(formatter.parse(sql)))
		
		
		
	}catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
}
