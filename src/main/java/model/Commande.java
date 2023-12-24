package model;

import java.io.Serializable;
import java.util.Date;

public class Commande implements Serializable {
	private String referance;
	private String status  ;
	private Double prix  ;
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	private Date date_commande;
	private int id_client;
	private int id_user;
	public Commande() {
		super();
	}
	public String getReferance() {
		return referance;
	}
	public void setReferance(String referance) {
		this.referance = referance;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}
	public int getId_client() {
		return id_client;
	}
	public void setId_client(int id_client) {
		this.id_client = id_client;
	}
	public int getId_user() {
		return id_user;
	}
	public void setId_user(int id_user) {
		this.id_user = id_user;
	}
	public Commande(String referance, String status, Double prix, Date date_commande, int id_client, int id_user) {
		super();
		this.referance = referance;
		this.status = status;
		this.prix = prix;
		this.date_commande = date_commande;
		this.id_client = id_client;
		this.id_user = id_user;
	}
	@Override
	public String toString() {
		return "Commande [referance=" + referance + ", status=" + status + ", prix=" + prix + ", date_commande="
				+ date_commande + ", id_client=" + id_client + ", id_user=" + id_user + "]";
	}

}
