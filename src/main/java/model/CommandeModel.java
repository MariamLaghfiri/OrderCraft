package model;

import java.util.ArrayList;
import java.util.List;

import model.Commande;

public class CommandeModel {
    private String motCle;
    private List<Commande> commandes = new ArrayList<Commande>();
    private List<Commande> commandesEnAttente = new ArrayList<>();
    private List<Commande> commandesEnCours = new ArrayList<>();
    private List<Commande> commandesTraite = new ArrayList<>();

    public String getMotCle() {
        return motCle;
    }

    public List<Commande> getCommandesEnAttente() {
		return commandesEnAttente;
	}

	public void setCommandesEnAttente(List<Commande> commandesEnAttente) {
		this.commandesEnAttente = commandesEnAttente;
	}

	public List<Commande> getCommandesEnCours() {
		return commandesEnCours;
	}

	public void setCommandesEnCours(List<Commande> commandesEnCours) {
		this.commandesEnCours = commandesEnCours;
	}

	public List<Commande> getCommandesTraite() {
		return commandesTraite;
	}

	public void setCommandesTraite(List<Commande> commandesTraite) {
		this.commandesTraite = commandesTraite;
	}

	public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Commande> getCommandes() { 
        return commandes;
    }
    public void setCommandes(List<Commande> commandes) {
        this.commandes = commandes;
    }
}
