package chapter5.flootSite;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        String testResult = "Неудача";

        int[] location = {2, 3, 4};
        dot.setLocationCells(location);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);


        if (result.equals("Попал") || result.equals("Мимо")) {
            testResult = "Прошел";
        }
        System.out.println(testResult);
    }
}
