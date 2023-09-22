public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Joe", 16, 0.5);
        Student student2 = new Student("Bob", 15, 4.0);

        student1.introduce();
        student1.grades();
        System.out.println();
        student2.introduce();
        student2.grades();
    }
}