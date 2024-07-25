package chapter6.modificatedDotComGame;

import java.util.ArrayList;
import java.util.List;

public class DotCom {
    private ArrayList<String> locationCells = new ArrayList<>();
    private String name;
    List<String> arrayList = new ArrayList<>();
    GameHelper helper = new GameHelper();


    public void setLocationSells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public void clearConsole() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
        for (int j = 0; j < helper.getGridLength(); j++) {
            for (int i = 1; i <= helper.getGridSize() / helper.getGridLength(); i++) {
                System.out.print("" + helper.getAlphabet().charAt(j) + i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";
        int index = locationCells.indexOf(userInput);

        if (index >= 0 && !arrayList.contains(userInput)) {
            locationCells.remove(index);

            if (locationCells.isEmpty() && !arrayList.contains(userInput)) {
                result = "Потопил";
                System.out.println("Ой! Вы потопили " + name);
            } else {
                result = "Попал";
            }
        }
        if (arrayList.contains(userInput)) {
            result = "Вы уже попадали в эту ячейку";
            return result;
        }
        arrayList.add(userInput);
        return result;
    }
}
