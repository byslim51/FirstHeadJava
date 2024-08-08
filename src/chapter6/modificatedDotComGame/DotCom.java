package chapter6.modificatedDotComGame;

import java.util.ArrayList;

public class DotCom {
    private ArrayList<String> locationCells = new ArrayList<>();
    private String name;

    public DotCom() {
    }

    public DotCom(String name) {
        this.name = name;
    }

    public DotCom(ArrayList<String> locationCells, String name) {
        this.locationCells = locationCells;
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void setLocationSells(ArrayList<String> loc) {
        locationCells = loc;
    }

    public void setName(String n) {
        name = n;
    }

    public String checkYourself(String userInput) {
        String result = "Мимо";

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}
