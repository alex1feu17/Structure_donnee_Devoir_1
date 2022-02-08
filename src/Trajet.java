
public class Trajet {
	String ville_depart;
	String ville_arrivee;
	float killo_depart;
	float kill_arrivee;
	Limousine limousine;
	
	public Trajet(String vd, String va, float kd, float ka, Limousine l)
	{
		ville_depart = vd;
		ville_arrivee = va;
		killo_depart = kd;
		kill_arrivee = ka;
		limousine = l;
	}
	public void affiche_info()
	{
		System.out.print(ville_depart);
		System.out.print(ville_arrivee);
		System.out.print(killo_depart);
		System.out.print(kill_arrivee);
		System.out.print(limousine.noImmatriculation);
		System.out.print(limousine.couleur);
		System.out.print(limousine.reservoir);
	}
}
