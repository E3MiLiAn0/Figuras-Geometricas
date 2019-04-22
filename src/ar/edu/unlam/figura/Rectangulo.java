package ar.edu.unlam.figura;

public class Rectangulo {
	
	private Integer base;
	private Integer altura;
	private Integer perimetro;
	private Integer area;

	public Rectangulo (Integer base, Integer altura){
		
		this.base=base;
		this.altura=altura;
				
	}
	
	public Integer areaDelRectangulo() {
		
		this.area=this.base*this.altura;
		return this.area;
		
	}
	
	public Integer perimetroDelRectangulo() {
		
		this.perimetro= this.base*2 + this.altura*2;
		return this.perimetro;
	}
	
	public boolean dibujar(){
		
		if((this.base!=this.altura) && (this.altura>0)&&(this.base>0)) {
			return true;
			
		}
		
		else{	
			
			return false;
		}
	}
	
}	
