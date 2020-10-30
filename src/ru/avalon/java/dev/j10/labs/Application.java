package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.shapes.*;

public class Application {
	
	static float maxArea;
	static int indexArea;
	
	// Метод определения фигуры с максимальной площадью в массиве
	public static void maxArea(Shape[] shapes) {
		
		for (int i = 0; i < shapes.length; i++) {
			if (shapes[i].getArea() > maxArea) {
				maxArea = shapes[i].getArea();
				indexArea = i;
			}	
		}
		// Определяем принадлежность элемента массива к определенному классу
		if (shapes[indexArea] instanceof Triangle) {
        	System.out.println("Фигура с максимальной площадью: Треугольник, площадь равна " + shapes[indexArea].getArea() );
        }else if (shapes[indexArea] instanceof Rectangle) {
        	System.out.println("Фигура с максимальной площадью: Прямоугольник, площадь равна " + shapes[indexArea].getArea() );
        }else if (shapes[indexArea] instanceof Circle) {
        	System.out.println("Фигура с максимальной площадью: Круг, площадь равна " + shapes[indexArea].getArea() );
        }
		
	}

    public static void main(String[] args) {
    	
        Shape[] shapes = null;
        shapes = new Shape[10];
        // Заполняем массив произвольными фигурами, создаем фигуры посредством метода генерации точек
        for (int i = 0; i < shapes.length; i++) {
        	if (i < 3) {
        	    shapes[i] = new Triangle(Dot.genDot(), Dot.genDot(), Dot.genDot());
        	} else if (i < 9) {
        		shapes[i] = new Rectangle(Dot.genDot(), Dot.genDot());
        	}
        	else
        		shapes[i] = new Circle(Dot.genDot(), Dot.genDot());	
        }
        
        Application.maxArea(shapes);
//        for (int i = 0; i < shapes.length; i++) {
//        	System.out.println(shapes[i].getArea());
//        }
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Application).
         */
    }
}
