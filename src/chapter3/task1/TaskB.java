// 93 страница
package chapter3.task1;

public class TaskB {
    String name;

    public static void main(String[] args) {
        TaskB[] h = new TaskB[3];
        int z = -1;

        while (z<2){
            z=z+1;
            h[z] = new TaskB();
            h[z].name = "Бильбо";
            if (z==1){
                h[z].name = "Фродо";
            }
            if (z==2){
                h[z].name = "Сэм";
            }
            System.out.print(h[z].name + " - ");
            System.out.println("имя хорошего" +
                    " хоббита");
        }
    }
} // Массив начинается с 0 элемента
