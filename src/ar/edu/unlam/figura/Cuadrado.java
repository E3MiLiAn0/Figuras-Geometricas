package ar.edu.unlam.figura;

public class Cuadrado {
	private Integer base;
	private Integer altura;
	private  Integer perimetro;
	private Integer area;
	
	
	public Cuadrado(Integer base, Integer altura){
		this.base=base;
		this.altura=altura;
		
		
	}
	
	public Integer areaDelCuadrado() {
		Integer area=0;
		this.area=this.base*this.altura;
		return this.area;
		
	}
	public Integer perimetroDelCuadrado() {
		Integer perimetro=0;
		this.perimetro= this.base*4;
		return this.perimetro;
	}

	public boolean dibujar(){
		if((this.base==this.altura) && (this.altura>0)) {
			return true;
			
		}
		
			return false;
		}
		
	}
	

