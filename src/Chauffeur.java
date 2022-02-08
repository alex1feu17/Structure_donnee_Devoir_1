import java.util.ArrayList;
import java.util.List;

public class Chauffeur {
	String nom;
	String prenom;
	int annee_embauche;
	String adresse ;
	List<String> trajet;
	String identification;
	
	public Chauffeur(String n, String p, int a, String add, List<String> t)
	{
		nom = n;
		prenom = p;
		annee_embauche = a;
		adresse = add;
		trajet = t;
		identification = create_identification_number(nom,prenom,annee_embauche); 
	}
	public void affiche_info()
	{
		System.out.print(nom);
		System.out.print(prenom);
		System.out.print(annee_embauche);
		System.out.print(adresse);
		System.out.print(trajet);
		System.out.print(identification);		
	}
	
	public String create_identification_number(String n, String p, int a) {
		String convert = Integer.toString(a);
		String strOut = n.substring(0,2) + p.substring(0,0) + convert.substring(2,4);
		return strOut;
	}
}
