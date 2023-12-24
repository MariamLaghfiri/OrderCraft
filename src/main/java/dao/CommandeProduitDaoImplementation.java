package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.CommandeProduit;

public class CommandeProduitDaoImplementation implements ICommandeProduitDao {

    @Override
    public CommandeProduit ajouterCommandeProduit(CommandeProduit p) {
        Connection con = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO commande_produit (id_produit, ref_commande, quantite, total_prix) VALUES (?, ?, ?, ?)");
            ps.setInt(1, p.getIdProduit());
            ps.setString(2, p.getReferanceCommande());
            ps.setInt(3, p.getQuatite());
            ps.setDouble(4, p.getPrixTotal());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public List<CommandeProduit> showAllCommandeProduit() {
        List<CommandeProduit> produits = new ArrayList<>();
        Connection con = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from commande_produit");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                CommandeProduit p = new CommandeProduit();
                p.setIdProduit(rs.getInt("id_produit"));
                p.setReferanceCommande(rs.getString("ref_commande"));
                p.setQuatite(rs.getInt("quantite"));
                p.setPrixTotal(rs.getDouble("total_prix"));
                produits.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return produits;
    }

    @Override
    public CommandeProduit getCommandeProduit(int id) {
        CommandeProduit p = null;
        Connection con = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("select * from commande_produit where id_produit = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                p = new CommandeProduit();
                p.setIdProduit(rs.getInt("id_produit"));
                p.setReferanceCommande(rs.getString("ref_commande"));
                p.setQuatite(rs.getInt("quantite"));
                p.setPrixTotal(rs.getDouble("total_prix"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public CommandeProduit updateCommandeProduit(CommandeProduit p, int id) {
        Connection con = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement(
                    "UPDATE commande_produit SET id_produit = ?, ref_commande = ?, quantite = ?, total_prix = ? WHERE id_produit = ?");
            ps.setInt(1, p.getIdProduit());
            ps.setString(2, p.getReferanceCommande());
            ps.setInt(3, p.getQuatite());
            ps.setDouble(4, p.getPrixTotal());
            ps.setInt(5, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }

    @Override
    public void supprimerCommandeProduit(int id) {
        Connection con = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = con.prepareStatement("delete from commande_produit where id_produit = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Double calculerTotalPrix(int q, Double p) {
        return q * p;
    }
}
