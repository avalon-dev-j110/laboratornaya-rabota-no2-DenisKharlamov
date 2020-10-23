package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о треугольнике.
 * <p>
 * Треуго́льник (в евклидовом пространстве) — геометрическая
 * фигура, образованная тремя отрезками, которые соединяют
 * три точки, не лежащие на одной прямой. Указанные три
 * точки называются вершинами треугольника, а отрезки —
 * сторонами треугольника. Часть плоскости, ограниченная
 * сторонами, называется внутренностью треугольника: нередко
 * треугольник рассматривается вместе со своей внутренностью
 * (например, для определения понятия площади).
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B5%D1%83%D0%B3%D0%BE%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA">Треугольник</a>
 */
public class Triangle implements Polygon, Shape {

    /*
     * TODO: Реализовать класс 'Triangle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */
	private Dot dot1;
	private Dot dot2;
	private Dot dot3;
	
	public Triangle(Dot dot1, Dot dot2, Dot dot3) {
		this.dot1 = dot1;
		this.dot2 = dot2;
		this.dot3 = dot3;
	}
	
	float getSideAB() {
		return (float) Math.sqrt(((Math.abs(dot1.getX()-dot2.getX())*Math.abs((dot1.getX()-dot2.getX()))
				+Math.abs(dot1.getY()-dot2.getY())*Math.abs(dot1.getY()-dot2.getY()))));
	}
	
	float getSideBC() {
		return (float) Math.sqrt(((Math.abs(dot2.getX()-dot3.getX())*Math.abs((dot2.getX()-dot3.getX()))
				+Math.abs(dot2.getY()-dot3.getY())*Math.abs(dot2.getY()-dot3.getY()))));
	}
	
	float getSideCA() {
		return (float) Math.sqrt(((Math.abs(dot1.getX()-dot3.getX())*Math.abs((dot1.getX()-dot3.getX()))
				+Math.abs(dot1.getY()-dot3.getY())*Math.abs(dot1.getY()-dot3.getY()))));
	}
	
	float getHalfPerimetr() {
		return (float)(getSideAB() + getSideBC() + getSideCA())/2;
	}
	
	@Override
	public float getArea() {
		return (float)Math.sqrt((getHalfPerimetr())*(Math.abs(getHalfPerimetr()-getSideAB()))*
				(Math.abs(getHalfPerimetr()-getSideBC()))*(Math.abs(getHalfPerimetr()-getSideCA())));
	}

	@Override
	public float getPerimeter() {
		return getSideAB() + getSideBC() + getSideCA();
	}
}
