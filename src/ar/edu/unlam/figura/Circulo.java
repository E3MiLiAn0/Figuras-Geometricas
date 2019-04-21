package ar.edu.unlam.figura;

public class Circulo {
	Double radio;
	Double perimetro;
	Double area;
	public Circulo(Double radio){
		this.radio = radio;
	}
	public Double getRadio() {
		return radio;
	}
	public void setRadio(Double radio) {
		this.radio = radio;
	}
	
	public Double Perimetro(){
		this.perimetro = 2*radio*Math.PI;
		
		return perimetro;
	}
	public Double Area(){
		this.area= Math.PI*Math.pow(this.radio, 2);
		return area;
	}
	


}

