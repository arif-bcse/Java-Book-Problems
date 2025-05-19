package bpl.team.player.selection;


import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create players from arrays inside their classes
        List<ForeignPlayer> foreignPlayers = ForeignPlayer.createPlayers();
        List<DeshiPlayer> deshiPlayers = DeshiPlayer.createPlayers();

        // Shuffle players
        Collections.shuffle(foreignPlayers);
        Collections.shuffle(deshiPlayers);

//        // Print all players to check
//        System.out.println("Foreign Players:");
//        foreignPlayers.forEach(System.out::println);
//
//        System.out.println("\nDeshi Players:");
//        deshiPlayers.forEach(System.out::println);
//

            Team team = new Team(foreignPlayers, deshiPlayers);

            // THIS IS IMPORTANT — print the teams here!
            team.printTeams();
        }

    }

