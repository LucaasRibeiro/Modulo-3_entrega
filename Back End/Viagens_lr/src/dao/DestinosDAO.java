package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.Destinos;

public class DestinosDAO {
//CREATE
	public void save(Destinos destino) {
		String sql = "INSERT INTO Destinos(nome_destino) VALUES (?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, destino.getNome_destino());
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

	// DELETE
	public void deleteById(int id) {
		String sql = "DELETE FROM Destinos WHERE id_destino = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);

			pstm.setInt(1, id);
		} catch (

		Exception e) {
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
	public void update(Destinos destino) {
		String sql = "UPDATE Destinos SET nome_destino = ? WHERE id_destino = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			pstm.setString(1, destino.getNome_destino());
			pstm.setInt(2, destino.getId_destino());

			pstm.execute();
		} catch (

		Exception e) {
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
	public List<Destinos> getDestinos() {
		String sql = "SELECT * FROM Destinos";

		List<Destinos> destinos = new ArrayList<Destinos>();

		Connection conn = null;
		PreparedStatement pstm = null;

		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {
				Destinos destino = new Destinos();

				destino.setId_destino(rset.getInt("id_destino"));
				destino.setNome_destino(rset.getString("nome_destino"));

				destinos.add(destino);
			}

		} catch (

		Exception e) {
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
		return destinos;
	}

	// READ - BY ID
	public Destinos getDestinosById(int id_destino) {
		String sql = "SELECT * FROM destinos WHERE id_destino = ?";

		Destinos destino = new Destinos();

		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id_destino);
			
			rset = pstm.executeQuery();
			
			rset.next();
			
			destino.setId_destino(rset.getInt("id_destino"));
			
			destino.setNome_destino(rset.getString("nome_editora"));
			
		} catch (

		Exception e) {
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
		return destino;
	}
}
