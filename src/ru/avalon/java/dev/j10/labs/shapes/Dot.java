package ru.avalon.java.dev.j10.labs.shapes;

public class Dot implements Point {
	
	private int x;
	private int y;
	
	public Dot(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public float getX() {
		return x;
	}
	
	public float getY() {
		return y;
	}
	
	// Метод генерации точек с использованием функции Math.random()
	public static Dot genDot() {
		return new Dot((int)(Math.random() * 100), (int)(Math.random() * 100));
	}

}
