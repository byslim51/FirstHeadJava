package chapter3.encapsulation;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog one = new Dog();
        one.setSize(70);

        Dog two = new Dog();
        two.setSize(8);

        System.out.println("Первая собака: " + one.getSize());
        System.out.println("Вторая собака: " + two.getSize());

        one.bark();
        two.bark();
    }
}
