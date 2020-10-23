package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о прямоугольнике.
 * <p>
 * Прямоугольник — четырехугольник, у которого все углы
 * прямые (равны 90 градусам).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9F%D1%80%D1%8F%D0%BC%D0%BE%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Прямоугольник</a>
 */
public class Rectangle implements Polygon, Shape {

    /*
     * TODO: Реализовать класс 'Rectangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
	private Dot dot1;
	private Dot dot2;
	
	public Rectangle(Dot dot1, Dot dot2) {
		this.dot1 = dot1;
		this.dot2 = dot2;
	}
	
	// Находим высоту прямоугольника
	public float getHeight() {
		return (float) Math.sqrt(((Math.abs(dot1.getY()-dot2.getY())*Math.abs(dot1.getY()-dot2.getY()))));
	}
	
	// Находим ширину прямоугольника
	public float getWidth() {
		return (float) Math.sqrt(((Math.abs(dot1.getX()-dot2.getX())*Math.abs(dot1.getX()-dot2.getX()))));
	}

	@Override
	public float getArea() {
		return getHeight() * getWidth();
	}

	@Override
	public float getPerimeter() {
		return 2 * getHeight() + 2 * getWidth();
	}
	
}
