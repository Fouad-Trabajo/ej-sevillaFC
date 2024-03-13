package com.iesam.sevillafc.features.match.presentation;

import com.iesam.sevillafc.features.match.data.MatchDataRepository;
import com.iesam.sevillafc.features.match.domain.models.Match;
import com.iesam.sevillafc.features.match.domain.usecases.CreateMatchUseCase;
import com.iesam.sevillafc.features.match.domain.usecases.GetMatchUseCase;

public class MainMatch {

    public static void createMatch(Match match) {
        MatchDataRepository matchDataRepository = MatchDataRepository.newInstance();
        CreateMatchUseCase createMatchUseCase = new CreateMatchUseCase(matchDataRepository);
        createMatchUseCase.execute(match);
    }

    public static void obtainMatch(String id) {
        GetMatchUseCase getMatchUseCase = new GetMatchUseCase(MatchDataRepository.newInstance());
        Match match = getMatchUseCase.execute(id);
        System.out.println(match.toString());

    }
}
