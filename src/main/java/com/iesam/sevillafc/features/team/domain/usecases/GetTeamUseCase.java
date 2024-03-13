package com.iesam.sevillafc.features.team.domain.usecases;

import com.iesam.sevillafc.features.team.domain.TeamRepository;
import com.iesam.sevillafc.features.team.domain.models.Team;

public class GetTeamUseCase {
    private TeamRepository teamRepository;


    public GetTeamUseCase(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    public Team execute(String id){
        return this.teamRepository.obtainTeam(id);
    }
}
