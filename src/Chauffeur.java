import java.util.List;

public class Chauffeur {
	String nom;
	String prenom;
	int annee_embauche;
	String adresse ;
	String identification;
	
	public Chauffeur(String n, String p, int a, String add)
	{
		nom = n;
		prenom = p;
		annee_embauche = a;
		adresse = add;
		identification = create_identification_number(n, p, a); 
	}
	public void affiche_info()
	{
		System.out.print("Nom: " + nom + ", ");
		System.out.print("Prenom: " + prenom + ", ");
		System.out.print("Annee: " + annee_embauche + ", ");
		System.out.print("Adresse: " + adresse + ", ");
		System.out.print("ID: " + identification + "\n");
	}
	
	public String create_identification_number(String n, String p, int a) {
		String convert = Integer.toString(a);
		String strOut = n.substring(0,3) + p.substring(0,1) + convert.substring(2,4);
		return strOut;
	}
}
