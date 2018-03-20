package ru.stqa.pft.sandbox;

public class Task2 {
  public static void main(String[] args) {
    Point p1 = new Point(4, 8);
    Point p2 = new Point(9, 88);
    System.out.println("Расстояние между точками с координатами " + "(X1 = " + p1.x + "; Y1 = " + p1.y + "), (X2 = " + p2.x + "; Y2 = " + p2.y + ") равно " + p1.Distance (p2));
  }

}
