package com.iesam.sevillafc.features.match.domain.usecases;

import com.iesam.sevillafc.features.match.domain.MatchRepository;
import com.iesam.sevillafc.features.match.domain.models.Match;

public class CreateMatchUseCase {

    private MatchRepository matchRepository;

    public CreateMatchUseCase(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public void execute(Match match){
        this.matchRepository.createMatch(match);
    }
}
