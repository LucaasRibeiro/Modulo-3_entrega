package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.Usuarios;
import modelo.Clientes;
import modelo.Permissoes;

public class UsuarioDAO {
//CREATE
	public void save(Usuarios usuario) {

		String sql = "INSERT INTO usuarios " + "(login_usuario, senha_usuario, id_cliente, id_permissao)"
				+ "VALUES (?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, usuario.getLogin_usuario());
			pstm.setString(2, usuario.getSenha_usuario());

			pstm.setString(3, usuario.getClientes().getId_cliente());
			pstm.setString(4, usuario.getPermissoes().getId_permissao());

			pstm.execute();

		} catch (Exception e) {
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

	// DELETE BY ID
	public void deleteById(int id) {
		String sql = "DELETE FROM usuarios WHERE id_usuarios = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);

			pstm.execute();
		} catch (Exception e) {
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

	// UPDATE
	public void update(Usuarios usuario) {
		String sql = "UPDATE usuarios " + "Set login_usuario = ?, senha_usuario = ?, id_cliente = ?, id_permissao = ?"
				+ "WHERE id_usuario = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, usuario.getLogin_usuario());
			pstm.setString(2, usuario.getSenha_usuario());

			pstm.setString(3, usuario.getClientes().getId_cliente());
			pstm.setInt(4, usuario.getPermissoes().getId_permissao());

			pstm.execute();

		} catch (Exception e) {
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

	// READ
	public List<Usuarios> getUsuarios (){
		String sql = "SELECT id_permissao FROM usuario_permissao;";
		
		List<Usuarios> usuarios = new ArrayList<Usuarios>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			rset = pstm.executeQuery();
			
			while (rset.next()) {
				Usuarios usuario = new Usuarios ();
				Permissoes permissao = new Permissoes ();
				Clientes cliente = new Clientes ();
				
				usuario.setId_usuario(rset.getInt("id_usuario"));
				usuario.setLogin_usuario(rset.getString("login_usuario"));
				usuario.setSenha_usuario(rset.getString("senha_usuario"));
				
				permissao.setTipo_permissoes(rset.getString("tipo_permissao"));
				usuario.setPermissoes;(permissao);
				
				usuarios.add(usuario);
				
				
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return usuarios;
	}
}
