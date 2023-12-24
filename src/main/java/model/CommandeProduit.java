package model;

public class CommandeProduit {
	private int id;
	private String referanceCommande;
	private int idProduit;
	private int quatite;
	private Double prixTotal;
	
	public CommandeProduit() {
		super();
	}
	public CommandeProduit(String referanceCommande, int idProduit, int quatite, Double prixTotal) {
		super();
		this.referanceCommande = referanceCommande;
		this.idProduit = idProduit;
		this.quatite = quatite;
		this.prixTotal = prixTotal;
	}
	public int getQuatite() {
		return quatite;
	}
	public void setQuatite(int quatite) {
		this.quatite = quatite;
	}
	public Double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(Double prixTotal) {
		this.prixTotal = prixTotal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getReferanceCommande() {
		return referanceCommande;
	}
	public void setReferanceCommande(String referanceCommande) {
		this.referanceCommande = referanceCommande;
	}
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	@Override
	public String toString() {
		return "CommandeProduit [referanceCommande=" + referanceCommande + ", idProduit=" + idProduit + ", quatite="
				+ quatite + ", prixTotal=" + prixTotal + "]";
	}
}
