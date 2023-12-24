package dao;

import java.util.List;

import model.Commande;
import model.CommandeProduit;

public interface ICommandeDao {
	public void toEnAtten(String ref);
	public void toEnCours(String ref);
	public void toTraite(String ref);
	public List<Commande> showCommandesByStatus(String status) ;
	public List<Commande> showAllCommandes() ;
	public CommandeProduit showDetails(String ref);
	public CommandeProduit ajouterCommande();
	public CommandeProduit updateCommande(String ref);
	public void supprimerCommande(String ref);
	public List<Commande> rechercherCommande(String ref);
}
