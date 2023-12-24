package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Commande;
import model.CommandeProduit;

public class CommandeDaoIplementation implements ICommandeDao {
	
	@Override
	public List<Commande> showCommandesByStatus(String status ) {
		List<Commande> commandes = new ArrayList<Commande>();
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select * from Commande where status = ?");
			ps.setString(1, status);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Commande c = new Commande();
				c.setReferance(rs.getString("reference"));
				c.setStatus(rs.getString("status"));
				c.setPrix(rs.getDouble("prix"));
				c.setDate_commande(rs.getDate("date_commande"));
				c.setId_client(rs.getInt("id_client"));
				c.setId_user(rs.getInt("id_user"));
				commandes.add(c);
			}
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return commandes;
	}
	@Override
	public List<Commande> showAllCommandes() {
		List<Commande> commandes = new ArrayList<Commande>();
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select *from Commande");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Commande c = new Commande();
				c.setReferance(rs.getString("reference"));
				c.setStatus(rs.getString("status"));
				c.setPrix(rs.getDouble("prix"));
				c.setDate_commande(rs.getDate("date_commande"));
				c.setId_client(rs.getInt("id_client"));
				c.setId_user(rs.getInt("id_user"));
				commandes.add(c);
			}
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return commandes;
	}
	
	@Override
	public void toEnAtten(String ref) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps =con.prepareStatement("UPDATE Commande SET status = ? WHERE reference = ?");
			ps.setString(1, "en_attente");
			ps.setString(2, ref);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void toEnCours(String ref) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps =con.prepareStatement("UPDATE Commande SET status = ? WHERE reference = ?");
			ps.setString(1, "en_cours");
			ps.setString(2, ref);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override 
	public void toTraite(String ref) {
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps =con.prepareStatement("UPDATE Commande SET status = ? WHERE reference = ?");
			ps.setString(1, "traite");
			ps.setString(2, ref);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public CommandeProduit showDetails(String ref) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CommandeProduit ajouterCommande() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public CommandeProduit updateCommande(String ref) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void supprimerCommande(String ref) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Commande> rechercherCommande(String ref) {
		List<Commande>commandes = new ArrayList<Commande>();
		Connection con = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement("select *from commande where reference like ?");
			ps.setString(1, ref);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Commande c = new Commande();
				c.setReferance(rs.getString("reference"));
				c.setStatus(rs.getString("status"));
				c.setDate_commande(rs.getDate("date_commande"));
				c.setId_client(rs.getInt("referance"));
				c.setPrix(rs.getDouble("prix"));
				commandes.add(c);
			}
		}catch(SQLException e){
			e.printStackTrace();	
		}
		return commandes;
	}
}
