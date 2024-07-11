package chapter1;

public class Taks2 {
    public static void main(String[] args) {
taskB();
    }

    public static void taskA() {
        int x = 1;
        while ( x < 10 ) {
            x++;
            if ( x > 3){
                System.out.println("большой икс");
            }
        }
    } // Верно написал ( не хватало x = x + 1 (x++) )

    public static void taskB() {
      int x = 5;
      while ( x > 1 ){
          x = x - 1;
          if ( x < 3 ) {
              System.out.println("маленький икс");
          }
      }
    } // Оказывается в книге там не было класса

    public static void taskC() {
        int x = 5;
        while (x > 1) {
            x = x - 1;
            if (x < 3){
                System.out.println("маленький икс");
            }
        }
    } // Верно, в книге не было метода
}


