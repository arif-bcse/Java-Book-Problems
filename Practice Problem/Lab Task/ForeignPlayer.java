package bpl.team.player.selection;

import java.util.ArrayList;
import java.util.List;

public class ForeignPlayer {
    private String name;
    private int number;
    private String country;

    public ForeignPlayer(String name, int number, String country) {
        this.name = name;
        this.number = number;
        this.country = country;
    }

    public String toString() {
        return name + " #" + number + " from " + country;
    }

    // Static method to create list of foreign players from arrays
    public static List<ForeignPlayer> createPlayers() {
        String[] names = {"Smith", "Miller", "Clark", "Johnson", "Watson", "Taylor", "Brown", "Anderson", "Lee", "White"};
        int[] numbers = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        String[] countries = {"Australia", "England", "South Africa", "New Zealand", "India", "Sri Lanka", "Pakistan", "West Indies", "Afghanistan", "Ireland"};

        List<ForeignPlayer> foreignPlayers = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            foreignPlayers.add(new ForeignPlayer(names[i], numbers[i], countries[i]));
        }
        return foreignPlayers;
    }
}
