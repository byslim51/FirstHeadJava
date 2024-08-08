package chapter10;

public class Syp1 {
    Integer i = 1;
    int j = 2;

    public static void main(String[] args) {
        Syp1 syp1 = new Syp1();
        syp1.go();
    }

    public void go() {
        j = i;
        System.out.println(j);
        System.out.println(i);
    }
}
