package bpl.team.player.selection;

import java.util.ArrayList;
import java.util.List;

public class Team {

    private List<List<ForeignPlayer>> foreignTeams;
    private List<List<DeshiPlayer>> deshiTeams;

    public Team(List<ForeignPlayer> foreignPlayers, List<DeshiPlayer> deshiPlayers) {
        foreignTeams = new ArrayList<>();
        deshiTeams = new ArrayList<>();

        // Initialize 5 empty teams each for foreign and deshi players
        for (int i = 0; i < 5; i++) {
            foreignTeams.add(new ArrayList<>());
            deshiTeams.add(new ArrayList<>());
        }

        // Assign 2 foreign players to each team
        int foreignIndex = 0;
        for (int team = 0; team < 5; team++) {
            for (int count = 0; count < 2; count++) {
                foreignTeams.get(team).add(foreignPlayers.get(foreignIndex++));
            }
        }

        // Assign 2 deshi players to each team
        int deshiIndex = 0;
        for (int team = 0; team < 5; team++) {
            for (int count = 0; count < 2; count++) {
                deshiTeams.get(team).add(deshiPlayers.get(deshiIndex++));
            }
        }
    }

    public void printTeams() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Team " + (i + 1) + ":");
            //System.out.println(" Foreign Players:");
            for (ForeignPlayer fp : foreignTeams.get(i)) {
                System.out.println("  " + fp);
            }
            //System.out.println(" Deshi Players:");
            for (DeshiPlayer dp : deshiTeams.get(i)) {
                System.out.println("  " + dp);
            }
            System.out.println();
        }
    }
}
