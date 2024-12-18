package lescollections;

public class ClientFidel extends Client {
 
	private String CodeFidelite;
    private float TauxReduction;

    
    public ClientFidel(int CodeClient, String NomClient, String AdrClient,String TelClient, String CodeFidelite, float TauxReduction) {
        super(CodeClient, NomClient, AdrClient,TelClient);
        this.CodeFidelite = CodeFidelite;
        this.TauxReduction = TauxReduction;
    }

   
   public String toString() {
	   return super.toString() +"CodeFidelite:"+CodeFidelite+",TauxReduction :"+TauxReduction;
   }
}
