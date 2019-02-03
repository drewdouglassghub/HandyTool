package model;

public class HandyPaint {

	private double width;
	private double height;
	private double area;
	private double gallonsOfPaint;
	
	public HandyPaint(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public HandyPaint() {
		super();
		
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double height, double width) {
		area = height * width;
	}

	public double getGallonsOfPaint() {
		return gallonsOfPaint;
	}

	public void setGallonsOfPaint(double area) {
		gallonsOfPaint = area / 400;
	}

	@Override
	public String toString() {
		return "HandyPaint [width = " + width + " ft, height = " + height + " ft, area = " + area + " sq ft, gallons of paint required = "
				+ gallonsOfPaint + " gallons]";
	}
	
	
}
