package fr.eftl.egence.voyages.prix;

public class CalculPrixBillet {

	private CalculPrixUnitaire calculPrixUnitaire;
	private Integer prixUnitaire;
	private String classe;
	
	public Integer getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(Integer prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public Integer calculer(String depart,String arrivee, String classe) {
		calculPrixUnitaire.setDepart(depart);
		calculPrixUnitaire.setArrivee(arrivee);
		Integer varPrixUnitaire = calculPrixUnitaire.generer();
		switch(classe) {
		case "eco": 
			return varPrixUnitaire;
		case "premiere":
			return varPrixUnitaire * 2;
		case "business":
			return varPrixUnitaire * 2 + 300;
		case "deuxieme":
		 	return varPrixUnitaire * 2 + 200;
		case "surclasse":
	 	return varPrixUnitaire * 2 + 500;
		default:
			return varPrixUnitaire;
			
		}
	}
	public CalculPrixUnitaire getCalculPrixUnitaire() {
		return calculPrixUnitaire;
	}
	public void setCalculPrixUnitaire(CalculPrixUnitaire calculPrixUnitaire) {
		this.calculPrixUnitaire = calculPrixUnitaire;
	}
	
}
