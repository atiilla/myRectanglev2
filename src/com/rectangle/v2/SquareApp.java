package com.rectangle.v2;

public class SquareApp {
	public static void main(String[] args) {
		Square square = new Square(1,4,10);
		square.setRect(5, 4, 3, 5);
		square.setWidth(5);
		square.setHeight(5);
		
		System.out.println("X: " + square.getX());
		System.out.println("Y: " + square.getY());
		System.out.println("Side: " + square.getSide());		
		System.out.println("Area: " + square.getArea(4,4));
		System.out.println("Perimeter: " + square.getPerimeter());
		
	}

	
}
