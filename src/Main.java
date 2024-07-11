import java.io.FileReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Integer.parseInt("a");
        } catch (NumberFormatException n){
            System.out.println(n.getMessage());

        }
        System.out.println("hello");
    }
}