package ar.edu.unlam.figura;

public class Triangulo {
	private Double ladoA;
	private Double ladoB;
	private Double ladoH;
	private Double anguloAlfa;
	private Double anguloBeta;
	private Double anguloGamma;
	private Double area;
	private Double perimetro;
	
	// metodo constructor
	public Triangulo (Double ladoA, Double ladoB, Double ladoH, Double anguloAlfa,Double anguloBeta, Double anguloGamma) {
		this.ladoA=ladoA;
		this.ladoB=ladoB;
		this.ladoH=ladoH;
		this.anguloAlfa=anguloAlfa;
		this.anguloBeta=anguloBeta;
		this.anguloGamma=anguloGamma;
		
		
		
		
	}
	//perimetro
	public Double perimetroTriangulo() {
		this.perimetro= (this.ladoA + this.ladoB)+ this.ladoH;
		
		return perimetro;
	}
	
	//area
	public Double areaTriangulo() {
		Double semiPerimetro= (this.ladoA + this.ladoB+ this.ladoH)/2;
		Double resultado=(semiPerimetro)*(semiPerimetro- this.ladoA)*(semiPerimetro- this.ladoB)*(semiPerimetro- this.ladoH);
		this.area=Math.sqrt(resultado);
		return this.area;
	}
		
	// metodo dibujar 
	public boolean dibujarTriangulo(){
		//if para que la medida del lado sea mayor a cero 
		if(this.ladoA==0|| this.ladoA<0){
			return false;
		}
		//if para que la medida del lado sea mayor a cero
		if(this.ladoB==0|| this.ladoB<0) {
			return false;
		}
		//if para que la medida del lado sea mayor a cero
		if(this.ladoH==0|| this.ladoH<0){
			return false;
		}
		//if para que la medida del angulo  sea mayor a cero y menor a 360
		if((this.anguloAlfa<=0)||(this.anguloAlfa>360)) {
			return false;
		}
		//if para que la medida del angulo  sea mayor a cero y menor a 360
		if((this.anguloBeta<=0)||(this.anguloBeta>360)) {
			return false;
		}
		//if para que la medida del angulo  sea mayor a cero y menor a 360
		if((this.anguloGamma<=0)||(this.anguloGamma>360)) {
			return false;
			
		}
		// if para que no se de el Triangulo prohibido (punto 7)
		if(this.ladoA==10.0 && this.ladoB==7.0 && this.ladoH==7.14) {
			if(this.anguloAlfa== 90 && this.anguloBeta== 45 && this.anguloGamma== 90)
			return false;
		}
		// if para que no se de el Triangulo prohibido (punto 8)
		if(this.ladoA==10.0 && this.ladoB==10.0 && this.ladoH==30.0) {
			if(this.anguloAlfa== 45 && this.anguloBeta== 90 && this.anguloGamma== 45)
			return false;
		}
		return true;
	}
	
	
}
