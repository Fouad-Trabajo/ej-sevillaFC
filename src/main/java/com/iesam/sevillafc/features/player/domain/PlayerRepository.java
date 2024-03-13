package com.iesam.sevillafc.features.player.domain;

import com.iesam.sevillafc.features.player.domain.models.Player;

import java.util.ArrayList;

public interface PlayerRepository {
    void createPlayer(Player player);

    Player getPlayer(String id);

    ArrayList<Player> getPlayers();
}
