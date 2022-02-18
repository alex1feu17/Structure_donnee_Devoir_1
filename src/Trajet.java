
public class Trajet {
	Chauffeur chauffeur;
	Limousine limousine;
	String ville_depart;
	String ville_arrivee;
	int killo_depart;
	int kill_arrivee;
	
	public Trajet(Chauffeur ch, String vd, String va, int kd, int ka, Limousine l)
	{
		chauffeur = ch;
		limousine = l;
		ville_depart = vd;
		ville_arrivee = va;
		killo_depart = kd;
		kill_arrivee = ka;
	}
	public void affiche_info()
	{
		System.out.print("[Trajet #" + (main.compagnie.getTrajets().indexOf(this) + 1) + "]:\n");
		System.out.print("Chauffeur:\n");
		chauffeur.affiche_info();
		System.out.print("Limousine:\n");
		limousine.affiche_info();
		System.out.print("Trajet:\n");
		System.out.print("Ville depart: " + ville_depart + ", ");
		System.out.print("Ville arrivee: " + ville_arrivee + ", ");
		System.out.print("Kilo. depart: " + killo_depart + ", ");
		System.out.print("Kilo. arrivee: " + kill_arrivee + "\n");
	}
}
