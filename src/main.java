// Alexy Duval, Alexis Michaud, Gabriel Deschenes
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;  

public class main {
	public static void main(String args[]) throws IOException  
	{  
		Path file_chauffeur = Path.of(args[0]);
		Path file_limousine = Path.of(args[1]);
		Path file_trajets = Path.of(args[2]);
		
		String string_chauffeur = Files.readString(file_chauffeur);
		String string_limousine = Files.readString(file_chauffeur);
		String string_trajets = Files.readString(file_chauffeur);
		
		String[] chauffeur_donnee = string_chauffeur.split("\t");
		String[] limousine_donnee = string_limousine.split("\t");
		String[] trajets_donnee = string_trajets.split("\t");
	
		//chauffeur_donnee[0] = nom
		//chauffeur_donnee[1] = prenom
		//chauffeur_donnee[2] = annee
		//chauffeur_donnee[3] = adresse
		
		//limousine_donnee[0] = nom
		//limousine_donnee[1] = prenom
		//limousine_donnee[2] = annee
		
		//trajets_donnee[0] = ville_depart
		//trajets_donnee[1] = ville_arrivee
		//trajets_donnee[2] = killo_depart
		//trajets_donnee[3] = kill_arrivee
		//trajets_donnee[4] = limousine
		
	}	
}
