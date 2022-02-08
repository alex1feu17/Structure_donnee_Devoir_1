public class Limousine {
	String noImmatriculation;
	float reservoir;
	String couleur;
	
	public Limousine(String no, float r, String c)
	{
		noImmatriculation = no;
		reservoir = r;
		couleur = c;
	}
	public void affiche_info()
	{
		System.out.print(noImmatriculation);
		System.out.print(reservoir);
		System.out.print(couleur);
	}
}
