package Assignment2;
//Base class Shape
abstract class Shape {
 // Final constant PI
 protected static final double PI = 3.142;

 // Abstract method to calculate area
 public abstract double area();
}

//Class Circle inherits from Shape
class Circle extends Shape {
 private double radius;

 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implement area method for Circle
 @Override
 public double area() {
     return PI * radius * radius;
 }
}

//Class Rectangle inherits from Shape
class Rectangle extends Shape {
 protected double length;
 protected double breadth;

 // Constructor
 public Rectangle(double length, double breadth) {
     this.length = length;
     this.breadth = breadth;
 }

 // Implement area method for Rectangle
 @Override
 public double area() {
     return length * breadth;
 }
}

//Class Cube inherits from Rectangle
class Cube extends Rectangle {
 private double height;

 // Constructor
 public Cube(double side) {
     super(side, side); // Cube has equal length and breadth
     this.height = side;
 }

 // Implement area method for Cube (surface area of a cube)
 @Override
 public double area() {
     return 6 * length * breadth; // Surface area = 6 * side^2
 }

 // Method to calculate volume of Cube
 public double volume() {
     return length * breadth * height; // Volume = side^3
 }
}

//Main class to test the implementation
public class Main2 {
 public static void main(String[] args) {
     // Create objects and test methods

     // Circle
     Circle circle = new Circle(5.0);
     System.out.println("Circle Area: " + circle.area());

     // Rectangle
     Rectangle rectangle = new Rectangle(4.0, 6.0);
     System.out.println("Rectangle Area: " + rectangle.area());

     // Cube
     Cube cube = new Cube(3.0);
     System.out.println("Cube Surface Area: " + cube.area());
     System.out.println("Cube Volume: " + cube.volume());
 }
}

