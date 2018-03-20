package ru.stqa.pft.sandbox;

public class Task_1 {
  public static void main(String[] args) {
    Point p1 = new Point(4, 2);
    Point p2 = new Point(9, 22);
    System.out.println("Расстояние между точками с координатами " + "(X1 = " + p1.x + "; Y1 = " + p1.y + "), (X2 = " + p2.x + "; Y2 = " + p2.y + ") равно " + Distance (p1, p2));
  }
  public static double Distance (Point p1, Point p2) {
    return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
  }
}
