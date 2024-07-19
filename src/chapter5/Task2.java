// 149 страница
package chapter5;

public class Task2 {
    public static void main(String[] args) {
         for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                if (x==1){
                    x++;
                }
                System.out.println(x + " " + y);
            }
        }
    }
}
