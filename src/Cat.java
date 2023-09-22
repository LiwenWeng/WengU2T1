// Cat class definition
public class Cat {

    // instance variables
    private String name;
    private int age;
    private double weight;

    // constructor
    public Cat(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // method that introduces the Cat
    public void introduce() {
        System.out.println("Hello my name is " + this.name + " and I am " + ((this.age >= 7) ? "an older" : "a younger") + " cat");
    }

    // method that prints Cat info
    public void printCatInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Weight: " + this.weight);
    }
}
