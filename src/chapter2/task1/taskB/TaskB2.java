package chapter2.task1.taskB;

public class TaskB2 {
    public static void main(String[] args) {
        TaskB1 d = new TaskB1();
        d.canRecord = true;
        d.playDVD();

        if (d.canRecord == true){
            d.recordDVD();
        }
    }
}
// Не было метода playDVD в книге.
