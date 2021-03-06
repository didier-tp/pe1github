package com.capgemini.pe1.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.pe1.Convertisseur;

//@Test et @Before necessite <dependency> junit dans pom.xml

/*
 * Les classes de Test sont par defaut déclenchées par maven 
 * si leurs noms commencent ou se terminent par "Test"
 */

public class ConverterTest {
	
	private static Convertisseur convertisseur;//à tester

	@BeforeClass
	public static void init() {
		System.out.println("init appelé une seule fois avec @BeforeClass");
		convertisseur = new Convertisseur();
	}
	
	@Test
	public void testEuroToFranc() {
		double sommeEnFranc = convertisseur.euroToFranc(15);//montantEnEuro * 6.55957;
		Assert.assertEquals(sommeEnFranc, 98.0, 2.0);
	}
	
	@Test
	public void testFrancToEuro() {
		double sommeEnEuro = convertisseur.FrancToEuro(99);//montantFranc / 6.55957;
		Assert.assertEquals(sommeEnEuro, 15.0, 0.5);
	}
	
}
