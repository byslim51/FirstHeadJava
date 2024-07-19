// 148 страница
package chapter5;

public class Task1 {
    public static void main(String[] args) {
        Task1 o = new Task1();
        o.go();
    }
    void go() {
        int y = 7;
        for (int x = 1; x < 7; x++) {
            y++;

            if (x > 4){
                System.out.print(++y + " ");
            }

            if (y > 14) {
                System.out.print("x = " + x);
                break;
            }
        }
    }
}
