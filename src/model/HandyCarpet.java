package model;

public class HandyCarpet {

	private int length;
	private int width;
	private double area;
	private double squareYards;

	public HandyCarpet() {
		super();
	}

	public HandyCarpet(int length, int width) {
		super();
		this.length = length;
		this.width = width;
		this.area = area;
		this.squareYards = squareYards;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double l, double w) {
		area = l * w;
		this.area = area;
	}

	public double getSquareYards() {
		return squareYards;
	}


	public void setSquareYards(double area) {
		this.squareYards = (double) area/9;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "HandyCarpet [length=" + length + ", width=" + width + ", area=" + area + ", squareYards=" + squareYards
				+ "]";
	}
	
	
}
