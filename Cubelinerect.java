package code20;


//Abstract Shape class
abstract class Shape {
 // Abstract method to draw the shape
 public abstract void draw();
}

//Line class extending Shape
class Line extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Line");
 }
}

//Rectangle class extending Shape
class Rectangle extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

//Cube class extending Shape
class Cube extends Shape {
 @Override
 public void draw() {
     System.out.println("Drawing a Cube");
 }
}

//Main class to test drawing all shapes
public class Cubelinerect {
 public static void main(String[] args) {
     // Creating instances of Line, Rectangle, and Cube
     Line line = new Line();
     Rectangle rectangle = new Rectangle();
     Cube cube = new Cube();

     // Drawing all shapes
     drawShape(line);
     drawShape(rectangle);
     drawShape(cube);
 }

 // Polymorphic method to draw any shape
 public static void drawShape(Shape shape) {
     shape.draw();
 }
}




