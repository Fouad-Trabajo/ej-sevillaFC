package com.iesam.sevillafc.features.player.data;

import com.iesam.sevillafc.features.player.data.local.FileLocalDataSourcePlayer;
import com.iesam.sevillafc.features.player.domain.PlayerRepository;
import com.iesam.sevillafc.features.player.domain.models.Player;

import java.util.ArrayList;

public class PlayerDataRepository implements PlayerRepository {

    //Instancia de fichero
    private static FileLocalDataSourcePlayer fileLocalDataSourcePlayer;

    //Instancia de patrón SingleTon
    private static PlayerDataRepository instane = null;

    //Método del patrón SingleTon
    public static PlayerDataRepository newInstance() {
        if (instane == null) {
            instane = new PlayerDataRepository();
        }
        return instane;
    }


    @Override
    public void createPlayer(Player player) {
        fileLocalDataSourcePlayer.save(player);
    }

    @Override
    public Player getPlayer(String id) {
        return fileLocalDataSourcePlayer.obtain();
    }

    @Override
    public ArrayList<Player> getPlayers() {
        ArrayList<Player> players = new ArrayList<>();
        Player player = fileLocalDataSourcePlayer.obtain();
        if (player != null) { //Si existe un player, añade otro más
            players.add(player);
        }
        return players;
    }
}
