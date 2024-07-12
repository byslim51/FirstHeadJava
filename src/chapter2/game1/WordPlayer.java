package chapter2.game1;

public class WordPlayer extends StartGame {
    int randomWord1 = 0;
    int randomWord2 = 0;
    int randomWord3 = 0;


    public void guess(){
        int randomWord1 = (int) (Math.random() * wordList1.length);
        int randomWord2 = (int) (Math.random() * wordList2.length);
        int randomWord3 = (int) (Math.random() * wordList3.length);
        System.out.println(wordList1[randomWord1] + " " + wordList2[randomWord2] + " " + wordList3[randomWord3]);
    }
}
