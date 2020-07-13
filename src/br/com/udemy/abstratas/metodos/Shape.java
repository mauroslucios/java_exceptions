package br.com.udemy.abstratas.metodos;

public abstract class Shape {

	private Color color;
	
	
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public double area(Double area) {
		return this.area(area);
	}
	
	public abstract double area();
	
}
