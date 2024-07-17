package task1.taskB;

public class Clock {
   private String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
} // Поле String должно быть private и в getTime было прописано void вместо String (возвращаемый параметр)
// +, но то что поле String должно быть private не указывается
