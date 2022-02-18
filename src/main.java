// Alexy Duval, Alexis Michaud, Gabriel Deschesnes
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  

public class main {
	
	public static Compagnie compagnie;
	
	public static void main(String args[]) throws IOException  {
		
		compagnie = new Compagnie();
		
		Scanner in = new Scanner(System.in);
		
		String[] chauffeurs_donnees = Files.readString(Path.of(args[0])).split("\n");
		String[] limousines_donnees = Files.readString(Path.of(args[1])).split("\n");
		String[] trajets_donnees = Files.readString(Path.of(args[2])).split("\n");
	
		for(int i = 0; i < chauffeurs_donnees.length; i++) {
			String[] chauffeur_donnees = chauffeurs_donnees[i].split("\t");
			if(chauffeur_donnees.length < 4) continue;
			compagnie.registerChauffeur(new Chauffeur(chauffeur_donnees[0].replace("\r", ""), chauffeur_donnees[1].replace("\r", ""), Integer.parseInt(chauffeur_donnees[2].replace("\r", "")), chauffeur_donnees[3].replace("\r", "")));
		}
		
		for(int i = 0; i < limousines_donnees.length; i++) {
			String[] limousine_donnees = limousines_donnees[i].split("\t");
			if(limousine_donnees.length < 3) continue;
			compagnie.registerLimousine(new Limousine(limousine_donnees[0].replace("\r", ""), Integer.parseInt(limousine_donnees[1].replace("\r", "")), limousine_donnees[2].replace("\r", "")));
		}
		
		for(int i = 0; i < trajets_donnees.length; i++) {
			String[] trajet_donnees = trajets_donnees[i].split("\t");
			if(trajet_donnees.length < 6) continue;
			compagnie.registerTrajet(new Trajet(compagnie.getChauffeurByID(trajet_donnees[0].replace("\r", "")), trajet_donnees[1].replace("\r", ""), trajet_donnees[2].replace("\r", ""), Integer.parseInt(trajet_donnees[3].replace("\r", "")), Integer.parseInt(trajet_donnees[4].replace("\r", "")), compagnie.getLimousineByImmatriculation(trajet_donnees[5].replace("\r", ""))));
		}
		
		String mode = "";
		while(!mode.equals("3")) {
			System.out.print("======================[MENU PRINCIPAL]=======================\n");
			System.out.print("[1] Afficher les limousines d'un chauffeur.\n");
			System.out.print("[2] Afficher les caractéristique des trajets.\n");
			System.out.print("[3] Quitter.\n");
			System.out.print("=============================================================\n");
			
			mode = in.next();
			
			if(mode.equals("1")) {
				System.out.print("Tapez un identifiant de chauffeur:\n");
				String id = in.next();
				List<Limousine> limousines = compagnie.getLimousinesByChauffeurID(id);
				System.out.print("========================[LIMOUSINES]=========================\n");
				for(Limousine limousine: limousines)
					limousine.affiche_info();
				System.out.print("=============================================================\n");
			} else if(mode.equals("2")) {
				System.out.print("==========================[TRAJETS]==========================\n");
				for(Trajet trajet: compagnie.getTrajets())
					trajet.affiche_info();
				System.out.print("=============================================================\n");
			}
		}
	}	
}
