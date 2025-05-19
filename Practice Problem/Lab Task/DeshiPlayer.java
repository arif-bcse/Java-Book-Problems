package bpl.team.player.selection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class DeshiPlayer {
    private String name;
    private int number;
    private String country;

    public DeshiPlayer(String name, int number, String country) {
        this.name = name;
        this.number = number;
        this.country = country;
    }

    public String toString() {
        return name + " #" + number + " from " + country;
    }

    // Static method to create list of deshi players from arrays
    public static List<DeshiPlayer> createPlayers() {
        String[] names = {"Shakib", "Tamim", "Mushfiq", "Liton", "Taskin", "Nasum", "Afif", "Yasir", "Mahedi", "Ebadot"};
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] countries = new String[10];
        Arrays.fill(countries, "Bangladesh");

        List<DeshiPlayer> deshiPlayers = new ArrayList<>();
        for (int i = 0; i < names.length; i++) {
            deshiPlayers.add(new DeshiPlayer(names[i], numbers[i], countries[i]));
        }
        return deshiPlayers;
    }
}
