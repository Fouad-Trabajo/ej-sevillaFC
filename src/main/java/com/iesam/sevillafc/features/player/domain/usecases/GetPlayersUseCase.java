package com.iesam.sevillafc.features.player.domain.usecases;

import com.iesam.sevillafc.features.player.domain.PlayerRepository;
import com.iesam.sevillafc.features.player.domain.models.Player;

import java.util.ArrayList;

public class GetPlayersUseCase {

    private PlayerRepository playerRepository;

    public GetPlayersUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public ArrayList<Player> execute() {
        return playerRepository.getPlayers();
    }
}
