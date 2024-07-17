package task1.taskA;

public class xCopy {
    public static void main(String[] args) {
        int orig = 42;
        xCopy x = new xCopy();
        int y = x.go(orig);
        System.out.println(orig + " " + y);
    }
    int go(int arg) {
        arg = arg * 2;
        return arg;
    }
} // Все правильно
// +
