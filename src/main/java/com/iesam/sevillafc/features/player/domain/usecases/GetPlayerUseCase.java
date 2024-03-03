package com.iesam.sevillafc.features.player.domain.usecases;

import com.iesam.sevillafc.features.player.domain.PlayerRepository;
import com.iesam.sevillafc.features.player.domain.models.Player;

public class GetPlayerUseCase {
    private PlayerRepository playerRepository;

    public GetPlayerUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public Player execute(String id) {
        return this.playerRepository.getPlayer(id);
    }
}
