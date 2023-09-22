public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void introduce() {
        System.out.println("Hello, I am " + name + " and I am " + age + " years old wth a gpa of " + gpa);
    }

    public void grades() {
        if (gpa >= 3.5) {
            System.out.println("I have good grades");
        } else {
            System.out.println("I have terrible grades");
        }
    }
}