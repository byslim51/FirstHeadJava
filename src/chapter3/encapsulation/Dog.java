package chapter3.encapsulation;

public class Dog {
    private int size;  // Указали модификатор доступа Private

    public int getSize() {   // Геттер, помогает нам получить значение поля
        return size;
    }

    public void setSize(int s) {  // Сеттер, помогает нам установить значение приватному полю, перед этим проверив его
//        Здесь могла быть проверка значения, к примеру: if (s < 10) {}
        size = s;
    }

    void bark() {
        if (size > 60){
            System.out.println("Гав, гав!");
        } else if (size > 14) {
            System.out.println("Вуф, вуф!");
        } else {
            System.out.println("Тяф, тяф!");
        }
    }
}
