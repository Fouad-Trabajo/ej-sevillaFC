package com.iesam.sevillafc.features.match.domain.models;

import com.iesam.sevillafc.features.team.domain.models.Team;

public class Match {
        public final String id, result, dateGame;
        public final Referee referee;
        public final Team localTeam, visitingTeam;

        public Match(String id, String result, String dateGame, Referee referee, Team localTeam, Team visitingTeam) {
                this.id = id;
                this.result = result;
                this.dateGame = dateGame;
                this.referee = referee;
                this.localTeam = localTeam;
                this.visitingTeam = visitingTeam;
        }
}
