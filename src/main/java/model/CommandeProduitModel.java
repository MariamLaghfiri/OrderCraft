package model;

import java.util.ArrayList;
import java.util.List;

public class CommandeProduitModel {
    private String motCle;
    private List<CommandeProduit> commandeProduits = new ArrayList<CommandeProduit>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<CommandeProduit> getCommandeProduits() {
		return commandeProduits;
	}
	public void setCommandeProduits(List<CommandeProduit> commandeProduits) {
		this.commandeProduits = commandeProduits;
	}
}
