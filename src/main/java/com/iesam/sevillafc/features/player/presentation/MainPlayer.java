package com.iesam.sevillafc.features.player.presentation;

import com.iesam.sevillafc.features.player.data.PlayerDataRepository;
import com.iesam.sevillafc.features.player.domain.PlayerRepository;
import com.iesam.sevillafc.features.player.domain.models.Player;
import com.iesam.sevillafc.features.player.domain.usecases.CreatePlayerUseCase;
import com.iesam.sevillafc.features.player.domain.usecases.GetPlayerUseCase;
import com.iesam.sevillafc.features.player.domain.usecases.GetPlayersUseCase;

import java.util.ArrayList;

public class MainPlayer {

    public static void createPlayer(Player player){
        PlayerDataRepository playerDataRepository = PlayerDataRepository.newInstance();
        CreatePlayerUseCase createPlayerUseCase= new CreatePlayerUseCase(playerDataRepository);
        createPlayerUseCase.execute(player);
    }


    public static void getPlayer(String id){
        GetPlayerUseCase getPlayerUseCase= new GetPlayerUseCase(PlayerDataRepository.newInstance());
        Player player= getPlayerUseCase.execute(id);
        System.out.println(player.toString());
    }

    public static void getPlayers(){
        GetPlayersUseCase getPlayersUseCase = new GetPlayersUseCase(PlayerDataRepository.newInstance());
        ArrayList<Player> players =getPlayersUseCase.execute();
        System.out.println(players.toString());
    }
}
