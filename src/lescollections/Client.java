package lescollections;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Client  {
	
	    private int CodeClient;
	    private String NomClient;
	    private String AdrClient;
	    private String TelClient;
	    private Vector<Commande> ListeCommandes;

	    
	    public Client(int CodeClient, String NomClient, String AdrClient,String TelClient) {
	        this.CodeClient = CodeClient;
	        this.NomClient = NomClient;
	        this.AdrClient = AdrClient;
	        this.TelClient=TelClient;
	        this.ListeCommandes = new Vector<>();
	    }
       public Vector<Commande> getListeCommandes() {
			return ListeCommandes;
		}
		public void setListeCommandes(Vector<Commande> listeCommandes) {
			ListeCommandes = listeCommandes;
		}
	public boolean EnregistrerCommande(Commande cmd) {
    	   return ListeCommandes.add(cmd);
       }
		public boolean SupprimerCommande(int NumCommande) {
			for(int i=0;i<ListeCommandes.size();i++) {
				if(ListeCommandes.get(i).getNumCommande()==NumCommande) {
					ListeCommandes.remove(i);
					return true;
				}
			}
			return false;
		}
		public String toString() {
			return"CodeClient"+CodeClient+", NomClient=" + NomClient + ", AdrClient=" + AdrClient + ", ListeCommandes=" + ListeCommandes;

		}
		
		
		
	}

	
	
	

