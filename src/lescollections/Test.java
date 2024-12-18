package lescollections;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) throws IOException {
		

		Commande cmd1 = new Commande(1,new Date(), "Rihame");
		Commande cmd2 = new Commande(1,new Date(), "lina");
		Commande cmd3 = new Commande(1,new Date(), "anys");
		Client c1= new Client(1,"Rihame","145Gh7","06543224986");
	    ClientFidel clientFidel = new ClientFidel(2, "Jane Smith", "456 Rue XYZ","06543224986", "FID001", 10);
      
        c1.EnregistrerCommande(cmd1);
        c1.EnregistrerCommande(cmd2);
        c1.EnregistrerCommande(cmd3);
        List<Client> clients= new ArrayList<>();
        clients.add(c1);
        clients.add(clientFidel);
        
        System.out.println("Avant tri des commandes pour le client1:");
        System.out.println(c1.getListeCommandes());

        Collections.sort(c1.getListeCommandes());
        System.out.println("Après tri des commandes pour le client1:");
        System.out.println(clientFidel.getListeCommandes());
       
          Set<Commande> cmdset= new HashSet<>();
          cmdset.add(cmd3);
          cmdset.add(cmd2);
          cmdset.add(cmd1);
          Map<String, Client> clientMap = new HashMap<>();
          clientMap.put(c1.toString(),c1);
          clientMap.put(clientFidel.toString(),clientFidel);
          
          try (BufferedWriter writer = new BufferedWriter(new FileWriter("clients.txt"))) {
        	    for (Client client : clients) {
        	        writer.write(client.toString());
        	        
        	    }
        	}

        	try (BufferedReader reader = new BufferedReader(new FileReader("clients.txt"))) {
        	    String line;
        	    while ((line = reader.readLine()) != null) {
        	        System.out.println(line);
        	    }
        	}

          
		
	}

}
