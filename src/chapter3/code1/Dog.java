package chapter3.code1;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Барт";

        Dog[] myDogs = new Dog[3];
        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;

        myDogs[0].name = "Фред";
        myDogs[1].name = "Джордж";

        System.out.println("Имя последней собаки - " + myDogs[2].name);

        for (int i = 0; i < myDogs.length; i++) {
            myDogs[i].bark();
        }

    }

    public void bark() {
        System.out.println(name + " сказал Гав!");
    }

    public void eat() {}

    public void chaseCat() {}
}
