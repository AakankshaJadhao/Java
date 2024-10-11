package Exception;
class Rectangle {
    private double length;
    private double breadth;

    // Parameterized constructor to initialize the Rectangle object
    // Throws RuntimeException if length or breadth is less than or equal to zero
    public Rectangle(double length, double breadth) {
        if (length <= 0) {
            throw new RuntimeException("Length must be greater than zero.");
        }
        if (breadth <= 0) {
            throw new RuntimeException("Breadth must be greater than zero.");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate the area of the rectangle
    public double calculateArea() {
        return length * breadth;
    }

    // toString method to print rectangle details
    @Override
    public String toString() {
        return "Rectangle [Length = " + length + ", Breadth = " + breadth + "]";
    }

public class RectangleMain {

	public static void main(String[] args) {
		try {
            // Creating a valid Rectangle object
            Rectangle rect1 = new Rectangle(5, 3);
            System.out.println(rect1);
            System.out.println("Area of rect1: " + rect1.calculateArea());
            System.out.println();

            // Creating an invalid Rectangle object (length <= 0)
            Rectangle rect2 = new Rectangle(0, 4);  // This will throw RuntimeException
            System.out.println(rect2);
            System.out.println("Area of rect2: " + rect2.calculateArea());
            System.out.println();

        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            // Creating another invalid Rectangle object (breadth <= 0)
            Rectangle rect3 = new Rectangle(5, -2);  // This will throw RuntimeException
            System.out.println(rect3);
            System.out.println("Area of rect3: " + rect3.calculateArea());
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
	}
}
}
