package com.iesam;

import com.iesam.sevillafc.features.match.domain.models.Match;
import com.iesam.sevillafc.features.match.domain.models.Referee;
import com.iesam.sevillafc.features.match.presentation.MainMatch;
import com.iesam.sevillafc.features.player.domain.models.Player;
import com.iesam.sevillafc.features.player.presentation.MainPlayer;
import com.iesam.sevillafc.features.team.domain.models.Team;
import com.iesam.sevillafc.features.team.presentation.MainTeam;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("--------MENU--------");
            System.out.println("1-Crear jugador");
            System.out.println("2-Crear equipo");
            System.out.println("3-Crear partido");
            System.out.println("4-Visualizar/obtener info de jugador");
            System.out.println("5-Visualizar lista de jugadores");
            System.out.println("6-Visualizar/obtener info de equipo");
            System.out.println("7-Visualizar/obtener info de partido");
            System.out.println("8-Exit");

            System.out.print("¿Que quieres hacer?: ");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Jugador creado y añadido correctamente");
                    Player newplayer1 = new Player("#4", "CR", "7",
                            "02-11-1989", "Delantero");
                    MainPlayer.createPlayer(newplayer1);
                    break;
                case 2:
                    System.out.println("Equipo creado y añadido correctamente");
                    Player newplayer2 = new Player("#5", "Messi", "La pulga",
                            "13-05-1991", "Medio-Centro");
                    ArrayList<Player> players = new ArrayList<>();
                    players.add(newplayer2);
                    Team newTeam1 = new Team("#133", "BarÇa",
                            "1 division", players);
                    MainTeam.createTeam(newTeam1);
                    break;
                case 3:
                    System.out.println("Partido creado y añadido correctamente");
                    //Instancia de arbitro
                    Referee referee1 = new Referee("#26", "Rubiales", "piquito",
                            "16/06/2023", "Arbitro con pito");

                    Player playersLocal1 = new Player("#6", "Joritoo", "Hernandez",
                            "13-05-1997", "Centro");
                    ArrayList<Player> playersLocal = new ArrayList<>();
                    playersLocal.add(playersLocal1);

                    //Instancia de equipoLocal
                    Team localTeam1 = new Team("#849", "Valladolid FC", "2ª", playersLocal);


                    Player playersVisit1 = new Player("#99", "Diego", "Armando Maradona",
                            "03-15-1932", "Cocainomano");
                    ArrayList<Player> playersVisit = new ArrayList<>();
                    playersVisit.add(playersVisit1);

                    //Instancia de equipoVisitante
                    Team visitedTeam1 = new Team("#6568", "BarÇa", "1ª", playersVisit);

                    //Instancia de partido
                    Match newMatch1 = new Match("#561", "2-0", "15-06-2023",
                            referee1, localTeam1, visitedTeam1);
                    MainMatch.createMatch(newMatch1);
                    break;
                case 4:
                    System.out.print("Has elegido visualizar a un jugador en concreto" +
                            ", introduce su id: ");
                    String showIdPlayer = sc.next();
                    MainPlayer.getPlayer(showIdPlayer);
                    break;
                case 5:
                    System.out.println("Has elegido ver el listado de jugadores");
                    MainPlayer.getPlayers();
                    break;
                case 6:
                    System.out.print("Has elegido visualizar un equipo en concreto" +
                            ", introduce su id: ");
                    String showIdTeam = sc.next();
                    MainTeam.obtainTeam(showIdTeam);
                    break;
                case 7:
                    System.out.print("Has elegido visualizar un partido en concreto" +
                            ", introduce su id: ");
                    String showIdMatch = sc.next();
                    MainMatch.obtainMatch(showIdMatch);
                    break;
                case 8:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Operación no válida. Elige una opción del menú.");
            }
        } while (num != 8);
        sc.close(); // Cerramos el scanner
    }
}