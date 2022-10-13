package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.Permissoes;
import modelo.Usuarios;

public class UsuarioDAO {

	// CREATE
	public void save(Usuarios usuario) {

		String sql = "INSERT INTO usuario" + "(nome_usuario, email_usuario,senha_usuario,id_permissao)"
				+ " VALUES (?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, usuario.getNome_usuario());
			pstm.setString(2, usuario.getEmail_usuario());
			pstm.setString(3, usuario.getSenha_usuario());

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

	// DELETE BY ID
	public void deleteById(int id) {
		String sql = "DELETE FROM usuarios WHERE id_usuario = ?";

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
		String sql = "UPDATE usuarios " + "SET nome usuario = ?, email_usuario = ?, senha_usuario = ?, id_permissao = ?"
				+ "WHERE id_usuario = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setString(1, usuario.getNome_usuario());
			pstm.setString(2, usuario.getEmail_usuario());
			pstm.setString(3, usuario.getSenha_usuario());
			pstm.setInt(4, usuario.getPermissoes().getId_permissao());
			pstm.setInt(5, usuario.getId_usuario());

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
	public List<Usuarios> getUsuarios() {
		String sql = "SELECT id_permissao FROM usuarios;";

		List<Usuarios> usuarios = new ArrayList<Usuarios>();

		Connection conn = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Usuarios usuario = new Usuarios();
				Permissoes permissao = new Permissoes();

				usuario.setId_usuario(rset.getInt("id_usuario"));
				usuario.setNome_usuario(rset.getString("nome_usuario"));
				usuario.setEmail_usuario(rset.getString("email_usuario"));
				usuario.setSenha_usuario(rset.getString("senha_usuario"));

				permissao.setTipo_permissao(rset.getString("tipo_permissao"));
				usuario.setPermissoes(permissao);

				usuarios.add(usuario);
			}
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
		return usuarios;
	}
}
