import java.io.FileReader;
import java.io.StringReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String a = new String("Лягушка");
        String x = new String("Лягушка");
        String b = "Лягушка";
        String c = "Лягушка";

//            System.out.println(a == x);
//        for (int i = 0; i < 10; i++) {
//            // Печатает сообщение и остается на той же строке
//            System.out.print("Привет");
//            System.out.print("Счетчик: " + i + "\r");
//
//            // Задержка, чтобы можно было увидеть обновление
//        }
//
//        // Печатает сообщение и переходит на новую строку
//        System.out.println("Готово!");

        Thread thread = new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                System.out.print("\rLoading : " + i + "%");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ie) {
                    System.out.println(ie.getMessage());
                }
            }
        });
        thread.start();
    }
}