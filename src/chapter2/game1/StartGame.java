package chapter2.game1;

public class StartGame {
    String[] wordList1 = {"Салют", "Привет", "Как дела,"};
    String[] wordList2 = {"Том,", "Адам,", "Алекс,"};
    String[] wordList3 = {"я только приехал", "я смотрю телевизор", "я отдыхаю"};



    public void LaunchGame (){
        WordPlayer p1 = new WordPlayer();
        WordPlayer p2 = new WordPlayer();
        WordPlayer p3 = new WordPlayer();
        System.out.println("Первый человек сказал:");
        p1.guess();
        System.out.println("");
        System.out.println("Второй человек сказал:");
        p2.guess();
        System.out.println("");
        System.out.println("Третий человек сказал:");
        p3.guess();
    }
}
