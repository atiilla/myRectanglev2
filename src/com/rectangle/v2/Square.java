package com.rectangle.v2;

import java.awt.Rectangle;

public class Square extends Rectangle {
	public final String DESC = "Square";
	private int width;
	private int height;
	private int x;
	private int y;
	private int side;

	public Square() {
		this(0, 0, 0);
	}

	public Square(int side) {
		this(side, 0, 0);
	}

	public Square(int side, int x, int y) {
		super(side, side, x, y);
	}

	public Square(Square square) {
		super(square);
	}

	public double getSide() {
		return getHeight();
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public void setSide(int side) {
		setHeight(side);
		setWidth(side);
	}

	
	public void setHeight(int height) {
		this.height = height;
	}

	
	public void setWidth(int width) {
		this.width = width;
	}

	

	public double getPerimeter() {
		return 2 * (width * height);
	}

	public int getArea(int width, int height) {
		this.width = width;
		this.height = height;
		return width * height;
	}

}
