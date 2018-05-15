package pe1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pe1.Convertisseur;

//@Test et @Before necessite <dependency> junit dans pom.xml
public class TestConvertisseur {
	
	private Convertisseur convertisseur;//à tester

	@Before
	public void init() {
		convertisseur = new Convertisseur();
	}
	
	@Test
	public void testEuroToFranc() {
		double sommeEnFranc = convertisseur.euroToFranc(15);//montantEnEuro * 6.55957;
		Assert.assertEquals(sommeEnFranc, 98.0, 2.0);
	}
	
}
