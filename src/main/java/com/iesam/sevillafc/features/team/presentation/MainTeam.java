package com.iesam.sevillafc.features.team.presentation;

import com.iesam.sevillafc.features.team.data.TeamDataRepository;
import com.iesam.sevillafc.features.team.domain.models.Team;
import com.iesam.sevillafc.features.team.domain.usecases.CreateTeamUseCase;
import com.iesam.sevillafc.features.team.domain.usecases.GetTeamUseCase;

public class MainTeam {

    public static void CreateTeam(Team team){
        TeamDataRepository teamDataRepository= TeamDataRepository.newInstance();
        CreateTeamUseCase createTeamUseCase= new CreateTeamUseCase(teamDataRepository);
        createTeamUseCase.execute(team);
    }

    public static void obtainTeam(String id){
        GetTeamUseCase getTeamUseCase = new GetTeamUseCase(TeamDataRepository.newInstance());
        Team team= getTeamUseCase.execute(id);
        System.out.println(team.toString());
    }
}
