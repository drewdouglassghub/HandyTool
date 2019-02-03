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
	}

	public double getArea() {
		return area;
	}

	public void setArea(double l, double w) {
		area = l * w;
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
		return "Handy Carpet Report: [Room length = " + length + " ft, Room width = " + 
				width + " ft, Room area = " + area + " square ft, Total square yards = " + squareYards
				+ " square yards]";
	}
	
	
}
