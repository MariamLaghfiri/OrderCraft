package dao;

import java.util.List;

import model.CommandeProduit;

public interface ICommandeProduitDao {
	public CommandeProduit ajouterCommandeProduit(CommandeProduit p);
	public List<CommandeProduit> showAllCommandeProduit();
	public CommandeProduit getCommandeProduit(int id);
	public CommandeProduit updateCommandeProduit(CommandeProduit p,int id);
	public void supprimerCommandeProduit(int id);
	public Double calculerTotalPrix(int q, Double p);
}
