package ar.edu.unlam.figura;

public class Cuadrado {
	
	private Integer base;
	private Integer altura;
	private Integer perimetro;
	private Integer area;
	
	
	public Cuadrado(Integer base, Integer altura){
		
		this.base=base;
		this.altura=altura;
				
	}
	
	public Integer areaDelCuadrado() {
		
		this.area=this.base*this.altura;
		return this.area;
		
	}
	
	public Integer perimetroDelCuadrado() {
		
		this.perimetro= this.base*4;
		return this.perimetro;
	}

	
	public boolean dibujar(){
		
		if((this.base==this.altura) && (this.altura>0)) {
			return true;
			
		}
		
		else{	
			
			return false;
		}
	}
		
}
	

