package ru.stqa.pft.sandbox;

public class MyFirstProgram {
    public static void main(String[] args) {
        Hello ("world");
        Hello ("Irina");
        Hello ("user3");

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r =new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point p1 = new Point(4, 1);
        Point p2 = new Point(9, 11);
        System.out.println("Расстояние между точками с координатами " + "(X1 = " + p1.x + "; Y1 = " + p1.y + "), (X2 = " + p2.x + "; Y2 = " + p2.y + ") равно " + Distance (p1, p2));

    }

    public static void Hello(String sambody) {
        System.out.println("Hello, " + sambody + " !");
    }

    public static double Distance (Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
    }





