package com.iesam.sevillafc.features.team.domain;

import com.iesam.sevillafc.features.team.domain.models.Team;

public interface TeamRepository {
    void createTeam(Team team);

    Team obtainTeam(String id);
}
