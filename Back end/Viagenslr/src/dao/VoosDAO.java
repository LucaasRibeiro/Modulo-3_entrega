package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connection.ConnectionMySQL;
import modelo.Voos;

public class VoosDAO {
	//CREATE
	public void save(Voos voo) {
		
		String sql = "INSERT INTO Voos (id_voo, origem_voo, destino_voo, dataIda_voo, dataVolta_voo) VALUES (?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, voo.getId_voo());
			
			pstm.execute();
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
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
//DELETE
	public void deleteById(int id) {
		String sql = "DELETE FROM Voos WHERE id_voo = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			pstm.setInt(1, id);
			
			pstm.execute();
			
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
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//UPDATE
	public void update (Voos voo) {
		String sql = "UPDATE Voos SET id_voo = ? WHERE origem_voo = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			
			pstm.setString(1, voo.getId_voo());
			pstm.setString(2, voo.getOrigem_voo());
			pstm.setString(3, voo.getDestino_voo());
			pstm.setString(4, voo.getDataIda_voo());
			pstm.setString(5, voo.getDataVolta_voo());
			
			pstm.execute();
			
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
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//READ
	public List<Voos> getVoos(){
		String sql = "SELECT * FROM Voos";
		
		List<Voos> voo = new ArrayList<Voos>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			conn = ConnectionMySQL.createConnectionMySQL();
			pstm = conn.prepareStatement(sql);
			rset = pstm.executeQuery();
			
			while(rset.next ()) {
				Voos voo = new Voos();
				
				voo.setId_voo(rset.getInt("id_voo"));
				voo.setOrigem_voo(rset.getInt("origem_voo"));
				voo.getDestino_voo(rset.getInt("destino_voo"));
				voo.getDataIda_voo(rset.getInt("dataIda_voo"));
				voo.setDataVolta_voo(rset.getInt("dataVolta_voo"));
				
				voos.add(voo);
			}
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
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	return voo;
	}
	//READ - BY id
	public Voos getVoosById(int id_voo) {
		String sql = "SELECT * FROM voos WHERE id_voo =  ?";
		
		Voos voo = new Voos();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rset = null;
		
		try {
		conn = ConnectionMySQL.createConnectionMySQL();
		pstm = conn.prepareStatement(sql);
		pstm.setInt(1, id_voo);
		
		rset = pstm.executeQuery();
		rset.next();
		
		voo.setId_voo(rset.getInt("id_voo"));
		voo.setOrigem_voo(rset.getInt("origem_voo"));
		voo.getDestino_voo(rset.getInt("destino_voo"));
		voo.getDataIda_voo(rset.getInt("dataIda_voo"));
		voo.setDataVolta_voo(rset.getInt("dataVolta_voo"));
		
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
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
