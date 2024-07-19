package chapter5.flootSite;

import chapter2.game1.Game;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits = 0;
    List<Integer> arrayList = new ArrayList<>();

    public void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if (guess == cell && arrayList.contains(guess) == false) {
                result = "Попал";
                arrayList.add(guess);
                numOfHits++;
                break;
            }
            if (arrayList.contains(guess)) {
                System.out.println("\nЭто число уже вводилось.");
                result = "";
                break;
            }
        }
        arrayList.add(guess);
        if (numOfHits == locationCells.length) {
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}


