// Rectangle class definition
public class Rectangle {

    // instance variables, the object data stored with each object:
    private int length;
    private int width;

    // the constructor used to create Rectangle objects:
    // instance variables are set here using the values passed as arguments
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // a method (object behavior) that calculates and prints area:
    void printArea() {
        int area = this.length * this.width;
        System.out.println("My area is " + area);
    }

    void printPerimeter() {
        int perimeter = this.length * 2 + this.width * 2;
        System.out.println("My perimeter is " + perimeter);
    }
}

