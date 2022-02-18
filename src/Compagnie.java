import java.util.ArrayList;
import java.util.List;

public class Compagnie {
	
	private List<Chauffeur> chauffeurs = new ArrayList<>();
	private List<Limousine> limousines = new ArrayList<>();
	private List<Trajet> trajets = new ArrayList<>();
	
	public List<Trajet> getTrajets(){
		return trajets;
	}
	
	//Pour get une limousine par son immatriculation
	public Limousine getLimousineByImmatriculation(String immatriculation) {
		return limousines.stream().filter(x -> x.noImmatriculation.equals(immatriculation)).findAny().orElse(null);
	}
		
	//Pour get un chauffeur par son id
	public Chauffeur getChauffeurByID(String id) {
		return chauffeurs.stream().filter(x -> x.identification.equals(id)).findAny().orElse(null);
	}
	
	//Pour get les trajets d'un chauffeur par son id
	public List<Trajet> getTrajetsByChauffeurID(String id) {
		return trajets.stream().filter(x -> x.chauffeur.identification.equals(id)).toList();
	}
	
	//Pour get les limousines d'un chauffeur par son id
	public List<Limousine> getLimousinesByChauffeurID(String id) {
		return getTrajetsByChauffeurID(id).stream().map(x -> x.limousine).distinct().toList();
	}
	
	public void registerChauffeur(Chauffeur chauffeur) {
		this.chauffeurs.add(chauffeur);
	}
	
	public void registerLimousine(Limousine limousine) {
		this.limousines.add(limousine);
	}
	
	public void registerTrajet(Trajet trajet) {
		this.trajets.add(trajet);
	}
	
}
