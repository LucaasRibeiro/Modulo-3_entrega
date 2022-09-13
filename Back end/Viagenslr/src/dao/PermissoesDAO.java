package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.Permissoes;

public class PermissoesDAO {
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// CREATE
	public void save(Permissoes permissao) {
		String sql = "INSERT INTO Permissoes (tipo_permissao) VALUES (?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, permissao.getTipo_permissao());

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

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//
	public void deleteById(int id) {
		String sql = "DELETE FROM Permissoes WHERE id_permissao = ?";

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

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// UPDATE
	public void update(Permissoes permissao) {

		String sql = "UPDATE Permissoes SET tipo_permissao = ? WHERE id_permissao = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, permissao.getTipo_permissao());
			pstm.setInt(2, permissao.getId_permissao());

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

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	// READ
	public List<Permissoes> getPermissoes() { // O RETORNO IRÁ SER FEITO NO FINAL
		String sql = "SELECT * FROM Permissoes";

		List<Permissoes> permissoes = new ArrayList<Permissoes>();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Permissoes permissao = new Permissoes();

				permissao.setId_permissao(rset.getInt("id_permissao"));
				permissao.setTipo_permissoes(rset.getString("tipo_permissao"));

				permissoes.add(permissao);
			}
		} catch (Exception e) {

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

		return permissoes;

	}

	public Permissoes getPermissaoById(int id_permissao) {
		String sql = "SELECT * FROM permissoes WHERE id_permissao = ?";

		Permissoes permissao = new Permissoes();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id_permissao);

			rset = pstm.executeQuery();

			rset.next();

			// RECUPERA O ID DO BANCO E ATRIBUI AO OBJETO
			permissao.setId_permissao(rset.getInt(id_permissao));
			permissao.setTipo_permissoes(rset.getString("tipo_permissao"));

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
		return permissao;
	}
}