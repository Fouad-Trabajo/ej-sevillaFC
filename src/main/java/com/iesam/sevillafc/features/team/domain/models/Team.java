package com.iesam.sevillafc.features.team.domain.models;

import com.iesam.sevillafc.features.player.domain.models.Player;

import java.util.ArrayList;

public class Team {
    public final String id,name,category;
    public final ArrayList<Player> players;

    public Team(String id, String name, String category, ArrayList<Player> players) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.players = players;
    }
}
