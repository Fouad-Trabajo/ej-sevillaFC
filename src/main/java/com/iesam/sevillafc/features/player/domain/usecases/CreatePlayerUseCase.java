package com.iesam.sevillafc.features.player.domain.usecases;

import com.iesam.sevillafc.features.player.domain.PlayerRepository;
import com.iesam.sevillafc.features.player.domain.models.Player;

public class CreatePlayerUseCase {

    private PlayerRepository playerRepository;

    public CreatePlayerUseCase(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void execute(Player player) {
        this.playerRepository.createPlayer(player);
    }
}
