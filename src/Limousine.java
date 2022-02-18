public class Limousine {
	String noImmatriculation;
	int reservoir;
	String couleur;
	
	public Limousine(String no, int r, String c)
	{
		noImmatriculation = no;
		reservoir = r;
		couleur = c;
	}
	public void affiche_info()
	{
		System.out.print("Immatriculation: " + noImmatriculation + ", ");
		System.out.print("Reservoir: " + reservoir + ", ");
		System.out.print("Couleur: " + couleur + "\n");
	}
}
