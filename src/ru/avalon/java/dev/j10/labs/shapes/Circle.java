package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle implements Ellipse, Shape {

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
	private Dot dot1;
	private Dot dot2;
	
	public Circle(Dot dot1, Dot dot2) {
		this.dot1 = dot1;
		this.dot2 = dot2;
	}
	
	// Вычисляем диаметр по двум точкам
	float getDiametr() {
		return (float) Math.sqrt(((Math.abs(dot1.getX() - dot2.getX()) * Math.abs((dot1.getX() - dot2.getX()))
				+ Math.abs(dot1.getY() - dot2.getY()) * Math.abs(dot1.getY() - dot2.getY()))));
	}

	@Override
	public float getArea() {
		return ((float) Math.PI * ((float) Math.pow(getDiametr(), 2)))/4;
	}

	@Override
	public float getLength() {
		return (float) Math.PI * getDiametr();
	}
}
