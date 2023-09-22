public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Joe", 7, 12.3);
        Cat cat2 = new Cat("Rose", 6, 10.23);

        cat1.introduce();
        cat1.printCatInfo();

        cat2.printCatInfo();
        cat2.introduce();
    }
}
