package ar.edu.unlam.figura;

import org.junit.Assert;
import org.junit.Test;

public class TestRectangulo {
		
	
	@Test
	public void testMetodoDibujarRectangulo() {
		Rectangulo rectangulo1= new Rectangulo(10, 5);
		Boolean valorEsperado=true;
		Boolean valorObtenido=rectangulo1.dibujar();
		Assert.assertEquals(valorEsperado,valorObtenido);
	}
	@Test
	public void testAreaRectangulo() {
		Rectangulo rectangulo2= new Rectangulo(10, 5);
		Integer valorEsperadoAreaRectangulo=50;
		Integer valorObtenidoAreaRectangulo=rectangulo2.areaDelRectangulo();
		Assert.assertEquals(valorEsperadoAreaRectangulo,valorObtenidoAreaRectangulo);
		
		
	}
	public void testPerimetroRectangulo() {
		Rectangulo rectangulo3= new Rectangulo(10, 5);
		Integer valorEsperadoPerimetroRectangulo=30;
		Integer valorObtenidoPerimetroRectangulo=rectangulo3.perimetroDelRectangulo();
		Assert.assertEquals(valorEsperadoPerimetroRectangulo,valorObtenidoPerimetroRectangulo);
		
	}
}
