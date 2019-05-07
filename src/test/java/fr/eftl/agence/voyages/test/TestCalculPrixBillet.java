package fr.eftl.agence.voyages.test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import fr.eftl.egence.voyages.prix.CalculPrixBillet;
import fr.eftl.egence.voyages.prix.CalculPrixUnitaire;


public class TestCalculPrixBillet {

	
	@Test
	public void prixBilletClasseEco() {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "eco");
		Assert.assertEquals(200, prixObtenu,0);
	
		
	}
	@Test
	public void prixBilletClassepremier() {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Londres", "Paris", "premiere");
		Assert.assertEquals(400, prixObtenu,0);
		
	}
	@Test
	public void prixBilletClassebusiness() {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "business");
		Assert.assertEquals(700, prixObtenu,0);
	}
	@Test
	public void prixBilletClassedeuxieme() {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "deuxieme");
		Assert.assertEquals(600, prixObtenu,0);
		
	}
	@Test
	public void prixBilletClassesurclasse() {
		CalculPrixBillet prixBillet = new CalculPrixBillet();
		//CalculPrixUnitaire calculPrixUnitaire = new CalculPrixUnitaire();
		CalculPrixUnitaire calculPrixUnitaire= Mockito.mock(CalculPrixUnitaire.class);
		Mockito.when(calculPrixUnitaire.generer()).thenReturn(200);
		
		prixBillet.setCalculPrixUnitaire(calculPrixUnitaire);
		
		Integer prixObtenu = prixBillet.calculer("Paris", "Londres", "surclasse");
		Assert.assertEquals(900, prixObtenu,0);
	}}