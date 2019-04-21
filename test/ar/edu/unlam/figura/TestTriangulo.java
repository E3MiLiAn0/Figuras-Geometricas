package ar.edu.unlam.figura;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class TestTriangulo {
	
	@Test 
	public void testMetodoDibujarTriangulo1() {
		Triangulo triangulo1=new Triangulo(15.0, 7.0, 12.0, 30.0, 90.0, 45.0);
		
		
		Boolean valorEsparoDibujar = true;
		Boolean valorObtenidaDibujar= triangulo1.dibujarTriangulo();
		Assert.assertEquals(valorEsparoDibujar,valorObtenidaDibujar);
		
		
		
	}
	
	@Test // este test me va a dar un error esperado (triangulo prohibido)
	public void testMetodoDibujarTriangulo2() {
		
		Triangulo triangulo2=new Triangulo(10.0, 7.0, 7.14, 90.0, 45.0, 90.0);	
		
		
		Boolean valorEsparoDibujar = true;// este valor es el que espero
		Boolean valorObtenidaDibujar= triangulo2.dibujarTriangulo();// este es el valor obtenido
		Assert.assertEquals(valorEsparoDibujar, valorObtenidaDibujar);// uso este metodo para comparar los resultados
		
		
		
	}
	@Test //este test me va a dar un error esperado (triangulo prohibido)
	public void testMetodoDibujarTriangulo3() {
			
		Triangulo triangulo3=new Triangulo(10.0, 10.0, 30.0, 45.0, 90.0, 45.0);
		
		Boolean valorEsparoDibujar = true;// este valor es el que espero
		Boolean valorObtenidaDibujar= triangulo3.dibujarTriangulo();// este es el valor obtenido
		Assert.assertEquals(valorEsparoDibujar, valorObtenidaDibujar);// uso este metodo para comparar los resultados
		
		
		
	}
	@Test
	public void testMetodoPerimetroTriangulo() {
		Triangulo triangulo4= new Triangulo(10.0, 15.0, 10.0, 45.0, 30.0, 90.0);
		
		Double valorEsperadoPerimetroTriangulo=35.0;
		Double valorObtenidoPerimetroTriangulo=triangulo4.perimetroTriangulo();
		
		assertEquals(valorEsperadoPerimetroTriangulo, valorObtenidoPerimetroTriangulo);
	}
	@Test
	public void testMetodoAreaTriangulo() {
		Triangulo triangulo5=new Triangulo(5.0, 5.0, 6.0, 90.5, 45.0, 45.0);
		Double valorEsperadoAreaTriangulo=12.0;
		Double valorObtenidoAreaTriangulo=triangulo5.areaTriangulo();
		
		assertEquals(valorEsperadoAreaTriangulo, valorObtenidoAreaTriangulo);
	}

}
