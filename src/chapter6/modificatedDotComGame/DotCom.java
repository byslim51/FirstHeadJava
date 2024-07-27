package chapter6.modificatedDotComGame;

import java.util.ArrayList;
import java.util.List;

public class DotCom {
    private ArrayList<String> locationCells = new ArrayList<>();
    private String name;
    private List<String> arrayList = new ArrayList<>();


    public void setLocationSells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";

        if (userInput.equals("Вы ввели что то неправильное.")){
            result = "Вы ввели что то неправильное.";
            return result;
        }

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
