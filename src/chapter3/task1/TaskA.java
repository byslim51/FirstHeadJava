// 93 страница
package chapter3.task1;

public class TaskA {
    String title;
    String author;

    public static void main(String[] args) {
        TaskA[] myBooks = new TaskA[3];
        int x = 0;

        myBooks[0] = new TaskA();
        myBooks[1] = myBooks[0];
        myBooks[2] = myBooks[0];

        myBooks[0].title = "Плоды Java";
        myBooks[1].title = "Java Гэтсби";
        myBooks[2].title = "Сборник рецептов";

        myBooks[0].author = "Боб";
        myBooks[1].author = "Сью";
        myBooks[2].author = "Ян";

        while (x < 3){
            System.out.print(myBooks[x].title);
            System.out.print(", автор ");
            System.out.println(myBooks[x].author);
            x++;
        }
    }
} // Создали ссылочные переменные к объектам а сами объекты пропустили.
