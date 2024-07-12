package chapter2.task1.taskA;

import chapter1.Taks2;

public class TaskA2 {
    public static void main(String[] args) {
        TaskA1 t = new TaskA1();

        t.canRecord = true;
        t.playTape();

        if (t.canRecord == true) {
            t.recordTape();
        }
    }
}
// В книге не было прописано создание объекта "t"
