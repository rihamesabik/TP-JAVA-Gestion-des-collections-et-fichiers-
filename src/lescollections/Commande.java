package lescollections;

import java.util.Date;

	public class Commande implements Comparable<Commande> {
	  private int NumCommande;
	  private Date DateCommande;
	  private String  NomFornisseur;
	  public Commande(int NumCommande,Date DateCommande,String  NomFornisseur) {
		  this.NumCommande=NumCommande;
		  this.DateCommande= DateCommande;
		  this.NomFornisseur= NomFornisseur;
	  }
	  public int getNumCommande() {
		  return NumCommande;
	  }
	  public String getNomFornisseur() {
		  return NomFornisseur;
	  }
	  public void  setNumCommande(int NumCommande) {
		  this.NumCommande=NumCommande;
	  }
	  public String toString() {
		  return "NumCommande:"+NumCommande+",DateCommande:"+DateCommande+
				  ",NomFornisseur"+ NomFornisseur;
	  }
	  @Override
     public boolean equals(Object obj) {
    	 if (this==obj)return true;
    	 if (obj== null||getClass()!=obj.getClass())return false;
    	 Commande cmd = (Commande)obj;
    	 return this.NumCommande==cmd.NumCommande;
     }
	@Override
	public int compareTo(Commande o) {
		
		return this.DateCommande.compareTo(o.DateCommande);
	}
	    
	   
	}

	


