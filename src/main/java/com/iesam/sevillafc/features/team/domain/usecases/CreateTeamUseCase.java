package com.iesam.sevillafc.features.team.domain.usecases;

import com.iesam.sevillafc.features.team.domain.TeamRepository;
import com.iesam.sevillafc.features.team.domain.models.Team;

public class CreateTeamUseCase {
    private TeamRepository teamRepository;

    public CreateTeamUseCase(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }


    public void execute(Team team){
        this.teamRepository.createTeam(team);
    }
}
