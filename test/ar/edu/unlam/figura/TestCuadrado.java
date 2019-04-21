package ar.edu.unlam.figura;

import org.junit.Test;

import junit.framework.Assert;

public class TestCuadrado {
	@Test
	public void tesMetodoDibujarCuadrado() {
		Cuadrado micuadrado = new Cuadrado(5, 5);

		Boolean valorEsperadoDibujar = true;
		Boolean valorObtenidoDibujar = micuadrado.dibujar();
		Assert.assertEquals(valorEsperadoDibujar, valorObtenidoDibujar);
		/*Integer valorEsperadoPerimetro=20;
		Integer valorObtenido=micuadrado.perimetroDelCuadrado();	
		
		Assert.assertEquals(valorEsperadoPerimetro, valorObtenido);*/

	}
	@Test
	public void testMetodoPerimetro() {
		Cuadrado micuadrado = new Cuadrado(5, 5);
	Integer valorEsperadoPerimetro=20;
	Integer valorObtenido=micuadrado.perimetroDelCuadrado();	
	
	Assert.assertEquals(valorEsperadoPerimetro, valorObtenido);
	}
	@Test
	public void testMetodoArea() {
		Cuadrado micuadrado = new Cuadrado(5, 5);
	Integer valorEsperadoArea=25;
	Integer valorObtenido=micuadrado.areaDelCuadrado();
	
	Assert.assertEquals(valorEsperadoArea, valorObtenido);
	}
}
