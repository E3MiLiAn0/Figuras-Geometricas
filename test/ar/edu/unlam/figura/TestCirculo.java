package ar.edu.unlam.figura;

import org.junit.Assert;
import org.junit.Test;

public class TestCirculo {
	
	@Test
	public void TestPerimetro(){
		
		Circulo C1 = new Circulo(5.0);
		Double vo = C1.Perimetro();
		Double ve = 31.41;
		
		Assert.assertEquals(ve, vo, 0.1);
	
	}	
	
	


}
