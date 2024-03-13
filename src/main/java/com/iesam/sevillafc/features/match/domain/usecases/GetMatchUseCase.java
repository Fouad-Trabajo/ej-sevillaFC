package com.iesam.sevillafc.features.match.domain.usecases;

import com.iesam.sevillafc.features.match.domain.MatchRepository;
import com.iesam.sevillafc.features.match.domain.models.Match;


public class GetMatchUseCase {

    private MatchRepository matchRepository;

    public GetMatchUseCase(MatchRepository matchRepository) {
        this.matchRepository = matchRepository;
    }

    public Match execute(String id){
        return this.matchRepository.obtainMatch(id);
    }
}
